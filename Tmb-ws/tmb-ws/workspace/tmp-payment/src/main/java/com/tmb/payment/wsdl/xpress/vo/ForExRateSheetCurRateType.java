
package com.tmb.payment.wsdl.xpress.vo;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForExRateSheetCurRate_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForExRateSheetCurRate_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}NewForExRate"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ForExRateType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BuySellIndicator"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ReceivingMethod"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ForExValDtType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ForExValDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MinCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MaxCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SmallBankNoteDenom" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EffTimeFrame" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FixingDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ForExRateProviderName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForExRateSheetCurRate_Type", propOrder = {
    "newForExRate",
    "forExRateType",
    "buySellIndicator",
    "receivingMethod",
    "forExValDtType",
    "forExValDt",
    "minCurAmt",
    "maxCurAmt",
    "smallBankNoteDenom",
    "effTimeFrame",
    "fixingDt",
    "forExRateProviderName"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.ForExRateSheetCurRateType.class
})
public class ForExRateSheetCurRateType {

    @XmlElement(name = "NewForExRate", required = true)
    protected NewForExRateType newForExRate;
    @XmlElement(name = "ForExRateType")
    @XmlSchemaType(name = "string")
    protected ForExRateTypeType forExRateType;
    @XmlElement(name = "BuySellIndicator", required = true)
    @XmlSchemaType(name = "string")
    protected BuySellIndicatorType buySellIndicator;
    @XmlElement(name = "ReceivingMethod", required = true)
    protected String receivingMethod;
    @XmlElement(name = "ForExValDtType", required = true)
    @XmlSchemaType(name = "string")
    protected ForExValDtTypeType forExValDtType;
    @XmlElement(name = "ForExValDt")
    protected String forExValDt;
    @XmlElement(name = "MinCurAmt")
    protected MinCurAmtType minCurAmt;
    @XmlElement(name = "MaxCurAmt")
    protected MaxCurAmtType maxCurAmt;
    @XmlElement(name = "SmallBankNoteDenom")
    protected BigDecimal smallBankNoteDenom;
    @XmlElement(name = "EffTimeFrame")
    protected EffTimeFrameType effTimeFrame;
    @XmlElement(name = "FixingDt")
    protected String fixingDt;
    @XmlElement(name = "ForExRateProviderName")
    protected String forExRateProviderName;

    /**
     * Gets the value of the newForExRate property.
     * 
     * @return
     *     possible object is
     *     {@link NewForExRateType }
     *     
     */
    public NewForExRateType getNewForExRate() {
        return newForExRate;
    }

    /**
     * Sets the value of the newForExRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewForExRateType }
     *     
     */
    public void setNewForExRate(NewForExRateType value) {
        this.newForExRate = value;
    }

    /**
     * Gets the value of the forExRateType property.
     * 
     * @return
     *     possible object is
     *     {@link ForExRateTypeType }
     *     
     */
    public ForExRateTypeType getForExRateType() {
        return forExRateType;
    }

    /**
     * Sets the value of the forExRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExRateTypeType }
     *     
     */
    public void setForExRateType(ForExRateTypeType value) {
        this.forExRateType = value;
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

    /**
     * Gets the value of the receivingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivingMethod() {
        return receivingMethod;
    }

    /**
     * Sets the value of the receivingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivingMethod(String value) {
        this.receivingMethod = value;
    }

    /**
     * Gets the value of the forExValDtType property.
     * 
     * @return
     *     possible object is
     *     {@link ForExValDtTypeType }
     *     
     */
    public ForExValDtTypeType getForExValDtType() {
        return forExValDtType;
    }

    /**
     * Sets the value of the forExValDtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExValDtTypeType }
     *     
     */
    public void setForExValDtType(ForExValDtTypeType value) {
        this.forExValDtType = value;
    }

    /**
     * Gets the value of the forExValDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForExValDt() {
        return forExValDt;
    }

    /**
     * Sets the value of the forExValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForExValDt(String value) {
        this.forExValDt = value;
    }

    /**
     * Gets the value of the minCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link MinCurAmtType }
     *     
     */
    public MinCurAmtType getMinCurAmt() {
        return minCurAmt;
    }

    /**
     * Sets the value of the minCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinCurAmtType }
     *     
     */
    public void setMinCurAmt(MinCurAmtType value) {
        this.minCurAmt = value;
    }

    /**
     * Gets the value of the maxCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link MaxCurAmtType }
     *     
     */
    public MaxCurAmtType getMaxCurAmt() {
        return maxCurAmt;
    }

    /**
     * Sets the value of the maxCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxCurAmtType }
     *     
     */
    public void setMaxCurAmt(MaxCurAmtType value) {
        this.maxCurAmt = value;
    }

    /**
     * Gets the value of the smallBankNoteDenom property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSmallBankNoteDenom() {
        return smallBankNoteDenom;
    }

    /**
     * Sets the value of the smallBankNoteDenom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSmallBankNoteDenom(BigDecimal value) {
        this.smallBankNoteDenom = value;
    }

    /**
     * Gets the value of the effTimeFrame property.
     * 
     * @return
     *     possible object is
     *     {@link EffTimeFrameType }
     *     
     */
    public EffTimeFrameType getEffTimeFrame() {
        return effTimeFrame;
    }

    /**
     * Sets the value of the effTimeFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffTimeFrameType }
     *     
     */
    public void setEffTimeFrame(EffTimeFrameType value) {
        this.effTimeFrame = value;
    }

    /**
     * Gets the value of the fixingDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixingDt() {
        return fixingDt;
    }

    /**
     * Sets the value of the fixingDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixingDt(String value) {
        this.fixingDt = value;
    }

    /**
     * Gets the value of the forExRateProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForExRateProviderName() {
        return forExRateProviderName;
    }

    /**
     * Sets the value of the forExRateProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForExRateProviderName(String value) {
        this.forExRateProviderName = value;
    }

}
