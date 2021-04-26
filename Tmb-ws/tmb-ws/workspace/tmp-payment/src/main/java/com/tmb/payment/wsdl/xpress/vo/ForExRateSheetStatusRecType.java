
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForExRateSheetStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForExRateSheetStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ForExRateSheetId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ForExRateSheetStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForExRateSheetStatusRec_Type", propOrder = {
    "forExRateSheetId",
    "forExRateSheetStatus"
})
public class ForExRateSheetStatusRecType {

    @XmlElement(name = "ForExRateSheetId")
    protected String forExRateSheetId;
    @XmlElement(name = "ForExRateSheetStatus")
    protected ForExRateSheetStatusType forExRateSheetStatus;

    /**
     * Gets the value of the forExRateSheetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForExRateSheetId() {
        return forExRateSheetId;
    }

    /**
     * Sets the value of the forExRateSheetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForExRateSheetId(String value) {
        this.forExRateSheetId = value;
    }

    /**
     * Gets the value of the forExRateSheetStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ForExRateSheetStatusType }
     *     
     */
    public ForExRateSheetStatusType getForExRateSheetStatus() {
        return forExRateSheetStatus;
    }

    /**
     * Sets the value of the forExRateSheetStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExRateSheetStatusType }
     *     
     */
    public void setForExRateSheetStatus(ForExRateSheetStatusType value) {
        this.forExRateSheetStatus = value;
    }

}
