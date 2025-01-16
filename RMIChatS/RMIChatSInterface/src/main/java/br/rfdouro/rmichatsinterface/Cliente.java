package br.rfdouro.rmichatsinterface;

import java.io.PrintStream;
import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author romulo
 */
public interface Cliente extends Remote {

 String getNomeUsuario() throws RemoteException;

 void mensagemServidor(String mensagem) throws RemoteException;

}
