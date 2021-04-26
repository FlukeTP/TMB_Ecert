
package com.tmb.payment.wsdl.xpress.vo;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntRateData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntRateData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Rate"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Desc" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IntAPY" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IntAPR" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Term" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}LowCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}HighCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PaidBy" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntRateData_Type", propOrder = {
    "rate",
    "desc",
    "intAPY",
    "intAPR",
    "term",
    "lowCurAmt",
    "highCurAmt",
    "paidBy"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.IntRateDataType.class
})
public class IntRateDataType {

    @XmlElement(name = "Rate", required = true)
    protected BigDecimal rate;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "IntAPY")
    protected BigDecimal intAPY;
    @XmlElement(name = "IntAPR")
    protected BigDecimal intAPR;
    @XmlElement(name = "Term")
    protected TermType term;
    @XmlElement(name = "LowCurAmt")
    protected LowCurAmtType lowCurAmt;
    @XmlElement(name = "HighCurAmt")
    protected HighCurAmtType highCurAmt;
    @XmlElement(name = "PaidBy")
    @XmlSchemaType(name = "string")
    protected PaidByType paidBy;

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
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
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
     * Gets the value of the paidBy property.
     * 
     * @return
     *     possible object is
     *     {@link PaidByType }
     *     
     */
    public PaidByType getPaidBy() {
        return paidBy;
    }

    /**
     * Sets the value of the paidBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaidByType }
     *     
     */
    public void setPaidBy(PaidByType value) {
        this.paidBy = value;
    }

}
