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

class CargoShip extends Transport {

    CargoShip(String trackingId, String destination) {
        super(trackingId, destination);
    }

    @Override
    void dispatch() {
        System.out.println("Cargo Ship " + trackingId + " sailing...");
    }
}

public class abscs3 {
    public static void main(String[] args) {

        Transport t = new DeliveryDrone("D101", "NYC");
        t.dispatch(); 

        GPS g = new DeliveryDrone("D101", "NYC");
        System.out.println(g.getCoordinates());

        if (t instanceof GPS) {
            System.out.println("This transport has GPS capability.");
        }

        List<Transport> list = new ArrayList<>();
        list.add(new DeliveryDrone("D102", "LA"));
        list.add(new Truck("T201", "Chicago"));
        list.add(new CargoShip("S301", "Miami"));

        for (Transport tr : list) {
            tr.dispatch();

            if (tr instanceof GPS) {
                GPS gps = (GPS) tr;
                System.out.println("Coordinates: " + gps.getCoordinates());
            }
        }
    }
}