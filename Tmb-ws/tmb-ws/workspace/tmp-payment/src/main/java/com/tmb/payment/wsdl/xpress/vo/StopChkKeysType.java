
package com.tmb.payment.wsdl.xpress.vo;

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
 * <p>Java class for StopChkKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopChkKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SvcIdent" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}StopChkId"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}AcctKeys"/&gt;
 *             &lt;sequence&gt;
 *               &lt;choice&gt;
 *                 &lt;element ref="{urn:ifxforum-org:XSD:1}ChkNum" minOccurs="0"/&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{urn:ifxforum-org:XSD:1}ChkNumRange" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/choice&gt;
 *             &lt;/sequence&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}OrigDt" minOccurs="0"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}CurAmt" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopChkKeys_Type", propOrder = {
    "svcIdent",
    "stopChkId",
    "acctKeys",
    "chkNum",
    "chkNumRange",
    "origDt",
    "curAmt"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.StopChkKeysType.class
})
public class StopChkKeysType {

    @XmlElement(name = "SvcIdent")
    protected String svcIdent;
    @XmlElement(name = "StopChkId")
    protected String stopChkId;
    @XmlElementRef(name = "AcctKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctKeysType> acctKeys;
    @XmlElement(name = "ChkNum")
    protected String chkNum;
    @XmlElement(name = "ChkNumRange")
    protected ChkNumRangeType chkNumRange;
    @XmlElement(name = "OrigDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar origDt;
    @XmlElement(name = "CurAmt")
    protected CurAmtType curAmt;

    /**
     * Gets the value of the svcIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcIdent() {
        return svcIdent;
    }

    /**
     * Sets the value of the svcIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcIdent(String value) {
        this.svcIdent = value;
    }

    /**
     * Gets the value of the stopChkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopChkId() {
        return stopChkId;
    }

    /**
     * Sets the value of the stopChkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopChkId(String value) {
        this.stopChkId = value;
    }

    /**
     * Gets the value of the acctKeys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctKeysType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctKeysType> getAcctKeys() {
        return acctKeys;
    }

    /**
     * Sets the value of the acctKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctKeysType }{@code >}
     *     
     */
    public void setAcctKeys(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctKeysType> value) {
        this.acctKeys = value;
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
     * Gets the value of the chkNumRange property.
     * 
     * @return
     *     possible object is
     *     {@link ChkNumRangeType }
     *     
     */
    public ChkNumRangeType getChkNumRange() {
        return chkNumRange;
    }

    /**
     * Sets the value of the chkNumRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkNumRangeType }
     *     
     */
    public void setChkNumRange(ChkNumRangeType value) {
        this.chkNumRange = value;
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

}
