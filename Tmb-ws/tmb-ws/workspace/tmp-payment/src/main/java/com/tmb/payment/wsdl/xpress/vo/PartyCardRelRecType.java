
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyCardRelRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyCardRelRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PartyCardRelId"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PartyCardRelKeys"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyCardRelInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyCardRelEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyCardRelAuth" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyCardRelStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyCardRelRec_Type", propOrder = {
    "partyCardRelId",
    "partyCardRelKeys",
    "partyCardRelInfo",
    "partyCardRelEnvr",
    "partyCardRelAuth",
    "partyCardRelStatus"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.PartyCardRelRecType.class
})
public class PartyCardRelRecType {

    @XmlElement(name = "PartyCardRelId")
    protected String partyCardRelId;
    @XmlElement(name = "PartyCardRelKeys")
    protected PartyCardRelKeysType partyCardRelKeys;
    @XmlElement(name = "PartyCardRelInfo", required = true)
    protected PartyCardRelInfoType partyCardRelInfo;
    @XmlElement(name = "PartyCardRelEnvr")
    protected PartyCardRelEnvrType partyCardRelEnvr;
    @XmlElement(name = "PartyCardRelAuth")
    protected PartyCardRelAuthType partyCardRelAuth;
    @XmlElement(name = "PartyCardRelStatus", required = true)
    protected PartyCardRelStatusType partyCardRelStatus;

    /**
     * Gets the value of the partyCardRelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyCardRelId() {
        return partyCardRelId;
    }

    /**
     * Sets the value of the partyCardRelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyCardRelId(String value) {
        this.partyCardRelId = value;
    }

    /**
     * Gets the value of the partyCardRelKeys property.
     * 
     * @return
     *     possible object is
     *     {@link PartyCardRelKeysType }
     *     
     */
    public PartyCardRelKeysType getPartyCardRelKeys() {
        return partyCardRelKeys;
    }

    /**
     * Sets the value of the partyCardRelKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyCardRelKeysType }
     *     
     */
    public void setPartyCardRelKeys(PartyCardRelKeysType value) {
        this.partyCardRelKeys = value;
    }

    /**
     * Gets the value of the partyCardRelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PartyCardRelInfoType }
     *     
     */
    public PartyCardRelInfoType getPartyCardRelInfo() {
        return partyCardRelInfo;
    }

    /**
     * Sets the value of the partyCardRelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyCardRelInfoType }
     *     
     */
    public void setPartyCardRelInfo(PartyCardRelInfoType value) {
        this.partyCardRelInfo = value;
    }

    /**
     * Gets the value of the partyCardRelEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyCardRelEnvrType }
     *     
     */
    public PartyCardRelEnvrType getPartyCardRelEnvr() {
        return partyCardRelEnvr;
    }

    /**
     * Sets the value of the partyCardRelEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyCardRelEnvrType }
     *     
     */
    public void setPartyCardRelEnvr(PartyCardRelEnvrType value) {
        this.partyCardRelEnvr = value;
    }

    /**
     * Gets the value of the partyCardRelAuth property.
     * 
     * @return
     *     possible object is
     *     {@link PartyCardRelAuthType }
     *     
     */
    public PartyCardRelAuthType getPartyCardRelAuth() {
        return partyCardRelAuth;
    }

    /**
     * Sets the value of the partyCardRelAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyCardRelAuthType }
     *     
     */
    public void setPartyCardRelAuth(PartyCardRelAuthType value) {
        this.partyCardRelAuth = value;
    }

    /**
     * Gets the value of the partyCardRelStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PartyCardRelStatusType }
     *     
     */
    public PartyCardRelStatusType getPartyCardRelStatus() {
        return partyCardRelStatus;
    }

    /**
     * Sets the value of the partyCardRelStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyCardRelStatusType }
     *     
     */
    public void setPartyCardRelStatus(PartyCardRelStatusType value) {
        this.partyCardRelStatus = value;
    }

}
