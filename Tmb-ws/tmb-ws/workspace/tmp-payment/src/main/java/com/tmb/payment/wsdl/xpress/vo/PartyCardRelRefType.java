
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyCardRelRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyCardRelRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PartyCardRelKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PartyCardRelRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PartyCardRelInfo"/&gt;
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
@XmlType(name = "PartyCardRelRef_Type", propOrder = {
    "partyCardRelKeys",
    "partyCardRelRec",
    "partyCardRelInfo"
})
public class PartyCardRelRefType {

    @XmlElement(name = "PartyCardRelKeys")
    protected PartyCardRelKeysType partyCardRelKeys;
    @XmlElementRef(name = "PartyCardRelRec", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyCardRelRecType> partyCardRelRec;
    @XmlElement(name = "PartyCardRelInfo")
    protected PartyCardRelInfoType partyCardRelInfo;

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
     * Gets the value of the partyCardRelRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyCardRelRecType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyCardRelRecType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyCardRelRecType> getPartyCardRelRec() {
        return partyCardRelRec;
    }

    /**
     * Sets the value of the partyCardRelRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyCardRelRecType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyCardRelRecType }{@code >}
     *     
     */
    public void setPartyCardRelRec(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyCardRelRecType> value) {
        this.partyCardRelRec = value;
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

}
