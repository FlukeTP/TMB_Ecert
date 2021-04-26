
package com.tmb.payment.wsdl.xpress;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tmb.payment.wsdl.xpress.vo.CurAmtType;
import com.tmb.payment.wsdl.xpress.vo.MaxCurAmtType;
import com.tmb.payment.wsdl.xpress.vo.MinCurAmtType;


/**
 * <p>Java class for FeeData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}FeePlan"/&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}FeeType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CurAmt"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}Rate"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MinCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MaxCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}WaiverCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}WaiverExpDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RecurrenceRule" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FeeAcctIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}WaiveFeeInd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeData_Type", propOrder = {
    "feePlan",
    "feeType",
    "curAmt",
    "rate",
    "minCurAmt",
    "maxCurAmt",
    "waiverCode",
    "waiverExpDt",
    "recurrenceRule",
    "feeAcctIdent",
    "waiveFeeInd"
})
public class FeeDataType {

    @XmlElement(name = "FeePlan")
    protected String feePlan;
    @XmlElement(name = "FeeType")
    protected String feeType;
    @XmlElement(name = "CurAmt", namespace = "urn:ifxforum-org:XSD:1")
    protected CurAmtType curAmt;
    @XmlElement(name = "Rate", namespace = "urn:ifxforum-org:XSD:1")
    protected BigDecimal rate;
    @XmlElement(name = "MinCurAmt", namespace = "urn:ifxforum-org:XSD:1")
    protected MinCurAmtType minCurAmt;
    @XmlElement(name = "MaxCurAmt", namespace = "urn:ifxforum-org:XSD:1")
    protected MaxCurAmtType maxCurAmt;
    @XmlElement(name = "WaiverCode")
    protected String waiverCode;
    @XmlElement(name = "WaiverExpDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar waiverExpDt;
    @XmlElement(name = "RecurrenceRule")
    protected RecurrenceRuleType recurrenceRule;
    @XmlElement(name = "FeeAcctIdent")
    protected String feeAcctIdent;
    @XmlElement(name = "WaiveFeeInd", namespace = "urn:ifxforum-org:XSD:1")
    protected Boolean waiveFeeInd;

    /**
     * Gets the value of the feePlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeePlan() {
        return feePlan;
    }

    /**
     * Sets the value of the feePlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeePlan(String value) {
        this.feePlan = value;
    }

    /**
     * Gets the value of the feeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeType() {
        return feeType;
    }

    /**
     * Sets the value of the feeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeType(String value) {
        this.feeType = value;
    }

    /**
     * Gets the value of the curAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getCurAmt() {
        return curAmt;
    }

    /**
     * Sets the value of the curAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setCurAmt(CurAmtType value) {
        this.curAmt = value;
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
     * Gets the value of the waiverCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaiverCode() {
        return waiverCode;
    }

    /**
     * Sets the value of the waiverCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaiverCode(String value) {
        this.waiverCode = value;
    }

    /**
     * Gets the value of the waiverExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWaiverExpDt() {
        return waiverExpDt;
    }

    /**
     * Sets the value of the waiverExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWaiverExpDt(XMLGregorianCalendar value) {
        this.waiverExpDt = value;
    }

    /**
     * Gets the value of the recurrenceRule property.
     * 
     * @return
     *     possible object is
     *     {@link RecurrenceRuleType }
     *     
     */
    public RecurrenceRuleType getRecurrenceRule() {
        return recurrenceRule;
    }

    /**
     * Sets the value of the recurrenceRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrenceRuleType }
     *     
     */
    public void setRecurrenceRule(RecurrenceRuleType value) {
        this.recurrenceRule = value;
    }

    /**
     * Gets the value of the feeAcctIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeAcctIdent() {
        return feeAcctIdent;
    }

    /**
     * Sets the value of the feeAcctIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeAcctIdent(String value) {
        this.feeAcctIdent = value;
    }

    /**
     * Gets the value of the waiveFeeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWaiveFeeInd() {
        return waiveFeeInd;
    }

    /**
     * Sets the value of the waiveFeeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWaiveFeeInd(Boolean value) {
        this.waiveFeeInd = value;
    }

}
