
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tmb.payment.wsdl.xpress.vo.AcctRefType;
import com.tmb.payment.wsdl.xpress.vo.CurAmtType;


/**
 * <p>Java class for BillPmtInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillPmtInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TranCode"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FromAcctRef"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ToAcctRef"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurAmt"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}BillPmtFee"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtRefIdent"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}InvoiceNum"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PostedDt"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}EPAYCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RBANo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}InterRegionFee" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CICSTranCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MsgType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctTitle" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}LedgerBal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AvailBal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FeeAmntResult" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RespCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}HoldCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FlagFeeReg" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CompCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PostedTime" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}WaiveProductCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AmountWaived" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}WaiveRemaining" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}WaiveUsed" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}WaiveFlag" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ATMMsgType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardNum" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BranchIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TermOwner" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TrnTypeValue" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TermId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TermRecNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}BalanceFlag" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SvcCompCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillPmtInfo_Type", propOrder = {
    "tranCode",
    "fromAcctRef",
    "toAcctRef",
    "curAmt",
    "billPmtFee",
    "pmtRefIdent",
    "invoiceNum",
    "postedDt",
    "epayCode",
    "rbaNo",
    "interRegionFee",
    "cicsTranCode",
    "msgType",
    "acctTitle",
    "ledgerBal",
    "availBal",
    "feeAmntResult",
    "acctStatusCode",
    "respCode",
    "holdCode",
    "flagFeeReg",
    "compCode",
    "postedTime",
    "waiveProductCode",
    "amountWaived",
    "waiveRemaining",
    "waiveUsed",
    "waiveFlag",
    "atmMsgType",
    "cardNum",
    "branchIdent",
    "termOwner",
    "trnTypeValue",
    "termId",
    "termRecNum",
    "balanceFlag",
    "svcCompCode"
})
public class BillPmtInfoType {

    @XmlElement(name = "TranCode", required = true)
    protected String tranCode;
    @XmlElementRef(name = "FromAcctRef", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.FromAcctRefType> fromAcctRef;
    @XmlElement(name = "ToAcctRef", namespace = "urn:ifxforum-org:XSD:1", required = true)
    protected AcctRefType toAcctRef;
    @XmlElement(name = "CurAmt", namespace = "urn:ifxforum-org:XSD:1", required = true)
    protected CurAmtType curAmt;
    @XmlElement(name = "BillPmtFee", required = true)
    protected CurAmtType billPmtFee;
    @XmlElement(name = "PmtRefIdent", namespace = "urn:ifxforum-org:XSD:1", required = true)
    protected String pmtRefIdent;
    @XmlElement(name = "InvoiceNum", namespace = "urn:ifxforum-org:XSD:1", required = true)
    protected String invoiceNum;
    @XmlElement(name = "PostedDt", namespace = "urn:ifxforum-org:XSD:1", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar postedDt;
    @XmlElement(name = "EPAYCode")
    protected String epayCode;
    @XmlElement(name = "RBANo")
    protected String rbaNo;
    @XmlElement(name = "InterRegionFee")
    protected CurAmtType interRegionFee;
    @XmlElement(name = "CICSTranCode")
    protected String cicsTranCode;
    @XmlElement(name = "MsgType")
    protected String msgType;
    @XmlElement(name = "AcctTitle", namespace = "urn:ifxforum-org:XSD:1")
    protected String acctTitle;
    @XmlElement(name = "LedgerBal")
    protected CurAmtType ledgerBal;
    @XmlElement(name = "AvailBal")
    protected CurAmtType availBal;
    @XmlElement(name = "FeeAmntResult")
    protected CurAmtType feeAmntResult;
    @XmlElement(name = "AcctStatusCode", namespace = "urn:ifxforum-org:XSD:1")
    protected String acctStatusCode;
    @XmlElement(name = "RespCode")
    protected String respCode;
    @XmlElement(name = "HoldCode")
    protected String holdCode;
    @XmlElement(name = "FlagFeeReg")
    protected String flagFeeReg;
    @XmlElement(name = "CompCode")
    protected String compCode;
    @XmlElement(name = "PostedTime")
    protected String postedTime;
    @XmlElement(name = "WaiveProductCode")
    protected String waiveProductCode;
    @XmlElement(name = "AmountWaived")
    protected Long amountWaived;
    @XmlElement(name = "WaiveRemaining")
    protected Long waiveRemaining;
    @XmlElement(name = "WaiveUsed")
    protected Long waiveUsed;
    @XmlElement(name = "WaiveFlag")
    protected String waiveFlag;
    @XmlElement(name = "ATMMsgType")
    protected String atmMsgType;
    @XmlElement(name = "CardNum", namespace = "urn:ifxforum-org:XSD:1")
    protected String cardNum;
    @XmlElement(name = "BranchIdent", namespace = "urn:ifxforum-org:XSD:1")
    protected String branchIdent;
    @XmlElement(name = "TermOwner")
    protected String termOwner;
    @XmlElement(name = "TrnTypeValue", namespace = "urn:ifxforum-org:XSD:1")
    protected String trnTypeValue;
    @XmlElement(name = "TermId")
    protected String termId;
    @XmlElement(name = "TermRecNum")
    protected String termRecNum;
    @XmlElement(name = "BalanceFlag")
    protected String balanceFlag;
    @XmlElement(name = "SvcCompCode")
    protected String svcCompCode;

    /**
     * Gets the value of the tranCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranCode() {
        return tranCode;
    }

    /**
     * Sets the value of the tranCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranCode(String value) {
        this.tranCode = value;
    }

    /**
     * Gets the value of the fromAcctRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.FromAcctRefType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.FromAcctRefType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.FromAcctRefType> getFromAcctRef() {
        return fromAcctRef;
    }

    /**
     * Sets the value of the fromAcctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.FromAcctRefType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.FromAcctRefType }{@code >}
     *     
     */
    public void setFromAcctRef(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.FromAcctRefType> value) {
        this.fromAcctRef = value;
    }

    /**
     * Gets the value of the toAcctRef property.
     * 
     * @return
     *     possible object is
     *     {@link AcctRefType }
     *     
     */
    public AcctRefType getToAcctRef() {
        return toAcctRef;
    }

    /**
     * Sets the value of the toAcctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctRefType }
     *     
     */
    public void setToAcctRef(AcctRefType value) {
        this.toAcctRef = value;
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
     * Gets the value of the billPmtFee property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getBillPmtFee() {
        return billPmtFee;
    }

    /**
     * Sets the value of the billPmtFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setBillPmtFee(CurAmtType value) {
        this.billPmtFee = value;
    }

    /**
     * Gets the value of the pmtRefIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtRefIdent() {
        return pmtRefIdent;
    }

    /**
     * Sets the value of the pmtRefIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtRefIdent(String value) {
        this.pmtRefIdent = value;
    }

    /**
     * Gets the value of the invoiceNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNum() {
        return invoiceNum;
    }

    /**
     * Sets the value of the invoiceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNum(String value) {
        this.invoiceNum = value;
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
     * Gets the value of the epayCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEPAYCode() {
        return epayCode;
    }

    /**
     * Sets the value of the epayCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEPAYCode(String value) {
        this.epayCode = value;
    }

    /**
     * Gets the value of the rbaNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRBANo() {
        return rbaNo;
    }

    /**
     * Sets the value of the rbaNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRBANo(String value) {
        this.rbaNo = value;
    }

    /**
     * Gets the value of the interRegionFee property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getInterRegionFee() {
        return interRegionFee;
    }

    /**
     * Sets the value of the interRegionFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setInterRegionFee(CurAmtType value) {
        this.interRegionFee = value;
    }

    /**
     * Gets the value of the cicsTranCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCICSTranCode() {
        return cicsTranCode;
    }

    /**
     * Sets the value of the cicsTranCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCICSTranCode(String value) {
        this.cicsTranCode = value;
    }

    /**
     * Gets the value of the msgType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * Sets the value of the msgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgType(String value) {
        this.msgType = value;
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
     * Gets the value of the ledgerBal property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getLedgerBal() {
        return ledgerBal;
    }

    /**
     * Sets the value of the ledgerBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setLedgerBal(CurAmtType value) {
        this.ledgerBal = value;
    }

    /**
     * Gets the value of the availBal property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getAvailBal() {
        return availBal;
    }

    /**
     * Sets the value of the availBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setAvailBal(CurAmtType value) {
        this.availBal = value;
    }

    /**
     * Gets the value of the feeAmntResult property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getFeeAmntResult() {
        return feeAmntResult;
    }

    /**
     * Sets the value of the feeAmntResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setFeeAmntResult(CurAmtType value) {
        this.feeAmntResult = value;
    }

    /**
     * Gets the value of the acctStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctStatusCode() {
        return acctStatusCode;
    }

    /**
     * Sets the value of the acctStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctStatusCode(String value) {
        this.acctStatusCode = value;
    }

    /**
     * Gets the value of the respCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespCode() {
        return respCode;
    }

    /**
     * Sets the value of the respCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespCode(String value) {
        this.respCode = value;
    }

    /**
     * Gets the value of the holdCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldCode() {
        return holdCode;
    }

    /**
     * Sets the value of the holdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldCode(String value) {
        this.holdCode = value;
    }

    /**
     * Gets the value of the flagFeeReg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagFeeReg() {
        return flagFeeReg;
    }

    /**
     * Sets the value of the flagFeeReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagFeeReg(String value) {
        this.flagFeeReg = value;
    }

    /**
     * Gets the value of the compCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompCode() {
        return compCode;
    }

    /**
     * Sets the value of the compCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompCode(String value) {
        this.compCode = value;
    }

    /**
     * Gets the value of the postedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostedTime() {
        return postedTime;
    }

    /**
     * Sets the value of the postedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostedTime(String value) {
        this.postedTime = value;
    }

    /**
     * Gets the value of the waiveProductCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaiveProductCode() {
        return waiveProductCode;
    }

    /**
     * Sets the value of the waiveProductCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaiveProductCode(String value) {
        this.waiveProductCode = value;
    }

    /**
     * Gets the value of the amountWaived property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmountWaived() {
        return amountWaived;
    }

    /**
     * Sets the value of the amountWaived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmountWaived(Long value) {
        this.amountWaived = value;
    }

    /**
     * Gets the value of the waiveRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWaiveRemaining() {
        return waiveRemaining;
    }

    /**
     * Sets the value of the waiveRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWaiveRemaining(Long value) {
        this.waiveRemaining = value;
    }

    /**
     * Gets the value of the waiveUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWaiveUsed() {
        return waiveUsed;
    }

    /**
     * Sets the value of the waiveUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWaiveUsed(Long value) {
        this.waiveUsed = value;
    }

    /**
     * Gets the value of the waiveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaiveFlag() {
        return waiveFlag;
    }

    /**
     * Sets the value of the waiveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaiveFlag(String value) {
        this.waiveFlag = value;
    }

    /**
     * Gets the value of the atmMsgType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATMMsgType() {
        return atmMsgType;
    }

    /**
     * Sets the value of the atmMsgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATMMsgType(String value) {
        this.atmMsgType = value;
    }

    /**
     * Gets the value of the cardNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNum() {
        return cardNum;
    }

    /**
     * Sets the value of the cardNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNum(String value) {
        this.cardNum = value;
    }

    /**
     * Gets the value of the branchIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchIdent() {
        return branchIdent;
    }

    /**
     * Sets the value of the branchIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchIdent(String value) {
        this.branchIdent = value;
    }

    /**
     * Gets the value of the termOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermOwner() {
        return termOwner;
    }

    /**
     * Sets the value of the termOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermOwner(String value) {
        this.termOwner = value;
    }

    /**
     * Gets the value of the trnTypeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnTypeValue() {
        return trnTypeValue;
    }

    /**
     * Sets the value of the trnTypeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnTypeValue(String value) {
        this.trnTypeValue = value;
    }

    /**
     * Gets the value of the termId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermId() {
        return termId;
    }

    /**
     * Sets the value of the termId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermId(String value) {
        this.termId = value;
    }

    /**
     * Gets the value of the termRecNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermRecNum() {
        return termRecNum;
    }

    /**
     * Sets the value of the termRecNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermRecNum(String value) {
        this.termRecNum = value;
    }

    /**
     * Gets the value of the balanceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceFlag() {
        return balanceFlag;
    }

    /**
     * Sets the value of the balanceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceFlag(String value) {
        this.balanceFlag = value;
    }

    /**
     * Gets the value of the svcCompCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcCompCode() {
        return svcCompCode;
    }

    /**
     * Sets the value of the svcCompCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcCompCode(String value) {
        this.svcCompCode = value;
    }

}
