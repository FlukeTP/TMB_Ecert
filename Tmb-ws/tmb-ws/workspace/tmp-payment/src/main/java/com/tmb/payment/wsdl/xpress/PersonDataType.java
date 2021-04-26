
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}PersonData_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PersonId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MaidenName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}BirthPlace" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AgeRange" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DeceasedDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DisabilityDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Race" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}VIPType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SmokerInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ResidenceInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FamilyInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DependentsInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}EducationInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonData_Type", propOrder = {
    "personId",
    "maidenName",
    "birthPlace",
    "ageRange",
    "deceasedDt",
    "disabilityDt",
    "race",
    "vipType",
    "smokerInd",
    "residenceInfo",
    "familyInfo",
    "dependentsInfo",
    "educationInfo"
})
public class PersonDataType
    extends com.tmb.payment.wsdl.xpress.vo.PersonDataType
{

    @XmlElement(name = "PersonId")
    protected String personId;
    @XmlElement(name = "MaidenName")
    protected String maidenName;
    @XmlElement(name = "BirthPlace")
    protected String birthPlace;
    @XmlElement(name = "AgeRange")
    protected String ageRange;
    @XmlElement(name = "DeceasedDt")
    protected String deceasedDt;
    @XmlElement(name = "DisabilityDt")
    protected String disabilityDt;
    @XmlElement(name = "Race")
    protected String race;
    @XmlElement(name = "VIPType")
    protected String vipType;
    @XmlElement(name = "SmokerInd")
    protected Boolean smokerInd;
    @XmlElement(name = "ResidenceInfo")
    protected ResidenceInfoType residenceInfo;
    @XmlElement(name = "FamilyInfo")
    protected FamilyInfoType familyInfo;
    @XmlElement(name = "DependentsInfo")
    protected DependentsInfoType dependentsInfo;
    @XmlElement(name = "EducationInfo")
    protected EducationInfoType educationInfo;

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonId(String value) {
        this.personId = value;
    }

    /**
     * Gets the value of the maidenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaidenName() {
        return maidenName;
    }

    /**
     * Sets the value of the maidenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaidenName(String value) {
        this.maidenName = value;
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
     * Gets the value of the ageRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeRange() {
        return ageRange;
    }

    /**
     * Sets the value of the ageRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeRange(String value) {
        this.ageRange = value;
    }

    /**
     * Gets the value of the deceasedDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeceasedDt() {
        return deceasedDt;
    }

    /**
     * Sets the value of the deceasedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeceasedDt(String value) {
        this.deceasedDt = value;
    }

    /**
     * Gets the value of the disabilityDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisabilityDt() {
        return disabilityDt;
    }

    /**
     * Sets the value of the disabilityDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisabilityDt(String value) {
        this.disabilityDt = value;
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
     * Gets the value of the vipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIPType() {
        return vipType;
    }

    /**
     * Sets the value of the vipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIPType(String value) {
        this.vipType = value;
    }

    /**
     * Gets the value of the smokerInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmokerInd() {
        return smokerInd;
    }

    /**
     * Sets the value of the smokerInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmokerInd(Boolean value) {
        this.smokerInd = value;
    }

    /**
     * Gets the value of the residenceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ResidenceInfoType }
     *     
     */
    public ResidenceInfoType getResidenceInfo() {
        return residenceInfo;
    }

    /**
     * Sets the value of the residenceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceInfoType }
     *     
     */
    public void setResidenceInfo(ResidenceInfoType value) {
        this.residenceInfo = value;
    }

    /**
     * Gets the value of the familyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FamilyInfoType }
     *     
     */
    public FamilyInfoType getFamilyInfo() {
        return familyInfo;
    }

    /**
     * Sets the value of the familyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FamilyInfoType }
     *     
     */
    public void setFamilyInfo(FamilyInfoType value) {
        this.familyInfo = value;
    }

    /**
     * Gets the value of the dependentsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DependentsInfoType }
     *     
     */
    public DependentsInfoType getDependentsInfo() {
        return dependentsInfo;
    }

    /**
     * Sets the value of the dependentsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DependentsInfoType }
     *     
     */
    public void setDependentsInfo(DependentsInfoType value) {
        this.dependentsInfo = value;
    }

    /**
     * Gets the value of the educationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EducationInfoType }
     *     
     */
    public EducationInfoType getEducationInfo() {
        return educationInfo;
    }

    /**
     * Sets the value of the educationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EducationInfoType }
     *     
     */
    public void setEducationInfo(EducationInfoType value) {
        this.educationInfo = value;
    }

}
