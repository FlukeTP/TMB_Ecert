
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeRsHdr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeRsHdr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DebitRef"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CreditRef"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeRsHdr_Type", propOrder = {
    "debitRef",
    "creditRef"
})
public class FeeRsHdrType {

    @XmlElement(name = "DebitRef")
    protected DebitRefType debitRef;
    @XmlElement(name = "CreditRef")
    protected CreditRefType creditRef;

    /**
     * Gets the value of the debitRef property.
     * 
     * @return
     *     possible object is
     *     {@link DebitRefType }
     *     
     */
    public DebitRefType getDebitRef() {
        return debitRef;
    }

    /**
     * Sets the value of the debitRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitRefType }
     *     
     */
    public void setDebitRef(DebitRefType value) {
        this.debitRef = value;
    }

    /**
     * Gets the value of the creditRef property.
     * 
     * @return
     *     possible object is
     *     {@link CreditRefType }
     *     
     */
    public CreditRefType getCreditRef() {
        return creditRef;
    }

    /**
     * Sets the value of the creditRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditRefType }
     *     
     */
    public void setCreditRef(CreditRefType value) {
        this.creditRef = value;
    }

}
