abstract class Room {
    String type;
    int price;

    Room(String type, int price) {
        this.type = type;
        this.price = price;
    }

    void display() {
        System.out.println(type + " Room - Price: " + price);
    }
}

class SingleRoom extends Room {
    SingleRoom() { super("Single", 1000); }
}

class DoubleRoom extends Room {
    DoubleRoom() { super("Double", 2000); }
}

class SuiteRoom extends Room {
    SuiteRoom() { super("Suite", 5000); }
}

public class BookMyStay {
    public static void main(String[] args) {
        Room r1 = new SingleRoom();
        Room r2 = new DoubleRoom();
        Room r3 = new SuiteRoom();

        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        r1.display();
        System.out.println("Available: " + singleAvailable);

        r2.display();
        System.out.println("Available: " + doubleAvailable);

        r3.display();
        System.out.println("Available: " + suiteAvailable);
    }
}