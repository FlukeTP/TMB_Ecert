
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForExQuoteStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForExQuoteStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ForExQuoteId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ForExQuoteStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForExQuoteStatusRec_Type", propOrder = {
    "forExQuoteId",
    "forExQuoteStatus"
})
public class ForExQuoteStatusRecType {

    @XmlElement(name = "ForExQuoteId")
    protected String forExQuoteId;
    @XmlElement(name = "ForExQuoteStatus")
    protected ForExQuoteStatusType forExQuoteStatus;

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
     * Gets the value of the forExQuoteStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ForExQuoteStatusType }
     *     
     */
    public ForExQuoteStatusType getForExQuoteStatus() {
        return forExQuoteStatus;
    }

    /**
     * Sets the value of the forExQuoteStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExQuoteStatusType }
     *     
     */
    public void setForExQuoteStatus(ForExQuoteStatusType value) {
        this.forExQuoteStatus = value;
    }

}
