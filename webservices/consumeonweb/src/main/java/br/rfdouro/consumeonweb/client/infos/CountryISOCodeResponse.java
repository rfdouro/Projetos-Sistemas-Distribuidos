
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
 *         <element name="CountryISOCodeResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "countryISOCodeResult"
})
@XmlRootElement(name = "CountryISOCodeResponse")
public class CountryISOCodeResponse {

    @XmlElement(name = "CountryISOCodeResult", required = true)
    protected String countryISOCodeResult;

    /**
     * Obtém o valor da propriedade countryISOCodeResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryISOCodeResult() {
        return countryISOCodeResult;
    }

    /**
     * Define o valor da propriedade countryISOCodeResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryISOCodeResult(String value) {
        this.countryISOCodeResult = value;
    }

}
