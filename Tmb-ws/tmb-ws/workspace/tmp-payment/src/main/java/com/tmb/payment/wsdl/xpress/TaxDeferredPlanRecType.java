
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxDeferredPlanRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxDeferredPlanRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}TaxDeferredPlanId"/&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}TaxDeferredPlanKeys"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TaxDeferredPlanInfo"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TaxDeferredPlanEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TaxDeferredPlanAuth" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TaxDeferredPlanStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxDeferredPlanRec_Type", propOrder = {
    "taxDeferredPlanId",
    "taxDeferredPlanKeys",
    "taxDeferredPlanInfo",
    "taxDeferredPlanEnvr",
    "taxDeferredPlanAuth",
    "taxDeferredPlanStatus"
})
public class TaxDeferredPlanRecType {

    @XmlElement(name = "TaxDeferredPlanId")
    protected String taxDeferredPlanId;
    @XmlElement(name = "TaxDeferredPlanKeys")
    protected TaxDeferredPlanKeysType taxDeferredPlanKeys;
    @XmlElement(name = "TaxDeferredPlanInfo", required = true)
    protected TaxDeferredPlanInfoType taxDeferredPlanInfo;
    @XmlElement(name = "TaxDeferredPlanEnvr")
    protected TaxDeferredPlanEnvrType taxDeferredPlanEnvr;
    @XmlElement(name = "TaxDeferredPlanAuth")
    protected TaxDeferredPlanAuthType taxDeferredPlanAuth;
    @XmlElement(name = "TaxDeferredPlanStatus")
    protected TaxDeferredPlanStatusType taxDeferredPlanStatus;

    /**
     * Gets the value of the taxDeferredPlanId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDeferredPlanId() {
        return taxDeferredPlanId;
    }

    /**
     * Sets the value of the taxDeferredPlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxDeferredPlanId(String value) {
        this.taxDeferredPlanId = value;
    }

    /**
     * Gets the value of the taxDeferredPlanKeys property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDeferredPlanKeysType }
     *     
     */
    public TaxDeferredPlanKeysType getTaxDeferredPlanKeys() {
        return taxDeferredPlanKeys;
    }

    /**
     * Sets the value of the taxDeferredPlanKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDeferredPlanKeysType }
     *     
     */
    public void setTaxDeferredPlanKeys(TaxDeferredPlanKeysType value) {
        this.taxDeferredPlanKeys = value;
    }

    /**
     * Gets the value of the taxDeferredPlanInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDeferredPlanInfoType }
     *     
     */
    public TaxDeferredPlanInfoType getTaxDeferredPlanInfo() {
        return taxDeferredPlanInfo;
    }

    /**
     * Sets the value of the taxDeferredPlanInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDeferredPlanInfoType }
     *     
     */
    public void setTaxDeferredPlanInfo(TaxDeferredPlanInfoType value) {
        this.taxDeferredPlanInfo = value;
    }

    /**
     * Gets the value of the taxDeferredPlanEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDeferredPlanEnvrType }
     *     
     */
    public TaxDeferredPlanEnvrType getTaxDeferredPlanEnvr() {
        return taxDeferredPlanEnvr;
    }

    /**
     * Sets the value of the taxDeferredPlanEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDeferredPlanEnvrType }
     *     
     */
    public void setTaxDeferredPlanEnvr(TaxDeferredPlanEnvrType value) {
        this.taxDeferredPlanEnvr = value;
    }

    /**
     * Gets the value of the taxDeferredPlanAuth property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDeferredPlanAuthType }
     *     
     */
    public TaxDeferredPlanAuthType getTaxDeferredPlanAuth() {
        return taxDeferredPlanAuth;
    }

    /**
     * Sets the value of the taxDeferredPlanAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDeferredPlanAuthType }
     *     
     */
    public void setTaxDeferredPlanAuth(TaxDeferredPlanAuthType value) {
        this.taxDeferredPlanAuth = value;
    }

    /**
     * Gets the value of the taxDeferredPlanStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDeferredPlanStatusType }
     *     
     */
    public TaxDeferredPlanStatusType getTaxDeferredPlanStatus() {
        return taxDeferredPlanStatus;
    }

    /**
     * Sets the value of the taxDeferredPlanStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDeferredPlanStatusType }
     *     
     */
    public void setTaxDeferredPlanStatus(TaxDeferredPlanStatusType value) {
        this.taxDeferredPlanStatus = value;
    }

}
