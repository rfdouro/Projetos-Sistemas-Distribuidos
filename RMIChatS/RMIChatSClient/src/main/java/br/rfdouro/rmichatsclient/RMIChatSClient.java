/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.rfdouro.rmichatsclient;

import br.rfdouro.rmichatsinterface.Cliente;
import java.io.PrintStream;
import java.io.Serializable;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;
import br.rfdouro.rmichatsinterface.Server;

/**
 *
 * @author romulo
 */
public class RMIChatSClient {

 public static void main(String[] args) {
  try {
   String name = "RMI-ChatS";
   //Registry registry = LocateRegistry.getRegistry("localhost", 1099);
   Server chat = (Server) Naming.lookup("rmi://localhost/" + name);
   int op = 0;
   String nome = null;
   PrintStream ous = System.out;

   do {
    if (nome == null) {
     String l = JOptionPane.showInputDialog("Deseja?\n 1- acessar;\n 0- sair");
     op = (l != null) ? Integer.parseInt(l) : -1;
    } else {
     String l = JOptionPane.showInputDialog("Olá " + nome + ", deseja?\n 2- enviar;\n 0- sair");
     op = (l != null) ? Integer.parseInt(l) : -1;
    }

    switch (op) {
     case 1:
      if (nome == null) {
       nome = JOptionPane.showInputDialog("Digite o nome");
       try {
        ClientImpl cliente = new ClientImpl(nome);
        Naming.rebind("rmi://localhost/cliente_" + nome, cliente);
        chat.adicionaUsuario(nome);
       } catch (Exception ex) {
        ex.printStackTrace();
       }
      }
      break;
     case 2:
      if (nome != null) {
       String mess = JOptionPane.showInputDialog("Digite a mensagem");
       chat.enviaMensagem(nome, mess);
      }
      break;
     case 0:
      chat.removeUsuario(nome);
      Naming.unbind("rmi://localhost/cliente_" + nome);
      System.exit(0);
      break;
     default:
      break;
    }
   } while (op != 0);
  } catch (Exception e) {
   System.err.println("Exception while trying to echo:");
   e.printStackTrace();
  }
 }
}
