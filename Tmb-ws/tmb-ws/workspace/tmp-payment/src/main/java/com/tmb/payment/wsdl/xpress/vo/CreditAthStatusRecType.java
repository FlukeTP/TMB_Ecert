
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditAthStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditAthStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CreditAthId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CreditAthStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditAthStatusRec_Type", propOrder = {
    "creditAthId",
    "creditAthStatus"
})
public class CreditAthStatusRecType {

    @XmlElement(name = "CreditAthId")
    protected String creditAthId;
    @XmlElement(name = "CreditAthStatus")
    protected CreditAthStatusType creditAthStatus;

    /**
     * Gets the value of the creditAthId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAthId() {
        return creditAthId;
    }

    /**
     * Sets the value of the creditAthId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAthId(String value) {
        this.creditAthId = value;
    }

    /**
     * Gets the value of the creditAthStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CreditAthStatusType }
     *     
     */
    public CreditAthStatusType getCreditAthStatus() {
        return creditAthStatus;
    }

    /**
     * Sets the value of the creditAthStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditAthStatusType }
     *     
     */
    public void setCreditAthStatus(CreditAthStatusType value) {
        this.creditAthStatus = value;
    }

}
