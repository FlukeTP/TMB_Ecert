
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyAcctRelRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyAcctRelRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PartyAcctRelId"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PartyAcctRelKeys"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyAcctRelInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyAcctRelEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyAcctRelAuth" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyAcctRelStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyAcctRelRec_Type", propOrder = {
    "partyAcctRelId",
    "partyAcctRelKeys",
    "partyAcctRelInfo",
    "partyAcctRelEnvr",
    "partyAcctRelAuth",
    "partyAcctRelStatus"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.PartyAcctRelRecType.class
})
public class PartyAcctRelRecType {

    @XmlElement(name = "PartyAcctRelId")
    protected String partyAcctRelId;
    @XmlElementRef(name = "PartyAcctRelKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyAcctRelKeysType> partyAcctRelKeys;
    @XmlElementRef(name = "PartyAcctRelInfo", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyAcctRelInfoType> partyAcctRelInfo;
    @XmlElement(name = "PartyAcctRelEnvr")
    protected PartyAcctRelEnvrType partyAcctRelEnvr;
    @XmlElement(name = "PartyAcctRelAuth")
    protected PartyAcctRelAuthType partyAcctRelAuth;
    @XmlElement(name = "PartyAcctRelStatus")
    protected PartyAcctRelStatusType partyAcctRelStatus;

    /**
     * Gets the value of the partyAcctRelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyAcctRelId() {
        return partyAcctRelId;
    }

    /**
     * Sets the value of the partyAcctRelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyAcctRelId(String value) {
        this.partyAcctRelId = value;
    }

    /**
     * Gets the value of the partyAcctRelKeys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyAcctRelKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyAcctRelKeysType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyAcctRelKeysType> getPartyAcctRelKeys() {
        return partyAcctRelKeys;
    }

    /**
     * Sets the value of the partyAcctRelKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyAcctRelKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyAcctRelKeysType }{@code >}
     *     
     */
    public void setPartyAcctRelKeys(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyAcctRelKeysType> value) {
        this.partyAcctRelKeys = value;
    }

    /**
     * Gets the value of the partyAcctRelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyAcctRelInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyAcctRelInfoType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyAcctRelInfoType> getPartyAcctRelInfo() {
        return partyAcctRelInfo;
    }

    /**
     * Sets the value of the partyAcctRelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyAcctRelInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyAcctRelInfoType }{@code >}
     *     
     */
    public void setPartyAcctRelInfo(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyAcctRelInfoType> value) {
        this.partyAcctRelInfo = value;
    }

    /**
     * Gets the value of the partyAcctRelEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAcctRelEnvrType }
     *     
     */
    public PartyAcctRelEnvrType getPartyAcctRelEnvr() {
        return partyAcctRelEnvr;
    }

    /**
     * Sets the value of the partyAcctRelEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAcctRelEnvrType }
     *     
     */
    public void setPartyAcctRelEnvr(PartyAcctRelEnvrType value) {
        this.partyAcctRelEnvr = value;
    }

    /**
     * Gets the value of the partyAcctRelAuth property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAcctRelAuthType }
     *     
     */
    public PartyAcctRelAuthType getPartyAcctRelAuth() {
        return partyAcctRelAuth;
    }

    /**
     * Sets the value of the partyAcctRelAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAcctRelAuthType }
     *     
     */
    public void setPartyAcctRelAuth(PartyAcctRelAuthType value) {
        this.partyAcctRelAuth = value;
    }

    /**
     * Gets the value of the partyAcctRelStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAcctRelStatusType }
     *     
     */
    public PartyAcctRelStatusType getPartyAcctRelStatus() {
        return partyAcctRelStatus;
    }

    /**
     * Sets the value of the partyAcctRelStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAcctRelStatusType }
     *     
     */
    public void setPartyAcctRelStatus(PartyAcctRelStatusType value) {
        this.partyAcctRelStatus = value;
    }

}
