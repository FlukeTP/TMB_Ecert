
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Offer_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Offer_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OfferIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OfferType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AcceptInd" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ProductIdent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Offer_Type", propOrder = {
    "offerIdent",
    "offerType",
    "acceptInd",
    "productIdent"
})
public class OfferType {

    @XmlElement(name = "OfferIdent")
    protected String offerIdent;
    @XmlElement(name = "OfferType")
    protected String offerType;
    @XmlElement(name = "AcceptInd")
    protected Boolean acceptInd;
    @XmlElement(name = "ProductIdent", namespace = "urn:ifxforum-org:XSD:1")
    protected String productIdent;

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
     * Gets the value of the offerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferType() {
        return offerType;
    }

    /**
     * Sets the value of the offerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferType(String value) {
        this.offerType = value;
    }

    /**
     * Gets the value of the acceptInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceptInd() {
        return acceptInd;
    }

    /**
     * Sets the value of the acceptInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptInd(Boolean value) {
        this.acceptInd = value;
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

}
