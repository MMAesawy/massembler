import grammar.Absyn.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*** BNFC-Generated Visitor Design Pattern Skeleton. ***/
/* This implements the common visitor design pattern.
   Tests show it to be slightly less efficient than the
   instanceof method, but easier to use.
   Replace the R and A parameters with the desired return
   and context types.*/

public class Interpreter
{
    public HashMap<String, Integer> labelLookup;
    public ArrayList<Character> instructionTypes;
    public ArrayList<Integer> pcToFc;
    public Assembler assembler;
    private int gProgramCounter = 0;

    private BufferedReader reader;
    private Pattern registerRegex;

    private ProgramVisitor visitor;
    private boolean single = false;
    private int counterMax;

    public Interpreter(Assembler ass, InputStreamReader in, int instructionCount) throws IOException {
        assembler = ass;
        visitor = new ProgramVisitor();
        counterMax = instructionCount;
    }

    public void interpretAll(Program p){
        p.accept(new ProgramVisitor(), null);
    }

    public void interpretNext(Program p){
        single = true;
        p.accept(new ProgramVisitor(), null);
        single = false;
    }


    public class ProgramVisitor implements Program.Visitor<String,Object>
    {
        public String visit(grammar.Absyn.PDefs p, Object arg)
        { /* Code For PDefs Goes Here */
            while (assembler.programCounter < counterMax)
            {
                p.liststmt_[assembler.programCounter].accept(new StmtVisitor(), arg);
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
    public class OffsetVisitor implements Offset.Visitor<String,Object>
    {
        public String visit(grammar.Absyn.OffRel p, Object arg)
        { /* Code For OffRel Goes Here */
            //p.integer_;
            //p.reg_;
            boolean validRegister = true;
            if (!registerRegex.matcher(p.reg_).matches()) validRegister = false;
            if (!validRegister){
                // throw invalid register error
            }
            return null;
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
    public class ImmVisitor implements Imm.Visitor<String,Object>
    {
        public String visit(grammar.Absyn.Immi p, Object arg)
        { /* Code For Immi Goes Here */
            //p.integer_;
            return null;
        }
    }
    public class AddrVisitor implements Addr.Visitor<String,Object>
    {
        public String visit(grammar.Absyn.AddRel p, Object arg)
        { /* Code For AddRel Goes Here */
            p.offset_.accept(new OffsetVisitor(), arg);
            return null;
        }
    }
    public class PCPntrVisitor implements PCPntr.Visitor<String,Object>
    {
        public String visit(grammar.Absyn.PCPntrLbl p, Object arg)
        { /* Code For PCPntrLbl Goes Here */
            //p.linelabel_;
            return null;
        }    public String visit(grammar.Absyn.PCPntrImm p, Object arg)
    { /* Code For PCPntrImm Goes Here */
        p.imm_.accept(new ImmVisitor(), arg);
        return null;
    }
    }
    public class RInstrVisitor implements RInstr.Visitor<String,Object>
    {
        public String visit(grammar.Absyn.EAdd p, Object arg)
        { /* Code For EAdd Goes Here */
            //p.reg_1;
            //p.reg_2;
            //p.reg_3;
            boolean validRegister = true;
            if (!registerRegex.matcher(p.reg_1).matches()) validRegister = false;
            if (!registerRegex.matcher(p.reg_2).matches()) validRegister = false;
            if (!registerRegex.matcher(p.reg_3).matches()) validRegister = false;
            if (!validRegister){
                // throw invalid register error
            }
            instructionTypes.set(gProgramCounter, 'R');
            return null;
        }    public String visit(grammar.Absyn.ESub p, Object arg)
    { /* Code For ESub Goes Here */
        //p.reg_1;
        //p.reg_2;
        //p.reg_3;
        boolean validRegister = true;
        if (!registerRegex.matcher(p.reg_1).matches()) validRegister = false;
        if (!registerRegex.matcher(p.reg_2).matches()) validRegister = false;
        if (!registerRegex.matcher(p.reg_3).matches()) validRegister = false;
        if (!validRegister){
            // throw invalid register error
        }
        instructionTypes.set(gProgramCounter, 'R');
        return null;
    }    public String visit(grammar.Absyn.EAnd p, Object arg)
    { /* Code For EAnd Goes Here */
        //p.reg_1;
        //p.reg_2;
        //p.reg_3;
        boolean validRegister = true;
        if (!registerRegex.matcher(p.reg_1).matches()) validRegister = false;
        if (!registerRegex.matcher(p.reg_2).matches()) validRegister = false;
        if (!registerRegex.matcher(p.reg_3).matches()) validRegister = false;
        if (!validRegister){
            // throw invalid register error
        }
        instructionTypes.set(gProgramCounter, 'R');
        return null;
    }    public String visit(grammar.Absyn.EOr p, Object arg)
    { /* Code For EOr Goes Here */
        //p.reg_1;
        //p.reg_2;
        //p.reg_3;
        boolean validRegister = true;
        if (!registerRegex.matcher(p.reg_1).matches()) validRegister = false;
        if (!registerRegex.matcher(p.reg_2).matches()) validRegister = false;
        if (!registerRegex.matcher(p.reg_3).matches()) validRegister = false;
        if (!validRegister){
            // throw invalid register error
        }
        instructionTypes.set(gProgramCounter, 'R');
        return null;
    }    public String visit(grammar.Absyn.ESll p, Object arg)
    { /* Code For ESll Goes Here */
        //p.reg_1;
        //p.reg_2;
        boolean validRegister = true;
        if (!registerRegex.matcher(p.reg_1).matches()) validRegister = false;
        if (!registerRegex.matcher(p.reg_2).matches()) validRegister = false;
        if (!validRegister){
            // throw invalid register error
        }
        instructionTypes.set(gProgramCounter, 'R');
        p.imm_.accept(new ImmVisitor(), arg);
        return null;
    }    public String visit(grammar.Absyn.ESrl p, Object arg)
    { /* Code For ESrl Goes Here */
        //p.reg_1;
        //p.reg_2;
        boolean validRegister = true;
        if (!registerRegex.matcher(p.reg_1).matches()) validRegister = false;
        if (!registerRegex.matcher(p.reg_2).matches()) validRegister = false;
        if (!validRegister){
            // throw invalid register error
        }
        instructionTypes.set(gProgramCounter, 'R');
        p.imm_.accept(new ImmVisitor(), arg);
        return null;
    }    public String visit(grammar.Absyn.ESlt p, Object arg)
    { /* Code For ESlt Goes Here */
        //p.reg_1;
        //p.reg_2;
        //p.reg_3;
        boolean validRegister = true;
        if (!registerRegex.matcher(p.reg_1).matches()) validRegister = false;
        if (!registerRegex.matcher(p.reg_2).matches()) validRegister = false;
        if (!validRegister){
            // throw invalid register error
        }
        instructionTypes.set(gProgramCounter, 'R');
        return null;
    }    public String visit(grammar.Absyn.EJr p, Object arg)
    { /* Code For EJr Goes Here */
        //p.reg_;
        boolean validRegister = true;
        if (!registerRegex.matcher(p.reg_).matches()) validRegister = false;
        if (!validRegister){
            // throw invalid register error
        }
        instructionTypes.set(gProgramCounter, 'R');
        return null;
    }
    }
    public class IInstrVisitor implements IInstr.Visitor<String,Object>
    {
        public String visit(grammar.Absyn.EAddi p, Object arg)
        { /* Code For EAddi Goes Here */
            //p.reg_1;
            //p.reg_2;
            boolean validRegister = true;
            if (!registerRegex.matcher(p.reg_1).matches()) validRegister = false;
            if (!registerRegex.matcher(p.reg_2).matches()) validRegister = false;
            if (!validRegister){
                // throw invalid register error
            }
            instructionTypes.set(gProgramCounter, 'I');
            p.imm_.accept(new ImmVisitor(), arg);
            return null;
        }    public String visit(grammar.Absyn.EOri p, Object arg)
    { /* Code For EOri Goes Here */
        //p.reg_1;
        //p.reg_2;
        boolean validRegister = true;
        if (!registerRegex.matcher(p.reg_1).matches()) validRegister = false;
        if (!registerRegex.matcher(p.reg_2).matches()) validRegister = false;
        if (!validRegister){
            // throw invalid register error
        }
        instructionTypes.set(gProgramCounter, 'I');
        p.imm_.accept(new ImmVisitor(), arg);
        return null;
    }    public String visit(grammar.Absyn.EAndi p, Object arg)
    { /* Code For EAndi Goes Here */
        //p.reg_1;
        //p.reg_2;
        boolean validRegister = true;
        if (!registerRegex.matcher(p.reg_1).matches()) validRegister = false;
        if (!registerRegex.matcher(p.reg_2).matches()) validRegister = false;
        if (!validRegister){
            // throw invalid register error
        }
        instructionTypes.set(gProgramCounter, 'I');
        p.imm_.accept(new ImmVisitor(), arg);
        return null;
    }    public String visit(grammar.Absyn.ESlti p, Object arg)
    { /* Code For ESlti Goes Here */
        //p.reg_1;
        //p.reg_2;
        boolean validRegister = true;
        if (!registerRegex.matcher(p.reg_1).matches()) validRegister = false;
        if (!registerRegex.matcher(p.reg_2).matches()) validRegister = false;
        if (!validRegister){
            // throw invalid register error
        }
        instructionTypes.set(gProgramCounter, 'I');
        p.imm_.accept(new ImmVisitor(), arg);
        return null;
    }    public String visit(grammar.Absyn.EBne p, Object arg)
    { /* Code For EBne Goes Here */
        //p.reg_1;
        //p.reg_2;
        boolean validRegister = true;
        if (!registerRegex.matcher(p.reg_1).matches()) validRegister = false;
        if (!registerRegex.matcher(p.reg_2).matches()) validRegister = false;
        if (!validRegister){
            // throw invalid register error
        }
        instructionTypes.set(gProgramCounter, 'I');
        p.pcpntr_.accept(new PCPntrVisitor(), arg);
        return null;
    }    public String visit(grammar.Absyn.EBeq p, Object arg)
    { /* Code For EBeq Goes Here */
        //p.reg_1;
        //p.reg_2;
        boolean validRegister = true;
        if (!registerRegex.matcher(p.reg_1).matches()) validRegister = false;
        if (!registerRegex.matcher(p.reg_2).matches()) validRegister = false;
        if (!validRegister){
            // throw invalid register error
        }
        instructionTypes.set(gProgramCounter, 'I');
        p.pcpntr_.accept(new PCPntrVisitor(), arg);
        return null;
    }    public String visit(grammar.Absyn.ELui p, Object arg)
    { /* Code For ELui Goes Here */
        //p.reg_;
        boolean validRegister = true;
        if (!registerRegex.matcher(p.reg_).matches()) validRegister = false;
        if (!validRegister){
            // throw invalid register error
        }
        instructionTypes.set(gProgramCounter, 'I');
        p.imm_.accept(new ImmVisitor(), arg);
        return null;
    }    public String visit(grammar.Absyn.ESw p, Object arg)
    { /* Code For ESw Goes Here */
        //p.reg_;
        boolean validRegister = true;
        if (!registerRegex.matcher(p.reg_).matches()) validRegister = false;
        if (!validRegister){
            // throw invalid register error
        }
        instructionTypes.set(gProgramCounter, 'I');
        p.addr_.accept(new AddrVisitor(), arg);
        return null;
    }    public String visit(grammar.Absyn.ELw p, Object arg)
    { /* Code For ELw Goes Here */
        //p.reg_;
        boolean validRegister = true;
        if (!registerRegex.matcher(p.reg_).matches()) validRegister = false;
        if (!validRegister){
            // throw invalid register error
        }
        instructionTypes.set(gProgramCounter, 'I');
        p.addr_.accept(new AddrVisitor(), arg);
        return null;
    }
    }
    public class JInstrVisitor implements JInstr.Visitor<String,Object>
    {
        public String visit(grammar.Absyn.EJ p, Object arg)
        { /* Code For EJ Goes Here */
            instructionTypes.set(gProgramCounter, 'J');
            p.pcpntr_.accept(new PCPntrVisitor(), arg);
            return null;
        }
    }
    public class InstrVisitor implements Instr.Visitor<String,Object>
    {
        public String visit(grammar.Absyn.ESyscall p, Object arg)
        { /* Code For ESyscall Goes Here */
            instructionTypes.set(gProgramCounter, 'B'); // B as in interrupt/breakpoint
            return null;
        }    public String visit(grammar.Absyn.ERInstr p, Object arg)
    { /* Code For ERInstr Goes Here */
        p.rinstr_.accept(new RInstrVisitor(), arg);
        return null;
    }    public String visit(grammar.Absyn.EIInstr p, Object arg)
    { /* Code For EIInstr Goes Here */
        p.iinstr_.accept(new IInstrVisitor(), arg);
        return null;
    }    public String visit(grammar.Absyn.EJInstr p, Object arg)
    { /* Code For EJInstr Goes Here */
        p.jinstr_.accept(new JInstrVisitor(), arg);
        return null;
    }
    }
}