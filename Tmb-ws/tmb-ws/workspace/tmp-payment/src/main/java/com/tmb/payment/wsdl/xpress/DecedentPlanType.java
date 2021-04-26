
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DecedentPlan_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DecedentPlan_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TaxDeferredPlanSeq" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TaxDeferredPlanId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IssuedIdent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecedentPlan_Type", propOrder = {
    "taxDeferredPlanSeq",
    "taxDeferredPlanId",
    "partyId",
    "name",
    "issuedIdent"
})
public class DecedentPlanType {

    @XmlElement(name = "TaxDeferredPlanSeq")
    protected String taxDeferredPlanSeq;
    @XmlElement(name = "TaxDeferredPlanId")
    protected String taxDeferredPlanId;
    @XmlElement(name = "PartyId", namespace = "urn:ifxforum-org:XSD:1")
    protected String partyId;
    @XmlElement(name = "Name", namespace = "urn:ifxforum-org:XSD:1")
    protected String name;
    @XmlElementRef(name = "IssuedIdent", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.IssuedIdentType> issuedIdent;

    /**
     * Gets the value of the taxDeferredPlanSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDeferredPlanSeq() {
        return taxDeferredPlanSeq;
    }

    /**
     * Sets the value of the taxDeferredPlanSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxDeferredPlanSeq(String value) {
        this.taxDeferredPlanSeq = value;
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
     * Gets the value of the partyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyId(String value) {
        this.partyId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the issuedIdent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.IssuedIdentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.IssuedIdentType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.IssuedIdentType> getIssuedIdent() {
        return issuedIdent;
    }

    /**
     * Sets the value of the issuedIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.IssuedIdentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.IssuedIdentType }{@code >}
     *     
     */
    public void setIssuedIdent(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.IssuedIdentType> value) {
        this.issuedIdent = value;
    }

}
