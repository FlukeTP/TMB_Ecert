
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctStmtInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctStmtInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctKeys"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyKeys" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StmtTimeFrame" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ImageURL" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}StmtImg"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}AcctTrnRef" maxOccurs="unbounded"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SubAcctRef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EffDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}NextDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctBal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctPeriodData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CreditStmtData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StmtGroup" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MktgMaterial" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SPRefIdent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctStmtInfo_Type", propOrder = {
    "acctKeys",
    "partyKeys",
    "stmtTimeFrame",
    "imageURL",
    "stmtImg",
    "acctTrnRef",
    "subAcctRef",
    "effDt",
    "nextDt",
    "acctBal",
    "acctPeriodData",
    "creditStmtData",
    "stmtGroup",
    "mktgMaterial",
    "spRefIdent"
})
public class AcctStmtInfoType {

    @XmlElementRef(name = "AcctKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctKeysType> acctKeys;
    @XmlElementRef(name = "PartyKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyKeysType> partyKeys;
    @XmlElement(name = "StmtTimeFrame")
    protected StmtTimeFrameType stmtTimeFrame;
    @XmlElement(name = "ImageURL")
    protected String imageURL;
    @XmlElement(name = "StmtImg")
    protected StmtImgType stmtImg;
    @XmlElement(name = "AcctTrnRef")
    protected List<AcctTrnRefType> acctTrnRef;
    @XmlElement(name = "SubAcctRef")
    protected List<SubAcctRefType> subAcctRef;
    @XmlElement(name = "EffDt")
    protected String effDt;
    @XmlElement(name = "NextDt")
    protected String nextDt;
    @XmlElement(name = "AcctBal")
    protected List<AcctBalType> acctBal;
    @XmlElement(name = "AcctPeriodData")
    protected List<AcctPeriodDataType> acctPeriodData;
    @XmlElement(name = "CreditStmtData")
    protected CreditStmtDataType creditStmtData;
    @XmlElement(name = "StmtGroup")
    protected String stmtGroup;
    @XmlElement(name = "MktgMaterial")
    protected MktgMaterialType mktgMaterial;
    @XmlElement(name = "SPRefIdent")
    protected String spRefIdent;

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
     * Gets the value of the stmtTimeFrame property.
     * 
     * @return
     *     possible object is
     *     {@link StmtTimeFrameType }
     *     
     */
    public StmtTimeFrameType getStmtTimeFrame() {
        return stmtTimeFrame;
    }

    /**
     * Sets the value of the stmtTimeFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtTimeFrameType }
     *     
     */
    public void setStmtTimeFrame(StmtTimeFrameType value) {
        this.stmtTimeFrame = value;
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
     * Gets the value of the stmtImg property.
     * 
     * @return
     *     possible object is
     *     {@link StmtImgType }
     *     
     */
    public StmtImgType getStmtImg() {
        return stmtImg;
    }

    /**
     * Sets the value of the stmtImg property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtImgType }
     *     
     */
    public void setStmtImg(StmtImgType value) {
        this.stmtImg = value;
    }

    /**
     * Gets the value of the acctTrnRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctTrnRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctTrnRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctTrnRefType }
     * 
     * 
     */
    public List<AcctTrnRefType> getAcctTrnRef() {
        if (acctTrnRef == null) {
            acctTrnRef = new ArrayList<AcctTrnRefType>();
        }
        return this.acctTrnRef;
    }

    /**
     * Gets the value of the subAcctRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subAcctRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubAcctRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubAcctRefType }
     * 
     * 
     */
    public List<SubAcctRefType> getSubAcctRef() {
        if (subAcctRef == null) {
            subAcctRef = new ArrayList<SubAcctRefType>();
        }
        return this.subAcctRef;
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
     * Gets the value of the nextDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextDt() {
        return nextDt;
    }

    /**
     * Sets the value of the nextDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextDt(String value) {
        this.nextDt = value;
    }

    /**
     * Gets the value of the acctBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctBalType }
     * 
     * 
     */
    public List<AcctBalType> getAcctBal() {
        if (acctBal == null) {
            acctBal = new ArrayList<AcctBalType>();
        }
        return this.acctBal;
    }

    /**
     * Gets the value of the acctPeriodData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctPeriodData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctPeriodData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctPeriodDataType }
     * 
     * 
     */
    public List<AcctPeriodDataType> getAcctPeriodData() {
        if (acctPeriodData == null) {
            acctPeriodData = new ArrayList<AcctPeriodDataType>();
        }
        return this.acctPeriodData;
    }

    /**
     * Gets the value of the creditStmtData property.
     * 
     * @return
     *     possible object is
     *     {@link CreditStmtDataType }
     *     
     */
    public CreditStmtDataType getCreditStmtData() {
        return creditStmtData;
    }

    /**
     * Sets the value of the creditStmtData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditStmtDataType }
     *     
     */
    public void setCreditStmtData(CreditStmtDataType value) {
        this.creditStmtData = value;
    }

    /**
     * Gets the value of the stmtGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtGroup() {
        return stmtGroup;
    }

    /**
     * Sets the value of the stmtGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtGroup(String value) {
        this.stmtGroup = value;
    }

    /**
     * Gets the value of the mktgMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link MktgMaterialType }
     *     
     */
    public MktgMaterialType getMktgMaterial() {
        return mktgMaterial;
    }

    /**
     * Sets the value of the mktgMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link MktgMaterialType }
     *     
     */
    public void setMktgMaterial(MktgMaterialType value) {
        this.mktgMaterial = value;
    }

    /**
     * Gets the value of the spRefIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPRefIdent() {
        return spRefIdent;
    }

    /**
     * Sets the value of the spRefIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPRefIdent(String value) {
        this.spRefIdent = value;
    }

}
