
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
 * <p>Java class for RecXferInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecXferInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}RecXferInfo_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SeqNum" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}XferInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RecurModel" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyKeys" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}EndXferCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PmtMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FromAcctProdId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ToAcctProdId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RemainingXferCount" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}NextXferDt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecXferInfo_Type", propOrder = {
    "seqNum",
    "xferInfo",
    "recurModel",
    "partyKeys",
    "endXferCurAmt",
    "pmtMethod",
    "fromAcctProdId",
    "toAcctProdId",
    "remainingXferCount",
    "nextXferDt"
})
public class RecXferInfoType
    extends com.tmb.payment.wsdl.xpress.vo.RecXferInfoType
{

    @XmlElement(name = "SeqNum", namespace = "urn:ifxforum-org:XSD:1")
    protected Long seqNum;
    @XmlElementRef(name = "XferInfo", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.XferInfoType> xferInfo;
    @XmlElement(name = "RecurModel")
    protected RecurModelType recurModel;
    @XmlElementRef(name = "PartyKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyKeysType> partyKeys;
    @XmlElement(name = "EndXferCurAmt")
    protected CurAmtType endXferCurAmt;
    @XmlElement(name = "PmtMethod")
    protected String pmtMethod;
    @XmlElement(name = "FromAcctProdId")
    protected String fromAcctProdId;
    @XmlElement(name = "ToAcctProdId")
    protected String toAcctProdId;
    @XmlElement(name = "RemainingXferCount")
    protected Long remainingXferCount;
    @XmlElement(name = "NextXferDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextXferDt;

    /**
     * Gets the value of the seqNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeqNum() {
        return seqNum;
    }

    /**
     * Sets the value of the seqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeqNum(Long value) {
        this.seqNum = value;
    }

    /**
     * Gets the value of the xferInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.XferInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.XferInfoType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.XferInfoType> getXferInfo() {
        return xferInfo;
    }

    /**
     * Sets the value of the xferInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.XferInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.XferInfoType }{@code >}
     *     
     */
    public void setXferInfo(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.XferInfoType> value) {
        this.xferInfo = value;
    }

    /**
     * Gets the value of the recurModel property.
     * 
     * @return
     *     possible object is
     *     {@link RecurModelType }
     *     
     */
    public RecurModelType getRecurModel() {
        return recurModel;
    }

    /**
     * Sets the value of the recurModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurModelType }
     *     
     */
    public void setRecurModel(RecurModelType value) {
        this.recurModel = value;
    }

    /**
     * Gets the value of the partyKeys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyKeysType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyKeysType> getPartyKeys() {
        return partyKeys;
    }

    /**
     * Sets the value of the partyKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyKeysType }{@code >}
     *     
     */
    public void setPartyKeys(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyKeysType> value) {
        this.partyKeys = value;
    }

    /**
     * Gets the value of the endXferCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getEndXferCurAmt() {
        return endXferCurAmt;
    }

    /**
     * Sets the value of the endXferCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setEndXferCurAmt(CurAmtType value) {
        this.endXferCurAmt = value;
    }

    /**
     * Gets the value of the pmtMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtMethod() {
        return pmtMethod;
    }

    /**
     * Sets the value of the pmtMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtMethod(String value) {
        this.pmtMethod = value;
    }

    /**
     * Gets the value of the fromAcctProdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromAcctProdId() {
        return fromAcctProdId;
    }

    /**
     * Sets the value of the fromAcctProdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromAcctProdId(String value) {
        this.fromAcctProdId = value;
    }

    /**
     * Gets the value of the toAcctProdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToAcctProdId() {
        return toAcctProdId;
    }

    /**
     * Sets the value of the toAcctProdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToAcctProdId(String value) {
        this.toAcctProdId = value;
    }

    /**
     * Gets the value of the remainingXferCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRemainingXferCount() {
        return remainingXferCount;
    }

    /**
     * Sets the value of the remainingXferCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRemainingXferCount(Long value) {
        this.remainingXferCount = value;
    }

    /**
     * Gets the value of the nextXferDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextXferDt() {
        return nextXferDt;
    }

    /**
     * Sets the value of the nextXferDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextXferDt(XMLGregorianCalendar value) {
        this.nextXferDt = value;
    }

}
