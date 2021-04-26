
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfferKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}OfferId"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{http://www.fnf.com/xes}OfferIdent"/&gt;
 *             &lt;element ref="{http://www.fnf.com/xes}SalesIdent" minOccurs="0"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}PartyKeys" minOccurs="0"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}AcctKeys" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.fnf.com/xes}PricingPlanIdent" minOccurs="0"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}ProductIdent" minOccurs="0"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}EffDt" minOccurs="0"/&gt;
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
@XmlType(name = "OfferKeys_Type", propOrder = {
    "offerId",
    "offerIdent",
    "salesIdent",
    "partyKeys",
    "acctKeys",
    "pricingPlanIdent",
    "productIdent",
    "effDt"
})
public class OfferKeysType {

    @XmlElement(name = "OfferId")
    protected String offerId;
    @XmlElement(name = "OfferIdent")
    protected String offerIdent;
    @XmlElement(name = "SalesIdent")
    protected String salesIdent;
    @XmlElementRef(name = "PartyKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyKeysType> partyKeys;
    @XmlElementRef(name = "AcctKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctKeysType> acctKeys;
    @XmlElement(name = "PricingPlanIdent")
    protected String pricingPlanIdent;
    @XmlElement(name = "ProductIdent", namespace = "urn:ifxforum-org:XSD:1")
    protected String productIdent;
    @XmlElement(name = "EffDt", namespace = "urn:ifxforum-org:XSD:1")
    protected String effDt;

    /**
     * Gets the value of the offerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferId() {
        return offerId;
    }

    /**
     * Sets the value of the offerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferId(String value) {
        this.offerId = value;
    }

    /**
     * Gets the value of the offerIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferIdent() {
        return offerIdent;
    }

    /**
     * Sets the value of the offerIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferIdent(String value) {
        this.offerIdent = value;
    }

    /**
     * Gets the value of the salesIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesIdent() {
        return salesIdent;
    }

    /**
     * Sets the value of the salesIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesIdent(String value) {
        this.salesIdent = value;
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
     * Gets the value of the acctKeys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctKeysType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctKeysType> getAcctKeys() {
        return acctKeys;
    }

    /**
     * Sets the value of the acctKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctKeysType }{@code >}
     *     
     */
    public void setAcctKeys(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctKeysType> value) {
        this.acctKeys = value;
    }

    /**
     * Gets the value of the pricingPlanIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingPlanIdent() {
        return pricingPlanIdent;
    }

    /**
     * Sets the value of the pricingPlanIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingPlanIdent(String value) {
        this.pricingPlanIdent = value;
    }

    /**
     * Gets the value of the productIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductIdent() {
        return productIdent;
    }

    /**
     * Sets the value of the productIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductIdent(String value) {
        this.productIdent = value;
    }

    /**
     * Gets the value of the effDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffDt() {
        return effDt;
    }

    /**
     * Sets the value of the effDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffDt(String value) {
        this.effDt = value;
    }

}
