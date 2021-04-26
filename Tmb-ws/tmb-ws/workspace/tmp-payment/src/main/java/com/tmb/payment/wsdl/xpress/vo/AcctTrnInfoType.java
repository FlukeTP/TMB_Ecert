
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
 * <p>Java class for AcctTrnInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctTrnInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctRef" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TrnType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TrnSubType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TrnSrc" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PostedDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OrigDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EffDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TotalCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ExchangeRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CompositeCurAmt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Memo" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StmtRunningBal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkNum" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}XferKeys" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtKeys" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AvailDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SalesSlipRefNum" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}NetworkTrnData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CounterpartyData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RefData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BillRefData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RemitAdviceRefId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustPayeeInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}InvoiceData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CSPRefIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SPRefIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SPRefIdCorrect" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctTrnInfo_Type", propOrder = {
    "acctRef",
    "trnType",
    "trnSubType",
    "trnSrc",
    "postedDt",
    "origDt",
    "effDt",
    "totalCurAmt",
    "exchangeRate",
    "compositeCurAmt",
    "memo",
    "name",
    "stmtRunningBal",
    "chkNum",
    "xferKeys",
    "pmtKeys",
    "availDt",
    "salesSlipRefNum",
    "networkTrnData",
    "counterpartyData",
    "refData",
    "billRefData",
    "remitAdviceRefId",
    "custPayeeInfo",
    "invoiceData",
    "cspRefIdent",
    "spRefIdent",
    "spRefIdCorrect"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.AcctTrnInfoType.class
})
public class AcctTrnInfoType {

    @XmlElement(name = "AcctRef")
    protected AcctRefType acctRef;
    @XmlElement(name = "TrnType")
    protected TrnTypeType trnType;
    @XmlElement(name = "TrnSubType")
    protected String trnSubType;
    @XmlElement(name = "TrnSrc")
    protected String trnSrc;
    @XmlElement(name = "PostedDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar postedDt;
    @XmlElement(name = "OrigDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar origDt;
    @XmlElement(name = "EffDt")
    protected String effDt;
    @XmlElement(name = "TotalCurAmt")
    protected TotalCurAmtType totalCurAmt;
    @XmlElementRef(name = "ExchangeRate", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ExchangeRateType> exchangeRate;
    @XmlElement(name = "CompositeCurAmt")
    protected List<CompositeCurAmtType> compositeCurAmt;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "StmtRunningBal")
    protected StmtRunningBalType stmtRunningBal;
    @XmlElement(name = "ChkNum")
    protected String chkNum;
    @XmlElementRef(name = "XferKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.XferKeysType> xferKeys;
    @XmlElementRef(name = "PmtKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PmtKeysType> pmtKeys;
    @XmlElement(name = "AvailDt")
    protected String availDt;
    @XmlElement(name = "SalesSlipRefNum")
    protected String salesSlipRefNum;
    @XmlElementRef(name = "NetworkTrnData", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.NetworkTrnDataType> networkTrnData;
    @XmlElement(name = "CounterpartyData")
    protected CounterpartyDataType counterpartyData;
    @XmlElement(name = "RefData")
    protected List<RefDataType> refData;
    @XmlElement(name = "BillRefData")
    protected String billRefData;
    @XmlElement(name = "RemitAdviceRefId")
    protected String remitAdviceRefId;
    @XmlElement(name = "CustPayeeInfo")
    protected CustPayeeInfoType custPayeeInfo;
    @XmlElement(name = "InvoiceData")
    protected InvoiceDataType invoiceData;
    @XmlElement(name = "CSPRefIdent")
    protected String cspRefIdent;
    @XmlElement(name = "SPRefIdent")
    protected String spRefIdent;
    @XmlElement(name = "SPRefIdCorrect")
    protected SPRefIdCorrectType spRefIdCorrect;

    /**
     * Gets the value of the acctRef property.
     * 
     * @return
     *     possible object is
     *     {@link AcctRefType }
     *     
     */
    public AcctRefType getAcctRef() {
        return acctRef;
    }

    /**
     * Sets the value of the acctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctRefType }
     *     
     */
    public void setAcctRef(AcctRefType value) {
        this.acctRef = value;
    }

    /**
     * Gets the value of the trnType property.
     * 
     * @return
     *     possible object is
     *     {@link TrnTypeType }
     *     
     */
    public TrnTypeType getTrnType() {
        return trnType;
    }

    /**
     * Sets the value of the trnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnTypeType }
     *     
     */
    public void setTrnType(TrnTypeType value) {
        this.trnType = value;
    }

    /**
     * Gets the value of the trnSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnSubType() {
        return trnSubType;
    }

    /**
     * Sets the value of the trnSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnSubType(String value) {
        this.trnSubType = value;
    }

    /**
     * Gets the value of the trnSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnSrc() {
        return trnSrc;
    }

    /**
     * Sets the value of the trnSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnSrc(String value) {
        this.trnSrc = value;
    }

    /**
     * Gets the value of the postedDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostedDt() {
        return postedDt;
    }

    /**
     * Sets the value of the postedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostedDt(XMLGregorianCalendar value) {
        this.postedDt = value;
    }

    /**
     * Gets the value of the origDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrigDt() {
        return origDt;
    }

    /**
     * Sets the value of the origDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrigDt(XMLGregorianCalendar value) {
        this.origDt = value;
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
     * Gets the value of the totalCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link TotalCurAmtType }
     *     
     */
    public TotalCurAmtType getTotalCurAmt() {
        return totalCurAmt;
    }

    /**
     * Sets the value of the totalCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalCurAmtType }
     *     
     */
    public void setTotalCurAmt(TotalCurAmtType value) {
        this.totalCurAmt = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ExchangeRateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ExchangeRateType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ExchangeRateType> getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ExchangeRateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ExchangeRateType }{@code >}
     *     
     */
    public void setExchangeRate(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ExchangeRateType> value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the compositeCurAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compositeCurAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompositeCurAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompositeCurAmtType }
     * 
     * 
     */
    public List<CompositeCurAmtType> getCompositeCurAmt() {
        if (compositeCurAmt == null) {
            compositeCurAmt = new ArrayList<CompositeCurAmtType>();
        }
        return this.compositeCurAmt;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the stmtRunningBal property.
     * 
     * @return
     *     possible object is
     *     {@link StmtRunningBalType }
     *     
     */
    public StmtRunningBalType getStmtRunningBal() {
        return stmtRunningBal;
    }

    /**
     * Sets the value of the stmtRunningBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtRunningBalType }
     *     
     */
    public void setStmtRunningBal(StmtRunningBalType value) {
        this.stmtRunningBal = value;
    }

    /**
     * Gets the value of the chkNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkNum() {
        return chkNum;
    }

    /**
     * Sets the value of the chkNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkNum(String value) {
        this.chkNum = value;
    }

    /**
     * Gets the value of the xferKeys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.XferKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.XferKeysType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.XferKeysType> getXferKeys() {
        return xferKeys;
    }

    /**
     * Sets the value of the xferKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.XferKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.XferKeysType }{@code >}
     *     
     */
    public void setXferKeys(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.XferKeysType> value) {
        this.xferKeys = value;
    }

    /**
     * Gets the value of the pmtKeys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PmtKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PmtKeysType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PmtKeysType> getPmtKeys() {
        return pmtKeys;
    }

    /**
     * Sets the value of the pmtKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PmtKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PmtKeysType }{@code >}
     *     
     */
    public void setPmtKeys(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PmtKeysType> value) {
        this.pmtKeys = value;
    }

    /**
     * Gets the value of the availDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailDt() {
        return availDt;
    }

    /**
     * Sets the value of the availDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailDt(String value) {
        this.availDt = value;
    }

    /**
     * Gets the value of the salesSlipRefNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesSlipRefNum() {
        return salesSlipRefNum;
    }

    /**
     * Sets the value of the salesSlipRefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesSlipRefNum(String value) {
        this.salesSlipRefNum = value;
    }

    /**
     * Gets the value of the networkTrnData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.NetworkTrnDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.NetworkTrnDataType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.NetworkTrnDataType> getNetworkTrnData() {
        return networkTrnData;
    }

    /**
     * Sets the value of the networkTrnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.NetworkTrnDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.NetworkTrnDataType }{@code >}
     *     
     */
    public void setNetworkTrnData(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.NetworkTrnDataType> value) {
        this.networkTrnData = value;
    }

    /**
     * Gets the value of the counterpartyData property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyDataType }
     *     
     */
    public CounterpartyDataType getCounterpartyData() {
        return counterpartyData;
    }

    /**
     * Sets the value of the counterpartyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyDataType }
     *     
     */
    public void setCounterpartyData(CounterpartyDataType value) {
        this.counterpartyData = value;
    }

    /**
     * Gets the value of the refData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefDataType }
     * 
     * 
     */
    public List<RefDataType> getRefData() {
        if (refData == null) {
            refData = new ArrayList<RefDataType>();
        }
        return this.refData;
    }

    /**
     * Gets the value of the billRefData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillRefData() {
        return billRefData;
    }

    /**
     * Sets the value of the billRefData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillRefData(String value) {
        this.billRefData = value;
    }

    /**
     * Gets the value of the remitAdviceRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemitAdviceRefId() {
        return remitAdviceRefId;
    }

    /**
     * Sets the value of the remitAdviceRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemitAdviceRefId(String value) {
        this.remitAdviceRefId = value;
    }

    /**
     * Gets the value of the custPayeeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustPayeeInfoType }
     *     
     */
    public CustPayeeInfoType getCustPayeeInfo() {
        return custPayeeInfo;
    }

    /**
     * Sets the value of the custPayeeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustPayeeInfoType }
     *     
     */
    public void setCustPayeeInfo(CustPayeeInfoType value) {
        this.custPayeeInfo = value;
    }

    /**
     * Gets the value of the invoiceData property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDataType }
     *     
     */
    public InvoiceDataType getInvoiceData() {
        return invoiceData;
    }

    /**
     * Sets the value of the invoiceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDataType }
     *     
     */
    public void setInvoiceData(InvoiceDataType value) {
        this.invoiceData = value;
    }

    /**
     * Gets the value of the cspRefIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSPRefIdent() {
        return cspRefIdent;
    }

    /**
     * Sets the value of the cspRefIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSPRefIdent(String value) {
        this.cspRefIdent = value;
    }

    /**
     * Gets the value of the spRefIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPRefIdent() {
        return spRefIdent;
    }

    /**
     * Sets the value of the spRefIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPRefIdent(String value) {
        this.spRefIdent = value;
    }

    /**
     * Gets the value of the spRefIdCorrect property.
     * 
     * @return
     *     possible object is
     *     {@link SPRefIdCorrectType }
     *     
     */
    public SPRefIdCorrectType getSPRefIdCorrect() {
        return spRefIdCorrect;
    }

    /**
     * Sets the value of the spRefIdCorrect property.
     * 
     * @param value
     *     allowed object is
     *     {@link SPRefIdCorrectType }
     *     
     */
    public void setSPRefIdCorrect(SPRefIdCorrectType value) {
        this.spRefIdCorrect = value;
    }

}
