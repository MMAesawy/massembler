
import java.util.HashMap;

public class Memory {

    HashMap<Integer, Integer> memory = new HashMap<>();

    public int get(int address) {
        return memory.getOrDefault(address, 0);
    }

    public void set(int address, int value) {
        memory.put(address, value);
    }
}