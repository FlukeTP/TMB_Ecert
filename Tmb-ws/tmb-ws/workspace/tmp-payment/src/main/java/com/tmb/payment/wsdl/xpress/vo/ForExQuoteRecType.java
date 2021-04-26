
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForExQuoteRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForExQuoteRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ForExQuoteId"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ForExQuoteKeys"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ForExQuoteInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ForExQuoteEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ForExQuoteAuth" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ForExQuoteStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForExQuoteRec_Type", propOrder = {
    "forExQuoteId",
    "forExQuoteKeys",
    "forExQuoteInfo",
    "forExQuoteEnvr",
    "forExQuoteAuth",
    "forExQuoteStatus"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.ForExQuoteRecType.class
})
public class ForExQuoteRecType {

    @XmlElement(name = "ForExQuoteId")
    protected String forExQuoteId;
    @XmlElement(name = "ForExQuoteKeys")
    protected ForExQuoteKeysType forExQuoteKeys;
    @XmlElement(name = "ForExQuoteInfo", required = true)
    protected ForExQuoteInfoType forExQuoteInfo;
    @XmlElement(name = "ForExQuoteEnvr")
    protected ForExQuoteEnvrType forExQuoteEnvr;
    @XmlElement(name = "ForExQuoteAuth")
    protected ForExQuoteAuthType forExQuoteAuth;
    @XmlElement(name = "ForExQuoteStatus", required = true)
    protected ForExQuoteStatusType forExQuoteStatus;

    /**
     * Gets the value of the forExQuoteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForExQuoteId() {
        return forExQuoteId;
    }

    /**
     * Sets the value of the forExQuoteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForExQuoteId(String value) {
        this.forExQuoteId = value;
    }

    /**
     * Gets the value of the forExQuoteKeys property.
     * 
     * @return
     *     possible object is
     *     {@link ForExQuoteKeysType }
     *     
     */
    public ForExQuoteKeysType getForExQuoteKeys() {
        return forExQuoteKeys;
    }

    /**
     * Sets the value of the forExQuoteKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExQuoteKeysType }
     *     
     */
    public void setForExQuoteKeys(ForExQuoteKeysType value) {
        this.forExQuoteKeys = value;
    }

    /**
     * Gets the value of the forExQuoteInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ForExQuoteInfoType }
     *     
     */
    public ForExQuoteInfoType getForExQuoteInfo() {
        return forExQuoteInfo;
    }

    /**
     * Sets the value of the forExQuoteInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExQuoteInfoType }
     *     
     */
    public void setForExQuoteInfo(ForExQuoteInfoType value) {
        this.forExQuoteInfo = value;
    }

    /**
     * Gets the value of the forExQuoteEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link ForExQuoteEnvrType }
     *     
     */
    public ForExQuoteEnvrType getForExQuoteEnvr() {
        return forExQuoteEnvr;
    }

    /**
     * Sets the value of the forExQuoteEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExQuoteEnvrType }
     *     
     */
    public void setForExQuoteEnvr(ForExQuoteEnvrType value) {
        this.forExQuoteEnvr = value;
    }

    /**
     * Gets the value of the forExQuoteAuth property.
     * 
     * @return
     *     possible object is
     *     {@link ForExQuoteAuthType }
     *     
     */
    public ForExQuoteAuthType getForExQuoteAuth() {
        return forExQuoteAuth;
    }

    /**
     * Sets the value of the forExQuoteAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExQuoteAuthType }
     *     
     */
    public void setForExQuoteAuth(ForExQuoteAuthType value) {
        this.forExQuoteAuth = value;
    }

    /**
     * Gets the value of the forExQuoteStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ForExQuoteStatusType }
     *     
     */
    public ForExQuoteStatusType getForExQuoteStatus() {
        return forExQuoteStatus;
    }

    /**
     * Sets the value of the forExQuoteStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExQuoteStatusType }
     *     
     */
    public void setForExQuoteStatus(ForExQuoteStatusType value) {
        this.forExQuoteStatus = value;
    }

}
