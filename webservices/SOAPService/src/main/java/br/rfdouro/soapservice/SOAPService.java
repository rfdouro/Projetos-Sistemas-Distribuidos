package br.rfdouro.soapservice;

import br.rfdouro.soapservice.impl.CertidaoNascimentoImpl;
import jakarta.xml.ws.Endpoint;

/**
 *
 * @author romulo
 */
public class SOAPService {

 public static void main(String[] args) {
  CertidaoNascimentoImpl certidaoNascimento = new CertidaoNascimentoImpl();
  Endpoint.publish("http://localhost:8085/servico/certidao", certidaoNascimento);
  System.out.println("Serviço rodando");
 }
}
