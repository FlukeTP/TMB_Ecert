
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForExDealStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForExDealStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ForExDealId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ForExDealStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForExDealStatusRec_Type", propOrder = {
    "forExDealId",
    "forExDealStatus"
})
public class ForExDealStatusRecType {

    @XmlElement(name = "ForExDealId", required = true)
    protected String forExDealId;
    @XmlElement(name = "ForExDealStatus", required = true)
    protected ForExDealStatusType forExDealStatus;

    /**
     * Gets the value of the forExDealId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForExDealId() {
        return forExDealId;
    }

    /**
     * Sets the value of the forExDealId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForExDealId(String value) {
        this.forExDealId = value;
    }

    /**
     * Gets the value of the forExDealStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ForExDealStatusType }
     *     
     */
    public ForExDealStatusType getForExDealStatus() {
        return forExDealStatus;
    }

    /**
     * Sets the value of the forExDealStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExDealStatusType }
     *     
     */
    public void setForExDealStatus(ForExDealStatusType value) {
        this.forExDealStatus = value;
    }

}
