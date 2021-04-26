
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyPartyRelRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyPartyRelRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PartyPartyRelId"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PartyPartyRelKeys"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyPartyRelInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyPartyRelEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyPartyRelAuth" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyPartyRelStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyPartyRelRec_Type", propOrder = {
    "partyPartyRelId",
    "partyPartyRelKeys",
    "partyPartyRelInfo",
    "partyPartyRelEnvr",
    "partyPartyRelAuth",
    "partyPartyRelStatus"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.PartyPartyRelRecType.class
})
public class PartyPartyRelRecType {

    @XmlElement(name = "PartyPartyRelId")
    protected String partyPartyRelId;
    @XmlElementRef(name = "PartyPartyRelKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyPartyRelKeysType> partyPartyRelKeys;
    @XmlElementRef(name = "PartyPartyRelInfo", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyPartyRelInfoType> partyPartyRelInfo;
    @XmlElement(name = "PartyPartyRelEnvr")
    protected PartyPartyRelEnvrType partyPartyRelEnvr;
    @XmlElement(name = "PartyPartyRelAuth")
    protected PartyPartyRelAuthType partyPartyRelAuth;
    @XmlElement(name = "PartyPartyRelStatus", required = true)
    protected PartyPartyRelStatusType partyPartyRelStatus;

    /**
     * Gets the value of the partyPartyRelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyPartyRelId() {
        return partyPartyRelId;
    }

    /**
     * Sets the value of the partyPartyRelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyPartyRelId(String value) {
        this.partyPartyRelId = value;
    }

    /**
     * Gets the value of the partyPartyRelKeys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyPartyRelKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyPartyRelKeysType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyPartyRelKeysType> getPartyPartyRelKeys() {
        return partyPartyRelKeys;
    }

    /**
     * Sets the value of the partyPartyRelKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyPartyRelKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyPartyRelKeysType }{@code >}
     *     
     */
    public void setPartyPartyRelKeys(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyPartyRelKeysType> value) {
        this.partyPartyRelKeys = value;
    }

    /**
     * Gets the value of the partyPartyRelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyPartyRelInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyPartyRelInfoType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyPartyRelInfoType> getPartyPartyRelInfo() {
        return partyPartyRelInfo;
    }

    /**
     * Sets the value of the partyPartyRelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyPartyRelInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyPartyRelInfoType }{@code >}
     *     
     */
    public void setPartyPartyRelInfo(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyPartyRelInfoType> value) {
        this.partyPartyRelInfo = value;
    }

    /**
     * Gets the value of the partyPartyRelEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyPartyRelEnvrType }
     *     
     */
    public PartyPartyRelEnvrType getPartyPartyRelEnvr() {
        return partyPartyRelEnvr;
    }

    /**
     * Sets the value of the partyPartyRelEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyPartyRelEnvrType }
     *     
     */
    public void setPartyPartyRelEnvr(PartyPartyRelEnvrType value) {
        this.partyPartyRelEnvr = value;
    }

    /**
     * Gets the value of the partyPartyRelAuth property.
     * 
     * @return
     *     possible object is
     *     {@link PartyPartyRelAuthType }
     *     
     */
    public PartyPartyRelAuthType getPartyPartyRelAuth() {
        return partyPartyRelAuth;
    }

    /**
     * Sets the value of the partyPartyRelAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyPartyRelAuthType }
     *     
     */
    public void setPartyPartyRelAuth(PartyPartyRelAuthType value) {
        this.partyPartyRelAuth = value;
    }

    /**
     * Gets the value of the partyPartyRelStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PartyPartyRelStatusType }
     *     
     */
    public PartyPartyRelStatusType getPartyPartyRelStatus() {
        return partyPartyRelStatus;
    }

    /**
     * Sets the value of the partyPartyRelStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyPartyRelStatusType }
     *     
     */
    public void setPartyPartyRelStatus(PartyPartyRelStatusType value) {
        this.partyPartyRelStatus = value;
    }

}
