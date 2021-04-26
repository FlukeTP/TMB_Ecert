
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecObjKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecObjKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SPName" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SecObjId"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SecObjPurpose"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecObjKeys_Type", propOrder = {
    "spName",
    "secObjId",
    "secObjPurpose"
})
@XmlSeeAlso({
    SecEncryptRefType.class,
    SecSignRefType.class
})
public class SecObjKeysType {

    @XmlElement(name = "SPName")
    protected String spName;
    @XmlElement(name = "SecObjId")
    protected String secObjId;
    @XmlElement(name = "SecObjPurpose")
    protected String secObjPurpose;

    /**
     * Gets the value of the spName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPName() {
        return spName;
    }

    /**
     * Sets the value of the spName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPName(String value) {
        this.spName = value;
    }

    /**
     * Gets the value of the secObjId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecObjId() {
        return secObjId;
    }

    /**
     * Sets the value of the secObjId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecObjId(String value) {
        this.secObjId = value;
    }

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

}
