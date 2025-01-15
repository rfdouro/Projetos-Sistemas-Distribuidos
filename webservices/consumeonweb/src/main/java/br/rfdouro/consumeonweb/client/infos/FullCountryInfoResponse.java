
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
 *         <element name="FullCountryInfoResult" type="{http://www.oorsprong.org/websamples.countryinfo}tCountryInfo"/>
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
    "fullCountryInfoResult"
})
@XmlRootElement(name = "FullCountryInfoResponse")
public class FullCountryInfoResponse {

    @XmlElement(name = "FullCountryInfoResult", required = true)
    protected TCountryInfo fullCountryInfoResult;

    /**
     * Obtém o valor da propriedade fullCountryInfoResult.
     * 
     * @return
     *     possible object is
     *     {@link TCountryInfo }
     *     
     */
    public TCountryInfo getFullCountryInfoResult() {
        return fullCountryInfoResult;
    }

    /**
     * Define o valor da propriedade fullCountryInfoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link TCountryInfo }
     *     
     */
    public void setFullCountryInfoResult(TCountryInfo value) {
        this.fullCountryInfoResult = value;
    }

}
