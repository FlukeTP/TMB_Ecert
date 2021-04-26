
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyKeys"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyAuth"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyStatusRec_Type", propOrder = {
    "partyKeys",
    "partyAuth",
    "partyEnvr",
    "partyStatus"
})
public class PartyStatusRecType {

    @XmlElementRef(name = "PartyKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyKeysType> partyKeys;
    @XmlElementRef(name = "PartyAuth", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyAuthType> partyAuth;
    @XmlElement(name = "PartyEnvr")
    protected PartyEnvrType partyEnvr;
    @XmlElement(name = "PartyStatus", required = true)
    protected PartyStatusType partyStatus;

    /**
     * Gets the value of the partyKeys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyKeysType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyKeysType> getPartyKeys() {
        return partyKeys;
    }

    /**
     * Sets the value of the partyKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyKeysType }{@code >}
     *     
     */
    public void setPartyKeys(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyKeysType> value) {
        this.partyKeys = value;
    }

    /**
     * Gets the value of the partyAuth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyAuthType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyAuthType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyAuthType> getPartyAuth() {
        return partyAuth;
    }

    /**
     * Sets the value of the partyAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyAuthType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyAuthType }{@code >}
     *     
     */
    public void setPartyAuth(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyAuthType> value) {
        this.partyAuth = value;
    }

    /**
     * Gets the value of the partyEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyEnvrType }
     *     
     */
    public PartyEnvrType getPartyEnvr() {
        return partyEnvr;
    }

    /**
     * Sets the value of the partyEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyEnvrType }
     *     
     */
    public void setPartyEnvr(PartyEnvrType value) {
        this.partyEnvr = value;
    }

    /**
     * Gets the value of the partyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PartyStatusType }
     *     
     */
    public PartyStatusType getPartyStatus() {
        return partyStatus;
    }

    /**
     * Sets the value of the partyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyStatusType }
     *     
     */
    public void setPartyStatus(PartyStatusType value) {
        this.partyStatus = value;
    }

}
