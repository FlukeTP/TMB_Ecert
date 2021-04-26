
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SPName" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PartyId"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}LoginIdent"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PartyIdent"/&gt;
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
@XmlType(name = "PartyKeys_Type", propOrder = {
    "spName",
    "partyId",
    "loginIdent",
    "partyIdent"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.PartyKeysType.class,
    RelPartyKeysType.class
})
public class PartyKeysType {

    @XmlElement(name = "SPName")
    protected String spName;
    @XmlElement(name = "PartyId")
    protected String partyId;
    @XmlElement(name = "LoginIdent")
    protected LoginIdentType loginIdent;
    @XmlElementRef(name = "PartyIdent", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyIdentType> partyIdent;

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
     * Gets the value of the partyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyId(String value) {
        this.partyId = value;
    }

    /**
     * Gets the value of the loginIdent property.
     * 
     * @return
     *     possible object is
     *     {@link LoginIdentType }
     *     
     */
    public LoginIdentType getLoginIdent() {
        return loginIdent;
    }

    /**
     * Sets the value of the loginIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginIdentType }
     *     
     */
    public void setLoginIdent(LoginIdentType value) {
        this.loginIdent = value;
    }

    /**
     * Gets the value of the partyIdent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyIdentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyIdentType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyIdentType> getPartyIdent() {
        return partyIdent;
    }

    /**
     * Sets the value of the partyIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyIdentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyIdentType }{@code >}
     *     
     */
    public void setPartyIdent(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyIdentType> value) {
        this.partyIdent = value;
    }

}
