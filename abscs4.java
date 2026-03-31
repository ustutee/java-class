import java.util.*;

abstract class Transport {
    protected String trackingId;
    protected String destination;

    Transport(String trackingId, String destination) {
        this.trackingId = trackingId;
        this.destination = destination;
    }

    abstract void dispatch();
}

interface GPS {
    String getCoordinates();

    default void pingServer() {
        System.out.println("Status: Online...");
    }
}

interface Autonomous {
    void selfNavigate();
}

class DeliveryDrone extends Transport implements GPS, Autonomous {

    DeliveryDrone(String trackingId, String destination) {
        super(trackingId, destination);
    }

    @Override
    void dispatch() {
        System.out.println("Drone " + trackingId + " taking off...");
    }

    @Override
    public String getCoordinates() {
        return "40.7128° N, 74.0060° W";
    }

    @Override
    public void selfNavigate() {
        System.out.println("Drone navigating autonomously...");
    }
}

class Truck extends Transport {

    Truck(String trackingId, String destination) {
        super(trackingId, destination);
    }

    @Override
    void dispatch() {
        System.out.println("Truck " + trackingId + " leaving via highway...");
    }
}

class CargoShip extends Transport implements GPS {

    CargoShip(String trackingId, String destination) {
        super(trackingId, destination);
    }

    @Override
    void dispatch() {
        System.out.println("Cargo Ship " + trackingId + " sailing...");
    }

    @Override
    public String getCoordinates() {
        return "25.7617° N, 80.1918° W";
    }
}

public class abscs4 {
    public static void main(String[] args) {

        Transport t = new DeliveryDrone("D101", "NYC");
        t.dispatch(); 

        GPS g = new DeliveryDrone("D101", "NYC");
        g.pingServer(); 

        Transport truck = new Truck("T201", "Chicago");
        if (truck instanceof GPS) {
            System.out.println("Truck has GPS");
        } else {
            System.out.println("Truck has NO GPS");
        }

        List<Transport> list = new ArrayList<>();
        list.add(new DeliveryDrone("D102", "LA"));
        list.add(new Truck("T202", "Delhi"));
        list.add(new CargoShip("S301", "Mumbai"));

        for (Transport tr : list) {
            tr.dispatch();

            if (tr instanceof GPS) {
                GPS gps = (GPS) tr;
                gps.pingServer(); // default method
                System.out.println("Coordinates: " + gps.getCoordinates());
            }

            if (tr instanceof Autonomous) {
                Autonomous a = (Autonomous) tr;
                a.selfNavigate();
            }

            System.out.println("-------------------");
        }
    }
}