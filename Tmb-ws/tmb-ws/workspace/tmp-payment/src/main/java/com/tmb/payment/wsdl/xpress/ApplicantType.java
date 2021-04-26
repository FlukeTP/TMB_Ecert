
package com.tmb.payment.wsdl.xpress;

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
import com.tmb.payment.wsdl.xpress.vo.FIDataType;
import com.tmb.payment.wsdl.xpress.vo.PartyRefType;
import com.tmb.payment.wsdl.xpress.vo.ResidenceCountryType;
import com.tmb.payment.wsdl.xpress.vo.TaxResidenceCountryType;


/**
 * <p>Java class for Applicant_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Applicant_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PrimaryApplicantInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TempPartyIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PartyId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}NewPartyIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ThirdPartyRqMsg" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ThirdPartyRsMsg" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PartyRel" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IdentVerifyResults" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}VerifyErrMsg" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PartyType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PartySubType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Memo" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SPName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ApplicantMiscData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Verification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FinancialData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Contact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}IssuedIdent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ResidenceCountry" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TaxResidenceCountry" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ResponsibleBranch" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ServiceLevel" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}EstablishedDt" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}PersonApplicant"/&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}OrgApplicant"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}W8Certification" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}W9UserCert" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}CreditBureauSummary" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}CreditBureauSummary2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ApplicantAth" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ApplicantSvc" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ProcessStat" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CreationStat" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ExistPartyInd" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FIData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Applicant_Type", propOrder = {
    "primaryApplicantInd",
    "tempPartyIdent",
    "partyId",
    "newPartyIdent",
    "thirdPartyRqMsg",
    "thirdPartyRsMsg",
    "partyRel",
    "identVerifyResults",
    "verifyErrMsg",
    "partyType",
    "partySubType",
    "memo",
    "spName",
    "applicantMiscData",
    "verification",
    "financialData",
    "contact",
    "issuedIdent",
    "residenceCountry",
    "taxResidenceCountry",
    "responsibleBranch",
    "serviceLevel",
    "establishedDt",
    "personApplicant",
    "orgApplicant",
    "w8Certification",
    "w9UserCert",
    "creditBureauSummary",
    "creditBureauSummary2",
    "applicantAth",
    "applicantSvc",
    "processStat",
    "creationStat",
    "partyRef",
    "existPartyInd",
    "fiData"
})
public class ApplicantType {

    @XmlElement(name = "PrimaryApplicantInd")
    protected Boolean primaryApplicantInd;
    @XmlElement(name = "TempPartyIdent")
    protected String tempPartyIdent;
    @XmlElement(name = "PartyId")
    protected String partyId;
    @XmlElement(name = "NewPartyIdent")
    protected String newPartyIdent;
    @XmlElement(name = "ThirdPartyRqMsg")
    protected String thirdPartyRqMsg;
    @XmlElement(name = "ThirdPartyRsMsg")
    protected String thirdPartyRsMsg;
    @XmlElement(name = "PartyRel")
    protected String partyRel;
    @XmlElement(name = "IdentVerifyResults", namespace = "urn:ifxforum-org:XSD:1")
    protected String identVerifyResults;
    @XmlElement(name = "VerifyErrMsg")
    protected String verifyErrMsg;
    @XmlElement(name = "PartyType")
    protected String partyType;
    @XmlElement(name = "PartySubType")
    protected String partySubType;
    @XmlElement(name = "Memo", namespace = "urn:ifxforum-org:XSD:1")
    protected String memo;
    @XmlElement(name = "SPName", namespace = "urn:ifxforum-org:XSD:1")
    protected String spName;
    @XmlElement(name = "ApplicantMiscData")
    protected List<AppMiscDetailType> applicantMiscData;
    @XmlElement(name = "Verification")
    protected List<VerificationType> verification;
    @XmlElement(name = "FinancialData")
    protected List<FinancialDataType> financialData;
    @XmlElementRef(name = "Contact", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ContactType>> contact;
    @XmlElement(name = "IssuedIdent")
    protected List<IssuedIdentType> issuedIdent;
    @XmlElement(name = "ResidenceCountry", namespace = "urn:ifxforum-org:XSD:1")
    protected ResidenceCountryType residenceCountry;
    @XmlElement(name = "TaxResidenceCountry", namespace = "urn:ifxforum-org:XSD:1")
    protected TaxResidenceCountryType taxResidenceCountry;
    @XmlElement(name = "ResponsibleBranch")
    protected String responsibleBranch;
    @XmlElement(name = "ServiceLevel", namespace = "urn:ifxforum-org:XSD:1")
    protected String serviceLevel;
    @XmlElement(name = "EstablishedDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar establishedDt;
    @XmlElement(name = "PersonApplicant")
    protected PersonApplicantType personApplicant;
    @XmlElement(name = "OrgApplicant")
    protected OrgApplicantType orgApplicant;
    @XmlElement(name = "W8Certification")
    protected W8CertificationType w8Certification;
    @XmlElement(name = "W9UserCert")
    protected W9UserCertType w9UserCert;
    @XmlElement(name = "CreditBureauSummary")
    protected CreditBureauSummaryType creditBureauSummary;
    @XmlElement(name = "CreditBureauSummary2")
    protected List<CreditBureauSummary2Type> creditBureauSummary2;
    @XmlElement(name = "ApplicantAth")
    protected ApplicantAthType applicantAth;
    @XmlElement(name = "ApplicantSvc")
    protected List<ApplicantSvcType> applicantSvc;
    @XmlElement(name = "ProcessStat", nillable = true)
    protected List<ProcessStatType> processStat;
    @XmlElement(name = "CreationStat", nillable = true)
    protected List<CreationStatType> creationStat;
    @XmlElement(name = "PartyRef", namespace = "urn:ifxforum-org:XSD:1")
    protected PartyRefType partyRef;
    @XmlElement(name = "ExistPartyInd")
    protected Boolean existPartyInd;
    @XmlElement(name = "FIData", namespace = "urn:ifxforum-org:XSD:1")
    protected FIDataType fiData;

    /**
     * Gets the value of the primaryApplicantInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryApplicantInd() {
        return primaryApplicantInd;
    }

    /**
     * Sets the value of the primaryApplicantInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryApplicantInd(Boolean value) {
        this.primaryApplicantInd = value;
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
     * Gets the value of the partyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyId(String value) {
        this.partyId = value;
    }

    /**
     * Gets the value of the newPartyIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPartyIdent() {
        return newPartyIdent;
    }

    /**
     * Sets the value of the newPartyIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPartyIdent(String value) {
        this.newPartyIdent = value;
    }

    /**
     * Gets the value of the thirdPartyRqMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyRqMsg() {
        return thirdPartyRqMsg;
    }

    /**
     * Sets the value of the thirdPartyRqMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyRqMsg(String value) {
        this.thirdPartyRqMsg = value;
    }

    /**
     * Gets the value of the thirdPartyRsMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyRsMsg() {
        return thirdPartyRsMsg;
    }

    /**
     * Sets the value of the thirdPartyRsMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyRsMsg(String value) {
        this.thirdPartyRsMsg = value;
    }

    /**
     * Gets the value of the partyRel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyRel() {
        return partyRel;
    }

    /**
     * Sets the value of the partyRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyRel(String value) {
        this.partyRel = value;
    }

    /**
     * Gets the value of the identVerifyResults property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentVerifyResults() {
        return identVerifyResults;
    }

    /**
     * Sets the value of the identVerifyResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentVerifyResults(String value) {
        this.identVerifyResults = value;
    }

    /**
     * Gets the value of the verifyErrMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifyErrMsg() {
        return verifyErrMsg;
    }

    /**
     * Sets the value of the verifyErrMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifyErrMsg(String value) {
        this.verifyErrMsg = value;
    }

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
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

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
     * Gets the value of the applicantMiscData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicantMiscData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicantMiscData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppMiscDetailType }
     * 
     * 
     */
    public List<AppMiscDetailType> getApplicantMiscData() {
        if (applicantMiscData == null) {
            applicantMiscData = new ArrayList<AppMiscDetailType>();
        }
        return this.applicantMiscData;
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
     * Gets the value of the financialData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialDataType }
     * 
     * 
     */
    public List<FinancialDataType> getFinancialData() {
        if (financialData == null) {
            financialData = new ArrayList<FinancialDataType>();
        }
        return this.financialData;
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
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ContactType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ContactType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ContactType>> getContact() {
        if (contact == null) {
            contact = new ArrayList<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ContactType>>();
        }
        return this.contact;
    }

    /**
     * Gets the value of the issuedIdent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issuedIdent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssuedIdent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssuedIdentType }
     * 
     * 
     */
    public List<IssuedIdentType> getIssuedIdent() {
        if (issuedIdent == null) {
            issuedIdent = new ArrayList<IssuedIdentType>();
        }
        return this.issuedIdent;
    }

    /**
     * Gets the value of the residenceCountry property.
     * 
     * @return
     *     possible object is
     *     {@link ResidenceCountryType }
     *     
     */
    public ResidenceCountryType getResidenceCountry() {
        return residenceCountry;
    }

    /**
     * Sets the value of the residenceCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceCountryType }
     *     
     */
    public void setResidenceCountry(ResidenceCountryType value) {
        this.residenceCountry = value;
    }

    /**
     * Gets the value of the taxResidenceCountry property.
     * 
     * @return
     *     possible object is
     *     {@link TaxResidenceCountryType }
     *     
     */
    public TaxResidenceCountryType getTaxResidenceCountry() {
        return taxResidenceCountry;
    }

    /**
     * Sets the value of the taxResidenceCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxResidenceCountryType }
     *     
     */
    public void setTaxResidenceCountry(TaxResidenceCountryType value) {
        this.taxResidenceCountry = value;
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
     * Gets the value of the establishedDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstablishedDt() {
        return establishedDt;
    }

    /**
     * Sets the value of the establishedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstablishedDt(XMLGregorianCalendar value) {
        this.establishedDt = value;
    }

    /**
     * Gets the value of the personApplicant property.
     * 
     * @return
     *     possible object is
     *     {@link PersonApplicantType }
     *     
     */
    public PersonApplicantType getPersonApplicant() {
        return personApplicant;
    }

    /**
     * Sets the value of the personApplicant property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonApplicantType }
     *     
     */
    public void setPersonApplicant(PersonApplicantType value) {
        this.personApplicant = value;
    }

    /**
     * Gets the value of the orgApplicant property.
     * 
     * @return
     *     possible object is
     *     {@link OrgApplicantType }
     *     
     */
    public OrgApplicantType getOrgApplicant() {
        return orgApplicant;
    }

    /**
     * Sets the value of the orgApplicant property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgApplicantType }
     *     
     */
    public void setOrgApplicant(OrgApplicantType value) {
        this.orgApplicant = value;
    }

    /**
     * Gets the value of the w8Certification property.
     * 
     * @return
     *     possible object is
     *     {@link W8CertificationType }
     *     
     */
    public W8CertificationType getW8Certification() {
        return w8Certification;
    }

    /**
     * Sets the value of the w8Certification property.
     * 
     * @param value
     *     allowed object is
     *     {@link W8CertificationType }
     *     
     */
    public void setW8Certification(W8CertificationType value) {
        this.w8Certification = value;
    }

    /**
     * Gets the value of the w9UserCert property.
     * 
     * @return
     *     possible object is
     *     {@link W9UserCertType }
     *     
     */
    public W9UserCertType getW9UserCert() {
        return w9UserCert;
    }

    /**
     * Sets the value of the w9UserCert property.
     * 
     * @param value
     *     allowed object is
     *     {@link W9UserCertType }
     *     
     */
    public void setW9UserCert(W9UserCertType value) {
        this.w9UserCert = value;
    }

    /**
     * Gets the value of the creditBureauSummary property.
     * 
     * @return
     *     possible object is
     *     {@link CreditBureauSummaryType }
     *     
     */
    public CreditBureauSummaryType getCreditBureauSummary() {
        return creditBureauSummary;
    }

    /**
     * Sets the value of the creditBureauSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditBureauSummaryType }
     *     
     */
    public void setCreditBureauSummary(CreditBureauSummaryType value) {
        this.creditBureauSummary = value;
    }

    /**
     * Gets the value of the creditBureauSummary2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditBureauSummary2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditBureauSummary2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditBureauSummary2Type }
     * 
     * 
     */
    public List<CreditBureauSummary2Type> getCreditBureauSummary2() {
        if (creditBureauSummary2 == null) {
            creditBureauSummary2 = new ArrayList<CreditBureauSummary2Type>();
        }
        return this.creditBureauSummary2;
    }

    /**
     * Gets the value of the applicantAth property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicantAthType }
     *     
     */
    public ApplicantAthType getApplicantAth() {
        return applicantAth;
    }

    /**
     * Sets the value of the applicantAth property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicantAthType }
     *     
     */
    public void setApplicantAth(ApplicantAthType value) {
        this.applicantAth = value;
    }

    /**
     * Gets the value of the applicantSvc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicantSvc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicantSvc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicantSvcType }
     * 
     * 
     */
    public List<ApplicantSvcType> getApplicantSvc() {
        if (applicantSvc == null) {
            applicantSvc = new ArrayList<ApplicantSvcType>();
        }
        return this.applicantSvc;
    }

    /**
     * Gets the value of the processStat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processStat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessStat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessStatType }
     * 
     * 
     */
    public List<ProcessStatType> getProcessStat() {
        if (processStat == null) {
            processStat = new ArrayList<ProcessStatType>();
        }
        return this.processStat;
    }

    /**
     * Gets the value of the creationStat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creationStat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreationStat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreationStatType }
     * 
     * 
     */
    public List<CreationStatType> getCreationStat() {
        if (creationStat == null) {
            creationStat = new ArrayList<CreationStatType>();
        }
        return this.creationStat;
    }

    /**
     * Gets the value of the partyRef property.
     * 
     * @return
     *     possible object is
     *     {@link PartyRefType }
     *     
     */
    public PartyRefType getPartyRef() {
        return partyRef;
    }

    /**
     * Sets the value of the partyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRefType }
     *     
     */
    public void setPartyRef(PartyRefType value) {
        this.partyRef = value;
    }

    /**
     * Gets the value of the existPartyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExistPartyInd() {
        return existPartyInd;
    }

    /**
     * Sets the value of the existPartyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExistPartyInd(Boolean value) {
        this.existPartyInd = value;
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

}
