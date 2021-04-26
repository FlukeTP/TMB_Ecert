
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaCashData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaCashData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CashValidity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CashQuality" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CashSignature" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CashSerialNum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaCashData_Type", propOrder = {
    "cashValidity",
    "cashQuality",
    "cashSignature",
    "cashSerialNum"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.MediaCashDataType.class
})
public class MediaCashDataType {

    @XmlElement(name = "CashValidity")
    protected String cashValidity;
    @XmlElement(name = "CashQuality")
    protected String cashQuality;
    @XmlElement(name = "CashSignature")
    protected CashSignatureType cashSignature;
    @XmlElement(name = "CashSerialNum")
    protected String cashSerialNum;

    /**
     * Gets the value of the cashValidity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashValidity() {
        return cashValidity;
    }

    /**
     * Sets the value of the cashValidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashValidity(String value) {
        this.cashValidity = value;
    }

    /**
     * Gets the value of the cashQuality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashQuality() {
        return cashQuality;
    }

    /**
     * Sets the value of the cashQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashQuality(String value) {
        this.cashQuality = value;
    }

    /**
     * Gets the value of the cashSignature property.
     * 
     * @return
     *     possible object is
     *     {@link CashSignatureType }
     *     
     */
    public CashSignatureType getCashSignature() {
        return cashSignature;
    }

    /**
     * Sets the value of the cashSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashSignatureType }
     *     
     */
    public void setCashSignature(CashSignatureType value) {
        this.cashSignature = value;
    }

    /**
     * Gets the value of the cashSerialNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashSerialNum() {
        return cashSerialNum;
    }

    /**
     * Sets the value of the cashSerialNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashSerialNum(String value) {
        this.cashSerialNum = value;
    }

}
