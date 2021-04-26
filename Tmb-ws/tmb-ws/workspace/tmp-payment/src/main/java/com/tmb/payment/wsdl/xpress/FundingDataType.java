
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.AcctIdentType;
import com.tmb.payment.wsdl.xpress.vo.AcctTypeType;
import com.tmb.payment.wsdl.xpress.vo.CurAmtType;
import com.tmb.payment.wsdl.xpress.vo.FIDataType;


/**
 * <p>Java class for FundingData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundingData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SPName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FundingIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FundingMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FIData" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OwnerName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RegMethCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RegDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ExpDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RegStatCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Verification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TempPartyIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AltAcctIdentValue" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CardData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctUse" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardNum" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EffDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TranIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OrderIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ReconIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ApprovalIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AuthRsCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MicroDepEntryClass" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}EntryClass" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Brand" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SettleDt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundingData_Type", propOrder = {
    "spName",
    "fundingIdent",
    "fundingMethod",
    "acctIdent",
    "acctType",
    "fiData",
    "ownerName",
    "regMethCode",
    "regDt",
    "expDt",
    "regStatCode",
    "curAmt",
    "verification",
    "tempPartyIdent",
    "altAcctIdentValue",
    "cardData",
    "acctUse",
    "cardNum",
    "effDt",
    "tranIdent",
    "orderIdent",
    "reconIdent",
    "approvalIdent",
    "authRsCode",
    "microDepEntryClass",
    "entryClass",
    "brand",
    "settleDt"
})
public class FundingDataType {

    @XmlElement(name = "SPName", namespace = "urn:ifxforum-org:XSD:1")
    protected String spName;
    @XmlElement(name = "FundingIdent")
    protected String fundingIdent;
    @XmlElement(name = "FundingMethod")
    protected String fundingMethod;
    @XmlElement(name = "AcctIdent", namespace = "urn:ifxforum-org:XSD:1")
    protected AcctIdentType acctIdent;
    @XmlElement(name = "AcctType", namespace = "urn:ifxforum-org:XSD:1")
    protected AcctTypeType acctType;
    @XmlElement(name = "FIData", namespace = "urn:ifxforum-org:XSD:1")
    protected FIDataType fiData;
    @XmlElement(name = "OwnerName")
    protected String ownerName;
    @XmlElement(name = "RegMethCode")
    protected String regMethCode;
    @XmlElement(name = "RegDt")
    protected String regDt;
    @XmlElement(name = "ExpDt", namespace = "urn:ifxforum-org:XSD:1")
    protected String expDt;
    @XmlElement(name = "RegStatCode")
    protected String regStatCode;
    @XmlElement(name = "CurAmt", namespace = "urn:ifxforum-org:XSD:1")
    protected CurAmtType curAmt;
    @XmlElement(name = "Verification")
    protected List<VerificationType> verification;
    @XmlElement(name = "TempPartyIdent")
    protected String tempPartyIdent;
    @XmlElement(name = "AltAcctIdentValue")
    protected String altAcctIdentValue;
    @XmlElement(name = "CardData")
    protected CardDataType cardData;
    @XmlElement(name = "AcctUse", namespace = "urn:ifxforum-org:XSD:1")
    protected String acctUse;
    @XmlElement(name = "CardNum", namespace = "urn:ifxforum-org:XSD:1")
    protected String cardNum;
    @XmlElement(name = "EffDt", namespace = "urn:ifxforum-org:XSD:1")
    protected String effDt;
    @XmlElement(name = "TranIdent")
    protected String tranIdent;
    @XmlElement(name = "OrderIdent")
    protected String orderIdent;
    @XmlElement(name = "ReconIdent")
    protected String reconIdent;
    @XmlElement(name = "ApprovalIdent")
    protected String approvalIdent;
    @XmlElement(name = "AuthRsCode")
    protected String authRsCode;
    @XmlElement(name = "MicroDepEntryClass")
    protected String microDepEntryClass;
    @XmlElement(name = "EntryClass")
    protected String entryClass;
    @XmlElement(name = "Brand", namespace = "urn:ifxforum-org:XSD:1")
    protected String brand;
    @XmlElement(name = "SettleDt")
    protected String settleDt;

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
     * Gets the value of the fundingIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundingIdent() {
        return fundingIdent;
    }

    /**
     * Sets the value of the fundingIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundingIdent(String value) {
        this.fundingIdent = value;
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
     * Gets the value of the ownerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    /**
     * Gets the value of the regMethCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegMethCode() {
        return regMethCode;
    }

    /**
     * Sets the value of the regMethCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegMethCode(String value) {
        this.regMethCode = value;
    }

    /**
     * Gets the value of the regDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegDt() {
        return regDt;
    }

    /**
     * Sets the value of the regDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegDt(String value) {
        this.regDt = value;
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
     * Gets the value of the regStatCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegStatCode() {
        return regStatCode;
    }

    /**
     * Sets the value of the regStatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegStatCode(String value) {
        this.regStatCode = value;
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
     * Gets the value of the verification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerificationType }
     * 
     * 
     */
    public List<VerificationType> getVerification() {
        if (verification == null) {
            verification = new ArrayList<VerificationType>();
        }
        return this.verification;
    }

    /**
     * Gets the value of the tempPartyIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempPartyIdent() {
        return tempPartyIdent;
    }

    /**
     * Sets the value of the tempPartyIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempPartyIdent(String value) {
        this.tempPartyIdent = value;
    }

    /**
     * Gets the value of the altAcctIdentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltAcctIdentValue() {
        return altAcctIdentValue;
    }

    /**
     * Sets the value of the altAcctIdentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltAcctIdentValue(String value) {
        this.altAcctIdentValue = value;
    }

    /**
     * Gets the value of the cardData property.
     * 
     * @return
     *     possible object is
     *     {@link CardDataType }
     *     
     */
    public CardDataType getCardData() {
        return cardData;
    }

    /**
     * Sets the value of the cardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataType }
     *     
     */
    public void setCardData(CardDataType value) {
        this.cardData = value;
    }

    /**
     * Gets the value of the acctUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctUse() {
        return acctUse;
    }

    /**
     * Sets the value of the acctUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctUse(String value) {
        this.acctUse = value;
    }

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
     * Gets the value of the tranIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranIdent() {
        return tranIdent;
    }

    /**
     * Sets the value of the tranIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranIdent(String value) {
        this.tranIdent = value;
    }

    /**
     * Gets the value of the orderIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderIdent() {
        return orderIdent;
    }

    /**
     * Sets the value of the orderIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderIdent(String value) {
        this.orderIdent = value;
    }

    /**
     * Gets the value of the reconIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconIdent() {
        return reconIdent;
    }

    /**
     * Sets the value of the reconIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconIdent(String value) {
        this.reconIdent = value;
    }

    /**
     * Gets the value of the approvalIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalIdent() {
        return approvalIdent;
    }

    /**
     * Sets the value of the approvalIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalIdent(String value) {
        this.approvalIdent = value;
    }

    /**
     * Gets the value of the authRsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthRsCode() {
        return authRsCode;
    }

    /**
     * Sets the value of the authRsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthRsCode(String value) {
        this.authRsCode = value;
    }

    /**
     * Gets the value of the microDepEntryClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMicroDepEntryClass() {
        return microDepEntryClass;
    }

    /**
     * Sets the value of the microDepEntryClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMicroDepEntryClass(String value) {
        this.microDepEntryClass = value;
    }

    /**
     * Gets the value of the entryClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryClass() {
        return entryClass;
    }

    /**
     * Sets the value of the entryClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryClass(String value) {
        this.entryClass = value;
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
     * Gets the value of the settleDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettleDt() {
        return settleDt;
    }

    /**
     * Sets the value of the settleDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettleDt(String value) {
        this.settleDt = value;
    }

}
