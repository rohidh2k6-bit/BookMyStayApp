import java.util.HashMap;

public class BookMyStay{
    public static void main(String[] args) {
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("Single", 5);
        inventory.put("Double", 0);
        inventory.put("Suite", 2);

        for (String room : inventory.keySet()) {
            if (inventory.get(room) > 0) {
                System.out.println(room + " Available: " + inventory.get(room));
            }
        }
    }
}