public class Program {
    public static void main(String[] args) {
        Hotel hotel = new Hotel(5);
        System.out.println(hotel.getCapacity());
        hotel.bookRoom(2);
        System.out.println(hotel.getCapacity());
    }
}
