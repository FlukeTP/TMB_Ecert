
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tmb.payment.wsdl.xpress.vo.CurAmtType;


/**
 * <p>Java class for AutoDistData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutoDistData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}UpdateCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}NextDistDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AutoDistNextCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AutoDistLastCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DistCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}NoticeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AutoDistReasonCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TrnSubType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DistMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SatisfyMADInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ConsolidatedDistCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AutoDistAcctRef" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RecurrenceRule" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkDetail" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}LastDistDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}LastUpdateDt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoDistData_Type", propOrder = {
    "updateCode",
    "nextDistDt",
    "autoDistNextCurAmt",
    "autoDistLastCurAmt",
    "distCode",
    "noticeCode",
    "autoDistReasonCode",
    "trnSubType",
    "distMethod",
    "satisfyMADInd",
    "consolidatedDistCode",
    "autoDistAcctRef",
    "recurrenceRule",
    "chkDetail",
    "lastDistDt",
    "lastUpdateDt"
})
public class AutoDistDataType {

    @XmlElement(name = "UpdateCode")
    protected String updateCode;
    @XmlElement(name = "NextDistDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextDistDt;
    @XmlElement(name = "AutoDistNextCurAmt")
    protected CurAmtType autoDistNextCurAmt;
    @XmlElement(name = "AutoDistLastCurAmt")
    protected CurAmtType autoDistLastCurAmt;
    @XmlElement(name = "DistCode")
    protected String distCode;
    @XmlElement(name = "NoticeCode")
    protected String noticeCode;
    @XmlElement(name = "AutoDistReasonCode")
    protected String autoDistReasonCode;
    @XmlElement(name = "TrnSubType", namespace = "urn:ifxforum-org:XSD:1")
    protected String trnSubType;
    @XmlElement(name = "DistMethod")
    protected String distMethod;
    @XmlElement(name = "SatisfyMADInd")
    protected Boolean satisfyMADInd;
    @XmlElement(name = "ConsolidatedDistCode")
    protected String consolidatedDistCode;
    @XmlElement(name = "AutoDistAcctRef")
    protected AutoDistAcctRefType autoDistAcctRef;
    @XmlElementRef(name = "RecurrenceRule", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.RecurrenceRuleType> recurrenceRule;
    @XmlElementRef(name = "ChkDetail", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ChkDetailType> chkDetail;
    @XmlElement(name = "LastDistDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastDistDt;
    @XmlElement(name = "LastUpdateDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdateDt;

    /**
     * Gets the value of the updateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateCode() {
        return updateCode;
    }

    /**
     * Sets the value of the updateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateCode(String value) {
        this.updateCode = value;
    }

    /**
     * Gets the value of the nextDistDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextDistDt() {
        return nextDistDt;
    }

    /**
     * Sets the value of the nextDistDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextDistDt(XMLGregorianCalendar value) {
        this.nextDistDt = value;
    }

    /**
     * Gets the value of the autoDistNextCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getAutoDistNextCurAmt() {
        return autoDistNextCurAmt;
    }

    /**
     * Sets the value of the autoDistNextCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setAutoDistNextCurAmt(CurAmtType value) {
        this.autoDistNextCurAmt = value;
    }

    /**
     * Gets the value of the autoDistLastCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getAutoDistLastCurAmt() {
        return autoDistLastCurAmt;
    }

    /**
     * Sets the value of the autoDistLastCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setAutoDistLastCurAmt(CurAmtType value) {
        this.autoDistLastCurAmt = value;
    }

    /**
     * Gets the value of the distCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistCode() {
        return distCode;
    }

    /**
     * Sets the value of the distCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistCode(String value) {
        this.distCode = value;
    }

    /**
     * Gets the value of the noticeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoticeCode() {
        return noticeCode;
    }

    /**
     * Sets the value of the noticeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoticeCode(String value) {
        this.noticeCode = value;
    }

    /**
     * Gets the value of the autoDistReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoDistReasonCode() {
        return autoDistReasonCode;
    }

    /**
     * Sets the value of the autoDistReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoDistReasonCode(String value) {
        this.autoDistReasonCode = value;
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
     * Gets the value of the distMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistMethod() {
        return distMethod;
    }

    /**
     * Sets the value of the distMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistMethod(String value) {
        this.distMethod = value;
    }

    /**
     * Gets the value of the satisfyMADInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSatisfyMADInd() {
        return satisfyMADInd;
    }

    /**
     * Sets the value of the satisfyMADInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSatisfyMADInd(Boolean value) {
        this.satisfyMADInd = value;
    }

    /**
     * Gets the value of the consolidatedDistCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsolidatedDistCode() {
        return consolidatedDistCode;
    }

    /**
     * Sets the value of the consolidatedDistCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsolidatedDistCode(String value) {
        this.consolidatedDistCode = value;
    }

    /**
     * Gets the value of the autoDistAcctRef property.
     * 
     * @return
     *     possible object is
     *     {@link AutoDistAcctRefType }
     *     
     */
    public AutoDistAcctRefType getAutoDistAcctRef() {
        return autoDistAcctRef;
    }

    /**
     * Sets the value of the autoDistAcctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoDistAcctRefType }
     *     
     */
    public void setAutoDistAcctRef(AutoDistAcctRefType value) {
        this.autoDistAcctRef = value;
    }

    /**
     * Gets the value of the recurrenceRule property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.RecurrenceRuleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.RecurrenceRuleType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.RecurrenceRuleType> getRecurrenceRule() {
        return recurrenceRule;
    }

    /**
     * Sets the value of the recurrenceRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.RecurrenceRuleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.RecurrenceRuleType }{@code >}
     *     
     */
    public void setRecurrenceRule(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.RecurrenceRuleType> value) {
        this.recurrenceRule = value;
    }

    /**
     * Gets the value of the chkDetail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ChkDetailType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ChkDetailType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ChkDetailType> getChkDetail() {
        return chkDetail;
    }

    /**
     * Sets the value of the chkDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ChkDetailType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ChkDetailType }{@code >}
     *     
     */
    public void setChkDetail(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ChkDetailType> value) {
        this.chkDetail = value;
    }

    /**
     * Gets the value of the lastDistDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDistDt() {
        return lastDistDt;
    }

    /**
     * Sets the value of the lastDistDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDistDt(XMLGregorianCalendar value) {
        this.lastDistDt = value;
    }

    /**
     * Gets the value of the lastUpdateDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateDt() {
        return lastUpdateDt;
    }

    /**
     * Sets the value of the lastUpdateDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateDt(XMLGregorianCalendar value) {
        this.lastUpdateDt = value;
    }

}
