
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.OrgCategoryType;


/**
 * <p>Java class for PartyAdditionalInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyAdditionalInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EngName" type="{http://www.fnf.com/xes}EngName_Type"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Phone" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EmailAddr" minOccurs="0"/&gt;
 *         &lt;element name="CustomerType" type="{http://www.fnf.com/xes}CustomerType_Type"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CustStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ROCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Race" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CountryOfIncome" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}IDDocumentFlag" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}KYCDocumentFlag" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Nationality2" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OrgCategory" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyAdditionalInfo_Type", propOrder = {
    "engName",
    "phone",
    "emailAddr",
    "customerType",
    "custStatus",
    "roCode",
    "race",
    "countryOfIncome",
    "idDocumentFlag",
    "kycDocumentFlag",
    "nationality2",
    "partyStatusCode",
    "orgCategory"
})
public class PartyAdditionalInfoType {

    @XmlElement(name = "EngName", required = true)
    protected String engName;
    @XmlElement(name = "Phone", namespace = "urn:ifxforum-org:XSD:1")
    protected String phone;
    @XmlElement(name = "EmailAddr", namespace = "urn:ifxforum-org:XSD:1")
    protected String emailAddr;
    @XmlElement(name = "CustomerType", required = true)
    protected String customerType;
    @XmlElement(name = "CustStatus")
    protected CustStatusType custStatus;
    @XmlElement(name = "ROCode")
    protected ROCodeType roCode;
    @XmlElement(name = "Race")
    protected String race;
    @XmlElement(name = "CountryOfIncome")
    protected String countryOfIncome;
    @XmlElement(name = "IDDocumentFlag")
    protected String idDocumentFlag;
    @XmlElement(name = "KYCDocumentFlag")
    protected String kycDocumentFlag;
    @XmlElement(name = "Nationality2")
    protected String nationality2;
    @XmlElement(name = "PartyStatusCode", namespace = "urn:ifxforum-org:XSD:1")
    protected String partyStatusCode;
    @XmlElement(name = "OrgCategory", namespace = "urn:ifxforum-org:XSD:1")
    protected OrgCategoryType orgCategory;

    /**
     * Gets the value of the engName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngName() {
        return engName;
    }

    /**
     * Sets the value of the engName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngName(String value) {
        this.engName = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the emailAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddr() {
        return emailAddr;
    }

    /**
     * Sets the value of the emailAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddr(String value) {
        this.emailAddr = value;
    }

    /**
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerType(String value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the custStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CustStatusType }
     *     
     */
    public CustStatusType getCustStatus() {
        return custStatus;
    }

    /**
     * Sets the value of the custStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustStatusType }
     *     
     */
    public void setCustStatus(CustStatusType value) {
        this.custStatus = value;
    }

    /**
     * Gets the value of the roCode property.
     * 
     * @return
     *     possible object is
     *     {@link ROCodeType }
     *     
     */
    public ROCodeType getROCode() {
        return roCode;
    }

    /**
     * Sets the value of the roCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ROCodeType }
     *     
     */
    public void setROCode(ROCodeType value) {
        this.roCode = value;
    }

    /**
     * Gets the value of the race property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRace() {
        return race;
    }

    /**
     * Sets the value of the race property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRace(String value) {
        this.race = value;
    }

    /**
     * Gets the value of the countryOfIncome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfIncome() {
        return countryOfIncome;
    }

    /**
     * Sets the value of the countryOfIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfIncome(String value) {
        this.countryOfIncome = value;
    }

    /**
     * Gets the value of the idDocumentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDDocumentFlag() {
        return idDocumentFlag;
    }

    /**
     * Sets the value of the idDocumentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDDocumentFlag(String value) {
        this.idDocumentFlag = value;
    }

    /**
     * Gets the value of the kycDocumentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKYCDocumentFlag() {
        return kycDocumentFlag;
    }

    /**
     * Sets the value of the kycDocumentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKYCDocumentFlag(String value) {
        this.kycDocumentFlag = value;
    }

    /**
     * Gets the value of the nationality2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality2() {
        return nationality2;
    }

    /**
     * Sets the value of the nationality2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality2(String value) {
        this.nationality2 = value;
    }

    /**
     * Gets the value of the partyStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyStatusCode() {
        return partyStatusCode;
    }

    /**
     * Sets the value of the partyStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyStatusCode(String value) {
        this.partyStatusCode = value;
    }

    /**
     * Gets the value of the orgCategory property.
     * 
     * @return
     *     possible object is
     *     {@link OrgCategoryType }
     *     
     */
    public OrgCategoryType getOrgCategory() {
        return orgCategory;
    }

    /**
     * Sets the value of the orgCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgCategoryType }
     *     
     */
    public void setOrgCategory(OrgCategoryType value) {
        this.orgCategory = value;
    }

}
