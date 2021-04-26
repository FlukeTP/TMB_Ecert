
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EducationInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EducationInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}GraduationDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}EducationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}StudentType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}UniversityName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EducationInfo_Type", propOrder = {
    "graduationDt",
    "educationCode",
    "studentType",
    "universityName"
})
public class EducationInfoType {

    @XmlElement(name = "GraduationDt")
    protected String graduationDt;
    @XmlElement(name = "EducationCode")
    protected String educationCode;
    @XmlElement(name = "StudentType")
    protected String studentType;
    @XmlElement(name = "UniversityName")
    protected String universityName;

    /**
     * Gets the value of the graduationDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraduationDt() {
        return graduationDt;
    }

    /**
     * Sets the value of the graduationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraduationDt(String value) {
        this.graduationDt = value;
    }

    /**
     * Gets the value of the educationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationCode() {
        return educationCode;
    }

    /**
     * Sets the value of the educationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationCode(String value) {
        this.educationCode = value;
    }

    /**
     * Gets the value of the studentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentType() {
        return studentType;
    }

    /**
     * Sets the value of the studentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentType(String value) {
        this.studentType = value;
    }

    /**
     * Gets the value of the universityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityName() {
        return universityName;
    }

    /**
     * Sets the value of the universityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityName(String value) {
        this.universityName = value;
    }

}
