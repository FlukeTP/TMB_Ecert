
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardOrderInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardOrderInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OrderSchedDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CardDesign" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardOrderInfo_Type", propOrder = {
    "orderSchedDt",
    "cardDesign"
})
public class CardOrderInfoType {

    @XmlElement(name = "OrderSchedDt")
    protected String orderSchedDt;
    @XmlElement(name = "CardDesign")
    protected String cardDesign;

    /**
     * Gets the value of the orderSchedDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderSchedDt() {
        return orderSchedDt;
    }

    /**
     * Sets the value of the orderSchedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderSchedDt(String value) {
        this.orderSchedDt = value;
    }

    /**
     * Gets the value of the cardDesign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardDesign() {
        return cardDesign;
    }

    /**
     * Sets the value of the cardDesign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardDesign(String value) {
        this.cardDesign = value;
    }

}
