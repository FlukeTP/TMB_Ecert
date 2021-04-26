
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctHoldStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctHoldStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AcctHoldKeys"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AcctHoldStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctHoldStatusRec_Type", propOrder = {
    "acctHoldKeys",
    "acctHoldStatus"
})
public class AcctHoldStatusRecType {

    @XmlElement(name = "AcctHoldKeys", required = true)
    protected AcctHoldKeysType acctHoldKeys;
    @XmlElement(name = "AcctHoldStatus", required = true)
    protected AcctHoldStatusType acctHoldStatus;

    /**
     * Gets the value of the acctHoldKeys property.
     * 
     * @return
     *     possible object is
     *     {@link AcctHoldKeysType }
     *     
     */
    public AcctHoldKeysType getAcctHoldKeys() {
        return acctHoldKeys;
    }

    /**
     * Sets the value of the acctHoldKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctHoldKeysType }
     *     
     */
    public void setAcctHoldKeys(AcctHoldKeysType value) {
        this.acctHoldKeys = value;
    }

    /**
     * Gets the value of the acctHoldStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AcctHoldStatusType }
     *     
     */
    public AcctHoldStatusType getAcctHoldStatus() {
        return acctHoldStatus;
    }

    /**
     * Sets the value of the acctHoldStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctHoldStatusType }
     *     
     */
    public void setAcctHoldStatus(AcctHoldStatusType value) {
        this.acctHoldStatus = value;
    }

}
