

public class Massembler {

    Memory mem = new Memory();
    //program counter in order to help us jumping in the program
    int programCounter = 0;
    //array of registers
    Register[] registers = new Register[32];
    //constructor
    public Massembler(){
        for(int i = 0; i< registers.length;i++){
            registers[i] = new Register(Register.reverseLookup(i));
        }
    }

    public void reset(){
        programCounter = 0;
        for(int i = 0; i< registers.length;i++){
            registers[i].setValue(0);
        }
    }

    public void add(Register rd, Register rs, Register rt){
        rd.setValue(rs.getValue() + rt.getValue());
        programCounter+=1;
    }

    public void sub(Register rd, Register rs, Register rt){
        rd.setValue(rs.getValue() + rt.getValue());
        programCounter+=1;
    }

    public void slt(Register d, Register s, Register t){
        d.setValue(s.getValue() < t.getValue() ? 1 : 0);
        programCounter+=1;
    }

    public void and(Register rd, Register rs, Register rt){
        programCounter+=1;
        rd.setValue(rs.getValue() & rt.getValue());

    }

    public void slti(Register t, Register s, int imm){
        t.setValue(s.getValue() < imm ? 1 : 0);
        programCounter+=1;

    }

    public void or(Register rd, Register rs, Register rt){
        programCounter+=1;
        rd.setValue(rs.getValue() | rt.getValue());
    }

    public void addi(Register rd, Register rs, int imm){
        programCounter+=1;
        rd.setValue(rs.getValue() + imm);
    }

    public void andi(Register rd, Register rs, int imm){
        programCounter+=1;
        rd.setValue(rs.getValue() & imm);
    }

    public void ori(Register rd, Register rs, int imm){
        programCounter+=1;
        rs.setValue(rs.getValue() | imm);
    }

    public void lw(Register reg1, int address){
        programCounter+=1;
        reg1.setValue(mem.get(address));
    }

    public void sw(Register reg1, int address){
        programCounter+=1;
        mem.set(address, reg1.getValue());
    }

    public void lui(Register t, int imm){
        programCounter+=1;
        t.setValue(imm<<16);
    }

    public void sll(Register d, Register t, int h){
        programCounter+=1;
        d.setValue(t.getValue()<<h);
    }

    public void srl(Register d, Register t, int h){
        programCounter+=1;
        d.setValue(t.getValue()>>h);
    }

    public void beq(Register s, Register t, int offset){
        if(s.getValue() == t.getValue()){
            programCounter += offset;
        }
        else
            programCounter +=1;
    }

    public void bne(Register s, Register t, int offset){
        if(s.getValue() != t.getValue()){
            programCounter += offset;
        }
        else
            programCounter +=1;

    }
    public void j(int target){
        programCounter = target;

    }
    public void jr(Register s){
        programCounter = s.getValue();
    }
}
