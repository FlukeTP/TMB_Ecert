
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DebitStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DebitStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DebitId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DebitStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebitStatusRec_Type", propOrder = {
    "debitId",
    "debitStatus"
})
public class DebitStatusRecType {

    @XmlElement(name = "DebitId")
    protected String debitId;
    @XmlElement(name = "DebitStatus")
    protected DebitStatusType debitStatus;

    /**
     * Gets the value of the debitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitId() {
        return debitId;
    }

    /**
     * Sets the value of the debitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitId(String value) {
        this.debitId = value;
    }

    /**
     * Gets the value of the debitStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DebitStatusType }
     *     
     */
    public DebitStatusType getDebitStatus() {
        return debitStatus;
    }

    /**
     * Sets the value of the debitStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitStatusType }
     *     
     */
    public void setDebitStatus(DebitStatusType value) {
        this.debitStatus = value;
    }

}
