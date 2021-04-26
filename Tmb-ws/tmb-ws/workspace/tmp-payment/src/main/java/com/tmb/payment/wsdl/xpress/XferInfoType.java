
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tmb.payment.wsdl.xpress.vo.CurAmtType;


/**
 * <p>Java class for XferInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XferInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}XferInfo_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}XferMiscData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TrnSubType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RetireAcctTrnData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}XferCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TranCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PostedDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}WaiverCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RBANo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ApplIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}XferFee" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FeeType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CICSTranCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MsgType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FromAcctName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ToAcctName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}LedgerBal" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AvailBal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FeeAmntResult" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MaturityDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}HoldCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RespCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PostedTime" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FlagFeeReg" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}WaiveProductCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AmountWaived" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}WaiveRemaining" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}WaiveUsed" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}WaiveFlag" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TellerId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}EPAYCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MerchantNo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ExpiredDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AuthentId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XferInfo_Type", propOrder = {
    "xferMiscData",
    "trnSubType",
    "retireAcctTrnData",
    "xferCurAmt",
    "tranCode",
    "postedDt",
    "waiverCode",
    "rbaNo",
    "applIdent",
    "xferFee",
    "feeType",
    "cicsTranCode",
    "msgType",
    "fromAcctName",
    "toAcctName",
    "ledgerBal",
    "availBal",
    "acctStatusCode",
    "feeAmntResult",
    "maturityDt",
    "holdCode",
    "respCode",
    "postedTime",
    "flagFeeReg",
    "waiveProductCode",
    "amountWaived",
    "waiveRemaining",
    "waiveUsed",
    "waiveFlag",
    "tellerId",
    "epayCode",
    "merchantNo",
    "expiredDt",
    "authentId"
})
public class XferInfoType
    extends com.tmb.payment.wsdl.xpress.vo.XferInfoType
{

    @XmlElement(name = "XferMiscData")
    protected List<XferMiscDataType> xferMiscData;
    @XmlElement(name = "TrnSubType", namespace = "urn:ifxforum-org:XSD:1")
    protected String trnSubType;
    @XmlElement(name = "RetireAcctTrnData")
    protected List<RetireAcctTrnDataType> retireAcctTrnData;
    @XmlElement(name = "XferCurAmt")
    protected CurAmtType xferCurAmt;
    @XmlElement(name = "TranCode")
    protected String tranCode;
    @XmlElement(name = "PostedDt", namespace = "urn:ifxforum-org:XSD:1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar postedDt;
    @XmlElement(name = "WaiverCode")
    protected String waiverCode;
    @XmlElement(name = "RBANo")
    protected String rbaNo;
    @XmlElement(name = "ApplIdent")
    protected String applIdent;
    @XmlElement(name = "XferFee")
    protected CurAmtType xferFee;
    @XmlElement(name = "FeeType")
    protected String feeType;
    @XmlElement(name = "CICSTranCode")
    protected String cicsTranCode;
    @XmlElement(name = "MsgType")
    protected String msgType;
    @XmlElement(name = "FromAcctName")
    protected String fromAcctName;
    @XmlElement(name = "ToAcctName")
    protected String toAcctName;
    @XmlElement(name = "LedgerBal")
    protected CurAmtType ledgerBal;
    @XmlElement(name = "AvailBal")
    protected CurAmtType availBal;
    @XmlElement(name = "AcctStatusCode", namespace = "urn:ifxforum-org:XSD:1")
    protected String acctStatusCode;
    @XmlElement(name = "FeeAmntResult")
    protected CurAmtType feeAmntResult;
    @XmlElement(name = "MaturityDt", namespace = "urn:ifxforum-org:XSD:1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar maturityDt;
    @XmlElement(name = "HoldCode")
    protected String holdCode;
    @XmlElement(name = "RespCode")
    protected String respCode;
    @XmlElement(name = "PostedTime")
    protected String postedTime;
    @XmlElement(name = "FlagFeeReg")
    protected String flagFeeReg;
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
    @XmlElement(name = "TellerId")
    protected String tellerId;
    @XmlElement(name = "EPAYCode")
    protected String epayCode;
    @XmlElement(name = "MerchantNo")
    protected String merchantNo;
    @XmlElement(name = "ExpiredDt")
    protected String expiredDt;
    @XmlElement(name = "AuthentId")
    protected String authentId;

    /**
     * Gets the value of the xferMiscData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xferMiscData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXferMiscData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XferMiscDataType }
     * 
     * 
     */
    public List<XferMiscDataType> getXferMiscData() {
        if (xferMiscData == null) {
            xferMiscData = new ArrayList<XferMiscDataType>();
        }
        return this.xferMiscData;
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
     * Gets the value of the retireAcctTrnData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retireAcctTrnData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetireAcctTrnData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetireAcctTrnDataType }
     * 
     * 
     */
    public List<RetireAcctTrnDataType> getRetireAcctTrnData() {
        if (retireAcctTrnData == null) {
            retireAcctTrnData = new ArrayList<RetireAcctTrnDataType>();
        }
        return this.retireAcctTrnData;
    }

    /**
     * Gets the value of the xferCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getXferCurAmt() {
        return xferCurAmt;
    }

    /**
     * Sets the value of the xferCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setXferCurAmt(CurAmtType value) {
        this.xferCurAmt = value;
    }

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
     * Gets the value of the applIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplIdent() {
        return applIdent;
    }

    /**
     * Sets the value of the applIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplIdent(String value) {
        this.applIdent = value;
    }

    /**
     * Gets the value of the xferFee property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getXferFee() {
        return xferFee;
    }

    /**
     * Sets the value of the xferFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setXferFee(CurAmtType value) {
        this.xferFee = value;
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
     * Gets the value of the fromAcctName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromAcctName() {
        return fromAcctName;
    }

    /**
     * Sets the value of the fromAcctName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromAcctName(String value) {
        this.fromAcctName = value;
    }

    /**
     * Gets the value of the toAcctName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToAcctName() {
        return toAcctName;
    }

    /**
     * Sets the value of the toAcctName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToAcctName(String value) {
        this.toAcctName = value;
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
     * Gets the value of the tellerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTellerId() {
        return tellerId;
    }

    /**
     * Sets the value of the tellerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTellerId(String value) {
        this.tellerId = value;
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
     * Gets the value of the merchantNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantNo() {
        return merchantNo;
    }

    /**
     * Sets the value of the merchantNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantNo(String value) {
        this.merchantNo = value;
    }

    /**
     * Gets the value of the expiredDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiredDt() {
        return expiredDt;
    }

    /**
     * Sets the value of the expiredDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiredDt(String value) {
        this.expiredDt = value;
    }

    /**
     * Gets the value of the authentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthentId() {
        return authentId;
    }

    /**
     * Sets the value of the authentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthentId(String value) {
        this.authentId = value;
    }

}
