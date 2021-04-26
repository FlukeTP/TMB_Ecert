
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyPartyRelKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyPartyRelKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}BaseKeys_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SvcIdent" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PartyPartyRelId"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}PartyKeys"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}RelPartyKeys"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}PartyRelRole" minOccurs="0"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}PartyRelType" minOccurs="0"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}PartyRelName" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyPartyRelKeys_Type", propOrder = {
    "svcIdent",
    "partyPartyRelId",
    "partyKeys",
    "relPartyKeys",
    "partyRelRole",
    "partyRelType",
    "partyRelName"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.PartyPartyRelKeysType.class
})
public class PartyPartyRelKeysType
    extends BaseKeysType
{

    @XmlElement(name = "SvcIdent")
    protected String svcIdent;
    @XmlElement(name = "PartyPartyRelId")
    protected String partyPartyRelId;
    @XmlElementRef(name = "PartyKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyKeysType> partyKeys;
    @XmlElement(name = "RelPartyKeys")
    protected RelPartyKeysType relPartyKeys;
    @XmlElement(name = "PartyRelRole")
    protected String partyRelRole;
    @XmlElement(name = "PartyRelType")
    protected String partyRelType;
    @XmlElement(name = "PartyRelName")
    protected String partyRelName;

    /**
     * Gets the value of the svcIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcIdent() {
        return svcIdent;
    }

    /**
     * Sets the value of the svcIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcIdent(String value) {
        this.svcIdent = value;
    }

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
     * Gets the value of the relPartyKeys property.
     * 
     * @return
     *     possible object is
     *     {@link RelPartyKeysType }
     *     
     */
    public RelPartyKeysType getRelPartyKeys() {
        return relPartyKeys;
    }

    /**
     * Sets the value of the relPartyKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelPartyKeysType }
     *     
     */
    public void setRelPartyKeys(RelPartyKeysType value) {
        this.relPartyKeys = value;
    }

    /**
     * Gets the value of the partyRelRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyRelRole() {
        return partyRelRole;
    }

    /**
     * Sets the value of the partyRelRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyRelRole(String value) {
        this.partyRelRole = value;
    }

    /**
     * Gets the value of the partyRelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyRelType() {
        return partyRelType;
    }

    /**
     * Sets the value of the partyRelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyRelType(String value) {
        this.partyRelType = value;
    }

    /**
     * Gets the value of the partyRelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyRelName() {
        return partyRelName;
    }

    /**
     * Sets the value of the partyRelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyRelName(String value) {
        this.partyRelName = value;
    }

}
