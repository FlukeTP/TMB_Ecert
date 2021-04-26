
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardOrderRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardOrderRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CardOrderRec"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardOrderRef_Type", propOrder = {
    "cardOrderRec"
})
public class CardOrderRefType {

    @XmlElement(name = "CardOrderRec", required = true)
    protected CardOrderRecType cardOrderRec;

    /**
     * Gets the value of the cardOrderRec property.
     * 
     * @return
     *     possible object is
     *     {@link CardOrderRecType }
     *     
     */
    public CardOrderRecType getCardOrderRec() {
        return cardOrderRec;
    }

    /**
     * Sets the value of the cardOrderRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardOrderRecType }
     *     
     */
    public void setCardOrderRec(CardOrderRecType value) {
        this.cardOrderRec = value;
    }

}
