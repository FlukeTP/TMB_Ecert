
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Common Business Outcome.
 * 
 * <p>Java class for Disclosure_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Disclosure_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DisclosureName"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Desc"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DisclosureType"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DisclosureURL" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DisclosureAcknowledgeDt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Disclosure_Type", propOrder = {
    "disclosureName",
    "desc",
    "disclosureType",
    "disclosureURL",
    "disclosureAcknowledgeDt"
})
public class DisclosureType {

    @XmlElement(name = "DisclosureName", required = true)
    protected String disclosureName;
    @XmlElement(name = "Desc", namespace = "urn:ifxforum-org:XSD:1", required = true)
    protected String desc;
    @XmlElement(name = "DisclosureType", required = true)
    protected String disclosureType;
    @XmlElement(name = "DisclosureURL")
    protected String disclosureURL;
    @XmlElement(name = "DisclosureAcknowledgeDt")
    protected String disclosureAcknowledgeDt;

    /**
     * Gets the value of the disclosureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclosureName() {
        return disclosureName;
    }

    /**
     * Sets the value of the disclosureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclosureName(String value) {
        this.disclosureName = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the disclosureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclosureType() {
        return disclosureType;
    }

    /**
     * Sets the value of the disclosureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclosureType(String value) {
        this.disclosureType = value;
    }

    /**
     * Gets the value of the disclosureURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclosureURL() {
        return disclosureURL;
    }

    /**
     * Sets the value of the disclosureURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclosureURL(String value) {
        this.disclosureURL = value;
    }

    /**
     * Gets the value of the disclosureAcknowledgeDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclosureAcknowledgeDt() {
        return disclosureAcknowledgeDt;
    }

    /**
     * Sets the value of the disclosureAcknowledgeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclosureAcknowledgeDt(String value) {
        this.disclosureAcknowledgeDt = value;
    }

}
