
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.PartyRefType;


/**
 * <p>Java class for TaxDeferredPlanSel_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxDeferredPlanSel_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}TaxDeferredPlanKeys"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{http://www.fnf.com/xes}TDPlanIdent" minOccurs="0"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}PartyRef" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.fnf.com/xes}TaxDeferredPlanType" minOccurs="0"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}TaxYear" minOccurs="0"/&gt;
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
@XmlType(name = "TaxDeferredPlanSel_Type", propOrder = {
    "taxDeferredPlanKeys",
    "tdPlanIdent",
    "partyRef",
    "taxDeferredPlanType",
    "taxYear"
})
public class TaxDeferredPlanSelType {

    @XmlElement(name = "TaxDeferredPlanKeys")
    protected TaxDeferredPlanKeysType taxDeferredPlanKeys;
    @XmlElement(name = "TDPlanIdent")
    protected TDPlanIdentType tdPlanIdent;
    @XmlElement(name = "PartyRef", namespace = "urn:ifxforum-org:XSD:1")
    protected PartyRefType partyRef;
    @XmlElement(name = "TaxDeferredPlanType")
    protected String taxDeferredPlanType;
    @XmlElement(name = "TaxYear", namespace = "urn:ifxforum-org:XSD:1")
    protected Long taxYear;

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
     * Gets the value of the tdPlanIdent property.
     * 
     * @return
     *     possible object is
     *     {@link TDPlanIdentType }
     *     
     */
    public TDPlanIdentType getTDPlanIdent() {
        return tdPlanIdent;
    }

    /**
     * Sets the value of the tdPlanIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDPlanIdentType }
     *     
     */
    public void setTDPlanIdent(TDPlanIdentType value) {
        this.tdPlanIdent = value;
    }

    /**
     * Gets the value of the partyRef property.
     * 
     * @return
     *     possible object is
     *     {@link PartyRefType }
     *     
     */
    public PartyRefType getPartyRef() {
        return partyRef;
    }

    /**
     * Sets the value of the partyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRefType }
     *     
     */
    public void setPartyRef(PartyRefType value) {
        this.partyRef = value;
    }

    /**
     * Gets the value of the taxDeferredPlanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDeferredPlanType() {
        return taxDeferredPlanType;
    }

    /**
     * Sets the value of the taxDeferredPlanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxDeferredPlanType(String value) {
        this.taxDeferredPlanType = value;
    }

    /**
     * Gets the value of the taxYear property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaxYear() {
        return taxYear;
    }

    /**
     * Sets the value of the taxYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaxYear(Long value) {
        this.taxYear = value;
    }

}
