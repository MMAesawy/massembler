package com.company;

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
    public long and(Register rd, Register rs, Register rt){
        rd.value = 0;
        if(rs.value == rt.value && rs.value != 0)
            rd.value = 1;
        return  rd.value;
    }
    public long or(Register rd, Register rs, Register rt){

        rd.value = 0;
        if(rs.value == 1 || rt.value == 1)
            rd.value = 1;
        return rd.value;
    }

}
