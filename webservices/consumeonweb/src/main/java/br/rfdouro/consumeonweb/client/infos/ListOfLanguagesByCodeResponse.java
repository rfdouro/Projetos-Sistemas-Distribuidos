
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
 *         <element name="ListOfLanguagesByCodeResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftLanguage"/>
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
    "listOfLanguagesByCodeResult"
})
@XmlRootElement(name = "ListOfLanguagesByCodeResponse")
public class ListOfLanguagesByCodeResponse {

    @XmlElement(name = "ListOfLanguagesByCodeResult", required = true)
    protected ArrayOftLanguage listOfLanguagesByCodeResult;

    /**
     * Obtém o valor da propriedade listOfLanguagesByCodeResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftLanguage }
     *     
     */
    public ArrayOftLanguage getListOfLanguagesByCodeResult() {
        return listOfLanguagesByCodeResult;
    }

    /**
     * Define o valor da propriedade listOfLanguagesByCodeResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftLanguage }
     *     
     */
    public void setListOfLanguagesByCodeResult(ArrayOftLanguage value) {
        this.listOfLanguagesByCodeResult = value;
    }

}
