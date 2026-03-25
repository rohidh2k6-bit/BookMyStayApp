import java.util.*;

class Service {
    String name;
    int cost;

    Service(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
}

public class BookMyStay{
    public static void main(String[] args) {
        Map<String, List<Service>> map = new HashMap<>();

        String reservationId = "R1";

        List<Service> services = new ArrayList<>();
        services.add(new Service("Food", 500));
        services.add(new Service("Spa", 1000));

        map.put(reservationId, services);

        int total = 0;
        for (Service s : services) {
            total += s.cost;
        }

        System.out.println("Total Add-on Cost: " + total);
    }
}