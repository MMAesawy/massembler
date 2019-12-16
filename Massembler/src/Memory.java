
import java.util.ArrayList;
import java.util.List;

public class Memory {

    ArrayList<Integer> memory = new ArrayList<>();

    public int get(int address) {

        memory.ensureCapacity(address+1);
        return memory.get(address);
    }

    public void set(int address, int value) {

        memory.ensureCapacity(address+1);
        memory.set(address, value);
    }
}