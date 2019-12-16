package com.company;

public class Register {
    int value;
    public Register(){
        //Sets the value to zero whenever an instance is initialized.
        setNumber(0);
    }

    public int getNumber() {
        return this.value;
    }

    public void setNumber(int num) {
        this.value = num;
    }
}
