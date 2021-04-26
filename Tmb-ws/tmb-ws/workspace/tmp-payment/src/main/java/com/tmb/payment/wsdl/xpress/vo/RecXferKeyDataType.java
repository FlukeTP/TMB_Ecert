
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecXferKeyData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecXferKeyData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}AcctFromKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}AcctToKeys" minOccurs="0"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SeqNum" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}NotAvailableInd"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecXferKeyData_Type", propOrder = {
    "acctFromKeys",
    "acctToKeys",
    "seqNum",
    "notAvailableInd"
})
public class RecXferKeyDataType {

    @XmlElement(name = "AcctFromKeys")
    protected AcctFromKeysType acctFromKeys;
    @XmlElement(name = "AcctToKeys")
    protected AcctToKeysType acctToKeys;
    @XmlElement(name = "SeqNum")
    protected Long seqNum;
    @XmlElement(name = "NotAvailableInd")
    protected Boolean notAvailableInd;

    /**
     * Gets the value of the acctFromKeys property.
     * 
     * @return
     *     possible object is
     *     {@link AcctFromKeysType }
     *     
     */
    public AcctFromKeysType getAcctFromKeys() {
        return acctFromKeys;
    }

    /**
     * Sets the value of the acctFromKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctFromKeysType }
     *     
     */
    public void setAcctFromKeys(AcctFromKeysType value) {
        this.acctFromKeys = value;
    }

    /**
     * Gets the value of the acctToKeys property.
     * 
     * @return
     *     possible object is
     *     {@link AcctToKeysType }
     *     
     */
    public AcctToKeysType getAcctToKeys() {
        return acctToKeys;
    }

    /**
     * Sets the value of the acctToKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctToKeysType }
     *     
     */
    public void setAcctToKeys(AcctToKeysType value) {
        this.acctToKeys = value;
    }

    /**
     * Gets the value of the seqNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeqNum() {
        return seqNum;
    }

    /**
     * Sets the value of the seqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeqNum(Long value) {
        this.seqNum = value;
    }

    /**
     * Gets the value of the notAvailableInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotAvailableInd() {
        return notAvailableInd;
    }

    /**
     * Sets the value of the notAvailableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotAvailableInd(Boolean value) {
        this.notAvailableInd = value;
    }

}
