
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxDeferredPlanRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxDeferredPlanRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TaxDeferredPlanKeys" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TaxDeferredPlanRec" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TaxDeferredPlanInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxDeferredPlanRef_Type", propOrder = {
    "taxDeferredPlanKeys",
    "taxDeferredPlanRec",
    "taxDeferredPlanInfo"
})
public class TaxDeferredPlanRefType {

    @XmlElement(name = "TaxDeferredPlanKeys")
    protected TaxDeferredPlanKeysType taxDeferredPlanKeys;
    @XmlElement(name = "TaxDeferredPlanRec")
    protected TaxDeferredPlanRecType taxDeferredPlanRec;
    @XmlElement(name = "TaxDeferredPlanInfo")
    protected TaxDeferredPlanInfoType taxDeferredPlanInfo;

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
     * Gets the value of the taxDeferredPlanRec property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDeferredPlanRecType }
     *     
     */
    public TaxDeferredPlanRecType getTaxDeferredPlanRec() {
        return taxDeferredPlanRec;
    }

    /**
     * Sets the value of the taxDeferredPlanRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDeferredPlanRecType }
     *     
     */
    public void setTaxDeferredPlanRec(TaxDeferredPlanRecType value) {
        this.taxDeferredPlanRec = value;
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

}
