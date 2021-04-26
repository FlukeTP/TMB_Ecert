
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisclosureStatData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisclosureStatData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DisclosureIdent"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DisclosureStatCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EffDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DisclosureParty" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisclosureStatData_Type", propOrder = {
    "disclosureIdent",
    "disclosureStatCode",
    "effDt",
    "disclosureParty"
})
public class DisclosureStatDataType {

    @XmlElement(name = "DisclosureIdent", required = true)
    protected String disclosureIdent;
    @XmlElement(name = "DisclosureStatCode")
    protected String disclosureStatCode;
    @XmlElement(name = "EffDt", namespace = "urn:ifxforum-org:XSD:1")
    protected String effDt;
    @XmlElement(name = "DisclosureParty")
    protected DisclosurePartyType disclosureParty;

    /**
     * Gets the value of the disclosureIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclosureIdent() {
        return disclosureIdent;
    }

    /**
     * Sets the value of the disclosureIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclosureIdent(String value) {
        this.disclosureIdent = value;
    }

    /**
     * Gets the value of the disclosureStatCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclosureStatCode() {
        return disclosureStatCode;
    }

    /**
     * Sets the value of the disclosureStatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclosureStatCode(String value) {
        this.disclosureStatCode = value;
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

    /**
     * Gets the value of the disclosureParty property.
     * 
     * @return
     *     possible object is
     *     {@link DisclosurePartyType }
     *     
     */
    public DisclosurePartyType getDisclosureParty() {
        return disclosureParty;
    }

    /**
     * Sets the value of the disclosureParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisclosurePartyType }
     *     
     */
    public void setDisclosureParty(DisclosurePartyType value) {
        this.disclosureParty = value;
    }

}
