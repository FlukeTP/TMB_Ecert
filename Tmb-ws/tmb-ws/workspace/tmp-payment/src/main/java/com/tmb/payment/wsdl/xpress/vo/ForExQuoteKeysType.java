
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForExQuoteKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForExQuoteKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SPName" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ForExQuoteId"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ForExQuoteIdent" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}NotAvailInd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForExQuoteKeys_Type", propOrder = {
    "spName",
    "forExQuoteId",
    "forExQuoteIdent",
    "notAvailInd"
})
public class ForExQuoteKeysType {

    @XmlElement(name = "SPName")
    protected String spName;
    @XmlElement(name = "ForExQuoteId")
    protected String forExQuoteId;
    @XmlElement(name = "ForExQuoteIdent")
    protected String forExQuoteIdent;
    @XmlElement(name = "NotAvailInd")
    protected Boolean notAvailInd;

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
     * Gets the value of the forExQuoteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForExQuoteId() {
        return forExQuoteId;
    }

    /**
     * Sets the value of the forExQuoteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForExQuoteId(String value) {
        this.forExQuoteId = value;
    }

    /**
     * Gets the value of the forExQuoteIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForExQuoteIdent() {
        return forExQuoteIdent;
    }

    /**
     * Sets the value of the forExQuoteIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForExQuoteIdent(String value) {
        this.forExQuoteIdent = value;
    }

    /**
     * Gets the value of the notAvailInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotAvailInd() {
        return notAvailInd;
    }

    /**
     * Sets the value of the notAvailInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotAvailInd(Boolean value) {
        this.notAvailInd = value;
    }

}
