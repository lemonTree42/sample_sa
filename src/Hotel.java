public class Hotel {
    private int capacity;
    private int capacity2;
    private int capacity3;
    private int capacity4;
    private int capacity5;
    private int capacity6;

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
