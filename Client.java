package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 5050);

            Calculator stub = (Calculator) registry.lookup("CalcService");

            int result = stub.add(5, 3);
            System.out.println("Add: " + result);

            System.out.println("Sub: " + stub.sub(10, 4));
            System.out.println("Mul: " + stub.mul(6, 2));
            System.out.println("Div: " + stub.div(8, 2));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
