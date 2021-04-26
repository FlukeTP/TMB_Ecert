
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
 * <p>Java class for BillPmtKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillPmtKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BillPmtId" type="{urn:ifxforum-org:XSD:1}Identifier_Type" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TranCode"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FromAcctRef"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ToAcctRef" minOccurs="0"/&gt;
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
 *         &lt;element ref="{http://www.fnf.com/xes}CompCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PostedTime" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}WaiveCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SvcCompCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BranchIdent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillPmtKeys_Type", propOrder = {
    "billPmtId",
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
    "compCode",
    "postedTime",
    "waiveCode",
    "svcCompCode",
    "branchIdent"
})
public class BillPmtKeysType {

    @XmlElement(name = "BillPmtId")
    protected String billPmtId;
    @XmlElement(name = "TranCode", required = true)
    protected String tranCode;
    @XmlElementRef(name = "FromAcctRef", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.FromAcctRefType> fromAcctRef;
    @XmlElement(name = "ToAcctRef", namespace = "urn:ifxforum-org:XSD:1")
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
    @XmlElement(name = "CompCode")
    protected String compCode;
    @XmlElement(name = "PostedTime")
    protected String postedTime;
    @XmlElement(name = "WaiveCode")
    protected String waiveCode;
    @XmlElement(name = "SvcCompCode")
    protected String svcCompCode;
    @XmlElement(name = "BranchIdent", namespace = "urn:ifxforum-org:XSD:1")
    protected String branchIdent;

    /**
     * Gets the value of the billPmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillPmtId() {
        return billPmtId;
    }

    /**
     * Sets the value of the billPmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillPmtId(String value) {
        this.billPmtId = value;
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
     * Gets the value of the waiveCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaiveCode() {
        return waiveCode;
    }

    /**
     * Sets the value of the waiveCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaiveCode(String value) {
        this.waiveCode = value;
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

}
