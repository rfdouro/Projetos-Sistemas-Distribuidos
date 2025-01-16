package br.rfdouro.rmichatsserver;

import br.rfdouro.rmichatsinterface.Cliente;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import br.rfdouro.rmichatsinterface.Server;

/**
 *
 * @author romulo
 */
public class ServerImpl extends UnicastRemoteObject implements Server {

 private HashSet<Cliente> usuarios = null;
 //private static HashMap<String, PrintStream> usuarios = new HashMap<>();

 public ServerImpl() throws RemoteException {
  super();
  this.usuarios = new HashSet<>();
 }

 @Override
 public void adicionaUsuario(String nomeUsuario) throws RemoteException {
  try {
   //Object o = Naming.lookup("rmi://localhost/cliente_" + nomeUsuario);
   Cliente c = (Cliente) Naming.lookup("rmi://localhost/cliente_" + nomeUsuario);
   usuarios.add(c);
   System.out.println("Usuário " + nomeUsuario + " adicionado");
  } catch (NotBoundException ex) {
   Logger.getLogger(ServerImpl.class.getName()).log(Level.SEVERE, null, ex);
  } catch (MalformedURLException ex) {
   Logger.getLogger(ServerImpl.class.getName()).log(Level.SEVERE, null, ex);
  }
 }

 @Override
 public void removeUsuario(String nomeUsuario) throws RemoteException {
  Cliente cli = usuarios.stream().filter(c -> {
   try {
    return c.getNomeUsuario().equals(nomeUsuario);
   } catch (RemoteException ex) {
    Logger.getLogger(ServerImpl.class.getName()).log(Level.SEVERE, null, ex);
   }
   return false;
  }).findFirst().get();
  if (cli != null) {
   usuarios.remove(cli);
  }
 }

 @Override
 public String enviaMensagem(String nomeUsuario, String mensagem) throws RemoteException {
  String mess = "[" + nomeUsuario + "] : " + mensagem;
  System.out.println(mess);
  usuarios.forEach((k) -> {
   try {
    if (!k.getNomeUsuario().equals(nomeUsuario)) {
     try {
      k.mensagemServidor(mess);
     } catch (RemoteException ex) {
      Logger.getLogger(ServerImpl.class.getName()).log(Level.SEVERE, null, ex);
     }
    } else {
     k.mensagemServidor("VOCE : " + mess);
    }
   } catch (Exception e) {

   }
  });
  return mess;
 }

}
