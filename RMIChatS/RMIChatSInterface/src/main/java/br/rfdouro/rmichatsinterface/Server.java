package br.rfdouro.rmichatsinterface;

import java.io.PrintStream;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author romulo
 */
public interface Server extends Remote {

 void adicionaUsuario(String nomeUsuario) throws RemoteException;

 void removeUsuario(String nomeUsuario) throws RemoteException;

 String enviaMensagem(String nomeUsuario, String mensagem) throws RemoteException;
}
