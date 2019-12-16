

public class Massembler {

    Memory mem = new Memory();
    //program counter in order to help us jumping in the program
    int programCounter = 0;
    //array of registers
    Register[] registers = new Register[32];
    //constructor
    public Massembler(){
        for(int i = 0; i< registers.length;i++){
            registers[i] = new Register();
        }
    }

    public void reset(){
        programCounter = 0;
        for(int i = 0; i< registers.length;i++){
            registers[i].set(0);
        }
    }

    public void add(Register rd, Register rs, Register rt){
        rd.value = rs.value + rt.value;
        programCounter+=1;
    }

    public void sub(Register rd, Register rs, Register rt){
        rd.value = rs.value - rt.value;
        programCounter+=1;
    }

    public void slt(Register d, Register s, Register t){
        programCounter+=1;
        if(s.get() < t.get()){
            d.set(1);
        }
        else
            d.set(0);

    }

    public void and(Register rd, Register rs, Register rt){
        programCounter+=1;
        rd.set(rs.get() & rt.get());

    }

    public void slti(Register t, Register s, int imm){

        if(s.get() < imm)
            t.set(1);
        else{
            t.set(0);
        }
        programCounter+=1;

    }

    public void or(Register rd, Register rs, Register rt){
        programCounter+=1;
        rd.set(rs.get() | rt.get());
    }

    public void addi(Register rd, Register rs, int imm){
        programCounter+=1;
        rd.value = rs.value + imm;
    }

    public void andi(Register rd, Register rs, int imm){
        programCounter+=1;

        rd.set(rs.get() & imm);

    }

    public void ori(Register rd, Register rs, int imm){
        programCounter+=1;
        rd.set(1);
        if(rs.value == 1 || imm == 1)
            rd.set(1);

    }

    public void lw(Register reg1, int address){
        programCounter+=1;
        reg1.set(mem.get(address));
    }

    public void sw(Register reg1, int address){
        programCounter+=1;
        mem.set(address, reg1.get());
    }

    public void lui(Register t, int imm){
        programCounter+=1;
        t.set(imm<<16);
    }

    public void sll(Register d, Register t, int h){
        programCounter+=1;
        d.set(t.get()<<h);
    }

    public void srl(Register d, Register t, int h){
        programCounter+=1;
        d.set(t.get()>>h);
    }

    public void beq(Register s, Register t, int offset){
        if(s.get() == t.get()){
            programCounter += offset;
        }
        else
            programCounter +=1;
    }

    public void bne(Register s, Register t, int offset){
        if(s.get() != t.get()){
            programCounter += offset;
        }
        else
            programCounter +=1;

    }
    public void j(int target){
        programCounter = target;

    }
    public void jr(Register s){
        programCounter = s.get();
    }
}
