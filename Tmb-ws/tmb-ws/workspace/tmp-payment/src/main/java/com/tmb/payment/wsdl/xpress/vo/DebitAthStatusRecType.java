
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DebitAthStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DebitAthStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DebitAthId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DebitAthStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebitAthStatusRec_Type", propOrder = {
    "debitAthId",
    "debitAthStatus"
})
public class DebitAthStatusRecType {

    @XmlElement(name = "DebitAthId")
    protected String debitAthId;
    @XmlElement(name = "DebitAthStatus")
    protected DebitAthStatusType debitAthStatus;

    /**
     * Gets the value of the debitAthId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitAthId() {
        return debitAthId;
    }

    /**
     * Sets the value of the debitAthId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitAthId(String value) {
        this.debitAthId = value;
    }

    /**
     * Gets the value of the debitAthStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DebitAthStatusType }
     *     
     */
    public DebitAthStatusType getDebitAthStatus() {
        return debitAthStatus;
    }

    /**
     * Sets the value of the debitAthStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitAthStatusType }
     *     
     */
    public void setDebitAthStatus(DebitAthStatusType value) {
        this.debitAthStatus = value;
    }

}
