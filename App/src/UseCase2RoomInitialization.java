abstract class Room {
    private int beds;
    private int size;
    private double price;

    public Room(int beds, int size, double price) {
        this.beds = beds;
        this.size = size;
        this.price = price;
    }

    public int getBeds() {
        return beds;
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getRoomType();

    public void displayRoomDetails() {
        System.out.println("Room Type: " + getRoomType());
        System.out.println("Beds: " + beds);
        System.out.println("Size: " + size + " sq ft");
        System.out.println("Price per night: ₹" + price);
        System.out.println("---------------------------");
    }
}

class SingleRoom extends Room {
    public SingleRoom() {
        super(1, 200, 2000);
    }

    public String getRoomType() {
        return "Single Room";
    }
}

class DoubleRoom extends Room {
    public DoubleRoom() {
        super(2, 350, 3500);
    }

    public String getRoomType() {
        return "Double Room";
    }
}

class SuiteRoom extends Room {
    public SuiteRoom() {
        super(3, 600, 7000);
    }

    public String getRoomType() {
        return "Suite Room";
    }
}

public class UseCase2RoomInitialization {

    public static void main(String[] args) {

        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        int singleAvailability = 10;
        int doubleAvailability = 6;
        int suiteAvailability = 2;

        System.out.println("Available Room Types\n");

        single.displayRoomDetails();
        System.out.println("Available: " + singleAvailability + "\n");

        doubleRoom.displayRoomDetails();
        System.out.println("Available: " + doubleAvailability + "\n");

        suite.displayRoomDetails();
        System.out.println("Available: " + suiteAvailability + "\n");

        System.out.println("Thank you for using Book My Stay App");
    }
}