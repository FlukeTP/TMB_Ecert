
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyQualificationData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyQualificationData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}QualificationIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}QualificationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}QualificationDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}QualificationUserIdent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyQualificationData_Type", propOrder = {
    "qualificationIdent",
    "qualificationCode",
    "qualificationDate",
    "qualificationUserIdent"
})
public class PartyQualificationDataType {

    @XmlElement(name = "QualificationIdent")
    protected String qualificationIdent;
    @XmlElement(name = "QualificationCode")
    protected String qualificationCode;
    @XmlElement(name = "QualificationDate")
    protected String qualificationDate;
    @XmlElement(name = "QualificationUserIdent")
    protected String qualificationUserIdent;

    /**
     * Gets the value of the qualificationIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationIdent() {
        return qualificationIdent;
    }

    /**
     * Sets the value of the qualificationIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationIdent(String value) {
        this.qualificationIdent = value;
    }

    /**
     * Gets the value of the qualificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationCode() {
        return qualificationCode;
    }

    /**
     * Sets the value of the qualificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationCode(String value) {
        this.qualificationCode = value;
    }

    /**
     * Gets the value of the qualificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationDate() {
        return qualificationDate;
    }

    /**
     * Sets the value of the qualificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationDate(String value) {
        this.qualificationDate = value;
    }

    /**
     * Gets the value of the qualificationUserIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationUserIdent() {
        return qualificationUserIdent;
    }

    /**
     * Sets the value of the qualificationUserIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationUserIdent(String value) {
        this.qualificationUserIdent = value;
    }

}
