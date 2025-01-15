
package br.rfdouro.consumeonweb.client.calculator;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(name = "CalculatorSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculatorSoap {


    /**
     * Adds two integers. This is a test WebService. ©DNE Online
     * 
     * @param intA
     * @param intB
     * @return
     *     returns int
     */
    @WebMethod(operationName = "Add", action = "http://tempuri.org/Add")
    @WebResult(name = "AddResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Add", targetNamespace = "http://tempuri.org/", className = "br.rfdouro.consumeonweb.client.calculator.Add")
    @ResponseWrapper(localName = "AddResponse", targetNamespace = "http://tempuri.org/", className = "br.rfdouro.consumeonweb.client.calculator.AddResponse")
    public int add(
        @WebParam(name = "intA", targetNamespace = "http://tempuri.org/")
        int intA,
        @WebParam(name = "intB", targetNamespace = "http://tempuri.org/")
        int intB);

    /**
     * 
     * @param intA
     * @param intB
     * @return
     *     returns int
     */
    @WebMethod(operationName = "Subtract", action = "http://tempuri.org/Subtract")
    @WebResult(name = "SubtractResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Subtract", targetNamespace = "http://tempuri.org/", className = "br.rfdouro.consumeonweb.client.calculator.Subtract")
    @ResponseWrapper(localName = "SubtractResponse", targetNamespace = "http://tempuri.org/", className = "br.rfdouro.consumeonweb.client.calculator.SubtractResponse")
    public int subtract(
        @WebParam(name = "intA", targetNamespace = "http://tempuri.org/")
        int intA,
        @WebParam(name = "intB", targetNamespace = "http://tempuri.org/")
        int intB);

    /**
     * 
     * @param intA
     * @param intB
     * @return
     *     returns int
     */
    @WebMethod(operationName = "Multiply", action = "http://tempuri.org/Multiply")
    @WebResult(name = "MultiplyResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Multiply", targetNamespace = "http://tempuri.org/", className = "br.rfdouro.consumeonweb.client.calculator.Multiply")
    @ResponseWrapper(localName = "MultiplyResponse", targetNamespace = "http://tempuri.org/", className = "br.rfdouro.consumeonweb.client.calculator.MultiplyResponse")
    public int multiply(
        @WebParam(name = "intA", targetNamespace = "http://tempuri.org/")
        int intA,
        @WebParam(name = "intB", targetNamespace = "http://tempuri.org/")
        int intB);

    /**
     * 
     * @param intA
     * @param intB
     * @return
     *     returns int
     */
    @WebMethod(operationName = "Divide", action = "http://tempuri.org/Divide")
    @WebResult(name = "DivideResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Divide", targetNamespace = "http://tempuri.org/", className = "br.rfdouro.consumeonweb.client.calculator.Divide")
    @ResponseWrapper(localName = "DivideResponse", targetNamespace = "http://tempuri.org/", className = "br.rfdouro.consumeonweb.client.calculator.DivideResponse")
    public int divide(
        @WebParam(name = "intA", targetNamespace = "http://tempuri.org/")
        int intA,
        @WebParam(name = "intB", targetNamespace = "http://tempuri.org/")
        int intB);

}
