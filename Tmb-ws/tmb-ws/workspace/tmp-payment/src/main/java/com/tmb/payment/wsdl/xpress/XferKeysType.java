
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tmb.payment.wsdl.xpress.vo.AcctRefType;
import com.tmb.payment.wsdl.xpress.vo.CurAmtType;


/**
 * <p>Java class for XferKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XferKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}XferKeys_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TranCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FromAcctRef"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ToAcctRef" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurAmt"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}WaiverCode"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ApplIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RBANo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}XferFee" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PostedDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FeeType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PostedTime" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}EPAYCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XferKeys_Type", propOrder = {
    "tranCode",
    "fromAcctRef",
    "toAcctRef",
    "curAmt",
    "waiverCode",
    "applIdent",
    "rbaNo",
    "xferFee",
    "postedDt",
    "feeType",
    "postedTime",
    "epayCode"
})
public class XferKeysType
    extends com.tmb.payment.wsdl.xpress.vo.XferKeysType
{

    @XmlElement(name = "TranCode")
    protected String tranCode;
    @XmlElement(name = "FromAcctRef", required = true)
    protected FromAcctRefType fromAcctRef;
    @XmlElement(name = "ToAcctRef", namespace = "urn:ifxforum-org:XSD:1")
    protected AcctRefType toAcctRef;
    @XmlElement(name = "CurAmt", namespace = "urn:ifxforum-org:XSD:1", required = true)
    protected CurAmtType curAmt;
    @XmlElement(name = "WaiverCode", required = true)
    protected String waiverCode;
    @XmlElement(name = "ApplIdent")
    protected String applIdent;
    @XmlElement(name = "RBANo")
    protected String rbaNo;
    @XmlElement(name = "XferFee")
    protected CurAmtType xferFee;
    @XmlElement(name = "PostedDt", namespace = "urn:ifxforum-org:XSD:1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar postedDt;
    @XmlElement(name = "FeeType")
    protected String feeType;
    @XmlElement(name = "PostedTime")
    protected String postedTime;
    @XmlElement(name = "EPAYCode")
    protected String epayCode;

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
     *     {@link FromAcctRefType }
     *     
     */
    public FromAcctRefType getFromAcctRef() {
        return fromAcctRef;
    }

    /**
     * Sets the value of the fromAcctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FromAcctRefType }
     *     
     */
    public void setFromAcctRef(FromAcctRefType value) {
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

}
