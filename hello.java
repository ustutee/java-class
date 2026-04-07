package rmi;

import java.rmi.*;
import java.rmi.RemoteException;

public interface hello extends Remote{
    String sayHello() throws RemoteException;
}

