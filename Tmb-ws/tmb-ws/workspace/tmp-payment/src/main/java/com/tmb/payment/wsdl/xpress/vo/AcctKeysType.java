
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SPName" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}AcctId"/&gt;
 *           &lt;sequence&gt;
 *             &lt;choice minOccurs="0"&gt;
 *               &lt;element ref="{urn:ifxforum-org:XSD:1}BBAN"/&gt;
 *               &lt;element ref="{urn:ifxforum-org:XSD:1}IBAN"/&gt;
 *               &lt;element ref="{urn:ifxforum-org:XSD:1}UPIC"/&gt;
 *               &lt;element ref="{urn:ifxforum-org:XSD:1}CLABE"/&gt;
 *               &lt;element ref="{urn:ifxforum-org:XSD:1}CardMagData"/&gt;
 *               &lt;element ref="{urn:ifxforum-org:XSD:1}CardKeys"/&gt;
 *               &lt;element ref="{urn:ifxforum-org:XSD:1}CardChipData"/&gt;
 *               &lt;element ref="{urn:ifxforum-org:XSD:1}AcctIdent"/&gt;
 *             &lt;/choice&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}AcctType" minOccurs="0"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}CurCode" minOccurs="0"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}FIIdentType" minOccurs="0"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}FIIdent" minOccurs="0"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}BranchIdent" minOccurs="0"/&gt;
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
@XmlType(name = "AcctKeys_Type", propOrder = {
    "spName",
    "acctId",
    "bban",
    "iban",
    "upic",
    "clabe",
    "cardMagData",
    "cardKeys",
    "cardChipData",
    "acctIdent",
    "acctType",
    "curCode",
    "fiIdentType",
    "fiIdent",
    "branchIdent"
})
@XmlSeeAlso({
    IntDistAcctRefType.class,
    FromAcctRefType.class,
    com.tmb.payment.wsdl.xpress.AcctKeysType.class,
    AcctFromKeysType.class,
    AcctToKeysType.class,
    SubAcctRefType.class,
    ToAcctRefType.class
})
public class AcctKeysType {

    @XmlElement(name = "SPName")
    protected String spName;
    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "BBAN")
    protected String bban;
    @XmlElement(name = "IBAN")
    protected String iban;
    @XmlElement(name = "UPIC")
    protected String upic;
    @XmlElement(name = "CLABE")
    protected String clabe;
    @XmlElement(name = "CardMagData")
    protected CardMagDataType cardMagData;
    @XmlElementRef(name = "CardKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CardKeysType> cardKeys;
    @XmlElement(name = "CardChipData")
    protected CardChipDataType cardChipData;
    @XmlElement(name = "AcctIdent")
    protected AcctIdentType acctIdent;
    @XmlElement(name = "AcctType")
    protected AcctTypeType acctType;
    @XmlElement(name = "CurCode")
    protected CurCodeType curCode;
    @XmlElement(name = "FIIdentType")
    protected String fiIdentType;
    @XmlElement(name = "FIIdent")
    protected String fiIdent;
    @XmlElement(name = "BranchIdent")
    protected String branchIdent;

    /**
     * Gets the value of the spName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPName() {
        return spName;
    }

    /**
     * Sets the value of the spName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPName(String value) {
        this.spName = value;
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
     * Gets the value of the bban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBBAN() {
        return bban;
    }

    /**
     * Sets the value of the bban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBBAN(String value) {
        this.bban = value;
    }

    /**
     * Gets the value of the iban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBAN(String value) {
        this.iban = value;
    }

    /**
     * Gets the value of the upic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPIC() {
        return upic;
    }

    /**
     * Sets the value of the upic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPIC(String value) {
        this.upic = value;
    }

    /**
     * Gets the value of the clabe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLABE() {
        return clabe;
    }

    /**
     * Sets the value of the clabe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLABE(String value) {
        this.clabe = value;
    }

    /**
     * Gets the value of the cardMagData property.
     * 
     * @return
     *     possible object is
     *     {@link CardMagDataType }
     *     
     */
    public CardMagDataType getCardMagData() {
        return cardMagData;
    }

    /**
     * Sets the value of the cardMagData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardMagDataType }
     *     
     */
    public void setCardMagData(CardMagDataType value) {
        this.cardMagData = value;
    }

    /**
     * Gets the value of the cardKeys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.CardKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.CardKeysType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CardKeysType> getCardKeys() {
        return cardKeys;
    }

    /**
     * Sets the value of the cardKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.CardKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.CardKeysType }{@code >}
     *     
     */
    public void setCardKeys(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CardKeysType> value) {
        this.cardKeys = value;
    }

    /**
     * Gets the value of the cardChipData property.
     * 
     * @return
     *     possible object is
     *     {@link CardChipDataType }
     *     
     */
    public CardChipDataType getCardChipData() {
        return cardChipData;
    }

    /**
     * Sets the value of the cardChipData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardChipDataType }
     *     
     */
    public void setCardChipData(CardChipDataType value) {
        this.cardChipData = value;
    }

    /**
     * Gets the value of the acctIdent property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdentType }
     *     
     */
    public AcctIdentType getAcctIdent() {
        return acctIdent;
    }

    /**
     * Sets the value of the acctIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdentType }
     *     
     */
    public void setAcctIdent(AcctIdentType value) {
        this.acctIdent = value;
    }

    /**
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeType }
     *     
     */
    public AcctTypeType getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeType }
     *     
     */
    public void setAcctType(AcctTypeType value) {
        this.acctType = value;
    }

    /**
     * Gets the value of the curCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurCodeType }
     *     
     */
    public CurCodeType getCurCode() {
        return curCode;
    }

    /**
     * Sets the value of the curCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurCodeType }
     *     
     */
    public void setCurCode(CurCodeType value) {
        this.curCode = value;
    }

    /**
     * Gets the value of the fiIdentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIIdentType() {
        return fiIdentType;
    }

    /**
     * Sets the value of the fiIdentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIIdentType(String value) {
        this.fiIdentType = value;
    }

    /**
     * Gets the value of the fiIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIIdent() {
        return fiIdent;
    }

    /**
     * Sets the value of the fiIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIIdent(String value) {
        this.fiIdent = value;
    }

    /**
     * Gets the value of the branchIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchIdent() {
        return branchIdent;
    }

    /**
     * Sets the value of the branchIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchIdent(String value) {
        this.branchIdent = value;
    }

}
