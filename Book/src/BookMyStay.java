import java.io.*;
import java.util.*;

class Data implements Serializable {
    Map<String, Integer> inventory;
}

public class BookMyStay {
    public static void main(String[] args) {

        Data d = new Data();
        d.inventory = new HashMap<>();
        d.inventory.put("Single", 2);

        // Save
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.ser"));
            out.writeObject(d);
            out.close();
        } catch (Exception e) {}

        // Load
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.ser"));
            Data loaded = (Data) in.readObject();
            System.out.println("Loaded: " + loaded.inventory);
            in.close();
        } catch (Exception e) {
            System.out.println("No data found");
        }
    }
}