
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditMediaCashData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditMediaCashData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CashAmt"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CashValidity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CashQuality" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditMediaCashData_Type", propOrder = {
    "cashAmt",
    "cashValidity",
    "cashQuality"
})
public class CreditMediaCashDataType {

    @XmlElement(name = "CashAmt", required = true)
    protected CashAmtType cashAmt;
    @XmlElement(name = "CashValidity")
    protected String cashValidity;
    @XmlElement(name = "CashQuality")
    protected String cashQuality;

    /**
     * Gets the value of the cashAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CashAmtType }
     *     
     */
    public CashAmtType getCashAmt() {
        return cashAmt;
    }

    /**
     * Sets the value of the cashAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAmtType }
     *     
     */
    public void setCashAmt(CashAmtType value) {
        this.cashAmt = value;
    }

    /**
     * Gets the value of the cashValidity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashValidity() {
        return cashValidity;
    }

    /**
     * Sets the value of the cashValidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashValidity(String value) {
        this.cashValidity = value;
    }

    /**
     * Gets the value of the cashQuality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashQuality() {
        return cashQuality;
    }

    /**
     * Sets the value of the cashQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashQuality(String value) {
        this.cashQuality = value;
    }

}
