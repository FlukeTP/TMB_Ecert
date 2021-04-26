
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tmb.payment.wsdl.xpress.vo.AcctRefType;
import com.tmb.payment.wsdl.xpress.vo.CurAmtType;


/**
 * <p>Java class for CreditItems_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditItems_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ToAcctRef"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CurAmt"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FeeAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PostedDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EffDt"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TranCode"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AvailBal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Desc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TrnSeqNum" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}WaiveFeeInd" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OpenDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ToAcctName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TrnMiscData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditItems_Type", propOrder = {
    "toAcctRef",
    "curAmt",
    "feeAmt",
    "postedDt",
    "effDt",
    "tranCode",
    "availBal",
    "desc",
    "trnSeqNum",
    "waiveFeeInd",
    "openDt",
    "toAcctName",
    "trnMiscData"
})
public class CreditItemsType {

    @XmlElement(name = "ToAcctRef", namespace = "urn:ifxforum-org:XSD:1", required = true)
    protected AcctRefType toAcctRef;
    @XmlElement(name = "CurAmt", required = true)
    protected CurAmtType curAmt;
    @XmlElement(name = "FeeAmt")
    protected CurAmtType feeAmt;
    @XmlElement(name = "PostedDt", namespace = "urn:ifxforum-org:XSD:1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar postedDt;
    @XmlElement(name = "EffDt", namespace = "urn:ifxforum-org:XSD:1", required = true)
    protected String effDt;
    @XmlElement(name = "TranCode", required = true)
    protected String tranCode;
    @XmlElement(name = "AvailBal")
    protected CurAmtType availBal;
    @XmlElement(name = "Desc", namespace = "urn:ifxforum-org:XSD:1")
    protected String desc;
    @XmlElement(name = "TrnSeqNum")
    protected String trnSeqNum;
    @XmlElement(name = "WaiveFeeInd", namespace = "urn:ifxforum-org:XSD:1")
    protected Boolean waiveFeeInd;
    @XmlElement(name = "OpenDt", namespace = "urn:ifxforum-org:XSD:1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar openDt;
    @XmlElement(name = "ToAcctName")
    protected String toAcctName;
    @XmlElement(name = "TrnMiscData")
    protected List<MiscDataType> trnMiscData;

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
     * Gets the value of the feeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getFeeAmt() {
        return feeAmt;
    }

    /**
     * Sets the value of the feeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setFeeAmt(CurAmtType value) {
        this.feeAmt = value;
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
     * Gets the value of the trnSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnSeqNum() {
        return trnSeqNum;
    }

    /**
     * Sets the value of the trnSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnSeqNum(String value) {
        this.trnSeqNum = value;
    }

    /**
     * Gets the value of the waiveFeeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWaiveFeeInd() {
        return waiveFeeInd;
    }

    /**
     * Sets the value of the waiveFeeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWaiveFeeInd(Boolean value) {
        this.waiveFeeInd = value;
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
     * Gets the value of the trnMiscData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trnMiscData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrnMiscData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MiscDataType }
     * 
     * 
     */
    public List<MiscDataType> getTrnMiscData() {
        if (trnMiscData == null) {
            trnMiscData = new ArrayList<MiscDataType>();
        }
        return this.trnMiscData;
    }

}
