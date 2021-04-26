
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctHoldRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctHoldRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AcctHoldKeys"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AcctHoldRec"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AcctHoldInfo"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctHoldRef_Type", propOrder = {
    "acctHoldKeys",
    "acctHoldRec",
    "acctHoldInfo"
})
public class AcctHoldRefType {

    @XmlElement(name = "AcctHoldKeys")
    protected AcctHoldKeysType acctHoldKeys;
    @XmlElement(name = "AcctHoldRec")
    protected AcctHoldRecType acctHoldRec;
    @XmlElement(name = "AcctHoldInfo")
    protected AcctHoldInfoType acctHoldInfo;

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
     * Gets the value of the acctHoldRec property.
     * 
     * @return
     *     possible object is
     *     {@link AcctHoldRecType }
     *     
     */
    public AcctHoldRecType getAcctHoldRec() {
        return acctHoldRec;
    }

    /**
     * Sets the value of the acctHoldRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctHoldRecType }
     *     
     */
    public void setAcctHoldRec(AcctHoldRecType value) {
        this.acctHoldRec = value;
    }

    /**
     * Gets the value of the acctHoldInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AcctHoldInfoType }
     *     
     */
    public AcctHoldInfoType getAcctHoldInfo() {
        return acctHoldInfo;
    }

    /**
     * Sets the value of the acctHoldInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctHoldInfoType }
     *     
     */
    public void setAcctHoldInfo(AcctHoldInfoType value) {
        this.acctHoldInfo = value;
    }

}
