
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
 *         <element name="ListOfContinentsByNameResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftContinent"/>
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
    "listOfContinentsByNameResult"
})
@XmlRootElement(name = "ListOfContinentsByNameResponse")
public class ListOfContinentsByNameResponse {

    @XmlElement(name = "ListOfContinentsByNameResult", required = true)
    protected ArrayOftContinent listOfContinentsByNameResult;

    /**
     * Obtém o valor da propriedade listOfContinentsByNameResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftContinent }
     *     
     */
    public ArrayOftContinent getListOfContinentsByNameResult() {
        return listOfContinentsByNameResult;
    }

    /**
     * Define o valor da propriedade listOfContinentsByNameResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftContinent }
     *     
     */
    public void setListOfContinentsByNameResult(ArrayOftContinent value) {
        this.listOfContinentsByNameResult = value;
    }

}
