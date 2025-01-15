
package br.rfdouro.consumeonweb.client.infos;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CountriesUsingCurrencyResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftCountryCodeAndName"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "countriesUsingCurrencyResult"
})
@XmlRootElement(name = "CountriesUsingCurrencyResponse")
public class CountriesUsingCurrencyResponse {

    @XmlElement(name = "CountriesUsingCurrencyResult", required = true)
    protected ArrayOftCountryCodeAndName countriesUsingCurrencyResult;

    /**
     * Obtém o valor da propriedade countriesUsingCurrencyResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftCountryCodeAndName }
     *     
     */
    public ArrayOftCountryCodeAndName getCountriesUsingCurrencyResult() {
        return countriesUsingCurrencyResult;
    }

    /**
     * Define o valor da propriedade countriesUsingCurrencyResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftCountryCodeAndName }
     *     
     */
    public void setCountriesUsingCurrencyResult(ArrayOftCountryCodeAndName value) {
        this.countriesUsingCurrencyResult = value;
    }

}
