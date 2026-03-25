import java.util.*;

class Reservation {
    String name;
    String roomType;

    Reservation(String name, String roomType) {
        this.name = name;
        this.roomType = roomType;
    }
}

public class BookMyStay {
    public static void main(String[] args) {
        Queue<Reservation> queue = new LinkedList<>();

        queue.add(new Reservation("John", "Single"));
        queue.add(new Reservation("Alice", "Double"));

        for (Reservation r : queue) {
            System.out.println(r.name + " requested " + r.roomType);
        }
    }
}