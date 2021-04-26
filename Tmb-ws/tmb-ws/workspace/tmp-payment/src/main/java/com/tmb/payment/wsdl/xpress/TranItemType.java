
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.ChkIssueRefType;
import com.tmb.payment.wsdl.xpress.vo.CurAmtType;


/**
 * <p>Java class for TranItem_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TranItem_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MediaItemIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MediaItemType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MediaItemSubType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DrawerData" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CalculatorData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ExchangeRate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TrnMiscData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}MediaCashData"/&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}CreditMediaChkData"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ChkIssueRef"/&gt;
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
@XmlType(name = "TranItem_Type", propOrder = {
    "mediaItemIdent",
    "mediaItemType",
    "mediaItemSubType",
    "acctId",
    "curAmt",
    "drawerData",
    "calculatorData",
    "exchangeRate",
    "trnMiscData",
    "mediaCashData",
    "creditMediaChkData",
    "chkIssueRef"
})
public class TranItemType {

    @XmlElement(name = "MediaItemIdent", namespace = "urn:ifxforum-org:XSD:1")
    protected String mediaItemIdent;
    @XmlElement(name = "MediaItemType", namespace = "urn:ifxforum-org:XSD:1", required = true)
    protected String mediaItemType;
    @XmlElement(name = "MediaItemSubType", namespace = "urn:ifxforum-org:XSD:1", required = true)
    protected String mediaItemSubType;
    @XmlElement(name = "AcctId", namespace = "urn:ifxforum-org:XSD:1")
    protected String acctId;
    @XmlElement(name = "CurAmt", namespace = "urn:ifxforum-org:XSD:1")
    protected CurAmtType curAmt;
    @XmlElement(name = "DrawerData")
    protected DrawerDataType drawerData;
    @XmlElement(name = "CalculatorData")
    protected CalculatorDataType calculatorData;
    @XmlElementRef(name = "ExchangeRate", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ExchangeRateType> exchangeRate;
    @XmlElement(name = "TrnMiscData")
    protected List<MiscDataType> trnMiscData;
    @XmlElementRef(name = "MediaCashData", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.MediaCashDataType> mediaCashData;
    @XmlElement(name = "CreditMediaChkData")
    protected CreditMediaChkDataType creditMediaChkData;
    @XmlElement(name = "ChkIssueRef", namespace = "urn:ifxforum-org:XSD:1")
    protected ChkIssueRefType chkIssueRef;

    /**
     * Gets the value of the mediaItemIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaItemIdent() {
        return mediaItemIdent;
    }

    /**
     * Sets the value of the mediaItemIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaItemIdent(String value) {
        this.mediaItemIdent = value;
    }

    /**
     * Gets the value of the mediaItemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaItemType() {
        return mediaItemType;
    }

    /**
     * Sets the value of the mediaItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaItemType(String value) {
        this.mediaItemType = value;
    }

    /**
     * Gets the value of the mediaItemSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaItemSubType() {
        return mediaItemSubType;
    }

    /**
     * Sets the value of the mediaItemSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaItemSubType(String value) {
        this.mediaItemSubType = value;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
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
     * Gets the value of the drawerData property.
     * 
     * @return
     *     possible object is
     *     {@link DrawerDataType }
     *     
     */
    public DrawerDataType getDrawerData() {
        return drawerData;
    }

    /**
     * Sets the value of the drawerData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrawerDataType }
     *     
     */
    public void setDrawerData(DrawerDataType value) {
        this.drawerData = value;
    }

    /**
     * Gets the value of the calculatorData property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatorDataType }
     *     
     */
    public CalculatorDataType getCalculatorData() {
        return calculatorData;
    }

    /**
     * Sets the value of the calculatorData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatorDataType }
     *     
     */
    public void setCalculatorData(CalculatorDataType value) {
        this.calculatorData = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ExchangeRateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ExchangeRateType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ExchangeRateType> getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ExchangeRateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ExchangeRateType }{@code >}
     *     
     */
    public void setExchangeRate(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ExchangeRateType> value) {
        this.exchangeRate = value;
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

    /**
     * Gets the value of the mediaCashData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.MediaCashDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.MediaCashDataType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.MediaCashDataType> getMediaCashData() {
        return mediaCashData;
    }

    /**
     * Sets the value of the mediaCashData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.MediaCashDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.MediaCashDataType }{@code >}
     *     
     */
    public void setMediaCashData(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.MediaCashDataType> value) {
        this.mediaCashData = value;
    }

    /**
     * Gets the value of the creditMediaChkData property.
     * 
     * @return
     *     possible object is
     *     {@link CreditMediaChkDataType }
     *     
     */
    public CreditMediaChkDataType getCreditMediaChkData() {
        return creditMediaChkData;
    }

    /**
     * Sets the value of the creditMediaChkData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditMediaChkDataType }
     *     
     */
    public void setCreditMediaChkData(CreditMediaChkDataType value) {
        this.creditMediaChkData = value;
    }

    /**
     * Gets the value of the chkIssueRef property.
     * 
     * @return
     *     possible object is
     *     {@link ChkIssueRefType }
     *     
     */
    public ChkIssueRefType getChkIssueRef() {
        return chkIssueRef;
    }

    /**
     * Sets the value of the chkIssueRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkIssueRefType }
     *     
     */
    public void setChkIssueRef(ChkIssueRefType value) {
        this.chkIssueRef = value;
    }

}
