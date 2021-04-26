
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.PartyRefType;


/**
 * <p>Java class for TaxDeferredPlanBenRelKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxDeferredPlanBenRelKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SPName" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}TaxDeferredPlanBenRelId"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{http://www.fnf.com/xes}BeneficiaryIdent" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.fnf.com/xes}TaxDeferredPlanId" minOccurs="0"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}PartyRef" minOccurs="0"/&gt;
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
@XmlType(name = "TaxDeferredPlanBenRelKeys_Type", propOrder = {
    "spName",
    "taxDeferredPlanBenRelId",
    "beneficiaryIdent",
    "taxDeferredPlanId",
    "partyRef"
})
public class TaxDeferredPlanBenRelKeysType {

    @XmlElement(name = "SPName", namespace = "urn:ifxforum-org:XSD:1")
    protected String spName;
    @XmlElement(name = "TaxDeferredPlanBenRelId")
    protected String taxDeferredPlanBenRelId;
    @XmlElement(name = "BeneficiaryIdent")
    protected String beneficiaryIdent;
    @XmlElement(name = "TaxDeferredPlanId")
    protected String taxDeferredPlanId;
    @XmlElement(name = "PartyRef", namespace = "urn:ifxforum-org:XSD:1")
    protected PartyRefType partyRef;

    /**
     * Gets the value of the spName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPName() {
        return spName;
    }

    /**
     * Sets the value of the spName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPName(String value) {
        this.spName = value;
    }

    /**
     * Gets the value of the taxDeferredPlanBenRelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDeferredPlanBenRelId() {
        return taxDeferredPlanBenRelId;
    }

    /**
     * Sets the value of the taxDeferredPlanBenRelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxDeferredPlanBenRelId(String value) {
        this.taxDeferredPlanBenRelId = value;
    }

    /**
     * Gets the value of the beneficiaryIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryIdent() {
        return beneficiaryIdent;
    }

    /**
     * Sets the value of the beneficiaryIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryIdent(String value) {
        this.beneficiaryIdent = value;
    }

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

}
