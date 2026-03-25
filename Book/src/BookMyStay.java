import java.util.*;

class Booking {
    static int rooms = 1;

    synchronized void book(String name) {
        if (rooms > 0) {
            System.out.println(name + " booked room");
            rooms--;
        } else {
            System.out.println(name + " failed");
        }
    }
}

public class BookMyStay {
    public static void main(String[] args) {

        Booking b = new Booking();

        new Thread(() -> b.book("John")).start();
        new Thread(() -> b.book("Alice")).start();
    }
}