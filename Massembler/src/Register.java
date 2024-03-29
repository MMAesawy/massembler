
public class Register {
    public String getName() {
        return name;
    }

    private String name;
    int value;
    public Register(String n){
        //Sets the value to zero whenever an instance is initialized.
        setValue(0);
        name = n;
    }
    public int getValue() {
        return this.value;
    }

    public void setValue(int num) {
        this.value = num;
    }

    private static String[] table = {
            "$0","$at","$v0","$v1","$a0","$a1","$a2","$a3",
            "$t0","$t1","$t2","$t3","$t4","$t5","$t6","$t7",
            "$s0","$s1","$s2","$s3","$s4","$s5","$s6","$s7",
            "$t8", "$t9", "$k0", "$k1", "$gp", "$sp", "$fp", "$ra"
    };

    public static int lookup(String reg){
        int i;
        for (i = 0; i < table.length; i++){
            if (reg.equalsIgnoreCase(table[i])) return i;
        }
        return -1;
    }

    public static String reverseLookup(int reg){
        return table[reg];
    }
}
