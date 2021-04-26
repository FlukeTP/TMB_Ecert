
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreationStat_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreationStat_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}StatIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}StatType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}StatCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}StatDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}EffDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}StatModBy" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}UserIdent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreationStat_Type", propOrder = {
    "statIdent",
    "statType",
    "statCode",
    "statDesc",
    "effDt",
    "statModBy",
    "userIdent"
})
public class CreationStatType {

    @XmlElement(name = "StatIdent")
    protected String statIdent;
    @XmlElement(name = "StatType")
    protected String statType;
    @XmlElement(name = "StatCode")
    protected String statCode;
    @XmlElement(name = "StatDesc")
    protected String statDesc;
    @XmlElement(name = "EffDt")
    protected Object effDt;
    @XmlElement(name = "StatModBy")
    protected String statModBy;
    @XmlElement(name = "UserIdent")
    protected String userIdent;

    /**
     * Gets the value of the statIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatIdent() {
        return statIdent;
    }

    /**
     * Sets the value of the statIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatIdent(String value) {
        this.statIdent = value;
    }

    /**
     * Gets the value of the statType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatType() {
        return statType;
    }

    /**
     * Sets the value of the statType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatType(String value) {
        this.statType = value;
    }

    /**
     * Gets the value of the statCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatCode() {
        return statCode;
    }

    /**
     * Sets the value of the statCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatCode(String value) {
        this.statCode = value;
    }

    /**
     * Gets the value of the statDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatDesc() {
        return statDesc;
    }

    /**
     * Sets the value of the statDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatDesc(String value) {
        this.statDesc = value;
    }

    /**
     * Gets the value of the effDt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEffDt() {
        return effDt;
    }

    /**
     * Sets the value of the effDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEffDt(Object value) {
        this.effDt = value;
    }

    /**
     * Gets the value of the statModBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatModBy() {
        return statModBy;
    }

    /**
     * Sets the value of the statModBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatModBy(String value) {
        this.statModBy = value;
    }

    /**
     * Gets the value of the userIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIdent() {
        return userIdent;
    }

    /**
     * Sets the value of the userIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIdent(String value) {
        this.userIdent = value;
    }

}
