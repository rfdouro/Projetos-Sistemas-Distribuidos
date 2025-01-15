package br.rfdouro.rmiinterfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author romulo
 */
public interface PrintMessage extends Remote {

 int imprimeMensagem(String mess) throws RemoteException;

}
