/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.rfdouro.rmiclient;

import br.rfdouro.rmiinterfaces.PrintMessage;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author romulo
 */
public class RMIClient {

 public static void main(String[] args) {
  // Set the Security Manager that we want to use.
  // The Security Manager must be set, or it will not work.
  /*if (System.getSecurityManager() == null) {
   System.setSecurityManager(new SecurityManager());
  }*/

  try {
   String name = "RMI-EchoMessage";
   Registry registry = LocateRegistry.getRegistry("localhost", 1099);
   PrintMessage comp = (PrintMessage) registry.lookup(name);

   System.out.println("About to try to print!");

   String messageToEcho = "Hi from the client!";
   if (args.length > 0) {
    messageToEcho = args[0];
   }
   int returnVal = comp.imprimeMensagem(messageToEcho);

   System.out.println("The return value from the server is: " + returnVal);
  } catch (Exception e) {
   System.err.println("Exception while trying to echo:");
   e.printStackTrace();
  }
 }
}
