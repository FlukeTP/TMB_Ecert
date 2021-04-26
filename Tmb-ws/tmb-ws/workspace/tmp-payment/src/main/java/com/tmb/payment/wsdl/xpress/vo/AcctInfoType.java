
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AcctInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurCode"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Desc" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctIdent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BBAN" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IBAN" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}UPIC" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CLABE" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FIData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctUse" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Term" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MaturityDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IntRateData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TaxWithholding" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TaxCountry" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TaxProvince" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ProductIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}InitialAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctTaxType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctTitle" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Memo" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OpenDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ClosedDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PostAddr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MktgMaterial" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctBal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctPeriodData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}GraceEndDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RemainingPmtCount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctTrnLimit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TaxWithheldData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DepAcctData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CreditAcctData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BillPayInd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctInfo_Type", propOrder = {
    "curCode",
    "desc",
    "acctIdent",
    "bban",
    "iban",
    "upic",
    "clabe",
    "fiData",
    "acctUse",
    "term",
    "maturityDt",
    "intRateData",
    "taxWithholding",
    "taxCountry",
    "taxProvince",
    "productIdent",
    "initialAmount",
    "acctType",
    "acctTaxType",
    "acctTitle",
    "memo",
    "openDt",
    "closedDt",
    "postAddr",
    "mktgMaterial",
    "acctBal",
    "acctPeriodData",
    "graceEndDt",
    "remainingPmtCount",
    "acctTrnLimit",
    "taxWithheldData",
    "depAcctData",
    "creditAcctData",
    "billPayInd"
})
@XmlSeeAlso({
     AcctInfoType.class
})
public class AcctInfoType {

    @XmlElement(name = "CurCode", required = true)
    protected CurCodeType curCode;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "AcctIdent")
    protected List<AcctIdentType> acctIdent;
    @XmlElement(name = "BBAN")
    protected String bban;
    @XmlElement(name = "IBAN")
    protected String iban;
    @XmlElement(name = "UPIC")
    protected String upic;
    @XmlElement(name = "CLABE")
    protected String clabe;
    @XmlElement(name = "FIData")
    protected FIDataType fiData;
    @XmlElement(name = "AcctUse")
    protected String acctUse;
    @XmlElement(name = "Term")
    protected TermType term;
    @XmlElement(name = "MaturityDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar maturityDt;
    @XmlElementRef(name = "IntRateData", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.IntRateDataType> intRateData;
    @XmlElement(name = "TaxWithholding")
    protected Boolean taxWithholding;
    @XmlElement(name = "TaxCountry")
    protected TaxCountryType taxCountry;
    @XmlElement(name = "TaxProvince")
    protected String taxProvince;
    @XmlElement(name = "ProductIdent")
    protected String productIdent;
    @XmlElement(name = "InitialAmount")
    protected InitialAmountType initialAmount;
    @XmlElement(name = "AcctType")
    protected AcctTypeType acctType;
    @XmlElement(name = "AcctTaxType")
    protected String acctTaxType;
    @XmlElement(name = "AcctTitle")
    protected String acctTitle;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "OpenDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar openDt;
    @XmlElement(name = "ClosedDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar closedDt;
    @XmlElementRef(name = "PostAddr", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PostAddrType> postAddr;
    @XmlElement(name = "MktgMaterial")
    protected List<MktgMaterialType> mktgMaterial;
    @XmlElement(name = "AcctBal")
    protected List<AcctBalType> acctBal;
    @XmlElement(name = "AcctPeriodData")
    protected List<AcctPeriodDataType> acctPeriodData;
    @XmlElement(name = "GraceEndDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar graceEndDt;
    @XmlElement(name = "RemainingPmtCount")
    protected Long remainingPmtCount;
    @XmlElement(name = "AcctTrnLimit")
    protected List<AcctTrnLimitType> acctTrnLimit;
    @XmlElement(name = "TaxWithheldData")
    protected List<TaxWithheldDataType> taxWithheldData;
    @XmlElementRef(name = "DepAcctData", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.DepAcctDataType> depAcctData;
    @XmlElementRef(name = "CreditAcctData", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CreditAcctDataType> creditAcctData;
    @XmlElement(name = "BillPayInd")
    protected Boolean billPayInd;

    /**
     * Gets the value of the curCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurCodeType }
     *     
     */
    public CurCodeType getCurCode() {
        return curCode;
    }

    /**
     * Sets the value of the curCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurCodeType }
     *     
     */
    public void setCurCode(CurCodeType value) {
        this.curCode = value;
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
     * Gets the value of the acctIdent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctIdent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctIdent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctIdentType }
     * 
     * 
     */
    public List<AcctIdentType> getAcctIdent() {
        if (acctIdent == null) {
            acctIdent = new ArrayList<AcctIdentType>();
        }
        return this.acctIdent;
    }

    /**
     * Gets the value of the bban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBBAN() {
        return bban;
    }

    /**
     * Sets the value of the bban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBBAN(String value) {
        this.bban = value;
    }

    /**
     * Gets the value of the iban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBAN(String value) {
        this.iban = value;
    }

    /**
     * Gets the value of the upic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPIC() {
        return upic;
    }

    /**
     * Sets the value of the upic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPIC(String value) {
        this.upic = value;
    }

    /**
     * Gets the value of the clabe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLABE() {
        return clabe;
    }

    /**
     * Sets the value of the clabe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLABE(String value) {
        this.clabe = value;
    }

    /**
     * Gets the value of the fiData property.
     * 
     * @return
     *     possible object is
     *     {@link FIDataType }
     *     
     */
    public FIDataType getFIData() {
        return fiData;
    }

    /**
     * Sets the value of the fiData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIDataType }
     *     
     */
    public void setFIData(FIDataType value) {
        this.fiData = value;
    }

    /**
     * Gets the value of the acctUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctUse() {
        return acctUse;
    }

    /**
     * Sets the value of the acctUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctUse(String value) {
        this.acctUse = value;
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
     * Gets the value of the maturityDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaturityDt() {
        return maturityDt;
    }

    /**
     * Sets the value of the maturityDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaturityDt(XMLGregorianCalendar value) {
        this.maturityDt = value;
    }

    /**
     * Gets the value of the intRateData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link  IntRateDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.IntRateDataType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.IntRateDataType> getIntRateData() {
        return intRateData;
    }

    /**
     * Sets the value of the intRateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link  IntRateDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.IntRateDataType }{@code >}
     *     
     */
    public void setIntRateData(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.IntRateDataType> value) {
        this.intRateData = value;
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
     * Gets the value of the taxCountry property.
     * 
     * @return
     *     possible object is
     *     {@link TaxCountryType }
     *     
     */
    public TaxCountryType getTaxCountry() {
        return taxCountry;
    }

    /**
     * Sets the value of the taxCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCountryType }
     *     
     */
    public void setTaxCountry(TaxCountryType value) {
        this.taxCountry = value;
    }

    /**
     * Gets the value of the taxProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxProvince() {
        return taxProvince;
    }

    /**
     * Sets the value of the taxProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxProvince(String value) {
        this.taxProvince = value;
    }

    /**
     * Gets the value of the productIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductIdent() {
        return productIdent;
    }

    /**
     * Sets the value of the productIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductIdent(String value) {
        this.productIdent = value;
    }

    /**
     * Gets the value of the initialAmount property.
     * 
     * @return
     *     possible object is
     *     {@link InitialAmountType }
     *     
     */
    public InitialAmountType getInitialAmount() {
        return initialAmount;
    }

    /**
     * Sets the value of the initialAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitialAmountType }
     *     
     */
    public void setInitialAmount(InitialAmountType value) {
        this.initialAmount = value;
    }

    /**
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeType }
     *     
     */
    public AcctTypeType getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeType }
     *     
     */
    public void setAcctType(AcctTypeType value) {
        this.acctType = value;
    }

    /**
     * Gets the value of the acctTaxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctTaxType() {
        return acctTaxType;
    }

    /**
     * Sets the value of the acctTaxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctTaxType(String value) {
        this.acctTaxType = value;
    }

    /**
     * Gets the value of the acctTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctTitle() {
        return acctTitle;
    }

    /**
     * Sets the value of the acctTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctTitle(String value) {
        this.acctTitle = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Gets the value of the openDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpenDt() {
        return openDt;
    }

    /**
     * Sets the value of the openDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOpenDt(XMLGregorianCalendar value) {
        this.openDt = value;
    }

    /**
     * Gets the value of the closedDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClosedDt() {
        return closedDt;
    }

    /**
     * Sets the value of the closedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClosedDt(XMLGregorianCalendar value) {
        this.closedDt = value;
    }

    /**
     * Gets the value of the postAddr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link  PostAddrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PostAddrType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PostAddrType> getPostAddr() {
        return postAddr;
    }

    /**
     * Sets the value of the postAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link  PostAddrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PostAddrType }{@code >}
     *     
     */
    public void setPostAddr(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PostAddrType> value) {
        this.postAddr = value;
    }

    /**
     * Gets the value of the mktgMaterial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mktgMaterial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMktgMaterial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MktgMaterialType }
     * 
     * 
     */
    public List<MktgMaterialType> getMktgMaterial() {
        if (mktgMaterial == null) {
            mktgMaterial = new ArrayList<MktgMaterialType>();
        }
        return this.mktgMaterial;
    }

    /**
     * Gets the value of the acctBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctBalType }
     * 
     * 
     */
    public List<AcctBalType> getAcctBal() {
        if (acctBal == null) {
            acctBal = new ArrayList<AcctBalType>();
        }
        return this.acctBal;
    }

    /**
     * Gets the value of the acctPeriodData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctPeriodData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctPeriodData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctPeriodDataType }
     * 
     * 
     */
    public List<AcctPeriodDataType> getAcctPeriodData() {
        if (acctPeriodData == null) {
            acctPeriodData = new ArrayList<AcctPeriodDataType>();
        }
        return this.acctPeriodData;
    }

    /**
     * Gets the value of the graceEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGraceEndDt() {
        return graceEndDt;
    }

    /**
     * Sets the value of the graceEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGraceEndDt(XMLGregorianCalendar value) {
        this.graceEndDt = value;
    }

    /**
     * Gets the value of the remainingPmtCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRemainingPmtCount() {
        return remainingPmtCount;
    }

    /**
     * Sets the value of the remainingPmtCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRemainingPmtCount(Long value) {
        this.remainingPmtCount = value;
    }

    /**
     * Gets the value of the acctTrnLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctTrnLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctTrnLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctTrnLimitType }
     * 
     * 
     */
    public List<AcctTrnLimitType> getAcctTrnLimit() {
        if (acctTrnLimit == null) {
            acctTrnLimit = new ArrayList<AcctTrnLimitType>();
        }
        return this.acctTrnLimit;
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
     * Gets the value of the depAcctData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link  DepAcctDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.DepAcctDataType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.DepAcctDataType> getDepAcctData() {
        return depAcctData;
    }

    /**
     * Sets the value of the depAcctData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link  DepAcctDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.DepAcctDataType }{@code >}
     *     
     */
    public void setDepAcctData(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.DepAcctDataType> value) {
        this.depAcctData = value;
    }

    /**
     * Gets the value of the creditAcctData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.CreditAcctDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link  CreditAcctDataType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CreditAcctDataType> getCreditAcctData() {
        return creditAcctData;
    }

    /**
     * Sets the value of the creditAcctData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.CreditAcctDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link  CreditAcctDataType }{@code >}
     *     
     */
    public void setCreditAcctData(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CreditAcctDataType> value) {
        this.creditAcctData = value;
    }

    /**
     * Gets the value of the billPayInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBillPayInd() {
        return billPayInd;
    }

    /**
     * Sets the value of the billPayInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBillPayInd(Boolean value) {
        this.billPayInd = value;
    }

}
