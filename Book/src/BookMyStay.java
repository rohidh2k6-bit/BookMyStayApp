import java.util.HashMap;

class RoomInventory {
    HashMap<String, Integer> inventory = new HashMap<>();

    RoomInventory() {
        inventory.put("Single", 5);
        inventory.put("Double", 3);
        inventory.put("Suite", 2);
    }

    void display() {
        System.out.println(inventory);
    }
}

public class BookMyStay {
    public static void main(String[] args) {
        RoomInventory inv = new RoomInventory();
        inv.display();
    }
}