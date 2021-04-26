
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CreditKeys" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CreditStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditStatusRec_Type", propOrder = {
    "creditKeys",
    "creditStatus"
})
public class CreditStatusRecType {

    @XmlElement(name = "CreditKeys")
    protected CreditKeysType creditKeys;
    @XmlElement(name = "CreditStatus")
    protected CreditStatusType creditStatus;

    /**
     * Gets the value of the creditKeys property.
     * 
     * @return
     *     possible object is
     *     {@link CreditKeysType }
     *     
     */
    public CreditKeysType getCreditKeys() {
        return creditKeys;
    }

    /**
     * Sets the value of the creditKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditKeysType }
     *     
     */
    public void setCreditKeys(CreditKeysType value) {
        this.creditKeys = value;
    }

    /**
     * Gets the value of the creditStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CreditStatusType }
     *     
     */
    public CreditStatusType getCreditStatus() {
        return creditStatus;
    }

    /**
     * Sets the value of the creditStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditStatusType }
     *     
     */
    public void setCreditStatus(CreditStatusType value) {
        this.creditStatus = value;
    }

}
