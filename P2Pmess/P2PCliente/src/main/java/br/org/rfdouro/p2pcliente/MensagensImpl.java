package br.org.rfdouro.p2pcliente;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.JOptionPane;

/**
 *
 * @author rfdouro
 */
public class MensagensImpl extends UnicastRemoteObject implements Mensagens {

 //precisa do remoteexception no construtor quando extende o UnicastRemoteObject
 public MensagensImpl() throws RemoteException {
 }

 @Override
 public void enviamensagem(String mensagem) throws RemoteException {
  System.out.println(mensagem);
  //JOptionPane.showMessageDialog(null, mensagem);
 }

}
