
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.PartyRefType;


/**
 * <p>Java class for TaxDeferredPlanKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxDeferredPlanKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}TaxDeferredPlanId"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{http://www.fnf.com/xes}TDPlanIdent"/&gt;
 *             &lt;sequence&gt;
 *               &lt;element ref="{urn:ifxforum-org:XSD:1}PartyRef" minOccurs="0"/&gt;
 *               &lt;element ref="{http://www.fnf.com/xes}TaxDeferredPlanSeq" minOccurs="0"/&gt;
 *             &lt;/sequence&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FIIdent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxDeferredPlanKeys_Type", propOrder = {
    "taxDeferredPlanId",
    "tdPlanIdent",
    "partyRef",
    "taxDeferredPlanSeq",
    "fiIdent"
})
public class TaxDeferredPlanKeysType {

    @XmlElement(name = "TaxDeferredPlanId")
    protected String taxDeferredPlanId;
    @XmlElement(name = "TDPlanIdent")
    protected TDPlanIdentType tdPlanIdent;
    @XmlElement(name = "PartyRef", namespace = "urn:ifxforum-org:XSD:1")
    protected PartyRefType partyRef;
    @XmlElement(name = "TaxDeferredPlanSeq")
    protected String taxDeferredPlanSeq;
    @XmlElement(name = "FIIdent", namespace = "urn:ifxforum-org:XSD:1")
    protected String fiIdent;

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
     * Gets the value of the fiIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIIdent() {
        return fiIdent;
    }

    /**
     * Sets the value of the fiIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIIdent(String value) {
        this.fiIdent = value;
    }

}
