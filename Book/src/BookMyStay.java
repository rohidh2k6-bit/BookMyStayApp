import java.util.*;

class Reservation {
    String name, roomType;

    Reservation(String name, String roomType) {
        this.name = name;
        this.roomType = roomType;
    }
}

public class BookMyStay {
    public static void main(String[] args) {

        List<Reservation> history = new ArrayList<>();

        history.add(new Reservation("John", "Single"));
        history.add(new Reservation("Alice", "Double"));

        System.out.println("Booking History:");
        for (Reservation r : history) {
            System.out.println(r.name + " -> " + r.roomType);
        }

        System.out.println("Total Bookings: " + history.size());
    }
}