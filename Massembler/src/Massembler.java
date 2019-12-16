

public class Massembler {

    Memory mem = new Memory();

    //array of registers
    Register[] regs = new Register[32];

    //program counter in order to help us jumping in the program
    int programCounter;

    public void add(Register rd, Register rs, Register rt){
        rd.value = rs.value + rt.value;
    }
    public void sub(Register rd, Register rs, Register rt){
        rd.value = rs.value - rt.value;
    }
    public int slt(Register rs, Register rt){

        return rs.value < rt.value ? 1:0;
    }
    public int and(Register rd, Register rs, Register rt){
        rd.value = 0;
        if(rs.value == rt.value && rs.value != 0)
            rd.value = 1;
        return  rd.value;
    }
    public int slti(Register rs, int imm){

        return rs.value < imm ? 1:0;
    }
    public int or(Register rd, Register rs, Register rt){

        rd.value = 0;
        if(rs.value == 1 || rt.value == 1)
            rd.value = 1;
        return rd.value;
    }

    public void addi(Register rd, Register rs, int imm){

        rd.value = rs.value + imm;
    }
    public void subi(Register rd, Register rs, int imm){

        rd.value = rs.value - imm;
    }

    public int andi(Register rd, Register rs, int imm){

        rd.value = 0;
        if(rs.value == imm && rs.value != 0)
            rd.value = 1;
        return  rd.value;
    }
    public int ori(Register rd, Register rs, int imm){

        rd.value = 0;
        if(rs.value == 1 || imm == 1)
            rd.value = 1;
        return rd.value;
    }
    public void lw(Register rs, int address){

    }
    public void sw(Register rs, int address){

    }

}
