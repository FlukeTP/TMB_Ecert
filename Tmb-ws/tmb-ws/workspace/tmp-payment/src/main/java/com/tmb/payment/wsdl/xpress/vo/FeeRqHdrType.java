
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeRqHdr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeRqHdr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DebitRef"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CreditRef"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}AcctKeys"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChargeRegulation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeRqHdr_Type", propOrder = {
    "debitRef",
    "creditRef",
    "acctKeys",
    "chargeRegulation"
})
public class FeeRqHdrType {

    @XmlElement(name = "DebitRef")
    protected DebitRefType debitRef;
    @XmlElement(name = "CreditRef")
    protected CreditRefType creditRef;
    @XmlElementRef(name = "AcctKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctKeysType> acctKeys;
    @XmlElement(name = "ChargeRegulation")
    protected String chargeRegulation;

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

    /**
     * Gets the value of the acctKeys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctKeysType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctKeysType> getAcctKeys() {
        return acctKeys;
    }

    /**
     * Sets the value of the acctKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctKeysType }{@code >}
     *     
     */
    public void setAcctKeys(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctKeysType> value) {
        this.acctKeys = value;
    }

    /**
     * Gets the value of the chargeRegulation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeRegulation() {
        return chargeRegulation;
    }

    /**
     * Sets the value of the chargeRegulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeRegulation(String value) {
        this.chargeRegulation = value;
    }

}
