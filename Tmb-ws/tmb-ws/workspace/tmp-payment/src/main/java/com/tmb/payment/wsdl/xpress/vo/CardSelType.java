
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardSel_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardSel_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CardKeys"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardSel_Type", propOrder = {
    "cardKeys"
})
public class CardSelType {

    @XmlElementRef(name = "CardKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CardKeysType>> cardKeys;

    /**
     * Gets the value of the cardKeys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardKeys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.CardKeysType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.CardKeysType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CardKeysType>> getCardKeys() {
        if (cardKeys == null) {
            cardKeys = new ArrayList<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CardKeysType>>();
        }
        return this.cardKeys;
    }

}
