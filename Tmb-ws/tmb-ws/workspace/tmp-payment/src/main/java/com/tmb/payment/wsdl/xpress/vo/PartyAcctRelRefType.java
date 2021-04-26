
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyAcctRelRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyAcctRelRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PartyAcctRelKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PartyAcctRelRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PartyAcctRelInfo"/&gt;
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
@XmlType(name = "PartyAcctRelRef_Type", propOrder = {
    "partyAcctRelKeys",
    "partyAcctRelRec",
    "partyAcctRelInfo"
})
public class PartyAcctRelRefType {

    @XmlElementRef(name = "PartyAcctRelKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyAcctRelKeysType> partyAcctRelKeys;
    @XmlElementRef(name = "PartyAcctRelRec", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyAcctRelRecType> partyAcctRelRec;
    @XmlElementRef(name = "PartyAcctRelInfo", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyAcctRelInfoType> partyAcctRelInfo;

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
     * Gets the value of the partyAcctRelRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyAcctRelRecType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyAcctRelRecType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyAcctRelRecType> getPartyAcctRelRec() {
        return partyAcctRelRec;
    }

    /**
     * Sets the value of the partyAcctRelRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyAcctRelRecType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyAcctRelRecType }{@code >}
     *     
     */
    public void setPartyAcctRelRec(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyAcctRelRecType> value) {
        this.partyAcctRelRec = value;
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

}
