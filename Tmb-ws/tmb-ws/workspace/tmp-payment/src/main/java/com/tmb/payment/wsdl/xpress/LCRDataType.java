
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
import com.tmb.payment.wsdl.xpress.vo.OrgDataType;


/**
 * <p>Java class for LCRData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LCRData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PersonData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OrgData" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AmendReport" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MultipleTrn" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MICRNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ExaminerCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OffTitle" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ConductorCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}LCRAcctIdent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TrnTypes" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CountryCodeValue" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ReportType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TrnDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PurposeDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MicrUnformatted" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TellerCurAmt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LCRData_Type", propOrder = {
    "personData",
    "orgData",
    "amendReport",
    "multipleTrn",
    "micrNum",
    "examinerCode",
    "offTitle",
    "conductorCode",
    "lcrAcctIdent",
    "trnTypes",
    "countryCodeValue",
    "reportType",
    "trnDesc",
    "purposeDesc",
    "micrUnformatted",
    "partyId",
    "tellerCurAmt"
})
public class LCRDataType {

    @XmlElementRef(name = "PersonData", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PersonDataType>> personData;
    @XmlElement(name = "OrgData", namespace = "urn:ifxforum-org:XSD:1")
    protected OrgDataType orgData;
    @XmlElement(name = "AmendReport")
    protected String amendReport;
    @XmlElement(name = "MultipleTrn")
    protected String multipleTrn;
    @XmlElement(name = "MICRNum")
    protected String micrNum;
    @XmlElement(name = "ExaminerCode")
    protected String examinerCode;
    @XmlElement(name = "OffTitle")
    protected String offTitle;
    @XmlElement(name = "ConductorCode")
    protected ConductorCodeType conductorCode;
    @XmlElement(name = "LCRAcctIdent")
    protected List<LCRAcctIdentType> lcrAcctIdent;
    @XmlElement(name = "TrnTypes")
    @XmlSchemaType(name = "string")
    protected TrnTypesType trnTypes;
    @XmlElement(name = "CountryCodeValue", namespace = "urn:ifxforum-org:XSD:1")
    protected String countryCodeValue;
    @XmlElement(name = "ReportType")
    protected String reportType;
    @XmlElement(name = "TrnDesc")
    protected TrnDescType trnDesc;
    @XmlElement(name = "PurposeDesc", namespace = "urn:ifxforum-org:XSD:1")
    protected String purposeDesc;
    @XmlElement(name = "MicrUnformatted", namespace = "urn:ifxforum-org:XSD:1")
    protected String micrUnformatted;
    @XmlElement(name = "PartyId", namespace = "urn:ifxforum-org:XSD:1")
    protected String partyId;
    @XmlElement(name = "TellerCurAmt")
    protected TellerCurAmtType tellerCurAmt;

    /**
     * Gets the value of the personData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PersonDataType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PersonDataType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PersonDataType>> getPersonData() {
        if (personData == null) {
            personData = new ArrayList<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PersonDataType>>();
        }
        return this.personData;
    }

    /**
     * Gets the value of the orgData property.
     * 
     * @return
     *     possible object is
     *     {@link OrgDataType }
     *     
     */
    public OrgDataType getOrgData() {
        return orgData;
    }

    /**
     * Sets the value of the orgData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgDataType }
     *     
     */
    public void setOrgData(OrgDataType value) {
        this.orgData = value;
    }

    /**
     * Gets the value of the amendReport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmendReport() {
        return amendReport;
    }

    /**
     * Sets the value of the amendReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmendReport(String value) {
        this.amendReport = value;
    }

    /**
     * Gets the value of the multipleTrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultipleTrn() {
        return multipleTrn;
    }

    /**
     * Sets the value of the multipleTrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultipleTrn(String value) {
        this.multipleTrn = value;
    }

    /**
     * Gets the value of the micrNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMICRNum() {
        return micrNum;
    }

    /**
     * Sets the value of the micrNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMICRNum(String value) {
        this.micrNum = value;
    }

    /**
     * Gets the value of the examinerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminerCode() {
        return examinerCode;
    }

    /**
     * Sets the value of the examinerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminerCode(String value) {
        this.examinerCode = value;
    }

    /**
     * Gets the value of the offTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffTitle() {
        return offTitle;
    }

    /**
     * Sets the value of the offTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffTitle(String value) {
        this.offTitle = value;
    }

    /**
     * Gets the value of the conductorCode property.
     * 
     * @return
     *     possible object is
     *     {@link ConductorCodeType }
     *     
     */
    public ConductorCodeType getConductorCode() {
        return conductorCode;
    }

    /**
     * Sets the value of the conductorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConductorCodeType }
     *     
     */
    public void setConductorCode(ConductorCodeType value) {
        this.conductorCode = value;
    }

    /**
     * Gets the value of the lcrAcctIdent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lcrAcctIdent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLCRAcctIdent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LCRAcctIdentType }
     * 
     * 
     */
    public List<LCRAcctIdentType> getLCRAcctIdent() {
        if (lcrAcctIdent == null) {
            lcrAcctIdent = new ArrayList<LCRAcctIdentType>();
        }
        return this.lcrAcctIdent;
    }

    /**
     * Gets the value of the trnTypes property.
     * 
     * @return
     *     possible object is
     *     {@link TrnTypesType }
     *     
     */
    public TrnTypesType getTrnTypes() {
        return trnTypes;
    }

    /**
     * Sets the value of the trnTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnTypesType }
     *     
     */
    public void setTrnTypes(TrnTypesType value) {
        this.trnTypes = value;
    }

    /**
     * Gets the value of the countryCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCodeValue() {
        return countryCodeValue;
    }

    /**
     * Sets the value of the countryCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCodeValue(String value) {
        this.countryCodeValue = value;
    }

    /**
     * Gets the value of the reportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * Sets the value of the reportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportType(String value) {
        this.reportType = value;
    }

    /**
     * Gets the value of the trnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link TrnDescType }
     *     
     */
    public TrnDescType getTrnDesc() {
        return trnDesc;
    }

    /**
     * Sets the value of the trnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnDescType }
     *     
     */
    public void setTrnDesc(TrnDescType value) {
        this.trnDesc = value;
    }

    /**
     * Gets the value of the purposeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurposeDesc() {
        return purposeDesc;
    }

    /**
     * Sets the value of the purposeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurposeDesc(String value) {
        this.purposeDesc = value;
    }

    /**
     * Gets the value of the micrUnformatted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMicrUnformatted() {
        return micrUnformatted;
    }

    /**
     * Sets the value of the micrUnformatted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMicrUnformatted(String value) {
        this.micrUnformatted = value;
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
     * Gets the value of the tellerCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link TellerCurAmtType }
     *     
     */
    public TellerCurAmtType getTellerCurAmt() {
        return tellerCurAmt;
    }

    /**
     * Sets the value of the tellerCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TellerCurAmtType }
     *     
     */
    public void setTellerCurAmt(TellerCurAmtType value) {
        this.tellerCurAmt = value;
    }

}
