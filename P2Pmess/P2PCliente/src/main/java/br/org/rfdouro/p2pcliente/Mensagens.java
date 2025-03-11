package br.org.rfdouro.p2pcliente;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author rfdouro
 */
public interface Mensagens extends Remote {

 void enviamensagem(String mensagem) throws RemoteException;
}
