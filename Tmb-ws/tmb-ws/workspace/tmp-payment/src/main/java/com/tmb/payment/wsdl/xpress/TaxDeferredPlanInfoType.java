
package com.tmb.payment.wsdl.xpress;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tmb.payment.wsdl.xpress.vo.AcctRefType;
import com.tmb.payment.wsdl.xpress.vo.CurrencyCodeType;
import com.tmb.payment.wsdl.xpress.vo.TaxWithheldDataType;


/**
 * <p>Java class for TaxDeferredPlanInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxDeferredPlanInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TaxDeferredPlanId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TaxDeferredPlanType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TaxDeferredPlanEndDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TaxDeferredPlanSeq" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DefaultBen" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TaxDeferredPlanDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TaxDeferredPlanCurrencyCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PersonPartyData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MailCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TDPlanIdent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FIIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PlanTitle" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PlanDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MADCd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MADCalcPctCd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MADCalcDOB" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MADCalcAgeBaseCde" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MADAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OptDistInitiationDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ManDistAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ManDistInitiationDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MADCalcAge" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ManDistInitiationYear" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}LifeExpectancyFactor" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TaxWithholding" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StateProv" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TaxWithheldData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AutoDistData" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DecedentPlan" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TDPlanPeriodData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TDPlanTrnLimit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TDPlanMiscData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TDPlanBal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctRef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxDeferredPlanInfo_Type", propOrder = {
    "partyId",
    "taxDeferredPlanId",
    "taxDeferredPlanType",
    "taxDeferredPlanEndDt",
    "taxDeferredPlanSeq",
    "defaultBen",
    "taxDeferredPlanDesc",
    "taxDeferredPlanCurrencyCode",
    "personPartyData",
    "mailCode",
    "tdPlanIdent",
    "fiIdent",
    "planTitle",
    "planDt",
    "madCd",
    "madCalcPctCd",
    "madCalcDOB",
    "madCalcAgeBaseCde",
    "madAmt",
    "optDistInitiationDt",
    "manDistAmt",
    "manDistInitiationDt",
    "madCalcAge",
    "manDistInitiationYear",
    "lifeExpectancyFactor",
    "taxWithholding",
    "stateProv",
    "taxWithheldData",
    "autoDistData",
    "decedentPlan",
    "tdPlanPeriodData",
    "tdPlanTrnLimit",
    "tdPlanMiscData",
    "tdPlanBal",
    "acctRef"
})
public class TaxDeferredPlanInfoType {

    @XmlElement(name = "PartyId", namespace = "urn:ifxforum-org:XSD:1")
    protected String partyId;
    @XmlElement(name = "TaxDeferredPlanId")
    protected String taxDeferredPlanId;
    @XmlElement(name = "TaxDeferredPlanType")
    protected String taxDeferredPlanType;
    @XmlElement(name = "TaxDeferredPlanEndDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar taxDeferredPlanEndDt;
    @XmlElement(name = "TaxDeferredPlanSeq")
    protected String taxDeferredPlanSeq;
    @XmlElement(name = "DefaultBen")
    protected String defaultBen;
    @XmlElement(name = "TaxDeferredPlanDesc")
    protected String taxDeferredPlanDesc;
    @XmlElement(name = "TaxDeferredPlanCurrencyCode")
    protected CurrencyCodeType taxDeferredPlanCurrencyCode;
    @XmlElement(name = "PersonPartyData")
    protected List<PersonPartyDataType> personPartyData;
    @XmlElement(name = "MailCode")
    protected String mailCode;
    @XmlElement(name = "TDPlanIdent")
    protected List<TDPlanIdentType> tdPlanIdent;
    @XmlElement(name = "FIIdent", namespace = "urn:ifxforum-org:XSD:1")
    protected String fiIdent;
    @XmlElement(name = "PlanTitle")
    protected String planTitle;
    @XmlElement(name = "PlanDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar planDt;
    @XmlElement(name = "MADCd")
    protected String madCd;
    @XmlElement(name = "MADCalcPctCd")
    protected String madCalcPctCd;
    @XmlElement(name = "MADCalcDOB")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar madCalcDOB;
    @XmlElement(name = "MADCalcAgeBaseCde")
    protected String madCalcAgeBaseCde;
    @XmlElement(name = "MADAmt")
    protected BigDecimal madAmt;
    @XmlElement(name = "OptDistInitiationDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar optDistInitiationDt;
    @XmlElement(name = "ManDistAmt")
    protected BigDecimal manDistAmt;
    @XmlElement(name = "ManDistInitiationDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar manDistInitiationDt;
    @XmlElement(name = "MADCalcAge")
    protected BigDecimal madCalcAge;
    @XmlElement(name = "ManDistInitiationYear")
    protected Long manDistInitiationYear;
    @XmlElement(name = "LifeExpectancyFactor")
    protected String lifeExpectancyFactor;
    @XmlElement(name = "TaxWithholding", namespace = "urn:ifxforum-org:XSD:1")
    protected Boolean taxWithholding;
    @XmlElement(name = "StateProv", namespace = "urn:ifxforum-org:XSD:1")
    protected String stateProv;
    @XmlElement(name = "TaxWithheldData", namespace = "urn:ifxforum-org:XSD:1")
    protected List<TaxWithheldDataType> taxWithheldData;
    @XmlElement(name = "AutoDistData")
    protected AutoDistDataType autoDistData;
    @XmlElement(name = "DecedentPlan")
    protected List<DecedentPlanType> decedentPlan;
    @XmlElement(name = "TDPlanPeriodData")
    protected List<TDPlanPeriodDataType> tdPlanPeriodData;
    @XmlElement(name = "TDPlanTrnLimit")
    protected List<TDPlanTrnLimitType> tdPlanTrnLimit;
    @XmlElement(name = "TDPlanMiscData")
    protected List<TDPlanMiscDataType> tdPlanMiscData;
    @XmlElement(name = "TDPlanBal")
    protected List<TDPlanBalType> tdPlanBal;
    @XmlElement(name = "AcctRef", namespace = "urn:ifxforum-org:XSD:1")
    protected List<AcctRefType> acctRef;

    /**
     * Gets the value of the partyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyId(String value) {
        this.partyId = value;
    }

    /**
     * Gets the value of the taxDeferredPlanId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDeferredPlanId() {
        return taxDeferredPlanId;
    }

    /**
     * Sets the value of the taxDeferredPlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxDeferredPlanId(String value) {
        this.taxDeferredPlanId = value;
    }

    /**
     * Gets the value of the taxDeferredPlanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDeferredPlanType() {
        return taxDeferredPlanType;
    }

    /**
     * Sets the value of the taxDeferredPlanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxDeferredPlanType(String value) {
        this.taxDeferredPlanType = value;
    }

    /**
     * Gets the value of the taxDeferredPlanEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTaxDeferredPlanEndDt() {
        return taxDeferredPlanEndDt;
    }

    /**
     * Sets the value of the taxDeferredPlanEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTaxDeferredPlanEndDt(XMLGregorianCalendar value) {
        this.taxDeferredPlanEndDt = value;
    }

    /**
     * Gets the value of the taxDeferredPlanSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDeferredPlanSeq() {
        return taxDeferredPlanSeq;
    }

    /**
     * Sets the value of the taxDeferredPlanSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxDeferredPlanSeq(String value) {
        this.taxDeferredPlanSeq = value;
    }

    /**
     * Gets the value of the defaultBen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultBen() {
        return defaultBen;
    }

    /**
     * Sets the value of the defaultBen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultBen(String value) {
        this.defaultBen = value;
    }

    /**
     * Gets the value of the taxDeferredPlanDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDeferredPlanDesc() {
        return taxDeferredPlanDesc;
    }

    /**
     * Sets the value of the taxDeferredPlanDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxDeferredPlanDesc(String value) {
        this.taxDeferredPlanDesc = value;
    }

    /**
     * Gets the value of the taxDeferredPlanCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getTaxDeferredPlanCurrencyCode() {
        return taxDeferredPlanCurrencyCode;
    }

    /**
     * Sets the value of the taxDeferredPlanCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setTaxDeferredPlanCurrencyCode(CurrencyCodeType value) {
        this.taxDeferredPlanCurrencyCode = value;
    }

    /**
     * Gets the value of the personPartyData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personPartyData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonPartyData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonPartyDataType }
     * 
     * 
     */
    public List<PersonPartyDataType> getPersonPartyData() {
        if (personPartyData == null) {
            personPartyData = new ArrayList<PersonPartyDataType>();
        }
        return this.personPartyData;
    }

    /**
     * Gets the value of the mailCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailCode() {
        return mailCode;
    }

    /**
     * Sets the value of the mailCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailCode(String value) {
        this.mailCode = value;
    }

    /**
     * Gets the value of the tdPlanIdent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tdPlanIdent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTDPlanIdent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDPlanIdentType }
     * 
     * 
     */
    public List<TDPlanIdentType> getTDPlanIdent() {
        if (tdPlanIdent == null) {
            tdPlanIdent = new ArrayList<TDPlanIdentType>();
        }
        return this.tdPlanIdent;
    }

    /**
     * Gets the value of the fiIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIIdent() {
        return fiIdent;
    }

    /**
     * Sets the value of the fiIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIIdent(String value) {
        this.fiIdent = value;
    }

    /**
     * Gets the value of the planTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanTitle() {
        return planTitle;
    }

    /**
     * Sets the value of the planTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanTitle(String value) {
        this.planTitle = value;
    }

    /**
     * Gets the value of the planDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlanDt() {
        return planDt;
    }

    /**
     * Sets the value of the planDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlanDt(XMLGregorianCalendar value) {
        this.planDt = value;
    }

    /**
     * Gets the value of the madCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMADCd() {
        return madCd;
    }

    /**
     * Sets the value of the madCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMADCd(String value) {
        this.madCd = value;
    }

    /**
     * Gets the value of the madCalcPctCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMADCalcPctCd() {
        return madCalcPctCd;
    }

    /**
     * Sets the value of the madCalcPctCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMADCalcPctCd(String value) {
        this.madCalcPctCd = value;
    }

    /**
     * Gets the value of the madCalcDOB property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMADCalcDOB() {
        return madCalcDOB;
    }

    /**
     * Sets the value of the madCalcDOB property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMADCalcDOB(XMLGregorianCalendar value) {
        this.madCalcDOB = value;
    }

    /**
     * Gets the value of the madCalcAgeBaseCde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMADCalcAgeBaseCde() {
        return madCalcAgeBaseCde;
    }

    /**
     * Sets the value of the madCalcAgeBaseCde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMADCalcAgeBaseCde(String value) {
        this.madCalcAgeBaseCde = value;
    }

    /**
     * Gets the value of the madAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMADAmt() {
        return madAmt;
    }

    /**
     * Sets the value of the madAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMADAmt(BigDecimal value) {
        this.madAmt = value;
    }

    /**
     * Gets the value of the optDistInitiationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOptDistInitiationDt() {
        return optDistInitiationDt;
    }

    /**
     * Sets the value of the optDistInitiationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOptDistInitiationDt(XMLGregorianCalendar value) {
        this.optDistInitiationDt = value;
    }

    /**
     * Gets the value of the manDistAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getManDistAmt() {
        return manDistAmt;
    }

    /**
     * Sets the value of the manDistAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setManDistAmt(BigDecimal value) {
        this.manDistAmt = value;
    }

    /**
     * Gets the value of the manDistInitiationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getManDistInitiationDt() {
        return manDistInitiationDt;
    }

    /**
     * Sets the value of the manDistInitiationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setManDistInitiationDt(XMLGregorianCalendar value) {
        this.manDistInitiationDt = value;
    }

    /**
     * Gets the value of the madCalcAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMADCalcAge() {
        return madCalcAge;
    }

    /**
     * Sets the value of the madCalcAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMADCalcAge(BigDecimal value) {
        this.madCalcAge = value;
    }

    /**
     * Gets the value of the manDistInitiationYear property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getManDistInitiationYear() {
        return manDistInitiationYear;
    }

    /**
     * Sets the value of the manDistInitiationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setManDistInitiationYear(Long value) {
        this.manDistInitiationYear = value;
    }

    /**
     * Gets the value of the lifeExpectancyFactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeExpectancyFactor() {
        return lifeExpectancyFactor;
    }

    /**
     * Sets the value of the lifeExpectancyFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifeExpectancyFactor(String value) {
        this.lifeExpectancyFactor = value;
    }

    /**
     * Gets the value of the taxWithholding property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxWithholding() {
        return taxWithholding;
    }

    /**
     * Sets the value of the taxWithholding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxWithholding(Boolean value) {
        this.taxWithholding = value;
    }

    /**
     * Gets the value of the stateProv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateProv() {
        return stateProv;
    }

    /**
     * Sets the value of the stateProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateProv(String value) {
        this.stateProv = value;
    }

    /**
     * Gets the value of the taxWithheldData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxWithheldData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxWithheldData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxWithheldDataType }
     * 
     * 
     */
    public List<TaxWithheldDataType> getTaxWithheldData() {
        if (taxWithheldData == null) {
            taxWithheldData = new ArrayList<TaxWithheldDataType>();
        }
        return this.taxWithheldData;
    }

    /**
     * Gets the value of the autoDistData property.
     * 
     * @return
     *     possible object is
     *     {@link AutoDistDataType }
     *     
     */
    public AutoDistDataType getAutoDistData() {
        return autoDistData;
    }

    /**
     * Sets the value of the autoDistData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoDistDataType }
     *     
     */
    public void setAutoDistData(AutoDistDataType value) {
        this.autoDistData = value;
    }

    /**
     * Gets the value of the decedentPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the decedentPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDecedentPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DecedentPlanType }
     * 
     * 
     */
    public List<DecedentPlanType> getDecedentPlan() {
        if (decedentPlan == null) {
            decedentPlan = new ArrayList<DecedentPlanType>();
        }
        return this.decedentPlan;
    }

    /**
     * Gets the value of the tdPlanPeriodData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tdPlanPeriodData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTDPlanPeriodData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDPlanPeriodDataType }
     * 
     * 
     */
    public List<TDPlanPeriodDataType> getTDPlanPeriodData() {
        if (tdPlanPeriodData == null) {
            tdPlanPeriodData = new ArrayList<TDPlanPeriodDataType>();
        }
        return this.tdPlanPeriodData;
    }

    /**
     * Gets the value of the tdPlanTrnLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tdPlanTrnLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTDPlanTrnLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDPlanTrnLimitType }
     * 
     * 
     */
    public List<TDPlanTrnLimitType> getTDPlanTrnLimit() {
        if (tdPlanTrnLimit == null) {
            tdPlanTrnLimit = new ArrayList<TDPlanTrnLimitType>();
        }
        return this.tdPlanTrnLimit;
    }

    /**
     * Gets the value of the tdPlanMiscData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tdPlanMiscData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTDPlanMiscData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDPlanMiscDataType }
     * 
     * 
     */
    public List<TDPlanMiscDataType> getTDPlanMiscData() {
        if (tdPlanMiscData == null) {
            tdPlanMiscData = new ArrayList<TDPlanMiscDataType>();
        }
        return this.tdPlanMiscData;
    }

    /**
     * Gets the value of the tdPlanBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tdPlanBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTDPlanBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDPlanBalType }
     * 
     * 
     */
    public List<TDPlanBalType> getTDPlanBal() {
        if (tdPlanBal == null) {
            tdPlanBal = new ArrayList<TDPlanBalType>();
        }
        return this.tdPlanBal;
    }

    /**
     * Gets the value of the acctRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctRefType }
     * 
     * 
     */
    public List<AcctRefType> getAcctRef() {
        if (acctRef == null) {
            acctRef = new ArrayList<AcctRefType>();
        }
        return this.acctRef;
    }

}
