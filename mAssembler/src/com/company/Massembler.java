package com.company;

public class Massembler {

    Memory mem = new Memory();

    //array of registers
    Register[] regs = new Register[32];


    //program counter in order to help us jumping in the program
    int programCounter = 0;

    public void add(Register rd, Register rs, Register rt){
        rd.value = rs.value + rt.value;
        programCounter+=4;
    }

    public void sub(Register rd, Register rs, Register rt){
        rd.value = rs.value - rt.value;
        programCounter+=4;
    }

    public void slt(Register rs, Register rt){
         programCounter+=4;
         //rs.value < rt.value ? 1:0;
    }

    public void and(Register rd, Register rs, Register rt){
        programCounter+=4;
        rd.value = 0;
        if(rs.value == rt.value && rs.value != 0)
            rd.value = 1;

    }

    public void slti(Register rs, int imm){
        //if $s < $t $d = 1
        Register t = null;
        if(rs.getNumber() < imm)
            //t = 1
            t.setNumber(1);
           else{
               t.setNumber(0);
        }
        programCounter+=4;

    }

    public void or(Register rd, Register rs, Register rt){
        programCounter+=4;
        rd.value = 0;
        if(rs.value == 1 || rt.value == 1)
            rd.setNumber(1);
    }

    public void addi(Register rd, Register rs, int imm){
        programCounter+=4;
        rd.value = rs.value + imm;
    }

    public void andi(Register rd, Register rs, int imm){
        programCounter+=4;
        rd.value = 0;
        if(rs.value == imm && rs.value != 0)
            rd.setNumber(1);

    }

    public void ori(Register rd, Register rs, int imm){
        programCounter+=4;
        rd.setNumber(1);
        if(rs.value == 1 || imm == 1)
            rd.setNumber(1);

    }

    public void lw(Register reg1, int addr){

        reg1.setNumber(mem.get(addr));
    }

    public void sw(Register reg1, int address){

        mem.set(address, reg1.getNumber());
    }

}
