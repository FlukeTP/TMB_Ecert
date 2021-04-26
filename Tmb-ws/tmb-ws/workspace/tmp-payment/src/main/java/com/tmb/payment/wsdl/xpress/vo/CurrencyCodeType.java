
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyCode_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyCode_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurrencyCodeType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurrencyCodeValue"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyCode_Type", propOrder = {
    "currencyCodeType",
    "currencyCodeValue"
})
@XmlSeeAlso({
    CurCodeType.class,
    BaseCurCodeType.class,
    ContraCurCodeType.class,
    DevCdmBinCurCodeType.class,
    DevCimBinCurCodeType.class,
    HomeCurCodeType.class
})
public class CurrencyCodeType {

    @XmlElement(name = "CurrencyCodeType")
    protected String currencyCodeType;
    @XmlElement(name = "CurrencyCodeValue", required = true)
    protected String currencyCodeValue;

    /**
     * Gets the value of the currencyCodeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCodeType() {
        return currencyCodeType;
    }

    /**
     * Sets the value of the currencyCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCodeType(String value) {
        this.currencyCodeType = value;
    }

    /**
     * Gets the value of the currencyCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCodeValue() {
        return currencyCodeValue;
    }

    /**
     * Sets the value of the currencyCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCodeValue(String value) {
        this.currencyCodeValue = value;
    }

}
