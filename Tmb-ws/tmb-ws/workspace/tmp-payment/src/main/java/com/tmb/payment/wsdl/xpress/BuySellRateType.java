
package com.tmb.payment.wsdl.xpress;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.BuySellIndicatorType;
import com.tmb.payment.wsdl.xpress.vo.CurrencyCodeType;


/**
 * <p>Java class for BuySellRate_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuySellRate_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurCode" type="{urn:ifxforum-org:XSD:1}CurrencyCode_Type" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ExchRate"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BuySellIndicator"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuySellRate_Type", propOrder = {
    "curCode",
    "exchRate",
    "buySellIndicator"
})
public class BuySellRateType {

    @XmlElement(name = "CurCode")
    protected CurrencyCodeType curCode;
    @XmlElement(name = "ExchRate", namespace = "urn:ifxforum-org:XSD:1", required = true)
    protected BigDecimal exchRate;
    @XmlElement(name = "BuySellIndicator", namespace = "urn:ifxforum-org:XSD:1", required = true)
    @XmlSchemaType(name = "string")
    protected BuySellIndicatorType buySellIndicator;

    /**
     * Gets the value of the curCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getCurCode() {
        return curCode;
    }

    /**
     * Sets the value of the curCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setCurCode(CurrencyCodeType value) {
        this.curCode = value;
    }

    /**
     * Gets the value of the exchRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchRate() {
        return exchRate;
    }

    /**
     * Sets the value of the exchRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchRate(BigDecimal value) {
        this.exchRate = value;
    }

    /**
     * Gets the value of the buySellIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link BuySellIndicatorType }
     *     
     */
    public BuySellIndicatorType getBuySellIndicator() {
        return buySellIndicator;
    }

    /**
     * Sets the value of the buySellIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuySellIndicatorType }
     *     
     */
    public void setBuySellIndicator(BuySellIndicatorType value) {
        this.buySellIndicator = value;
    }

}
