
package com.tmb.payment.wsdl.xpress;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.HighCurAmtType;
import com.tmb.payment.wsdl.xpress.vo.LowCurAmtType;
import com.tmb.payment.wsdl.xpress.vo.TermType;


/**
 * <p>Java class for RateMatrixTier_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateMatrixTier_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Tier" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}LowCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}HighCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Term" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Rate"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Margin" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IntAPY" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IntAPR" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateMatrixTier_Type", propOrder = {
    "tier",
    "lowCurAmt",
    "highCurAmt",
    "term",
    "rate",
    "margin",
    "intAPY",
    "intAPR"
})
public class RateMatrixTierType {

    @XmlElement(name = "Tier")
    protected String tier;
    @XmlElement(name = "LowCurAmt", namespace = "urn:ifxforum-org:XSD:1")
    protected LowCurAmtType lowCurAmt;
    @XmlElement(name = "HighCurAmt", namespace = "urn:ifxforum-org:XSD:1")
    protected HighCurAmtType highCurAmt;
    @XmlElement(name = "Term", namespace = "urn:ifxforum-org:XSD:1")
    protected TermType term;
    @XmlElement(name = "Rate", namespace = "urn:ifxforum-org:XSD:1", required = true)
    protected BigDecimal rate;
    @XmlElement(name = "Margin")
    protected BigDecimal margin;
    @XmlElement(name = "IntAPY", namespace = "urn:ifxforum-org:XSD:1")
    protected BigDecimal intAPY;
    @XmlElement(name = "IntAPR", namespace = "urn:ifxforum-org:XSD:1")
    protected BigDecimal intAPR;

    /**
     * Gets the value of the tier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTier() {
        return tier;
    }

    /**
     * Sets the value of the tier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTier(String value) {
        this.tier = value;
    }

    /**
     * Gets the value of the lowCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LowCurAmtType }
     *     
     */
    public LowCurAmtType getLowCurAmt() {
        return lowCurAmt;
    }

    /**
     * Sets the value of the lowCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LowCurAmtType }
     *     
     */
    public void setLowCurAmt(LowCurAmtType value) {
        this.lowCurAmt = value;
    }

    /**
     * Gets the value of the highCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link HighCurAmtType }
     *     
     */
    public HighCurAmtType getHighCurAmt() {
        return highCurAmt;
    }

    /**
     * Sets the value of the highCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link HighCurAmtType }
     *     
     */
    public void setHighCurAmt(HighCurAmtType value) {
        this.highCurAmt = value;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link TermType }
     *     
     */
    public TermType getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermType }
     *     
     */
    public void setTerm(TermType value) {
        this.term = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the margin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMargin() {
        return margin;
    }

    /**
     * Sets the value of the margin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMargin(BigDecimal value) {
        this.margin = value;
    }

    /**
     * Gets the value of the intAPY property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntAPY() {
        return intAPY;
    }

    /**
     * Sets the value of the intAPY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIntAPY(BigDecimal value) {
        this.intAPY = value;
    }

    /**
     * Gets the value of the intAPR property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntAPR() {
        return intAPR;
    }

    /**
     * Sets the value of the intAPR property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIntAPR(BigDecimal value) {
        this.intAPR = value;
    }

}
