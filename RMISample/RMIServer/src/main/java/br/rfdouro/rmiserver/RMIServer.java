package br.rfdouro.rmiserver;

import br.rfdouro.rmiinterfaces.PrintMessage;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author romulo
 */
public class RMIServer {

 public static void main(String[] args) {

  try {
   LocateRegistry.createRegistry(1099);
  } catch (Exception e) {
  }

  try {
   // First, create the real object which will do the requested function.
   PrintMessageimpl implementation = new PrintMessageimpl();
   // Export the object.
   PrintMessage stub = (PrintMessage) UnicastRemoteObject.exportObject(implementation, 1099);
   Registry registry = LocateRegistry.getRegistry();
   // I don't know why we have to rebind at all.
   // However, this does set the string that you need to use in order to lookup the remote class.
   registry.rebind("RMI-EchoMessage", stub);
  } catch (RemoteException ex) {
   ex.printStackTrace();
   return;
  }
  System.out.println("Bound!");
  System.out.println("Server will wait forever for messages.");
 }
}
