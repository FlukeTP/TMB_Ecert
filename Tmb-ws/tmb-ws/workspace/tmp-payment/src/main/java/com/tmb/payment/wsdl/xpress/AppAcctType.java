
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.AcctIdentType;
import com.tmb.payment.wsdl.xpress.vo.AcctTypeType;
import com.tmb.payment.wsdl.xpress.vo.FIDataType;
import com.tmb.payment.wsdl.xpress.vo.InitialAmountType;


/**
 * <p>Java class for AppAcct_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppAcct_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ProductIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FIData" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AcctOwnership" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}InitialAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OpenDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SPName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AcctDft" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Offer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AppPartyAcctData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DepAppAcct" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PartyAcctRelData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DisclosureStatData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AcctMiscData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FundingData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AcctSvc" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ProcessStat" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AcctMemo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CreationStat" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PackageIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CostCenter" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ServiceLevel" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CompanyCd" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctTitle" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AcctTitleDesc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppAcct_Type", propOrder = {
    "acctIdent",
    "acctId",
    "acctType",
    "productIdent",
    "fiData",
    "acctOwnership",
    "initialAmount",
    "openDt",
    "spName",
    "acctDft",
    "offer",
    "appPartyAcctData",
    "depAppAcct",
    "partyAcctRelData",
    "disclosureStatData",
    "acctMiscData",
    "fundingData",
    "acctSvc",
    "processStat",
    "acctMemo",
    "creationStat",
    "packageIdent",
    "costCenter",
    "serviceLevel",
    "companyCd",
    "acctTitle",
    "acctTitleDesc"
})
public class AppAcctType {

    @XmlElement(name = "AcctIdent", namespace = "urn:ifxforum-org:XSD:1")
    protected AcctIdentType acctIdent;
    @XmlElement(name = "AcctId", namespace = "urn:ifxforum-org:XSD:1")
    protected String acctId;
    @XmlElement(name = "AcctType", namespace = "urn:ifxforum-org:XSD:1")
    protected AcctTypeType acctType;
    @XmlElement(name = "ProductIdent", namespace = "urn:ifxforum-org:XSD:1")
    protected String productIdent;
    @XmlElement(name = "FIData", namespace = "urn:ifxforum-org:XSD:1")
    protected FIDataType fiData;
    @XmlElement(name = "AcctOwnership")
    protected String acctOwnership;
    @XmlElement(name = "InitialAmount", namespace = "urn:ifxforum-org:XSD:1")
    protected InitialAmountType initialAmount;
    @XmlElement(name = "OpenDt")
    protected String openDt;
    @XmlElement(name = "SPName", namespace = "urn:ifxforum-org:XSD:1")
    protected String spName;
    @XmlElement(name = "AcctDft")
    protected List<AcctDftType> acctDft;
    @XmlElement(name = "Offer")
    protected List<OfferType> offer;
    @XmlElement(name = "AppPartyAcctData")
    protected List<AppPartyAcctDataType> appPartyAcctData;
    @XmlElement(name = "DepAppAcct")
    protected DepAppAcctType depAppAcct;
    @XmlElement(name = "PartyAcctRelData")
    protected List<PartyAcctRelDataType> partyAcctRelData;
    @XmlElement(name = "DisclosureStatData")
    protected List<DisclosureStatDataType> disclosureStatData;
    @XmlElement(name = "AcctMiscData")
    protected List<AcctMiscDataType> acctMiscData;
    @XmlElement(name = "FundingData")
    protected List<FundingDataType> fundingData;
    @XmlElement(name = "AcctSvc")
    protected List<AcctSvcType> acctSvc;
    @XmlElement(name = "ProcessStat", nillable = true)
    protected List<ProcessStatType> processStat;
    @XmlElement(name = "AcctMemo")
    protected List<AcctMemoType> acctMemo;
    @XmlElement(name = "CreationStat", nillable = true)
    protected List<CreationStatType> creationStat;
    @XmlElement(name = "PackageIdent")
    protected String packageIdent;
    @XmlElement(name = "CostCenter")
    protected String costCenter;
    @XmlElement(name = "ServiceLevel", namespace = "urn:ifxforum-org:XSD:1")
    protected String serviceLevel;
    @XmlElement(name = "CompanyCd")
    protected String companyCd;
    @XmlElement(name = "AcctTitle", namespace = "urn:ifxforum-org:XSD:1")
    protected String acctTitle;
    @XmlElement(name = "AcctTitleDesc")
    protected String acctTitleDesc;

    /**
     * Gets the value of the acctIdent property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdentType }
     *     
     */
    public AcctIdentType getAcctIdent() {
        return acctIdent;
    }

    /**
     * Sets the value of the acctIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdentType }
     *     
     */
    public void setAcctIdent(AcctIdentType value) {
        this.acctIdent = value;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
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
     * Gets the value of the acctOwnership property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctOwnership() {
        return acctOwnership;
    }

    /**
     * Sets the value of the acctOwnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctOwnership(String value) {
        this.acctOwnership = value;
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
     * Gets the value of the openDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenDt() {
        return openDt;
    }

    /**
     * Sets the value of the openDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenDt(String value) {
        this.openDt = value;
    }

    /**
     * Gets the value of the spName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPName() {
        return spName;
    }

    /**
     * Sets the value of the spName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPName(String value) {
        this.spName = value;
    }

    /**
     * Gets the value of the acctDft property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctDft property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctDft().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctDftType }
     * 
     * 
     */
    public List<AcctDftType> getAcctDft() {
        if (acctDft == null) {
            acctDft = new ArrayList<AcctDftType>();
        }
        return this.acctDft;
    }

    /**
     * Gets the value of the offer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferType }
     * 
     * 
     */
    public List<OfferType> getOffer() {
        if (offer == null) {
            offer = new ArrayList<OfferType>();
        }
        return this.offer;
    }

    /**
     * Gets the value of the appPartyAcctData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appPartyAcctData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppPartyAcctData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppPartyAcctDataType }
     * 
     * 
     */
    public List<AppPartyAcctDataType> getAppPartyAcctData() {
        if (appPartyAcctData == null) {
            appPartyAcctData = new ArrayList<AppPartyAcctDataType>();
        }
        return this.appPartyAcctData;
    }

    /**
     * Gets the value of the depAppAcct property.
     * 
     * @return
     *     possible object is
     *     {@link DepAppAcctType }
     *     
     */
    public DepAppAcctType getDepAppAcct() {
        return depAppAcct;
    }

    /**
     * Sets the value of the depAppAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAppAcctType }
     *     
     */
    public void setDepAppAcct(DepAppAcctType value) {
        this.depAppAcct = value;
    }

    /**
     * Gets the value of the partyAcctRelData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyAcctRelData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyAcctRelData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyAcctRelDataType }
     * 
     * 
     */
    public List<PartyAcctRelDataType> getPartyAcctRelData() {
        if (partyAcctRelData == null) {
            partyAcctRelData = new ArrayList<PartyAcctRelDataType>();
        }
        return this.partyAcctRelData;
    }

    /**
     * Gets the value of the disclosureStatData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disclosureStatData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisclosureStatData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisclosureStatDataType }
     * 
     * 
     */
    public List<DisclosureStatDataType> getDisclosureStatData() {
        if (disclosureStatData == null) {
            disclosureStatData = new ArrayList<DisclosureStatDataType>();
        }
        return this.disclosureStatData;
    }

    /**
     * Gets the value of the acctMiscData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctMiscData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctMiscData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctMiscDataType }
     * 
     * 
     */
    public List<AcctMiscDataType> getAcctMiscData() {
        if (acctMiscData == null) {
            acctMiscData = new ArrayList<AcctMiscDataType>();
        }
        return this.acctMiscData;
    }

    /**
     * Gets the value of the fundingData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fundingData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFundingData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundingDataType }
     * 
     * 
     */
    public List<FundingDataType> getFundingData() {
        if (fundingData == null) {
            fundingData = new ArrayList<FundingDataType>();
        }
        return this.fundingData;
    }

    /**
     * Gets the value of the acctSvc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctSvc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctSvc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctSvcType }
     * 
     * 
     */
    public List<AcctSvcType> getAcctSvc() {
        if (acctSvc == null) {
            acctSvc = new ArrayList<AcctSvcType>();
        }
        return this.acctSvc;
    }

    /**
     * Gets the value of the processStat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processStat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessStat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessStatType }
     * 
     * 
     */
    public List<ProcessStatType> getProcessStat() {
        if (processStat == null) {
            processStat = new ArrayList<ProcessStatType>();
        }
        return this.processStat;
    }

    /**
     * Gets the value of the acctMemo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctMemo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctMemo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctMemoType }
     * 
     * 
     */
    public List<AcctMemoType> getAcctMemo() {
        if (acctMemo == null) {
            acctMemo = new ArrayList<AcctMemoType>();
        }
        return this.acctMemo;
    }

    /**
     * Gets the value of the creationStat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creationStat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreationStat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreationStatType }
     * 
     * 
     */
    public List<CreationStatType> getCreationStat() {
        if (creationStat == null) {
            creationStat = new ArrayList<CreationStatType>();
        }
        return this.creationStat;
    }

    /**
     * Gets the value of the packageIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageIdent() {
        return packageIdent;
    }

    /**
     * Sets the value of the packageIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageIdent(String value) {
        this.packageIdent = value;
    }

    /**
     * Gets the value of the costCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenter() {
        return costCenter;
    }

    /**
     * Sets the value of the costCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenter(String value) {
        this.costCenter = value;
    }

    /**
     * Gets the value of the serviceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLevel() {
        return serviceLevel;
    }

    /**
     * Sets the value of the serviceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLevel(String value) {
        this.serviceLevel = value;
    }

    /**
     * Gets the value of the companyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCd() {
        return companyCd;
    }

    /**
     * Sets the value of the companyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCd(String value) {
        this.companyCd = value;
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
     * Gets the value of the acctTitleDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctTitleDesc() {
        return acctTitleDesc;
    }

    /**
     * Sets the value of the acctTitleDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctTitleDesc(String value) {
        this.acctTitleDesc = value;
    }

}
