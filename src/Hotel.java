public class Hotel {
    private int capacity;
    private int capacity2;
    private int capacity3;

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
