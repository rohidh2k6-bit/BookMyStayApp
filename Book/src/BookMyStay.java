import java.util.*;

class InvalidBookingException extends Exception {
    InvalidBookingException(String msg) {
        super(msg);
    }
}

public class BookMyStay {
    public static void main(String[] args) {

        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("Single", 1);

        String request = "Suite";

        try {
            if (!inventory.containsKey(request)) {
                throw new InvalidBookingException("Invalid Room Type");
            }

            if (inventory.get(request) <= 0) {
                throw new InvalidBookingException("No Rooms Available");
            }

            System.out.println("Booking Success");

        } catch (InvalidBookingException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}