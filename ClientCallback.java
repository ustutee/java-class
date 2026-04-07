package rmi;

import java.rmi.*;

public interface ClientCallback {

    void receiveMesaage(String msg) throws RemoteException;

}