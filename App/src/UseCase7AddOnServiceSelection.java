import java.util.*;

class AddOnService {
    String serviceName;
    double cost;

    AddOnService(String serviceName, double cost) {
        this.serviceName = serviceName;
        this.cost = cost;
    }
}

class AddOnServiceManager {
    private Map<String, List<AddOnService>> serviceMap = new HashMap<>();

    // Add services to reservation
    public void addService(String reservationId, AddOnService service) {
        serviceMap.putIfAbsent(reservationId, new ArrayList<>());
        serviceMap.get(reservationId).add(service);
    }

    // Get total cost
    public double calculateTotalCost(String reservationId) {
        double total = 0;
        List<AddOnService> services = serviceMap.get(reservationId);

        if (services != null) {
            for (AddOnService s : services) {
                total += s.cost;
            }
        }
        return total;
    }

    // Display services
    public void displayServices(String reservationId) {
        List<AddOnService> services = serviceMap.get(reservationId);

        if (services == null) {
            System.out.println("No services added.");
            return;
        }

        System.out.println("Services for Reservation " + reservationId + ":");
        for (AddOnService s : services) {
            System.out.println("- " + s.serviceName + " : ₹" + s.cost);
        }
    }
}

public class UseCase7AddOnServiceSelection {
    public static void main(String[] args) {

        AddOnServiceManager manager = new AddOnServiceManager();

        String reservationId = "R101";

        // Adding services
        manager.addService(reservationId, new AddOnService("Breakfast", 500));
        manager.addService(reservationId, new AddOnService("Airport Pickup", 1200));
        manager.addService(reservationId, new AddOnService("Extra Bed", 800));

        // Display services
        manager.displayServices(reservationId);

        // Total cost
        double total = manager.calculateTotalCost(reservationId);
        System.out.println("Total Add-On Cost: ₹" + total);
    }
}