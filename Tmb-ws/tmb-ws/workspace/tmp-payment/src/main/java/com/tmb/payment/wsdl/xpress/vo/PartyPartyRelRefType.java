
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyPartyRelRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyPartyRelRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PartyPartyRelKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PartyPartyRelRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PartyPartyRelInfo"/&gt;
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
@XmlType(name = "PartyPartyRelRef_Type", propOrder = {
    "partyPartyRelKeys",
    "partyPartyRelRec",
    "partyPartyRelInfo"
})
public class PartyPartyRelRefType {

    @XmlElementRef(name = "PartyPartyRelKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyPartyRelKeysType> partyPartyRelKeys;
    @XmlElementRef(name = "PartyPartyRelRec", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyPartyRelRecType> partyPartyRelRec;
    @XmlElementRef(name = "PartyPartyRelInfo", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyPartyRelInfoType> partyPartyRelInfo;

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
     * Gets the value of the partyPartyRelRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyPartyRelRecType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyPartyRelRecType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyPartyRelRecType> getPartyPartyRelRec() {
        return partyPartyRelRec;
    }

    /**
     * Sets the value of the partyPartyRelRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyPartyRelRecType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyPartyRelRecType }{@code >}
     *     
     */
    public void setPartyPartyRelRec(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyPartyRelRecType> value) {
        this.partyPartyRelRec = value;
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

}
