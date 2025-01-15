package br.rfdouro.soapservice.spec;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

/**
 *
 * @author romulo
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CertidaoNascimento {

 @WebMethod
 int calculaIdade(String dtNascimento);

 @WebMethod
 String diaSemanaNascimento(String dtNascimento);

}
