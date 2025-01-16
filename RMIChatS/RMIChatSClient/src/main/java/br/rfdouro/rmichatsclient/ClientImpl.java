package br.rfdouro.rmichatsclient;

import br.rfdouro.rmichatsinterface.Cliente;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author romulo
 */
public class ClientImpl extends UnicastRemoteObject implements Cliente, Serializable {

 private String nomeUsuario;

 public ClientImpl(String nomeUsuario) throws Exception {
  this.nomeUsuario = nomeUsuario;
 }

 @Override
 public String getNomeUsuario() {
  return nomeUsuario;
 }

 @Override
 public void mensagemServidor(String mensagem) {
  System.out.println(mensagem);
 }

 public void setNomeUsuario(String nomeUsuario) {
  this.nomeUsuario = nomeUsuario;
 }

 @Override
 public boolean equals(Object obj) {
  if (obj != null && obj.getClass().equals(Cliente.class)) {
   Cliente c = (Cliente) obj;
   try {
    return this.nomeUsuario.equals(c.getNomeUsuario());
   } catch (RemoteException ex) {
    
   }
  }
  return false;
 }

}
