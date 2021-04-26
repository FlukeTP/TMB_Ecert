
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyAppPrefKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyAppPrefKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}PartyAppPrefId"/&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}PartyAppPrefIdent"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyKeys" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}WidgetIdent"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}NotAvailInd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyAppPrefKeys_Type", propOrder = {
    "partyAppPrefId",
    "partyAppPrefIdent",
    "partyKeys",
    "widgetIdent",
    "notAvailInd"
})
public class PartyAppPrefKeysType {

    @XmlElement(name = "PartyAppPrefId")
    protected String partyAppPrefId;
    @XmlElement(name = "PartyAppPrefIdent")
    protected PartyAppPrefIdentType partyAppPrefIdent;
    @XmlElementRef(name = "PartyKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyKeysType> partyKeys;
    @XmlElement(name = "WidgetIdent", required = true)
    protected String widgetIdent;
    @XmlElement(name = "NotAvailInd")
    protected Boolean notAvailInd;

    /**
     * Gets the value of the partyAppPrefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyAppPrefId() {
        return partyAppPrefId;
    }

    /**
     * Sets the value of the partyAppPrefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyAppPrefId(String value) {
        this.partyAppPrefId = value;
    }

    /**
     * Gets the value of the partyAppPrefIdent property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAppPrefIdentType }
     *     
     */
    public PartyAppPrefIdentType getPartyAppPrefIdent() {
        return partyAppPrefIdent;
    }

    /**
     * Sets the value of the partyAppPrefIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAppPrefIdentType }
     *     
     */
    public void setPartyAppPrefIdent(PartyAppPrefIdentType value) {
        this.partyAppPrefIdent = value;
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
     * Gets the value of the widgetIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidgetIdent() {
        return widgetIdent;
    }

    /**
     * Sets the value of the widgetIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidgetIdent(String value) {
        this.widgetIdent = value;
    }

    /**
     * Gets the value of the notAvailInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotAvailInd() {
        return notAvailInd;
    }

    /**
     * Sets the value of the notAvailInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotAvailInd(Boolean value) {
        this.notAvailInd = value;
    }

}
