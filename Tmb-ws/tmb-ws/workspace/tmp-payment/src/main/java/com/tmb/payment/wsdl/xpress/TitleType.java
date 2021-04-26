
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Title_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Title_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FullName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TitleIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OnFileCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TitleOrgData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Title_Type", propOrder = {
    "fullName",
    "titleIdent",
    "onFileCode",
    "titleOrgData"
})
public class TitleType {

    @XmlElement(name = "FullName")
    protected String fullName;
    @XmlElement(name = "TitleIdent")
    protected String titleIdent;
    @XmlElement(name = "OnFileCode")
    protected String onFileCode;
    @XmlElement(name = "TitleOrgData")
    protected TitleOrgDataType titleOrgData;

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the titleIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleIdent() {
        return titleIdent;
    }

    /**
     * Sets the value of the titleIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleIdent(String value) {
        this.titleIdent = value;
    }

    /**
     * Gets the value of the onFileCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnFileCode() {
        return onFileCode;
    }

    /**
     * Sets the value of the onFileCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnFileCode(String value) {
        this.onFileCode = value;
    }

    /**
     * Gets the value of the titleOrgData property.
     * 
     * @return
     *     possible object is
     *     {@link TitleOrgDataType }
     *     
     */
    public TitleOrgDataType getTitleOrgData() {
        return titleOrgData;
    }

    /**
     * Sets the value of the titleOrgData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitleOrgDataType }
     *     
     */
    public void setTitleOrgData(TitleOrgDataType value) {
        this.titleOrgData = value;
    }

}
