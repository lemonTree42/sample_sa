pwe
wëfdpflps

public class Hotel {
    private int capacity;

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
