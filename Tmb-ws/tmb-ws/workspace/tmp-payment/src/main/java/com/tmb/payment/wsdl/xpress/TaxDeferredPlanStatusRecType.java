
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxDeferredPlanStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxDeferredPlanStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TaxDeferredPlanKeys" minOccurs="0"/&gt;
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
@XmlType(name = "TaxDeferredPlanStatusRec_Type", propOrder = {
    "taxDeferredPlanKeys",
    "taxDeferredPlanStatus"
})
public class TaxDeferredPlanStatusRecType {

    @XmlElement(name = "TaxDeferredPlanKeys")
    protected TaxDeferredPlanKeysType taxDeferredPlanKeys;
    @XmlElement(name = "TaxDeferredPlanStatus")
    protected TaxDeferredPlanStatusType taxDeferredPlanStatus;

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
