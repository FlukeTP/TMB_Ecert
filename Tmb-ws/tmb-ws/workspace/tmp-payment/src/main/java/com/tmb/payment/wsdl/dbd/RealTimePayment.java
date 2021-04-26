
package com.tmb.payment.wsdl.dbd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for realTimePayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="realTimePayment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="message" type="{http://service.payment.dbd.gov/}paymentPayLoad" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "realTimePayment", propOrder = {
    "message"
})
public class RealTimePayment {

    protected PaymentPayLoad message;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentPayLoad }
     *     
     */
    public PaymentPayLoad getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentPayLoad }
     *     
     */
    public void setMessage(PaymentPayLoad value) {
        this.message = value;
    }

}
