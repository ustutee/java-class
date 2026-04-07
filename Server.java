package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            CalculatorImpl obj = new CalculatorImpl();

            Registry registry = LocateRegistry.createRegistry(5050);
            registry.rebind("CalcService", obj);

            System.out.println("Server started...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}