import java.util.*;

public class BookMyStay {
    public static void main(String[] args) {

        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("Single", 0);

        Stack<String> rollback = new Stack<>();
        rollback.push("S-101");

        System.out.println("Cancelling booking...");

        inventory.put("Single", inventory.get("Single") + 1);

        String released = rollback.pop();

        System.out.println("Room Released: " + released);
        System.out.println("Updated Inventory: " + inventory);
    }
}