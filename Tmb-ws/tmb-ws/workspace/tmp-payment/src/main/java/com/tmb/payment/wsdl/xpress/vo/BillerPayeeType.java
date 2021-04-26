
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillerPayee_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillerPayee_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BillerKeys"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BillerContact" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}HistRetentionDays" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BillerPayInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillerPayee_Type", propOrder = {
    "billerKeys",
    "billerContact",
    "histRetentionDays",
    "billerPayInfo"
})
public class BillerPayeeType {

    @XmlElement(name = "BillerKeys", required = true)
    protected BillerKeysType billerKeys;
    @XmlElement(name = "BillerContact")
    protected BillerContactType billerContact;
    @XmlElement(name = "HistRetentionDays")
    protected Long histRetentionDays;
    @XmlElement(name = "BillerPayInfo")
    protected BillerPayInfoType billerPayInfo;

    /**
     * Gets the value of the billerKeys property.
     * 
     * @return
     *     possible object is
     *     {@link BillerKeysType }
     *     
     */
    public BillerKeysType getBillerKeys() {
        return billerKeys;
    }

    /**
     * Sets the value of the billerKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillerKeysType }
     *     
     */
    public void setBillerKeys(BillerKeysType value) {
        this.billerKeys = value;
    }

    /**
     * Gets the value of the billerContact property.
     * 
     * @return
     *     possible object is
     *     {@link BillerContactType }
     *     
     */
    public BillerContactType getBillerContact() {
        return billerContact;
    }

    /**
     * Sets the value of the billerContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillerContactType }
     *     
     */
    public void setBillerContact(BillerContactType value) {
        this.billerContact = value;
    }

    /**
     * Gets the value of the histRetentionDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHistRetentionDays() {
        return histRetentionDays;
    }

    /**
     * Sets the value of the histRetentionDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHistRetentionDays(Long value) {
        this.histRetentionDays = value;
    }

    /**
     * Gets the value of the billerPayInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BillerPayInfoType }
     *     
     */
    public BillerPayInfoType getBillerPayInfo() {
        return billerPayInfo;
    }

    /**
     * Sets the value of the billerPayInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillerPayInfoType }
     *     
     */
    public void setBillerPayInfo(BillerPayInfoType value) {
        this.billerPayInfo = value;
    }

}
