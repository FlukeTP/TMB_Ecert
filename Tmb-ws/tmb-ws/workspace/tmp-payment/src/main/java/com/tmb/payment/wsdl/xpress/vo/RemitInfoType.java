
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemitInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemitInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RemitInstruction" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SettlementData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CounterpartyData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkURL" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CustPayeeId"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CustPayeeInfo"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RemitDetail" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtRef" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RefData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurAmt"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtRemitRefIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtLegalRpt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemitInfo_Type", propOrder = {
    "remitInstruction",
    "settlementData",
    "counterpartyData",
    "chkData",
    "chkURL",
    "custPayeeId",
    "custPayeeInfo",
    "remitDetail",
    "pmtRef",
    "refData",
    "curAmt",
    "pmtRemitRefIdent",
    "pmtLegalRpt"
})
public class RemitInfoType {

    @XmlElement(name = "RemitInstruction")
    protected RemitInstructionType remitInstruction;
    @XmlElement(name = "SettlementData")
    protected SettlementDataType settlementData;
    @XmlElement(name = "CounterpartyData")
    protected CounterpartyDataType counterpartyData;
    @XmlElementRef(name = "ChkData", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ChkDataType> chkData;
    @XmlElement(name = "ChkURL")
    protected String chkURL;
    @XmlElement(name = "CustPayeeId")
    protected String custPayeeId;
    @XmlElement(name = "CustPayeeInfo")
    protected CustPayeeInfoType custPayeeInfo;
    @XmlElement(name = "RemitDetail", required = true)
    protected List<RemitDetailType> remitDetail;
    @XmlElement(name = "PmtRef")
    protected PmtRefType pmtRef;
    @XmlElement(name = "RefData")
    protected List<RefDataType> refData;
    @XmlElement(name = "CurAmt", required = true)
    protected CurAmtType curAmt;
    @XmlElement(name = "PmtRemitRefIdent")
    protected String pmtRemitRefIdent;
    @XmlElement(name = "PmtLegalRpt")
    protected PmtLegalRptType pmtLegalRpt;

    /**
     * Gets the value of the remitInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link RemitInstructionType }
     *     
     */
    public RemitInstructionType getRemitInstruction() {
        return remitInstruction;
    }

    /**
     * Sets the value of the remitInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemitInstructionType }
     *     
     */
    public void setRemitInstruction(RemitInstructionType value) {
        this.remitInstruction = value;
    }

    /**
     * Gets the value of the settlementData property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDataType }
     *     
     */
    public SettlementDataType getSettlementData() {
        return settlementData;
    }

    /**
     * Sets the value of the settlementData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDataType }
     *     
     */
    public void setSettlementData(SettlementDataType value) {
        this.settlementData = value;
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
     * Gets the value of the chkData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ChkDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ChkDataType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ChkDataType> getChkData() {
        return chkData;
    }

    /**
     * Sets the value of the chkData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ChkDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ChkDataType }{@code >}
     *     
     */
    public void setChkData(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ChkDataType> value) {
        this.chkData = value;
    }

    /**
     * Gets the value of the chkURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkURL() {
        return chkURL;
    }

    /**
     * Sets the value of the chkURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkURL(String value) {
        this.chkURL = value;
    }

    /**
     * Gets the value of the custPayeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustPayeeId() {
        return custPayeeId;
    }

    /**
     * Sets the value of the custPayeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustPayeeId(String value) {
        this.custPayeeId = value;
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
     * Gets the value of the remitDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remitDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemitDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemitDetailType }
     * 
     * 
     */
    public List<RemitDetailType> getRemitDetail() {
        if (remitDetail == null) {
            remitDetail = new ArrayList<RemitDetailType>();
        }
        return this.remitDetail;
    }

    /**
     * Gets the value of the pmtRef property.
     * 
     * @return
     *     possible object is
     *     {@link PmtRefType }
     *     
     */
    public PmtRefType getPmtRef() {
        return pmtRef;
    }

    /**
     * Sets the value of the pmtRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtRefType }
     *     
     */
    public void setPmtRef(PmtRefType value) {
        this.pmtRef = value;
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
     * Gets the value of the pmtRemitRefIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtRemitRefIdent() {
        return pmtRemitRefIdent;
    }

    /**
     * Sets the value of the pmtRemitRefIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtRemitRefIdent(String value) {
        this.pmtRemitRefIdent = value;
    }

    /**
     * Gets the value of the pmtLegalRpt property.
     * 
     * @return
     *     possible object is
     *     {@link PmtLegalRptType }
     *     
     */
    public PmtLegalRptType getPmtLegalRpt() {
        return pmtLegalRpt;
    }

    /**
     * Sets the value of the pmtLegalRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtLegalRptType }
     *     
     */
    public void setPmtLegalRpt(PmtLegalRptType value) {
        this.pmtLegalRpt = value;
    }

}
