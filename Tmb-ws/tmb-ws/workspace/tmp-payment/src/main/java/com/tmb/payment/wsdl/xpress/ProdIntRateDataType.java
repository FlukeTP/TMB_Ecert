
package com.tmb.payment.wsdl.xpress;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProdIntRateData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProdIntRateData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RateMatrixTier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}IntRateCategory" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Desc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}BasedOnCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}BasedOnValue" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AccrualFrequency" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AccrualMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DailyAccrual" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CapFrequency" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}IntRateType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EffDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ExpDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TierAmtType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdIntRateData_Type", propOrder = {
    "rateMatrixTier",
    "intRateCategory",
    "desc",
    "basedOnCode",
    "basedOnValue",
    "accrualFrequency",
    "accrualMethod",
    "dailyAccrual",
    "capFrequency",
    "intRateType",
    "effDt",
    "expDt",
    "tierAmtType"
})
public class ProdIntRateDataType {

    @XmlElement(name = "RateMatrixTier")
    protected List<RateMatrixTierType> rateMatrixTier;
    @XmlElement(name = "IntRateCategory")
    protected String intRateCategory;
    @XmlElement(name = "Desc", namespace = "urn:ifxforum-org:XSD:1")
    protected String desc;
    @XmlElement(name = "BasedOnCode")
    @XmlSchemaType(name = "string")
    protected BasedOnCodeType basedOnCode;
    @XmlElement(name = "BasedOnValue")
    protected BigDecimal basedOnValue;
    @XmlElement(name = "AccrualFrequency")
    protected FrequencyType accrualFrequency;
    @XmlElement(name = "AccrualMethod")
    protected String accrualMethod;
    @XmlElement(name = "DailyAccrual")
    @XmlSchemaType(name = "string")
    protected DailyAccrualType dailyAccrual;
    @XmlElement(name = "CapFrequency")
    protected FrequencyType capFrequency;
    @XmlElement(name = "IntRateType")
    @XmlSchemaType(name = "string")
    protected IntRateTypeType intRateType;
    @XmlElement(name = "EffDt", namespace = "urn:ifxforum-org:XSD:1")
    protected String effDt;
    @XmlElement(name = "ExpDt", namespace = "urn:ifxforum-org:XSD:1")
    protected String expDt;
    @XmlElement(name = "TierAmtType")
    protected String tierAmtType;

    /**
     * Gets the value of the rateMatrixTier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateMatrixTier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateMatrixTier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateMatrixTierType }
     * 
     * 
     */
    public List<RateMatrixTierType> getRateMatrixTier() {
        if (rateMatrixTier == null) {
            rateMatrixTier = new ArrayList<RateMatrixTierType>();
        }
        return this.rateMatrixTier;
    }

    /**
     * Gets the value of the intRateCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntRateCategory() {
        return intRateCategory;
    }

    /**
     * Sets the value of the intRateCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntRateCategory(String value) {
        this.intRateCategory = value;
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
     * Gets the value of the basedOnCode property.
     * 
     * @return
     *     possible object is
     *     {@link BasedOnCodeType }
     *     
     */
    public BasedOnCodeType getBasedOnCode() {
        return basedOnCode;
    }

    /**
     * Sets the value of the basedOnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasedOnCodeType }
     *     
     */
    public void setBasedOnCode(BasedOnCodeType value) {
        this.basedOnCode = value;
    }

    /**
     * Gets the value of the basedOnValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBasedOnValue() {
        return basedOnValue;
    }

    /**
     * Sets the value of the basedOnValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBasedOnValue(BigDecimal value) {
        this.basedOnValue = value;
    }

    /**
     * Gets the value of the accrualFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyType }
     *     
     */
    public FrequencyType getAccrualFrequency() {
        return accrualFrequency;
    }

    /**
     * Sets the value of the accrualFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyType }
     *     
     */
    public void setAccrualFrequency(FrequencyType value) {
        this.accrualFrequency = value;
    }

    /**
     * Gets the value of the accrualMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccrualMethod() {
        return accrualMethod;
    }

    /**
     * Sets the value of the accrualMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccrualMethod(String value) {
        this.accrualMethod = value;
    }

    /**
     * Gets the value of the dailyAccrual property.
     * 
     * @return
     *     possible object is
     *     {@link DailyAccrualType }
     *     
     */
    public DailyAccrualType getDailyAccrual() {
        return dailyAccrual;
    }

    /**
     * Sets the value of the dailyAccrual property.
     * 
     * @param value
     *     allowed object is
     *     {@link DailyAccrualType }
     *     
     */
    public void setDailyAccrual(DailyAccrualType value) {
        this.dailyAccrual = value;
    }

    /**
     * Gets the value of the capFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyType }
     *     
     */
    public FrequencyType getCapFrequency() {
        return capFrequency;
    }

    /**
     * Sets the value of the capFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyType }
     *     
     */
    public void setCapFrequency(FrequencyType value) {
        this.capFrequency = value;
    }

    /**
     * Gets the value of the intRateType property.
     * 
     * @return
     *     possible object is
     *     {@link IntRateTypeType }
     *     
     */
    public IntRateTypeType getIntRateType() {
        return intRateType;
    }

    /**
     * Sets the value of the intRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRateTypeType }
     *     
     */
    public void setIntRateType(IntRateTypeType value) {
        this.intRateType = value;
    }

    /**
     * Gets the value of the effDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffDt() {
        return effDt;
    }

    /**
     * Sets the value of the effDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffDt(String value) {
        this.effDt = value;
    }

    /**
     * Gets the value of the expDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpDt() {
        return expDt;
    }

    /**
     * Sets the value of the expDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpDt(String value) {
        this.expDt = value;
    }

    /**
     * Gets the value of the tierAmtType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierAmtType() {
        return tierAmtType;
    }

    /**
     * Sets the value of the tierAmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierAmtType(String value) {
        this.tierAmtType = value;
    }

}
