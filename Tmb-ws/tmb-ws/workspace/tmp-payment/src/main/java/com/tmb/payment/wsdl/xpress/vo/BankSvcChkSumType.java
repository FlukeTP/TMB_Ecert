
package com.tmb.payment.wsdl.xpress.vo;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankSvcChkSum_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankSvcChkSum_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BankSvcChkSumType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BankSvcChkSumValue"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankSvcChkSum_Type", propOrder = {
    "bankSvcChkSumType",
    "bankSvcChkSumValue"
})
public class BankSvcChkSumType {

    @XmlElement(name = "BankSvcChkSumType", required = true)
    protected String bankSvcChkSumType;
    @XmlElement(name = "BankSvcChkSumValue", required = true)
    protected BigDecimal bankSvcChkSumValue;

    /**
     * Gets the value of the bankSvcChkSumType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankSvcChkSumType() {
        return bankSvcChkSumType;
    }

    /**
     * Sets the value of the bankSvcChkSumType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankSvcChkSumType(String value) {
        this.bankSvcChkSumType = value;
    }

    /**
     * Gets the value of the bankSvcChkSumValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBankSvcChkSumValue() {
        return bankSvcChkSumValue;
    }

    /**
     * Sets the value of the bankSvcChkSumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBankSvcChkSumValue(BigDecimal value) {
        this.bankSvcChkSumValue = value;
    }

}
