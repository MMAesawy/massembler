import java.util.ArrayList;
import java.util.HashMap;

public class Memory {

    private HashMap<Integer, Integer> memoryLookup = new HashMap<>();
    ArrayList<MemoryEntry> memory = new ArrayList<>();

    public int get(int address) {
        if (memoryLookup.containsKey(address)){
            return memory.get(memoryLookup.get(address)).getValue();
        }
        else{
            memory.add(new MemoryEntry(address, 0));
            memoryLookup.put(address, memory.size()-1);
            return 0;
        }
    }

    public void set(int address, int value) {
        if (memoryLookup.containsKey(address)){
            memory.get(memoryLookup.get(address)).setValue(value);
        }
        else{
            memory.add(new MemoryEntry(address, value));
            memoryLookup.put(address, memory.size()-1);
        }
    }

}