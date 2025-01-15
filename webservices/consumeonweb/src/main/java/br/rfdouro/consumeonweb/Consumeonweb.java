/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.rfdouro.consumeonweb;

import br.rfdouro.consumeonweb.client.calculator.CalculatorSoap;
import br.rfdouro.consumeonweb.client.infos.CountryInfoServiceSoapType;
import jakarta.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;

/**
 *
 * @author romulo
 */
public class Consumeonweb {

 public static void main(String[] args) throws MalformedURLException {
  URL urlcalc = new URL("http://www.dneonline.com/calculator.asmx?WSDL");

  Service s = Service.create(urlcalc, new QName("http://tempuri.org/", "Calculator"));

  CalculatorSoap cs = s.getPort(CalculatorSoap.class);

  int r = cs.add(1, 2);

  System.out.println("r = " + r);

  URL urlcalc2 = new URL("http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso?WSDL");

  Service s2 = Service.create(urlcalc2, new QName("http://www.oorsprong.org/websamples.countryinfo", "CountryInfoService"));

  CountryInfoServiceSoapType cs2 = s2.getPort(CountryInfoServiceSoapType.class);

  var ci = cs2.fullCountryInfoAllCountries();
  ci.getTCountryInfo().forEach(x -> System.out.println(x.getSName()));

  System.out.println(ci);

 }
}
