
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.CountryCodeType;
import com.tmb.payment.wsdl.xpress.vo.FIDataType;


/**
 * <p>Java class for PartySel_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartySel_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}PartySel_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PartyType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PartySubType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PartyIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FamilyName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}GivenName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MiddleName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Addr2" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Addr3" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Addr4" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}City" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StateProv" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CountryCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OriginatingBranch" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OriginatingBank" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PreferredBranch" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PreferredBank" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ResponsibleBranch" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ResponsibleBank" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}BankRegion" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ActiveOnlyInd" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SpouseName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FIData" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ChallengeInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}QuestionCount" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OOBAuthData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartySel_Type", propOrder = {
    "partyType",
    "partySubType",
    "partyIdent",
    "familyName",
    "givenName",
    "middleName",
    "addr2",
    "addr3",
    "addr4",
    "city",
    "stateProv",
    "countryCode",
    "originatingBranch",
    "originatingBank",
    "preferredBranch",
    "preferredBank",
    "responsibleBranch",
    "responsibleBank",
    "bankRegion",
    "activeOnlyInd",
    "spouseName",
    "fiData",
    "challengeInd",
    "questionCount",
    "oobAuthData"
})
public class PartySelType
    extends com.tmb.payment.wsdl.xpress.vo.PartySelType
{

    @XmlElement(name = "PartyType")
    protected String partyType;
    @XmlElement(name = "PartySubType")
    protected String partySubType;
    @XmlElement(name = "PartyIdent")
    protected PartyIdentType partyIdent;
    @XmlElement(name = "FamilyName", namespace = "urn:ifxforum-org:XSD:1")
    protected List<String> familyName;
    @XmlElement(name = "GivenName", namespace = "urn:ifxforum-org:XSD:1")
    protected List<String> givenName;
    @XmlElement(name = "MiddleName", namespace = "urn:ifxforum-org:XSD:1")
    protected List<String> middleName;
    @XmlElement(name = "Addr2", namespace = "urn:ifxforum-org:XSD:1")
    protected String addr2;
    @XmlElement(name = "Addr3", namespace = "urn:ifxforum-org:XSD:1")
    protected String addr3;
    @XmlElement(name = "Addr4", namespace = "urn:ifxforum-org:XSD:1")
    protected String addr4;
    @XmlElement(name = "City", namespace = "urn:ifxforum-org:XSD:1")
    protected String city;
    @XmlElement(name = "StateProv", namespace = "urn:ifxforum-org:XSD:1")
    protected String stateProv;
    @XmlElement(name = "CountryCode", namespace = "urn:ifxforum-org:XSD:1")
    protected CountryCodeType countryCode;
    @XmlElement(name = "OriginatingBranch", namespace = "urn:ifxforum-org:XSD:1")
    protected String originatingBranch;
    @XmlElement(name = "OriginatingBank", namespace = "urn:ifxforum-org:XSD:1")
    protected String originatingBank;
    @XmlElement(name = "PreferredBranch", namespace = "urn:ifxforum-org:XSD:1")
    protected String preferredBranch;
    @XmlElement(name = "PreferredBank", namespace = "urn:ifxforum-org:XSD:1")
    protected String preferredBank;
    @XmlElement(name = "ResponsibleBranch", namespace = "urn:ifxforum-org:XSD:1")
    protected String responsibleBranch;
    @XmlElement(name = "ResponsibleBank", namespace = "urn:ifxforum-org:XSD:1")
    protected String responsibleBank;
    @XmlElement(name = "BankRegion")
    protected String bankRegion;
    @XmlElement(name = "ActiveOnlyInd")
    protected Boolean activeOnlyInd;
    @XmlElement(name = "SpouseName", namespace = "urn:ifxforum-org:XSD:1")
    protected String spouseName;
    @XmlElement(name = "FIData", namespace = "urn:ifxforum-org:XSD:1")
    protected FIDataType fiData;
    @XmlElement(name = "ChallengeInd")
    protected Boolean challengeInd;
    @XmlElement(name = "QuestionCount")
    protected Long questionCount;
    @XmlElement(name = "OOBAuthData")
    protected OOBAuthDataType oobAuthData;

    /**
     * Gets the value of the partyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyType() {
        return partyType;
    }

    /**
     * Sets the value of the partyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyType(String value) {
        this.partyType = value;
    }

    /**
     * Gets the value of the partySubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartySubType() {
        return partySubType;
    }

    /**
     * Sets the value of the partySubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartySubType(String value) {
        this.partySubType = value;
    }

    /**
     * Gets the value of the partyIdent property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentType }
     *     
     */
    public PartyIdentType getPartyIdent() {
        return partyIdent;
    }

    /**
     * Sets the value of the partyIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentType }
     *     
     */
    public void setPartyIdent(PartyIdentType value) {
        this.partyIdent = value;
    }

    /**
     * Gets the value of the familyName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the familyName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFamilyName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFamilyName() {
        if (familyName == null) {
            familyName = new ArrayList<String>();
        }
        return this.familyName;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the givenName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGivenName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGivenName() {
        if (givenName == null) {
            givenName = new ArrayList<String>();
        }
        return this.givenName;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the middleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiddleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMiddleName() {
        if (middleName == null) {
            middleName = new ArrayList<String>();
        }
        return this.middleName;
    }

    /**
     * Gets the value of the addr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr2() {
        return addr2;
    }

    /**
     * Sets the value of the addr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr2(String value) {
        this.addr2 = value;
    }

    /**
     * Gets the value of the addr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr3() {
        return addr3;
    }

    /**
     * Sets the value of the addr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr3(String value) {
        this.addr3 = value;
    }

    /**
     * Gets the value of the addr4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr4() {
        return addr4;
    }

    /**
     * Sets the value of the addr4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr4(String value) {
        this.addr4 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the stateProv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateProv() {
        return stateProv;
    }

    /**
     * Sets the value of the stateProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateProv(String value) {
        this.stateProv = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCountryCode(CountryCodeType value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the originatingBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingBranch() {
        return originatingBranch;
    }

    /**
     * Sets the value of the originatingBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingBranch(String value) {
        this.originatingBranch = value;
    }

    /**
     * Gets the value of the originatingBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingBank() {
        return originatingBank;
    }

    /**
     * Sets the value of the originatingBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingBank(String value) {
        this.originatingBank = value;
    }

    /**
     * Gets the value of the preferredBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredBranch() {
        return preferredBranch;
    }

    /**
     * Sets the value of the preferredBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredBranch(String value) {
        this.preferredBranch = value;
    }

    /**
     * Gets the value of the preferredBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredBank() {
        return preferredBank;
    }

    /**
     * Sets the value of the preferredBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredBank(String value) {
        this.preferredBank = value;
    }

    /**
     * Gets the value of the responsibleBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsibleBranch() {
        return responsibleBranch;
    }

    /**
     * Sets the value of the responsibleBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsibleBranch(String value) {
        this.responsibleBranch = value;
    }

    /**
     * Gets the value of the responsibleBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsibleBank() {
        return responsibleBank;
    }

    /**
     * Sets the value of the responsibleBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsibleBank(String value) {
        this.responsibleBank = value;
    }

    /**
     * Gets the value of the bankRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankRegion() {
        return bankRegion;
    }

    /**
     * Sets the value of the bankRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankRegion(String value) {
        this.bankRegion = value;
    }

    /**
     * Gets the value of the activeOnlyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveOnlyInd() {
        return activeOnlyInd;
    }

    /**
     * Sets the value of the activeOnlyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveOnlyInd(Boolean value) {
        this.activeOnlyInd = value;
    }

    /**
     * Gets the value of the spouseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseName() {
        return spouseName;
    }

    /**
     * Sets the value of the spouseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseName(String value) {
        this.spouseName = value;
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
     * Gets the value of the challengeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChallengeInd() {
        return challengeInd;
    }

    /**
     * Sets the value of the challengeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChallengeInd(Boolean value) {
        this.challengeInd = value;
    }

    /**
     * Gets the value of the questionCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuestionCount() {
        return questionCount;
    }

    /**
     * Sets the value of the questionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuestionCount(Long value) {
        this.questionCount = value;
    }

    /**
     * Gets the value of the oobAuthData property.
     * 
     * @return
     *     possible object is
     *     {@link OOBAuthDataType }
     *     
     */
    public OOBAuthDataType getOOBAuthData() {
        return oobAuthData;
    }

    /**
     * Sets the value of the oobAuthData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OOBAuthDataType }
     *     
     */
    public void setOOBAuthData(OOBAuthDataType value) {
        this.oobAuthData = value;
    }

}
