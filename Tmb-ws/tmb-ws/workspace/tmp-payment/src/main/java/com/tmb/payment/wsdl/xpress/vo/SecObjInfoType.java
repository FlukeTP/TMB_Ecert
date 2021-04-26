
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SecObjInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecObjInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecObjPurpose"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecObjType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecObjUse" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CryptType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecEncryptRef" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecSignRef" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecObjDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecObjValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecObjInfo_Type", propOrder = {
    "secObjPurpose",
    "secObjType",
    "secObjUse",
    "cryptType",
    "secEncryptRef",
    "secSignRef",
    "secObjDesc",
    "secObjValue"
})
public class SecObjInfoType {

    @XmlElement(name = "SecObjPurpose", required = true)
    protected String secObjPurpose;
    @XmlElement(name = "SecObjType", required = true)
    protected String secObjType;
    @XmlElement(name = "SecObjUse")
    protected String secObjUse;
    @XmlElement(name = "CryptType", required = true)
    protected String cryptType;
    @XmlElement(name = "SecEncryptRef")
    protected SecEncryptRefType secEncryptRef;
    @XmlElement(name = "SecSignRef")
    protected SecSignRefType secSignRef;
    @XmlElement(name = "SecObjDesc")
    protected String secObjDesc;
    @XmlElement(name = "SecObjValue", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] secObjValue;

    /**
     * Gets the value of the secObjPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecObjPurpose() {
        return secObjPurpose;
    }

    /**
     * Sets the value of the secObjPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecObjPurpose(String value) {
        this.secObjPurpose = value;
    }

    /**
     * Gets the value of the secObjType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecObjType() {
        return secObjType;
    }

    /**
     * Sets the value of the secObjType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecObjType(String value) {
        this.secObjType = value;
    }

    /**
     * Gets the value of the secObjUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecObjUse() {
        return secObjUse;
    }

    /**
     * Sets the value of the secObjUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecObjUse(String value) {
        this.secObjUse = value;
    }

    /**
     * Gets the value of the cryptType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCryptType() {
        return cryptType;
    }

    /**
     * Sets the value of the cryptType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCryptType(String value) {
        this.cryptType = value;
    }

    /**
     * Gets the value of the secEncryptRef property.
     * 
     * @return
     *     possible object is
     *     {@link SecEncryptRefType }
     *     
     */
    public SecEncryptRefType getSecEncryptRef() {
        return secEncryptRef;
    }

    /**
     * Sets the value of the secEncryptRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecEncryptRefType }
     *     
     */
    public void setSecEncryptRef(SecEncryptRefType value) {
        this.secEncryptRef = value;
    }

    /**
     * Gets the value of the secSignRef property.
     * 
     * @return
     *     possible object is
     *     {@link SecSignRefType }
     *     
     */
    public SecSignRefType getSecSignRef() {
        return secSignRef;
    }

    /**
     * Sets the value of the secSignRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecSignRefType }
     *     
     */
    public void setSecSignRef(SecSignRefType value) {
        this.secSignRef = value;
    }

    /**
     * Gets the value of the secObjDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecObjDesc() {
        return secObjDesc;
    }

    /**
     * Sets the value of the secObjDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecObjDesc(String value) {
        this.secObjDesc = value;
    }

    /**
     * Gets the value of the secObjValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getSecObjValue() {
        return secObjValue;
    }

    /**
     * Sets the value of the secObjValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecObjValue(byte[] value) {
        this.secObjValue = value;
    }

}
