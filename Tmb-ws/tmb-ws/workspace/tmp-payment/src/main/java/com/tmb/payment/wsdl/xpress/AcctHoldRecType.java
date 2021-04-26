
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctHoldRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctHoldRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}AcctHoldId"/&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}AcctHoldKeys"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AcctHoldInfo"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AcctHoldEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AcctHoldAuth" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AcctHoldStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctHoldRec_Type", propOrder = {
    "acctHoldId",
    "acctHoldKeys",
    "acctHoldInfo",
    "acctHoldEnvr",
    "acctHoldAuth",
    "acctHoldStatus"
})
public class AcctHoldRecType {

    @XmlElement(name = "AcctHoldId")
    protected String acctHoldId;
    @XmlElement(name = "AcctHoldKeys")
    protected AcctHoldKeysType acctHoldKeys;
    @XmlElement(name = "AcctHoldInfo", required = true)
    protected AcctHoldInfoType acctHoldInfo;
    @XmlElement(name = "AcctHoldEnvr")
    protected AcctHoldEnvrType acctHoldEnvr;
    @XmlElement(name = "AcctHoldAuth")
    protected AcctHoldAuthType acctHoldAuth;
    @XmlElement(name = "AcctHoldStatus")
    protected AcctHoldStatusType acctHoldStatus;

    /**
     * Gets the value of the acctHoldId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctHoldId() {
        return acctHoldId;
    }

    /**
     * Sets the value of the acctHoldId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctHoldId(String value) {
        this.acctHoldId = value;
    }

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

    /**
     * Gets the value of the acctHoldEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link AcctHoldEnvrType }
     *     
     */
    public AcctHoldEnvrType getAcctHoldEnvr() {
        return acctHoldEnvr;
    }

    /**
     * Sets the value of the acctHoldEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctHoldEnvrType }
     *     
     */
    public void setAcctHoldEnvr(AcctHoldEnvrType value) {
        this.acctHoldEnvr = value;
    }

    /**
     * Gets the value of the acctHoldAuth property.
     * 
     * @return
     *     possible object is
     *     {@link AcctHoldAuthType }
     *     
     */
    public AcctHoldAuthType getAcctHoldAuth() {
        return acctHoldAuth;
    }

    /**
     * Sets the value of the acctHoldAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctHoldAuthType }
     *     
     */
    public void setAcctHoldAuth(AcctHoldAuthType value) {
        this.acctHoldAuth = value;
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
