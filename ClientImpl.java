package rmi;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.List;
import java.util.ArrayList;

public class ClientImpl extends UnicastRemoteObject implements ChatInterface {

    List<ClientCallback> clients;

    public ClientImpl() throws RemoteException {
        clients = new ArrayList<>();
    }

    public void registerClient(ClientCallback client) throws RemoteException {
        clients.add(client);
        System.out.println("Client connected...");
    }
}