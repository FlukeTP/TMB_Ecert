
package com.tmb.payment.wsdl.xpress.vo;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeRate_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeRate_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ExchRate"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BaseCurCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ContraCurCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ExchConvertRule" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ExchRatePrecision" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ExchRateInvertPrec" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ExchMktConvertRule" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ExchMktRatePrecision" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeRate_Type", propOrder = {
    "exchRate",
    "baseCurCode",
    "contraCurCode",
    "exchConvertRule",
    "exchRatePrecision",
    "exchRateInvertPrec",
    "exchMktConvertRule",
    "exchMktRatePrecision"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.ExchangeRateType.class,
    ForExHomeRateType.class,
    NewForExRateType.class,
    RequestedForExRateType.class
})
public class ExchangeRateType {

    @XmlElement(name = "ExchRate", required = true)
    protected BigDecimal exchRate;
    @XmlElement(name = "BaseCurCode")
    protected BaseCurCodeType baseCurCode;
    @XmlElement(name = "ContraCurCode")
    protected ContraCurCodeType contraCurCode;
    @XmlElement(name = "ExchConvertRule")
    @XmlSchemaType(name = "string")
    protected ExchConvertRuleType exchConvertRule;
    @XmlElement(name = "ExchRatePrecision")
    protected Long exchRatePrecision;
    @XmlElement(name = "ExchRateInvertPrec")
    protected Long exchRateInvertPrec;
    @XmlElement(name = "ExchMktConvertRule")
    @XmlSchemaType(name = "string")
    protected ExchMktConvertRuleType exchMktConvertRule;
    @XmlElement(name = "ExchMktRatePrecision")
    protected Long exchMktRatePrecision;

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
     * Gets the value of the baseCurCode property.
     * 
     * @return
     *     possible object is
     *     {@link BaseCurCodeType }
     *     
     */
    public BaseCurCodeType getBaseCurCode() {
        return baseCurCode;
    }

    /**
     * Sets the value of the baseCurCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseCurCodeType }
     *     
     */
    public void setBaseCurCode(BaseCurCodeType value) {
        this.baseCurCode = value;
    }

    /**
     * Gets the value of the contraCurCode property.
     * 
     * @return
     *     possible object is
     *     {@link ContraCurCodeType }
     *     
     */
    public ContraCurCodeType getContraCurCode() {
        return contraCurCode;
    }

    /**
     * Sets the value of the contraCurCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContraCurCodeType }
     *     
     */
    public void setContraCurCode(ContraCurCodeType value) {
        this.contraCurCode = value;
    }

    /**
     * Gets the value of the exchConvertRule property.
     * 
     * @return
     *     possible object is
     *     {@link ExchConvertRuleType }
     *     
     */
    public ExchConvertRuleType getExchConvertRule() {
        return exchConvertRule;
    }

    /**
     * Sets the value of the exchConvertRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchConvertRuleType }
     *     
     */
    public void setExchConvertRule(ExchConvertRuleType value) {
        this.exchConvertRule = value;
    }

    /**
     * Gets the value of the exchRatePrecision property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExchRatePrecision() {
        return exchRatePrecision;
    }

    /**
     * Sets the value of the exchRatePrecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExchRatePrecision(Long value) {
        this.exchRatePrecision = value;
    }

    /**
     * Gets the value of the exchRateInvertPrec property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExchRateInvertPrec() {
        return exchRateInvertPrec;
    }

    /**
     * Sets the value of the exchRateInvertPrec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExchRateInvertPrec(Long value) {
        this.exchRateInvertPrec = value;
    }

    /**
     * Gets the value of the exchMktConvertRule property.
     * 
     * @return
     *     possible object is
     *     {@link ExchMktConvertRuleType }
     *     
     */
    public ExchMktConvertRuleType getExchMktConvertRule() {
        return exchMktConvertRule;
    }

    /**
     * Sets the value of the exchMktConvertRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchMktConvertRuleType }
     *     
     */
    public void setExchMktConvertRule(ExchMktConvertRuleType value) {
        this.exchMktConvertRule = value;
    }

    /**
     * Gets the value of the exchMktRatePrecision property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExchMktRatePrecision() {
        return exchMktRatePrecision;
    }

    /**
     * Sets the value of the exchMktRatePrecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExchMktRatePrecision(Long value) {
        this.exchMktRatePrecision = value;
    }

}
