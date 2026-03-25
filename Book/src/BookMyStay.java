import java.util.*;

public class BookMyStay {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Single");
        queue.add("Single");

        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("Single", 1);

        Set<String> allocated = new HashSet<>();

        while (!queue.isEmpty()) {
            String type = queue.poll();

            if (inventory.get(type) > 0) {
                String roomId = type + "-" + UUID.randomUUID();
                allocated.add(roomId);
                inventory.put(type, inventory.get(type) - 1);
                System.out.println("Allocated: " + roomId);
            } else {
                System.out.println("No rooms available for " + type);
            }
        }
    }
}