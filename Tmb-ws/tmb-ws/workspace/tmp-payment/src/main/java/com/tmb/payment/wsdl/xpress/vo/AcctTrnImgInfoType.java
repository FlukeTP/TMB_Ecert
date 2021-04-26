
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AcctTrnImgInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctTrnImgInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctTrnRef" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TrnType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkNum" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RefData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PrcDt" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}TrnImg" minOccurs="0"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ImageURL" minOccurs="0"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ChkImgData" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctTrnImgInfo_Type", propOrder = {
    "acctTrnRef",
    "trnType",
    "curAmt",
    "chkNum",
    "refData",
    "prcDt",
    "trnImg",
    "imageURL",
    "chkImgData"
})
public class AcctTrnImgInfoType {

    @XmlElement(name = "AcctTrnRef")
    protected AcctTrnRefType acctTrnRef;
    @XmlElement(name = "TrnType")
    protected TrnTypeType trnType;
    @XmlElement(name = "CurAmt")
    protected CurAmtType curAmt;
    @XmlElement(name = "ChkNum")
    protected String chkNum;
    @XmlElement(name = "RefData")
    protected RefDataType refData;
    @XmlElement(name = "PrcDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prcDt;
    @XmlElement(name = "TrnImg")
    protected TrnImgType trnImg;
    @XmlElement(name = "ImageURL")
    protected String imageURL;
    @XmlElementRef(name = "ChkImgData", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ChkImgDataType> chkImgData;

    /**
     * Gets the value of the acctTrnRef property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTrnRefType }
     *     
     */
    public AcctTrnRefType getAcctTrnRef() {
        return acctTrnRef;
    }

    /**
     * Sets the value of the acctTrnRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTrnRefType }
     *     
     */
    public void setAcctTrnRef(AcctTrnRefType value) {
        this.acctTrnRef = value;
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
     * Gets the value of the refData property.
     * 
     * @return
     *     possible object is
     *     {@link RefDataType }
     *     
     */
    public RefDataType getRefData() {
        return refData;
    }

    /**
     * Sets the value of the refData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefDataType }
     *     
     */
    public void setRefData(RefDataType value) {
        this.refData = value;
    }

    /**
     * Gets the value of the prcDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrcDt() {
        return prcDt;
    }

    /**
     * Sets the value of the prcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrcDt(XMLGregorianCalendar value) {
        this.prcDt = value;
    }

    /**
     * Gets the value of the trnImg property.
     * 
     * @return
     *     possible object is
     *     {@link TrnImgType }
     *     
     */
    public TrnImgType getTrnImg() {
        return trnImg;
    }

    /**
     * Sets the value of the trnImg property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnImgType }
     *     
     */
    public void setTrnImg(TrnImgType value) {
        this.trnImg = value;
    }

    /**
     * Gets the value of the imageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageURL() {
        return imageURL;
    }

    /**
     * Sets the value of the imageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageURL(String value) {
        this.imageURL = value;
    }

    /**
     * Gets the value of the chkImgData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ChkImgDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ChkImgDataType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ChkImgDataType> getChkImgData() {
        return chkImgData;
    }

    /**
     * Sets the value of the chkImgData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ChkImgDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ChkImgDataType }{@code >}
     *     
     */
    public void setChkImgData(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ChkImgDataType> value) {
        this.chkImgData = value;
    }

}
