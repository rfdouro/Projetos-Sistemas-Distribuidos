
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
 *         <element name="LanguageISOCodeResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "languageISOCodeResult"
})
@XmlRootElement(name = "LanguageISOCodeResponse")
public class LanguageISOCodeResponse {

    @XmlElement(name = "LanguageISOCodeResult", required = true)
    protected String languageISOCodeResult;

    /**
     * Obtém o valor da propriedade languageISOCodeResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageISOCodeResult() {
        return languageISOCodeResult;
    }

    /**
     * Define o valor da propriedade languageISOCodeResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageISOCodeResult(String value) {
        this.languageISOCodeResult = value;
    }

}
