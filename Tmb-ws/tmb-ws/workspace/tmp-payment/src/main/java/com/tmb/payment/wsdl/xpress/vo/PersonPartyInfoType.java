
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PersonPartyInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonPartyInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}PartyDetail_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PersonData"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BirthDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BirthPlace" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DeceasedDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MotherMaidenName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SpouseName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Employment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Gender" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MaritalStat" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MilitaryRank" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Dependents" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OEDCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OEDInstitution" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OEDRelationship" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OccupationalStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Nationality" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ImmigrationStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EducationLevel" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}HomeOwnership" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonPartyInfo_Type", propOrder = {
    "personData",
    "birthDt",
    "birthPlace",
    "deceasedDt",
    "motherMaidenName",
    "spouseName",
    "employment",
    "gender",
    "maritalStat",
    "militaryRank",
    "dependents",
    "oedCode",
    "oedInstitution",
    "oedRelationship",
    "occupationalStatus",
    "nationality",
    "immigrationStatus",
    "educationLevel",
    "homeOwnership"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.PersonPartyInfoType.class
})
public class PersonPartyInfoType
    extends PartyDetailType
{

    @XmlElementRef(name = "PersonData", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PersonDataType> personData;
    @XmlElement(name = "BirthDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDt;
    @XmlElement(name = "BirthPlace")
    protected String birthPlace;
    @XmlElement(name = "DeceasedDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deceasedDt;
    @XmlElement(name = "MotherMaidenName")
    protected String motherMaidenName;
    @XmlElement(name = "SpouseName")
    protected String spouseName;
    @XmlElementRef(name = "Employment", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.EmploymentType>> employment;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "MaritalStat")
    protected String maritalStat;
    @XmlElement(name = "MilitaryRank")
    protected String militaryRank;
    @XmlElement(name = "Dependents")
    protected Long dependents;
    @XmlElement(name = "OEDCode")
    protected String oedCode;
    @XmlElement(name = "OEDInstitution")
    protected String oedInstitution;
    @XmlElement(name = "OEDRelationship")
    protected String oedRelationship;
    @XmlElement(name = "OccupationalStatus")
    protected String occupationalStatus;
    @XmlElement(name = "Nationality")
    protected String nationality;
    @XmlElement(name = "ImmigrationStatus")
    protected String immigrationStatus;
    @XmlElement(name = "EducationLevel")
    protected String educationLevel;
    @XmlElement(name = "HomeOwnership")
    protected String homeOwnership;

    /**
     * Gets the value of the personData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PersonDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PersonDataType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PersonDataType> getPersonData() {
        return personData;
    }

    /**
     * Sets the value of the personData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PersonDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PersonDataType }{@code >}
     *     
     */
    public void setPersonData(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PersonDataType> value) {
        this.personData = value;
    }

    /**
     * Gets the value of the birthDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDt() {
        return birthDt;
    }

    /**
     * Sets the value of the birthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDt(XMLGregorianCalendar value) {
        this.birthDt = value;
    }

    /**
     * Gets the value of the birthPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /**
     * Sets the value of the birthPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthPlace(String value) {
        this.birthPlace = value;
    }

    /**
     * Gets the value of the deceasedDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeceasedDt() {
        return deceasedDt;
    }

    /**
     * Sets the value of the deceasedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeceasedDt(XMLGregorianCalendar value) {
        this.deceasedDt = value;
    }

    /**
     * Gets the value of the motherMaidenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherMaidenName() {
        return motherMaidenName;
    }

    /**
     * Sets the value of the motherMaidenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherMaidenName(String value) {
        this.motherMaidenName = value;
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
     * Gets the value of the employment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.EmploymentType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.EmploymentType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.EmploymentType>> getEmployment() {
        if (employment == null) {
            employment = new ArrayList<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.EmploymentType>>();
        }
        return this.employment;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the maritalStat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStat() {
        return maritalStat;
    }

    /**
     * Sets the value of the maritalStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStat(String value) {
        this.maritalStat = value;
    }

    /**
     * Gets the value of the militaryRank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilitaryRank() {
        return militaryRank;
    }

    /**
     * Sets the value of the militaryRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilitaryRank(String value) {
        this.militaryRank = value;
    }

    /**
     * Gets the value of the dependents property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDependents() {
        return dependents;
    }

    /**
     * Sets the value of the dependents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDependents(Long value) {
        this.dependents = value;
    }

    /**
     * Gets the value of the oedCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOEDCode() {
        return oedCode;
    }

    /**
     * Sets the value of the oedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOEDCode(String value) {
        this.oedCode = value;
    }

    /**
     * Gets the value of the oedInstitution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOEDInstitution() {
        return oedInstitution;
    }

    /**
     * Sets the value of the oedInstitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOEDInstitution(String value) {
        this.oedInstitution = value;
    }

    /**
     * Gets the value of the oedRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOEDRelationship() {
        return oedRelationship;
    }

    /**
     * Sets the value of the oedRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOEDRelationship(String value) {
        this.oedRelationship = value;
    }

    /**
     * Gets the value of the occupationalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupationalStatus() {
        return occupationalStatus;
    }

    /**
     * Sets the value of the occupationalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupationalStatus(String value) {
        this.occupationalStatus = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the immigrationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImmigrationStatus() {
        return immigrationStatus;
    }

    /**
     * Sets the value of the immigrationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImmigrationStatus(String value) {
        this.immigrationStatus = value;
    }

    /**
     * Gets the value of the educationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationLevel() {
        return educationLevel;
    }

    /**
     * Sets the value of the educationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationLevel(String value) {
        this.educationLevel = value;
    }

    /**
     * Gets the value of the homeOwnership property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeOwnership() {
        return homeOwnership;
    }

    /**
     * Sets the value of the homeOwnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeOwnership(String value) {
        this.homeOwnership = value;
    }

}
