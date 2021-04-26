
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardOrderRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardOrderRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CardOrderId"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CardOrderInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardOrderRec_Type", propOrder = {
    "cardOrderId",
    "cardOrderInfo"
})
public class CardOrderRecType {

    @XmlElement(name = "CardOrderId", required = true)
    protected String cardOrderId;
    @XmlElement(name = "CardOrderInfo", required = true)
    protected CardOrderInfoType cardOrderInfo;

    /**
     * Gets the value of the cardOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardOrderId() {
        return cardOrderId;
    }

    /**
     * Sets the value of the cardOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardOrderId(String value) {
        this.cardOrderId = value;
    }

    /**
     * Gets the value of the cardOrderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CardOrderInfoType }
     *     
     */
    public CardOrderInfoType getCardOrderInfo() {
        return cardOrderInfo;
    }

    /**
     * Sets the value of the cardOrderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardOrderInfoType }
     *     
     */
    public void setCardOrderInfo(CardOrderInfoType value) {
        this.cardOrderInfo = value;
    }

}
