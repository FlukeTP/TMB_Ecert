
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}AcctInfo_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AcctOwnership" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CostCenter" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ServiceLevel" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CompanyCd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Region" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CloseReason" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}GraceDays" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ExternalInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FeeData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Statement" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SolicitationFreq" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AcctMiscData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Contact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PassbookData" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AcctSubType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ApplicationKeys" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ApplIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RegMethCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RelationshipMgr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SvcProvider" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OnlineBankingInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ActionType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AcctTitleDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}InGraceInd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctInfo_Type", propOrder = {
    "acctOwnership",
    "costCenter",
    "serviceLevel",
    "companyCd",
    "region",
    "closeReason",
    "graceDays",
    "externalInd",
    "feeData",
    "statement",
    "solicitationFreq",
    "acctMiscData",
    "contact",
    "passbookData",
    "acctSubType",
    "applicationKeys",
    "applIdent",
    "regMethCode",
    "relationshipMgr",
    "svcProvider",
    "onlineBankingInd",
    "actionType",
    "acctTitleDesc",
    "inGraceInd"
})
public class AcctInfoType
    extends com.tmb.payment.wsdl.xpress.vo.AcctInfoType
{

    @XmlElement(name = "AcctOwnership")
    protected String acctOwnership;
    @XmlElement(name = "CostCenter")
    protected String costCenter;
    @XmlElement(name = "ServiceLevel", namespace = "urn:ifxforum-org:XSD:1")
    protected String serviceLevel;
    @XmlElement(name = "CompanyCd")
    protected String companyCd;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "CloseReason")
    protected String closeReason;
    @XmlElement(name = "GraceDays")
    protected Long graceDays;
    @XmlElement(name = "ExternalInd")
    protected Boolean externalInd;
    @XmlElement(name = "FeeData")
    protected List<FeeDataType> feeData;
    @XmlElement(name = "Statement")
    protected StatementType statement;
    @XmlElement(name = "SolicitationFreq")
    protected SolicitationFreqType solicitationFreq;
    @XmlElement(name = "AcctMiscData")
    protected List<AcctMiscDataType> acctMiscData;
    @XmlElement(name = "Contact")
    protected List<ContactType> contact;
    @XmlElement(name = "PassbookData")
    protected PassbookDataType passbookData;
    @XmlElement(name = "AcctSubType")
    protected String acctSubType;
    @XmlElement(name = "ApplicationKeys")
    protected ApplicationKeysType applicationKeys;
    @XmlElement(name = "ApplIdent")
    protected String applIdent;
    @XmlElement(name = "RegMethCode")
    protected String regMethCode;
    @XmlElement(name = "RelationshipMgr")
    protected RelationshipMgrType relationshipMgr;
    @XmlElement(name = "SvcProvider")
    protected String svcProvider;
    @XmlElement(name = "OnlineBankingInd")
    protected Boolean onlineBankingInd;
    @XmlElement(name = "ActionType")
    protected String actionType;
    @XmlElement(name = "AcctTitleDesc")
    protected String acctTitleDesc;
    @XmlElement(name = "InGraceInd")
    protected Boolean inGraceInd;

    /**
     * Gets the value of the acctOwnership property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctOwnership() {
        return acctOwnership;
    }

    /**
     * Sets the value of the acctOwnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctOwnership(String value) {
        this.acctOwnership = value;
    }

    /**
     * Gets the value of the costCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenter() {
        return costCenter;
    }

    /**
     * Sets the value of the costCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenter(String value) {
        this.costCenter = value;
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

    /**
     * Gets the value of the companyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCd() {
        return companyCd;
    }

    /**
     * Sets the value of the companyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCd(String value) {
        this.companyCd = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the closeReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloseReason() {
        return closeReason;
    }

    /**
     * Sets the value of the closeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloseReason(String value) {
        this.closeReason = value;
    }

    /**
     * Gets the value of the graceDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGraceDays() {
        return graceDays;
    }

    /**
     * Sets the value of the graceDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGraceDays(Long value) {
        this.graceDays = value;
    }

    /**
     * Gets the value of the externalInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExternalInd() {
        return externalInd;
    }

    /**
     * Sets the value of the externalInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExternalInd(Boolean value) {
        this.externalInd = value;
    }

    /**
     * Gets the value of the feeData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeDataType }
     * 
     * 
     */
    public List<FeeDataType> getFeeData() {
        if (feeData == null) {
            feeData = new ArrayList<FeeDataType>();
        }
        return this.feeData;
    }

    /**
     * Gets the value of the statement property.
     * 
     * @return
     *     possible object is
     *     {@link StatementType }
     *     
     */
    public StatementType getStatement() {
        return statement;
    }

    /**
     * Sets the value of the statement property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementType }
     *     
     */
    public void setStatement(StatementType value) {
        this.statement = value;
    }

    /**
     * Gets the value of the solicitationFreq property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitationFreqType }
     *     
     */
    public SolicitationFreqType getSolicitationFreq() {
        return solicitationFreq;
    }

    /**
     * Sets the value of the solicitationFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitationFreqType }
     *     
     */
    public void setSolicitationFreq(SolicitationFreqType value) {
        this.solicitationFreq = value;
    }

    /**
     * Gets the value of the acctMiscData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctMiscData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctMiscData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctMiscDataType }
     * 
     * 
     */
    public List<AcctMiscDataType> getAcctMiscData() {
        if (acctMiscData == null) {
            acctMiscData = new ArrayList<AcctMiscDataType>();
        }
        return this.acctMiscData;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactType }
     * 
     * 
     */
    public List<ContactType> getContact() {
        if (contact == null) {
            contact = new ArrayList<ContactType>();
        }
        return this.contact;
    }

    /**
     * Gets the value of the passbookData property.
     * 
     * @return
     *     possible object is
     *     {@link PassbookDataType }
     *     
     */
    public PassbookDataType getPassbookData() {
        return passbookData;
    }

    /**
     * Sets the value of the passbookData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassbookDataType }
     *     
     */
    public void setPassbookData(PassbookDataType value) {
        this.passbookData = value;
    }

    /**
     * Gets the value of the acctSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctSubType() {
        return acctSubType;
    }

    /**
     * Sets the value of the acctSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctSubType(String value) {
        this.acctSubType = value;
    }

    /**
     * Gets the value of the applicationKeys property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationKeysType }
     *     
     */
    public ApplicationKeysType getApplicationKeys() {
        return applicationKeys;
    }

    /**
     * Sets the value of the applicationKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationKeysType }
     *     
     */
    public void setApplicationKeys(ApplicationKeysType value) {
        this.applicationKeys = value;
    }

    /**
     * Gets the value of the applIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplIdent() {
        return applIdent;
    }

    /**
     * Sets the value of the applIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplIdent(String value) {
        this.applIdent = value;
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
     * Gets the value of the relationshipMgr property.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipMgrType }
     *     
     */
    public RelationshipMgrType getRelationshipMgr() {
        return relationshipMgr;
    }

    /**
     * Sets the value of the relationshipMgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipMgrType }
     *     
     */
    public void setRelationshipMgr(RelationshipMgrType value) {
        this.relationshipMgr = value;
    }

    /**
     * Gets the value of the svcProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcProvider() {
        return svcProvider;
    }

    /**
     * Sets the value of the svcProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcProvider(String value) {
        this.svcProvider = value;
    }

    /**
     * Gets the value of the onlineBankingInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlineBankingInd() {
        return onlineBankingInd;
    }

    /**
     * Sets the value of the onlineBankingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlineBankingInd(Boolean value) {
        this.onlineBankingInd = value;
    }

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionType(String value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the acctTitleDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctTitleDesc() {
        return acctTitleDesc;
    }

    /**
     * Sets the value of the acctTitleDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctTitleDesc(String value) {
        this.acctTitleDesc = value;
    }

    /**
     * Gets the value of the inGraceInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInGraceInd() {
        return inGraceInd;
    }

    /**
     * Sets the value of the inGraceInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInGraceInd(Boolean value) {
        this.inGraceInd = value;
    }

}
