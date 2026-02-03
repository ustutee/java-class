abstract class Vehicle {

    abstract void start();

    void fuel() {
        System.out.println("This vehicle needs fuel.");
    }
}

class Car extends Vehicle {

    void start() {
        System.out.println("Car starts with a key or button.");
    }
}


public class abstracteg{
    public static void main(String[] args) {

        Car c = new Car();

        c.start();
        c.fuel();
    }
}