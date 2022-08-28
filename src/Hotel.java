public class Hotel {
    private int capacity;
    private int field1;
    private int field2;
    private int field3;
    private int field4;
    private int field5;
    private int field6;
    private int field7;
    private int field8;
    private int field9;
    private int field10;
    private int field11;

    public Hotel(int capacity) {
        this.capacity = capacity;
    }

    public void bookRoom(int amount) {
        capacity -= amount;
    }

    public int getCapacity() {
        return capacity;
    }
}
