
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardNum"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardEmbossNum" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardSeqNum" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Brand" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardTechnology" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IssuerName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FIData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AffinityName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ValidFromDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IssueDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ExpDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OrigIssueDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}NextIssueDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardVrfyData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardCategory" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecondaryName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PostAddr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PhotoInd" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Design" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CSPhoneNum" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardTrnLimit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AutoReissue" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AutoReplacement" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ReplacementDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MemberSinceDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}InterchangeServiceCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardPref" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardInfo_Type", propOrder = {
    "cardNum",
    "cardEmbossNum",
    "cardSeqNum",
    "cardType",
    "brand",
    "cardTechnology",
    "issuerName",
    "fiData",
    "affinityName",
    "validFromDt",
    "issueDt",
    "expDt",
    "origIssueDt",
    "nextIssueDt",
    "cardVrfyData",
    "cardCategory",
    "name",
    "secondaryName",
    "postAddr",
    "photoInd",
    "design",
    "csPhoneNum",
    "cardTrnLimit",
    "autoReissue",
    "autoReplacement",
    "replacementDt",
    "memberSinceDt",
    "interchangeServiceCode",
    "cardPref"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.CardInfoType.class
})
public class CardInfoType {

    @XmlElement(name = "CardNum", required = true)
    protected String cardNum;
    @XmlElement(name = "CardEmbossNum")
    protected String cardEmbossNum;
    @XmlElement(name = "CardSeqNum")
    protected String cardSeqNum;
    @XmlElement(name = "CardType")
    protected String cardType;
    @XmlElement(name = "Brand")
    protected String brand;
    @XmlElement(name = "CardTechnology")
    protected String cardTechnology;
    @XmlElement(name = "IssuerName")
    protected String issuerName;
    @XmlElement(name = "FIData")
    protected FIDataType fiData;
    @XmlElement(name = "AffinityName")
    protected String affinityName;
    @XmlElement(name = "ValidFromDt")
    protected String validFromDt;
    @XmlElement(name = "IssueDt")
    protected String issueDt;
    @XmlElement(name = "ExpDt")
    protected String expDt;
    @XmlElement(name = "OrigIssueDt")
    protected String origIssueDt;
    @XmlElement(name = "NextIssueDt")
    protected String nextIssueDt;
    @XmlElement(name = "CardVrfyData")
    protected String cardVrfyData;
    @XmlElement(name = "CardCategory")
    protected String cardCategory;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "SecondaryName")
    protected String secondaryName;
    @XmlElementRef(name = "PostAddr", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PostAddrType> postAddr;
    @XmlElement(name = "PhotoInd")
    protected Boolean photoInd;
    @XmlElement(name = "Design")
    protected String design;
    @XmlElement(name = "CSPhoneNum")
    protected String csPhoneNum;
    @XmlElement(name = "CardTrnLimit")
    protected List<CardTrnLimitType> cardTrnLimit;
    @XmlElement(name = "AutoReissue")
    protected Boolean autoReissue;
    @XmlElement(name = "AutoReplacement")
    protected Boolean autoReplacement;
    @XmlElement(name = "ReplacementDt")
    protected String replacementDt;
    @XmlElement(name = "MemberSinceDt")
    protected String memberSinceDt;
    @XmlElement(name = "InterchangeServiceCode")
    protected String interchangeServiceCode;
    @XmlElement(name = "CardPref")
    protected CardPrefType cardPref;

    /**
     * Gets the value of the cardNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNum() {
        return cardNum;
    }

    /**
     * Sets the value of the cardNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNum(String value) {
        this.cardNum = value;
    }

    /**
     * Gets the value of the cardEmbossNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardEmbossNum() {
        return cardEmbossNum;
    }

    /**
     * Sets the value of the cardEmbossNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardEmbossNum(String value) {
        this.cardEmbossNum = value;
    }

    /**
     * Gets the value of the cardSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSeqNum() {
        return cardSeqNum;
    }

    /**
     * Sets the value of the cardSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSeqNum(String value) {
        this.cardSeqNum = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the cardTechnology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardTechnology() {
        return cardTechnology;
    }

    /**
     * Sets the value of the cardTechnology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardTechnology(String value) {
        this.cardTechnology = value;
    }

    /**
     * Gets the value of the issuerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerName() {
        return issuerName;
    }

    /**
     * Sets the value of the issuerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerName(String value) {
        this.issuerName = value;
    }

    /**
     * Gets the value of the fiData property.
     * 
     * @return
     *     possible object is
     *     {@link FIDataType }
     *     
     */
    public FIDataType getFIData() {
        return fiData;
    }

    /**
     * Sets the value of the fiData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIDataType }
     *     
     */
    public void setFIData(FIDataType value) {
        this.fiData = value;
    }

    /**
     * Gets the value of the affinityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffinityName() {
        return affinityName;
    }

    /**
     * Sets the value of the affinityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffinityName(String value) {
        this.affinityName = value;
    }

    /**
     * Gets the value of the validFromDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidFromDt() {
        return validFromDt;
    }

    /**
     * Sets the value of the validFromDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidFromDt(String value) {
        this.validFromDt = value;
    }

    /**
     * Gets the value of the issueDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueDt() {
        return issueDt;
    }

    /**
     * Sets the value of the issueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueDt(String value) {
        this.issueDt = value;
    }

    /**
     * Gets the value of the expDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpDt() {
        return expDt;
    }

    /**
     * Sets the value of the expDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpDt(String value) {
        this.expDt = value;
    }

    /**
     * Gets the value of the origIssueDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigIssueDt() {
        return origIssueDt;
    }

    /**
     * Sets the value of the origIssueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigIssueDt(String value) {
        this.origIssueDt = value;
    }

    /**
     * Gets the value of the nextIssueDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextIssueDt() {
        return nextIssueDt;
    }

    /**
     * Sets the value of the nextIssueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextIssueDt(String value) {
        this.nextIssueDt = value;
    }

    /**
     * Gets the value of the cardVrfyData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardVrfyData() {
        return cardVrfyData;
    }

    /**
     * Sets the value of the cardVrfyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardVrfyData(String value) {
        this.cardVrfyData = value;
    }

    /**
     * Gets the value of the cardCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCategory() {
        return cardCategory;
    }

    /**
     * Sets the value of the cardCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCategory(String value) {
        this.cardCategory = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the secondaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryName() {
        return secondaryName;
    }

    /**
     * Sets the value of the secondaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryName(String value) {
        this.secondaryName = value;
    }

    /**
     * Gets the value of the postAddr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PostAddrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PostAddrType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PostAddrType> getPostAddr() {
        return postAddr;
    }

    /**
     * Sets the value of the postAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PostAddrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PostAddrType }{@code >}
     *     
     */
    public void setPostAddr(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PostAddrType> value) {
        this.postAddr = value;
    }

    /**
     * Gets the value of the photoInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPhotoInd() {
        return photoInd;
    }

    /**
     * Sets the value of the photoInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPhotoInd(Boolean value) {
        this.photoInd = value;
    }

    /**
     * Gets the value of the design property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesign() {
        return design;
    }

    /**
     * Sets the value of the design property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesign(String value) {
        this.design = value;
    }

    /**
     * Gets the value of the csPhoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSPhoneNum() {
        return csPhoneNum;
    }

    /**
     * Sets the value of the csPhoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSPhoneNum(String value) {
        this.csPhoneNum = value;
    }

    /**
     * Gets the value of the cardTrnLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardTrnLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardTrnLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardTrnLimitType }
     * 
     * 
     */
    public List<CardTrnLimitType> getCardTrnLimit() {
        if (cardTrnLimit == null) {
            cardTrnLimit = new ArrayList<CardTrnLimitType>();
        }
        return this.cardTrnLimit;
    }

    /**
     * Gets the value of the autoReissue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoReissue() {
        return autoReissue;
    }

    /**
     * Sets the value of the autoReissue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoReissue(Boolean value) {
        this.autoReissue = value;
    }

    /**
     * Gets the value of the autoReplacement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoReplacement() {
        return autoReplacement;
    }

    /**
     * Sets the value of the autoReplacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoReplacement(Boolean value) {
        this.autoReplacement = value;
    }

    /**
     * Gets the value of the replacementDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplacementDt() {
        return replacementDt;
    }

    /**
     * Sets the value of the replacementDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplacementDt(String value) {
        this.replacementDt = value;
    }

    /**
     * Gets the value of the memberSinceDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberSinceDt() {
        return memberSinceDt;
    }

    /**
     * Sets the value of the memberSinceDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberSinceDt(String value) {
        this.memberSinceDt = value;
    }

    /**
     * Gets the value of the interchangeServiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterchangeServiceCode() {
        return interchangeServiceCode;
    }

    /**
     * Sets the value of the interchangeServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterchangeServiceCode(String value) {
        this.interchangeServiceCode = value;
    }

    /**
     * Gets the value of the cardPref property.
     * 
     * @return
     *     possible object is
     *     {@link CardPrefType }
     *     
     */
    public CardPrefType getCardPref() {
        return cardPref;
    }

    /**
     * Sets the value of the cardPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPrefType }
     *     
     */
    public void setCardPref(CardPrefType value) {
        this.cardPref = value;
    }

}
