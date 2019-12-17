public class MemoryEntry {
    private int address = 0;
    private int value = 0;

    public MemoryEntry(int address, int value) {
        this.address = address;
        this.value = value;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
