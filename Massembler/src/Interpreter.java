import grammar.Absyn.*;

import java.io.*;

import grammar.*;

/*** BNFC-Generated Visitor Design Pattern Skeleton. ***/
/* This implements the common visitor design pattern.
   Tests show it to be slightly less efficient than the
   instanceof method, but easier to use.
   Replace the R and A parameters with the desired return
   and context types.*/

public class Interpreter
{
    public Massembler assembler;

    private boolean errorFlag = false;
    private boolean single = false;
    private int counterMax;
    private Preprocessor preprocessor;
    private PrintStream outputStream;
    private PrintStream errorStream;
    private grammar.Absyn.Program parsedProgram;

    private char type = ' ';
    private String opcode = "000000";
    private String funct = "";
    private String register1 = "";
    private String register2 = "";
    private String register3 = "";
    private int immediate = 0;
    private int destination = 0;
    private int prevProgCount = 0;

    public Interpreter(Massembler ass, InputStream in) throws IOException{
        this(ass, in, null, null);
    }

    public Interpreter(Massembler ass, String in) throws IOException{
        this(ass, in, null, null);
    }

    public Interpreter(Massembler ass, String in, PrintStream output, PrintStream error) throws IOException{
        this(ass,new ByteArrayInputStream(in.getBytes()), output, error);
    }

    public Interpreter(Massembler ass, InputStream in, PrintStream output, PrintStream error) throws IOException {
        InputStreamReader reader = new InputStreamReader(in);
        assembler = ass;
        preprocessor = new Preprocessor();
        outputStream = output;
        errorStream = error;

        // Parse
        in.reset();
        Yylex l = new Yylex(in);
        parser p = new parser(l);
        try
        {
            parsedProgram = p.pProgram();
            if (outputStream != null) {
                outputStream.println("[Parsing successful]");
            }
        }
        catch(Throwable e)
        {
            errorFlag = true;
            if (errorStream != null) {
                errorStream.println("At line " + String.valueOf(l.line_num()) + ", near \"" + l.buff() + "\" :");
                errorStream.println("     " + e.getMessage());
            }
            return;
            //System.exit(1);
        }

        // Preprocess
        in.reset();
        try{
            preprocessor.initialPass(reader);
            preprocessor.preprocess(parsedProgram);
            if (outputStream != null) {
                outputStream.println("[Preprocessing successful]");
            }
        }
        catch(IOException e){
            errorFlag = true;
            if (errorStream != null) {
                errorStream.println("Preprocessing error!");
            }
        }
        catch(InvalidRegisterException e){
            errorFlag = true;
            if (errorStream != null){
                errorStream.println(e.getMessage());
            }
        }

        counterMax = preprocessor.pcToFc.size(); // assuming pcToFc extends to end of program
    }

    //public char getInstructionType(int instructionNumber){
    //    return preprocessor.instructionTypes.get(instructionNumber);
    //}

    public int getLineNumber(int instructionNumber){
        return preprocessor.pcToFc.get(instructionNumber);
    }

    public int getLineNumber(){
        return getLineNumber(assembler.programCounter);
    }

    public int getPrevLineNumber(){
        return getLineNumber(getPrevProgCount());
    }

    public boolean ready(){
        return assembler.programCounter < counterMax && !errorFlag;
    }

    public void interpretAll(){
        if (!ready()){
            if (errorStream != null){
                errorStream.println("WARNING: Executing when not ready!");
            }
        }
        parsedProgram.accept(new ProgramVisitor(), null);
    }

    public void interpretNext(){
        if (!ready()){
            if (errorStream != null){
                errorStream.println("WARNING: Executing when not ready!");
            }
        }
        single = true;
        parsedProgram.accept(new ProgramVisitor(), null);
        single = false;
    }

    public char getType() {
        return type;
    }
    public String getOpcode() {
        return opcode;
    }
    public String getFunct() {
        return funct;
    }
    public String getR1() {
        return register1;
    }
    public String getR2() {
        return register2;
    }
    public String getR3() {
        return register3;
    }
    public int getImm() {
        return immediate;
    }
    public int getDest() {
        return destination;
    }
    public int getPrevProgCount() {
        return prevProgCount;
    }

    private void resetInfo(){
        type = ' ';
        opcode = "000000";
        funct = "";
        register1 = "";
        register2 = "";
        register3 = "";
        immediate = 0;
        destination = 0;
    }

    public class ProgramVisitor implements Program.Visitor<String,Object>
    {
        public String visit(grammar.Absyn.PDefs p, Object arg)
        { /* Code For PDefs Goes Here */
            while (assembler.programCounter < counterMax)
            {
                resetInfo();
                prevProgCount = assembler.programCounter;
                p.liststmt_.get(assembler.programCounter).accept(new StmtVisitor(), arg);
                if (single) break;
            }
            return null;
        }
    }
    public class StmtVisitor implements Stmt.Visitor<String,Object>
    {
        public String visit(grammar.Absyn.EStmtLbl p, Object arg)
        { /* Code For EStmtLbl Goes Here */
            p.lblinstr_.accept(new LblInstrVisitor(), arg);
            return null;
        }    public String visit(grammar.Absyn.EStmtInstr p, Object arg)
    { /* Code For EStmtInstr Goes Here */
        p.instr_.accept(new InstrVisitor(), arg);
        return null;
    }
    }
    public class LabelVisitor implements Label.Visitor<String,Object>
    {
        public String visit(grammar.Absyn.ELbl p, Object arg)
        { /* Code For ELbl Goes Here */
            //p.linelabel_;
            return null;
        }
    }
    public class OffsetVisitor implements Offset.Visitor<Integer,Object>
    {
        public Integer visit(grammar.Absyn.OffRel p, Object arg)
        { /* Code For OffRel Goes Here */
            //p.integer_;
            //p.reg_;
            Register r1 = assembler.registers[Register.lookup(p.reg_)];
            return p.integer_ + r1.value;
            //return null;
        }
    }
    public class LblInstrVisitor implements LblInstr.Visitor<String,Object>
    {
        public String visit(grammar.Absyn.LbledStmt p, Object arg)
        { /* Code For LbledStmt Goes Here */
            p.label_.accept(new LabelVisitor(), arg);
            p.instr_.accept(new InstrVisitor(), arg);
            return null;
        }    public String visit(grammar.Absyn.LbledLine p, Object arg)
    { /* Code For LbledLine Goes Here */
        p.label_.accept(new LabelVisitor(), arg);
        return null;
    }
    }
    public class ImmVisitor implements Imm.Visitor<Integer,Object>
    {
        public Integer visit(grammar.Absyn.Immi p, Object arg)
        { /* Code For Immi Goes Here */
            //p.integer_;
            return p.integer_;
        }
    }
    public class AddrVisitor implements Addr.Visitor<Integer,Object>
    {
        public Integer visit(grammar.Absyn.AddRel p, Object arg)
        { /* Code For AddRel Goes Here */
            return p.offset_.accept(new OffsetVisitor(), arg);
            //return null;
        }
    }
    public class PCPntrVisitor implements PCPntr.Visitor<Integer,Object>
    {
        public Integer visit(grammar.Absyn.PCPntrLbl p, Object arg)
        { /* Code For PCPntrLbl Goes Here */
            //p.linelabel_;
            return preprocessor.labelLookup.get(p.linelabel_);
            //return null;
        }    public Integer visit(grammar.Absyn.PCPntrImm p, Object arg)
    { /* Code For PCPntrImm Goes Here */
        return p.imm_.accept(new ImmVisitor(), arg);
        //return null;
    }
    }
    public class RInstrVisitor implements RInstr.Visitor<String,Object>
    {
        public String visit(grammar.Absyn.EAdd p, Object arg)
        { /* Code For EAdd Goes Here */
            //p.reg_1;
            //p.reg_2;
            //p.reg_3;

            Register r1 = assembler.registers[Register.lookup(p.reg_1)];
            Register r2 = assembler.registers[Register.lookup(p.reg_2)];
            Register r3 = assembler.registers[Register.lookup(p.reg_3)];
            register1 = p.reg_1;
            register2 = p.reg_2;
            register3 = p.reg_3;
            funct = "100000";
            assembler.add(r1, r2, r3);
            return null;
        }    public String visit(grammar.Absyn.ESub p, Object arg)
    { /* Code For ESub Goes Here */
        //p.reg_1;
        //p.reg_2;
        //p.reg_3;
        Register r1 = assembler.registers[Register.lookup(p.reg_1)];
        Register r2 = assembler.registers[Register.lookup(p.reg_2)];
        Register r3 = assembler.registers[Register.lookup(p.reg_3)];
        register1 = p.reg_1;
        register2 = p.reg_2;
        register3 = p.reg_3;
        funct = "100011";
        assembler.sub(r1, r2, r3);
        return null;
    }    public String visit(grammar.Absyn.EAnd p, Object arg)
    { /* Code For EAnd Goes Here */
        //p.reg_1;
        //p.reg_2;
        //p.reg_3;
        Register r1 = assembler.registers[Register.lookup(p.reg_1)];
        Register r2 = assembler.registers[Register.lookup(p.reg_2)];
        Register r3 = assembler.registers[Register.lookup(p.reg_3)];
        register1 = p.reg_1;
        register2 = p.reg_2;
        register3 = p.reg_3;
        funct = "100001";
        assembler.and(r1, r2, r3);
        return null;
    }    public String visit(grammar.Absyn.EOr p, Object arg)
    { /* Code For EOr Goes Here */
        //p.reg_1;
        //p.reg_2;
        //p.reg_3;
        Register r1 = assembler.registers[Register.lookup(p.reg_1)];
        Register r2 = assembler.registers[Register.lookup(p.reg_2)];
        Register r3 = assembler.registers[Register.lookup(p.reg_3)];
        register1 = p.reg_1;
        register2 = p.reg_2;
        register3 = p.reg_3;
        funct = "100101";
        assembler.or(r1, r2, r3);
        return null;
    }    public String visit(grammar.Absyn.ESll p, Object arg)
    { /* Code For ESll Goes Here */
        //p.reg_1;
        //p.reg_2;

        int imm = p.imm_.accept(new ImmVisitor(), arg);
        Register r1 = assembler.registers[Register.lookup(p.reg_1)];
        Register r2 = assembler.registers[Register.lookup(p.reg_2)];
        register1 = p.reg_1;
        register2 = p.reg_2;
        funct = "000000";
        immediate = imm;
        assembler.sll(r1, r2, imm);
        return null;
    }    public String visit(grammar.Absyn.ESrl p, Object arg)
    { /* Code For ESrl Goes Here */
        //p.reg_1;
        //p.reg_2;

        int imm = p.imm_.accept(new ImmVisitor(), arg);
        Register r1 = assembler.registers[Register.lookup(p.reg_1)];
        Register r2 = assembler.registers[Register.lookup(p.reg_2)];
        register1 = p.reg_1;
        register2 = p.reg_2;
        funct = "000010";
        immediate = imm;
        assembler.srl(r1, r2, imm);
        return null;
    }    public String visit(grammar.Absyn.ESlt p, Object arg)
    { /* Code For ESlt Goes Here */
        //p.reg_1;
        //p.reg_2;
        //p.reg_3;

        Register r1 = assembler.registers[Register.lookup(p.reg_1)];
        Register r2 = assembler.registers[Register.lookup(p.reg_2)];
        Register r3 = assembler.registers[Register.lookup(p.reg_3)];
        register1 = p.reg_1;
        register2 = p.reg_2;
        register3 = p.reg_3;
        funct = "101010";
        assembler.slt(r1, r2, r3);
        return null;
    }    public String visit(grammar.Absyn.EJr p, Object arg)
    { /* Code For EJr Goes Here */
        //p.reg_;
        Register r1 = assembler.registers[Register.lookup(p.reg_)];
        register1 = p.reg_;
        funct = "001000";
        assembler.jr(r1);
        return null;
    }
    }
    public class IInstrVisitor implements IInstr.Visitor<String,Object>
    {
        public String visit(grammar.Absyn.EAddi p, Object arg)
        { /* Code For EAddi Goes Here */
            //p.reg_1;
            //p.reg_2;

            int imm = p.imm_.accept(new ImmVisitor(), arg);
            Register r1 = assembler.registers[Register.lookup(p.reg_1)];
            Register r2 = assembler.registers[Register.lookup(p.reg_2)];
            register1 = p.reg_1;
            register2 = p.reg_2;
            immediate = imm;
            opcode = "001000";
            assembler.addi(r1, r2, imm);
            return null;
        }    public String visit(grammar.Absyn.EOri p, Object arg)
    { /* Code For EOri Goes Here */
        //p.reg_1;
        //p.reg_2;

        int imm = p.imm_.accept(new ImmVisitor(), arg);
        Register r1 = assembler.registers[Register.lookup(p.reg_1)];
        Register r2 = assembler.registers[Register.lookup(p.reg_2)];
        register1 = p.reg_1;
        register2 = p.reg_2;
        immediate = imm;
        opcode = "001101";
        assembler.ori(r1, r2, imm);
        return null;
    }    public String visit(grammar.Absyn.EAndi p, Object arg)
    { /* Code For EAndi Goes Here */
        //p.reg_1;
        //p.reg_2;

        int imm = p.imm_.accept(new ImmVisitor(), arg);
        Register r1 = assembler.registers[Register.lookup(p.reg_1)];
        Register r2 = assembler.registers[Register.lookup(p.reg_2)];
        register1 = p.reg_1;
        register2 = p.reg_2;
        immediate = imm;
        opcode = "001100";
        assembler.andi(r1, r2, imm);
        return null;
    }    public String visit(grammar.Absyn.ESlti p, Object arg)
    { /* Code For ESlti Goes Here */
        //p.reg_1;
        //p.reg_2;

        int imm = p.imm_.accept(new ImmVisitor(), arg);
        Register r1 = assembler.registers[Register.lookup(p.reg_1)];
        Register r2 = assembler.registers[Register.lookup(p.reg_2)];
        register1 = p.reg_1;
        register2 = p.reg_2;
        immediate = imm;
        opcode = "001010";
        assembler.slti(r1, r2, imm);
        return null;
    }    public String visit(grammar.Absyn.EBne p, Object arg)
    { /* Code For EBne Goes Here */
        //p.reg_1;
        //p.reg_2;

        int pntr = p.pcpntr_.accept(new PCPntrVisitor(), arg);
        int dest = pntr - assembler.programCounter;
        Register r1 = assembler.registers[Register.lookup(p.reg_1)];
        Register r2 = assembler.registers[Register.lookup(p.reg_2)];
        register1 = p.reg_1;
        register2 = p.reg_2;
        destination = pntr;
        opcode = "000101";
        assembler.bne(r1, r2, dest);
        return null;
    }    public String visit(grammar.Absyn.EBeq p, Object arg)
    { /* Code For EBeq Goes Here */
        //p.reg_1;
        //p.reg_2;

        int pntr = p.pcpntr_.accept(new PCPntrVisitor(), arg);
        int dest = pntr - assembler.programCounter;
        Register r1 = assembler.registers[Register.lookup(p.reg_1)];
        Register r2 = assembler.registers[Register.lookup(p.reg_2)];
        register1 = p.reg_1;
        register2 = p.reg_2;
        destination = pntr;
        opcode = "000100";
        assembler.beq(r1, r2, dest);
        return null;
    }    public String visit(grammar.Absyn.ELui p, Object arg)
    { /* Code For ELui Goes Here */
        //p.reg_;

        int imm = p.imm_.accept(new ImmVisitor(), arg);
        Register r1 = assembler.registers[Register.lookup(p.reg_)];
        register1 = p.reg_;
        immediate = imm;
        opcode = "001111";
        assembler.lui(r1, imm);
        return null;
    }    public String visit(grammar.Absyn.ESw p, Object arg)
    { /* Code For ESw Goes Here */
        //p.reg_;

        int addr = p.addr_.accept(new AddrVisitor(), arg);
        Register r1 = assembler.registers[Register.lookup(p.reg_)];
        register1 = p.reg_;
        immediate = addr;
        opcode = "101011";
        assembler.sw(r1, addr);
        return null;
    }    public String visit(grammar.Absyn.ELw p, Object arg)
    { /* Code For ELw Goes Here */
        //p.reg_;

        int addr = p.addr_.accept(new AddrVisitor(), arg);
        Register r1 = assembler.registers[Register.lookup(p.reg_)];
        register1 = p.reg_;
        immediate = addr;
        opcode = "100011";
        assembler.lw(r1, addr);
        return null;
    }
    }
    public class JInstrVisitor implements JInstr.Visitor<String,Object>
    {
        public String visit(grammar.Absyn.EJ p, Object arg)
        { /* Code For EJ Goes Here */

            int pntr = p.pcpntr_.accept(new PCPntrVisitor(), arg);
            opcode = "000010";
            destination = pntr;
            assembler.j(pntr);
            return null;
        }
    }
    public class InstrVisitor implements Instr.Visitor<String,Object>
    {
        public String visit(grammar.Absyn.ESyscall p, Object arg)
        { /* Code For ESyscall Goes Here */
            type = 'B';
            return null;
        }    public String visit(grammar.Absyn.ERInstr p, Object arg)
    { /* Code For ERInstr Goes Here */
        type = 'R';
        opcode = "000000";
        p.rinstr_.accept(new RInstrVisitor(), arg);
        return null;
    }    public String visit(grammar.Absyn.EIInstr p, Object arg)
    { /* Code For EIInstr Goes Here */
        type = 'I';
        p.iinstr_.accept(new IInstrVisitor(), arg);
        return null;
    }    public String visit(grammar.Absyn.EJInstr p, Object arg)
    { /* Code For EJInstr Goes Here */
        type = 'J';
        p.jinstr_.accept(new JInstrVisitor(), arg);
        return null;
    }
    }
}