
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
 *         <element name="sCountryISOCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "sCountryISOCode"
})
@XmlRootElement(name = "CountryFlag")
public class CountryFlag {

    @XmlElement(required = true)
    protected String sCountryISOCode;

    /**
     * Obtém o valor da propriedade sCountryISOCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCountryISOCode() {
        return sCountryISOCode;
    }

    /**
     * Define o valor da propriedade sCountryISOCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCountryISOCode(String value) {
        this.sCountryISOCode = value;
    }

}
