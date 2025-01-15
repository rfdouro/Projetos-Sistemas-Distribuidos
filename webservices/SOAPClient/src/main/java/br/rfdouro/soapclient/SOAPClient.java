package br.rfdouro.soapclient;

import br.rfdouro.soapclient.client.certidaonascimento.CertidaoNascimento;
import jakarta.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;

/**
 *
 * @author romulo
 */
public class SOAPClient {

 public static void main(String[] args) throws MalformedURLException {
  URL urlcalc = new URL("http://localhost:8085/servico/certidao?WSDL");

  Service s = Service.create(urlcalc, new QName("http://impl.soapservice.rfdouro.br/", "CertidaoNascimentoImplService"));

  CertidaoNascimento cn = s.getPort(CertidaoNascimento.class);

  int id = cn.calculaIdade("04/05/1978");

  System.out.println("id = " + id);
 }
}
