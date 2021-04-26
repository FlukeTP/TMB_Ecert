
package com.tmb.payment.wsdl.xpress.vo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ForExQuoteInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForExQuoteInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ForExQuoteType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ForExRateType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BuySellIndicator"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BidOffer" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BaseCurCode"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BaseCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ContraCurCode"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ContraCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}HomeCurCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}HomeCurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ForExValDtType"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ForExValDt"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ForExValDtTimeFrame"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ReceivingMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FundingMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TranDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RelatedForExDealRef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctKeys" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}InterestRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}InterestRateYield" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RequestedForExRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ForExRateProviderName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ServiceLevel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForExQuoteInfo_Type", propOrder = {
    "forExQuoteType",
    "forExRateType",
    "buySellIndicator",
    "bidOffer",
    "baseCurCode",
    "baseCurAmt",
    "contraCurCode",
    "contraCurAmt",
    "homeCurCode",
    "homeCurAmt",
    "forExValDtType",
    "forExValDt",
    "forExValDtTimeFrame",
    "receivingMethod",
    "fundingMethod",
    "tranDt",
    "relatedForExDealRef",
    "acctKeys",
    "interestRate",
    "interestRateYield",
    "requestedForExRate",
    "forExRateProviderName",
    "serviceLevel"
})
public class ForExQuoteInfoType {

    @XmlElement(name = "ForExQuoteType")
    protected String forExQuoteType;
    @XmlElement(name = "ForExRateType")
    @XmlSchemaType(name = "string")
    protected ForExRateTypeType forExRateType;
    @XmlElement(name = "BuySellIndicator", required = true)
    @XmlSchemaType(name = "string")
    protected BuySellIndicatorType buySellIndicator;
    @XmlElement(name = "BidOffer")
    @XmlSchemaType(name = "string")
    protected BidOfferType bidOffer;
    @XmlElement(name = "BaseCurCode", required = true)
    protected BaseCurCodeType baseCurCode;
    @XmlElement(name = "BaseCurAmt")
    protected BigDecimal baseCurAmt;
    @XmlElement(name = "ContraCurCode", required = true)
    protected ContraCurCodeType contraCurCode;
    @XmlElement(name = "ContraCurAmt")
    protected BigDecimal contraCurAmt;
    @XmlElement(name = "HomeCurCode")
    protected HomeCurCodeType homeCurCode;
    @XmlElement(name = "HomeCurAmt")
    protected BigDecimal homeCurAmt;
    @XmlElement(name = "ForExValDtType", required = true)
    @XmlSchemaType(name = "string")
    protected ForExValDtTypeType forExValDtType;
    @XmlElement(name = "ForExValDt")
    protected String forExValDt;
    @XmlElement(name = "ForExValDtTimeFrame")
    protected ForExValDtTimeFrameType forExValDtTimeFrame;
    @XmlElement(name = "ReceivingMethod")
    protected String receivingMethod;
    @XmlElement(name = "FundingMethod")
    protected String fundingMethod;
    @XmlElement(name = "TranDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tranDt;
    @XmlElement(name = "RelatedForExDealRef")
    protected List<RelatedForExDealRefType> relatedForExDealRef;
    @XmlElementRef(name = "AcctKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctKeysType> acctKeys;
    @XmlElement(name = "InterestRate")
    protected BigDecimal interestRate;
    @XmlElement(name = "InterestRateYield")
    protected InterestRateYieldType interestRateYield;
    @XmlElement(name = "RequestedForExRate")
    protected RequestedForExRateType requestedForExRate;
    @XmlElement(name = "ForExRateProviderName")
    protected String forExRateProviderName;
    @XmlElement(name = "ServiceLevel")
    protected String serviceLevel;

    /**
     * Gets the value of the forExQuoteType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForExQuoteType() {
        return forExQuoteType;
    }

    /**
     * Sets the value of the forExQuoteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForExQuoteType(String value) {
        this.forExQuoteType = value;
    }

    /**
     * Gets the value of the forExRateType property.
     * 
     * @return
     *     possible object is
     *     {@link ForExRateTypeType }
     *     
     */
    public ForExRateTypeType getForExRateType() {
        return forExRateType;
    }

    /**
     * Sets the value of the forExRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExRateTypeType }
     *     
     */
    public void setForExRateType(ForExRateTypeType value) {
        this.forExRateType = value;
    }

    /**
     * Gets the value of the buySellIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link BuySellIndicatorType }
     *     
     */
    public BuySellIndicatorType getBuySellIndicator() {
        return buySellIndicator;
    }

    /**
     * Sets the value of the buySellIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuySellIndicatorType }
     *     
     */
    public void setBuySellIndicator(BuySellIndicatorType value) {
        this.buySellIndicator = value;
    }

    /**
     * Gets the value of the bidOffer property.
     * 
     * @return
     *     possible object is
     *     {@link BidOfferType }
     *     
     */
    public BidOfferType getBidOffer() {
        return bidOffer;
    }

    /**
     * Sets the value of the bidOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BidOfferType }
     *     
     */
    public void setBidOffer(BidOfferType value) {
        this.bidOffer = value;
    }

    /**
     * Gets the value of the baseCurCode property.
     * 
     * @return
     *     possible object is
     *     {@link BaseCurCodeType }
     *     
     */
    public BaseCurCodeType getBaseCurCode() {
        return baseCurCode;
    }

    /**
     * Sets the value of the baseCurCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseCurCodeType }
     *     
     */
    public void setBaseCurCode(BaseCurCodeType value) {
        this.baseCurCode = value;
    }

    /**
     * Gets the value of the baseCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseCurAmt() {
        return baseCurAmt;
    }

    /**
     * Sets the value of the baseCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseCurAmt(BigDecimal value) {
        this.baseCurAmt = value;
    }

    /**
     * Gets the value of the contraCurCode property.
     * 
     * @return
     *     possible object is
     *     {@link ContraCurCodeType }
     *     
     */
    public ContraCurCodeType getContraCurCode() {
        return contraCurCode;
    }

    /**
     * Sets the value of the contraCurCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContraCurCodeType }
     *     
     */
    public void setContraCurCode(ContraCurCodeType value) {
        this.contraCurCode = value;
    }

    /**
     * Gets the value of the contraCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getContraCurAmt() {
        return contraCurAmt;
    }

    /**
     * Sets the value of the contraCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setContraCurAmt(BigDecimal value) {
        this.contraCurAmt = value;
    }

    /**
     * Gets the value of the homeCurCode property.
     * 
     * @return
     *     possible object is
     *     {@link HomeCurCodeType }
     *     
     */
    public HomeCurCodeType getHomeCurCode() {
        return homeCurCode;
    }

    /**
     * Sets the value of the homeCurCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HomeCurCodeType }
     *     
     */
    public void setHomeCurCode(HomeCurCodeType value) {
        this.homeCurCode = value;
    }

    /**
     * Gets the value of the homeCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHomeCurAmt() {
        return homeCurAmt;
    }

    /**
     * Sets the value of the homeCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHomeCurAmt(BigDecimal value) {
        this.homeCurAmt = value;
    }

    /**
     * Gets the value of the forExValDtType property.
     * 
     * @return
     *     possible object is
     *     {@link ForExValDtTypeType }
     *     
     */
    public ForExValDtTypeType getForExValDtType() {
        return forExValDtType;
    }

    /**
     * Sets the value of the forExValDtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExValDtTypeType }
     *     
     */
    public void setForExValDtType(ForExValDtTypeType value) {
        this.forExValDtType = value;
    }

    /**
     * Gets the value of the forExValDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForExValDt() {
        return forExValDt;
    }

    /**
     * Sets the value of the forExValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForExValDt(String value) {
        this.forExValDt = value;
    }

    /**
     * Gets the value of the forExValDtTimeFrame property.
     * 
     * @return
     *     possible object is
     *     {@link ForExValDtTimeFrameType }
     *     
     */
    public ForExValDtTimeFrameType getForExValDtTimeFrame() {
        return forExValDtTimeFrame;
    }

    /**
     * Sets the value of the forExValDtTimeFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExValDtTimeFrameType }
     *     
     */
    public void setForExValDtTimeFrame(ForExValDtTimeFrameType value) {
        this.forExValDtTimeFrame = value;
    }

    /**
     * Gets the value of the receivingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivingMethod() {
        return receivingMethod;
    }

    /**
     * Sets the value of the receivingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivingMethod(String value) {
        this.receivingMethod = value;
    }

    /**
     * Gets the value of the fundingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundingMethod() {
        return fundingMethod;
    }

    /**
     * Sets the value of the fundingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundingMethod(String value) {
        this.fundingMethod = value;
    }

    /**
     * Gets the value of the tranDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTranDt() {
        return tranDt;
    }

    /**
     * Sets the value of the tranDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTranDt(XMLGregorianCalendar value) {
        this.tranDt = value;
    }

    /**
     * Gets the value of the relatedForExDealRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedForExDealRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedForExDealRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedForExDealRefType }
     * 
     * 
     */
    public List<RelatedForExDealRefType> getRelatedForExDealRef() {
        if (relatedForExDealRef == null) {
            relatedForExDealRef = new ArrayList<RelatedForExDealRefType>();
        }
        return this.relatedForExDealRef;
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
     * Gets the value of the interestRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInterestRate() {
        return interestRate;
    }

    /**
     * Sets the value of the interestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInterestRate(BigDecimal value) {
        this.interestRate = value;
    }

    /**
     * Gets the value of the interestRateYield property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateYieldType }
     *     
     */
    public InterestRateYieldType getInterestRateYield() {
        return interestRateYield;
    }

    /**
     * Sets the value of the interestRateYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateYieldType }
     *     
     */
    public void setInterestRateYield(InterestRateYieldType value) {
        this.interestRateYield = value;
    }

    /**
     * Gets the value of the requestedForExRate property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedForExRateType }
     *     
     */
    public RequestedForExRateType getRequestedForExRate() {
        return requestedForExRate;
    }

    /**
     * Sets the value of the requestedForExRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedForExRateType }
     *     
     */
    public void setRequestedForExRate(RequestedForExRateType value) {
        this.requestedForExRate = value;
    }

    /**
     * Gets the value of the forExRateProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForExRateProviderName() {
        return forExRateProviderName;
    }

    /**
     * Sets the value of the forExRateProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForExRateProviderName(String value) {
        this.forExRateProviderName = value;
    }

    /**
     * Gets the value of the serviceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLevel() {
        return serviceLevel;
    }

    /**
     * Sets the value of the serviceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLevel(String value) {
        this.serviceLevel = value;
    }

}
