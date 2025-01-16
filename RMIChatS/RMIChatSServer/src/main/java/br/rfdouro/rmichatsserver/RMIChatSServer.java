package br.rfdouro.rmichatsserver;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author romulo
 */
public class RMIChatSServer {

 public static void main(String[] args) {
  try {
   LocateRegistry.createRegistry(1099);
  } catch (Exception e) {
  }

  try {
   // First, create the real object which will do the requested function.
   ServerImpl implementation = new ServerImpl();
   // Export the object.
   /*Server stub = (Server) UnicastRemoteObject.exportObject(implementation, 1099);
   Registry registry = LocateRegistry.getRegistry();
   // I don't know why we have to rebind at all.
   // However, this does set the string that you need to use in order to lookup the remote class.
   registry.rebind("RMI-ChatS", stub);*/

   String ip = "localhost";
   try (final DatagramSocket socket = new DatagramSocket()) {
    socket.connect(InetAddress.getByName("8.8.8.8"), 10002);
    ip = socket.getLocalAddress().getHostAddress();
   }

   Naming.rebind("rmi://" + ip + "/RMI-ChatS", implementation);
  } catch (Exception ex) {
   ex.printStackTrace();
   return;
  }
  System.out.println("RODANDO!");
  System.out.println("Servidor de chat está executando.");
 }
}
