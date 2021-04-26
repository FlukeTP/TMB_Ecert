
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FamilyInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FamilyInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FatherName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MotherName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}NextOfKinName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SpouseInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FamilyFinancialInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FamilyInfo_Type", propOrder = {
    "fatherName",
    "motherName",
    "nextOfKinName",
    "spouseInfo",
    "familyFinancialInfo"
})
public class FamilyInfoType {

    @XmlElement(name = "FatherName")
    protected String fatherName;
    @XmlElement(name = "MotherName")
    protected String motherName;
    @XmlElement(name = "NextOfKinName")
    protected String nextOfKinName;
    @XmlElement(name = "SpouseInfo")
    protected SpouseInfoType spouseInfo;
    @XmlElement(name = "FamilyFinancialInfo")
    protected FamilyFinancialInfoType familyFinancialInfo;

    /**
     * Gets the value of the fatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherName() {
        return fatherName;
    }

    /**
     * Sets the value of the fatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherName(String value) {
        this.fatherName = value;
    }

    /**
     * Gets the value of the motherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherName() {
        return motherName;
    }

    /**
     * Sets the value of the motherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherName(String value) {
        this.motherName = value;
    }

    /**
     * Gets the value of the nextOfKinName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextOfKinName() {
        return nextOfKinName;
    }

    /**
     * Sets the value of the nextOfKinName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextOfKinName(String value) {
        this.nextOfKinName = value;
    }

    /**
     * Gets the value of the spouseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SpouseInfoType }
     *     
     */
    public SpouseInfoType getSpouseInfo() {
        return spouseInfo;
    }

    /**
     * Sets the value of the spouseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpouseInfoType }
     *     
     */
    public void setSpouseInfo(SpouseInfoType value) {
        this.spouseInfo = value;
    }

    /**
     * Gets the value of the familyFinancialInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FamilyFinancialInfoType }
     *     
     */
    public FamilyFinancialInfoType getFamilyFinancialInfo() {
        return familyFinancialInfo;
    }

    /**
     * Sets the value of the familyFinancialInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FamilyFinancialInfoType }
     *     
     */
    public void setFamilyFinancialInfo(FamilyFinancialInfoType value) {
        this.familyFinancialInfo = value;
    }

}
