package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloServer {
	public static void main(String[] arges) {
		try {
			HelloImpl obj = new HelloImpl();
			
			Registry registry = LocateRegistry.createRegistry(2000);
			registry.rebind("HelloService", obj);
					
			System.out.println("Server started....");		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
