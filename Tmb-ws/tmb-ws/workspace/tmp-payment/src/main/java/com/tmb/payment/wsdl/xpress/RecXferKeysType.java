
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.AcctKeysType;


/**
 * <p>Java class for RecXferKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecXferKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}RecXferKeys_Type"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}FromAcctKeys" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}ToAcctKeys" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}SeqNum" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecXferKeys_Type", propOrder = {
    "fromAcctKeys",
    "toAcctKeys",
    "seqNum"
})
public class RecXferKeysType
    extends com.tmb.payment.wsdl.xpress.vo.RecXferKeysType
{

    @XmlElement(name = "FromAcctKeys")
    protected AcctKeysType fromAcctKeys;
    @XmlElement(name = "ToAcctKeys")
    protected AcctKeysType toAcctKeys;
    @XmlElement(name = "SeqNum")
    protected String seqNum;

    /**
     * Gets the value of the fromAcctKeys property.
     * 
     * @return
     *     possible object is
     *     {@link AcctKeysType }
     *     
     */
    public AcctKeysType getFromAcctKeys() {
        return fromAcctKeys;
    }

    /**
     * Sets the value of the fromAcctKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctKeysType }
     *     
     */
    public void setFromAcctKeys(AcctKeysType value) {
        this.fromAcctKeys = value;
    }

    /**
     * Gets the value of the toAcctKeys property.
     * 
     * @return
     *     possible object is
     *     {@link AcctKeysType }
     *     
     */
    public AcctKeysType getToAcctKeys() {
        return toAcctKeys;
    }

    /**
     * Sets the value of the toAcctKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctKeysType }
     *     
     */
    public void setToAcctKeys(AcctKeysType value) {
        this.toAcctKeys = value;
    }

    /**
     * Gets the value of the seqNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqNum() {
        return seqNum;
    }

    /**
     * Sets the value of the seqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqNum(String value) {
        this.seqNum = value;
    }

}
