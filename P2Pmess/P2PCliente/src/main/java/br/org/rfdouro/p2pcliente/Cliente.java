package br.org.rfdouro.p2pcliente;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

/**
 *
 * @author rfdouro
 */
public class Cliente {

 private static String nomeCliente = null;

 private static void conectarCliente() throws Exception {
  MensagensImpl impl = new MensagensImpl();
  nomeCliente = JOptionPane.showInputDialog("Nome do cliente");
  Naming.rebind("rmi://localhost/cliente_" + nomeCliente, impl);
 }

 private static void listarClientes() throws Exception {
  Registry reg = LocateRegistry.getRegistry();
  for (String x : reg.list()) {
   System.out.println(x);
  }
 }

 private static void enviarMensagemCliente() throws Exception {
  String outro = JOptionPane.showInputDialog("Nome do outro cliente");
  Mensagens chat = (Mensagens) Naming.lookup("rmi://localhost/cliente_" + outro);
  if (chat != null) {
   String mensagem = JOptionPane.showInputDialog("mensagem");
   chat.enviamensagem("de: " + nomeCliente + " mensagem: " + mensagem);
  }
 }

 private static void menu() throws Exception {
  int op = 0;
  do {
   op = Integer.parseInt(JOptionPane.showInputDialog(null, "digite a opção\n0 - sair\n1 - conectar\n2 - ver clientes\n3 - enviar mensagem", "Cliente: " + nomeCliente, JOptionPane.QUESTION_MESSAGE));
   switch (op) {
    case 1 ->
     conectarCliente();
    case 2 ->
     listarClientes();
    case 3 ->
     enviarMensagemCliente();
    case 0 ->
     System.exit(0);
   }
  } while (true);
 }

 public static void main(String[] args) {
  try {
   LocateRegistry.createRegistry(1099);
  } catch (Exception ex) {
   System.err.println("Já registrada a porta");
  }

  System.out.println("Rodando");

  try {
   menu();
  } catch (Exception ex) {
   //JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
   ex.printStackTrace();
  }

 }
}
