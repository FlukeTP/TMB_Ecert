
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyPartyRelSel_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyPartyRelSel_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PartyPartyRelKeys"/&gt;
 *           &lt;sequence&gt;
 *             &lt;sequence&gt;
 *               &lt;element ref="{urn:ifxforum-org:XSD:1}PartyKeys" minOccurs="0"/&gt;
 *               &lt;element ref="{urn:ifxforum-org:XSD:1}RelPartyKeys" minOccurs="0"/&gt;
 *               &lt;element ref="{urn:ifxforum-org:XSD:1}PartyRelName" minOccurs="0"/&gt;
 *               &lt;element ref="{urn:ifxforum-org:XSD:1}PartyRelType" minOccurs="0"/&gt;
 *               &lt;element ref="{urn:ifxforum-org:XSD:1}PartyRole" minOccurs="0"/&gt;
 *               &lt;element ref="{urn:ifxforum-org:XSD:1}RelPartyRole" minOccurs="0"/&gt;
 *               &lt;element ref="{urn:ifxforum-org:XSD:1}DtRange" minOccurs="0"/&gt;
 *             &lt;/sequence&gt;
 *           &lt;/sequence&gt;
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
@XmlType(name = "PartyPartyRelSel_Type", propOrder = {
    "partyPartyRelKeys",
    "partyKeys",
    "relPartyKeys",
    "partyRelName",
    "partyRelType",
    "partyRole",
    "relPartyRole",
    "dtRange"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.PartyPartyRelSelType.class
})
public class PartyPartyRelSelType {

    @XmlElementRef(name = "PartyPartyRelKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyPartyRelKeysType> partyPartyRelKeys;
    @XmlElementRef(name = "PartyKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyKeysType> partyKeys;
    @XmlElement(name = "RelPartyKeys")
    protected RelPartyKeysType relPartyKeys;
    @XmlElement(name = "PartyRelName")
    protected String partyRelName;
    @XmlElement(name = "PartyRelType")
    protected String partyRelType;
    @XmlElement(name = "PartyRole")
    protected String partyRole;
    @XmlElement(name = "RelPartyRole")
    protected String relPartyRole;
    @XmlElementRef(name = "DtRange", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.DtRangeType> dtRange;

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
     * Gets the value of the partyRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyRole() {
        return partyRole;
    }

    /**
     * Sets the value of the partyRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyRole(String value) {
        this.partyRole = value;
    }

    /**
     * Gets the value of the relPartyRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelPartyRole() {
        return relPartyRole;
    }

    /**
     * Sets the value of the relPartyRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelPartyRole(String value) {
        this.relPartyRole = value;
    }

    /**
     * Gets the value of the dtRange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.DtRangeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.DtRangeType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.DtRangeType> getDtRange() {
        return dtRange;
    }

    /**
     * Sets the value of the dtRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.DtRangeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.DtRangeType }{@code >}
     *     
     */
    public void setDtRange(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.DtRangeType> value) {
        this.dtRange = value;
    }

}
