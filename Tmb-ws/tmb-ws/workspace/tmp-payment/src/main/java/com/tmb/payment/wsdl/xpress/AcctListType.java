
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.AcctIdentType;


/**
 * <p>Java class for AcctList_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctList_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}AcctKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}AcctIdent"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PrimaryAcctInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PriceCd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PriceBenCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PriceInfluenceCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PriceCycleCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctList_Type", propOrder = {
    "acctKeys",
    "acctIdent",
    "primaryAcctInd",
    "priceCd",
    "priceBenCode",
    "priceInfluenceCode",
    "priceCycleCode"
})
public class AcctListType {

    @XmlElementRef(name = "AcctKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctKeysType> acctKeys;
    @XmlElement(name = "AcctIdent", namespace = "urn:ifxforum-org:XSD:1")
    protected AcctIdentType acctIdent;
    @XmlElement(name = "PrimaryAcctInd", namespace = "urn:ifxforum-org:XSD:1")
    protected Boolean primaryAcctInd;
    @XmlElement(name = "PriceCd")
    protected String priceCd;
    @XmlElement(name = "PriceBenCode")
    protected String priceBenCode;
    @XmlElement(name = "PriceInfluenceCode")
    protected String priceInfluenceCode;
    @XmlElement(name = "PriceCycleCode")
    protected String priceCycleCode;

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
     * Gets the value of the acctIdent property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdentType }
     *     
     */
    public AcctIdentType getAcctIdent() {
        return acctIdent;
    }

    /**
     * Sets the value of the acctIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdentType }
     *     
     */
    public void setAcctIdent(AcctIdentType value) {
        this.acctIdent = value;
    }

    /**
     * Gets the value of the primaryAcctInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryAcctInd() {
        return primaryAcctInd;
    }

    /**
     * Sets the value of the primaryAcctInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryAcctInd(Boolean value) {
        this.primaryAcctInd = value;
    }

    /**
     * Gets the value of the priceCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceCd() {
        return priceCd;
    }

    /**
     * Sets the value of the priceCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceCd(String value) {
        this.priceCd = value;
    }

    /**
     * Gets the value of the priceBenCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceBenCode() {
        return priceBenCode;
    }

    /**
     * Sets the value of the priceBenCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceBenCode(String value) {
        this.priceBenCode = value;
    }

    /**
     * Gets the value of the priceInfluenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceInfluenceCode() {
        return priceInfluenceCode;
    }

    /**
     * Sets the value of the priceInfluenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceInfluenceCode(String value) {
        this.priceInfluenceCode = value;
    }

    /**
     * Gets the value of the priceCycleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceCycleCode() {
        return priceCycleCode;
    }

    /**
     * Sets the value of the priceCycleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceCycleCode(String value) {
        this.priceCycleCode = value;
    }

}
