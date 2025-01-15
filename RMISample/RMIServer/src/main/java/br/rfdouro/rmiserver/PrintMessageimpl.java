package br.rfdouro.rmiserver;

import br.rfdouro.rmiinterfaces.PrintMessage;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author romulo
 */
public class PrintMessageimpl implements PrintMessage {

 @Override
 public int imprimeMensagem(String mess) throws RemoteException {
  System.out.println("Mensagem = " + mess);
  return mess.length();
 }

}
