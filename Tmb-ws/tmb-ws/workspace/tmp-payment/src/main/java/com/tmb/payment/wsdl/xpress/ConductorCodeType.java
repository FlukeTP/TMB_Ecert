
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConductorCode_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConductorCode_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ArmCarSvc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MailDepOrShip" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OnOwnBehalf" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DepMode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}IsMultipleTrn" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConductorCode_Type", propOrder = {
    "armCarSvc",
    "mailDepOrShip",
    "onOwnBehalf",
    "depMode",
    "isMultipleTrn"
})
public class ConductorCodeType {

    @XmlElement(name = "ArmCarSvc")
    protected String armCarSvc;
    @XmlElement(name = "MailDepOrShip")
    protected String mailDepOrShip;
    @XmlElement(name = "OnOwnBehalf")
    protected String onOwnBehalf;
    @XmlElement(name = "DepMode")
    protected String depMode;
    @XmlElement(name = "IsMultipleTrn")
    protected String isMultipleTrn;

    /**
     * Gets the value of the armCarSvc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArmCarSvc() {
        return armCarSvc;
    }

    /**
     * Sets the value of the armCarSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArmCarSvc(String value) {
        this.armCarSvc = value;
    }

    /**
     * Gets the value of the mailDepOrShip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailDepOrShip() {
        return mailDepOrShip;
    }

    /**
     * Sets the value of the mailDepOrShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailDepOrShip(String value) {
        this.mailDepOrShip = value;
    }

    /**
     * Gets the value of the onOwnBehalf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnOwnBehalf() {
        return onOwnBehalf;
    }

    /**
     * Sets the value of the onOwnBehalf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnOwnBehalf(String value) {
        this.onOwnBehalf = value;
    }

    /**
     * Gets the value of the depMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepMode() {
        return depMode;
    }

    /**
     * Sets the value of the depMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepMode(String value) {
        this.depMode = value;
    }

    /**
     * Gets the value of the isMultipleTrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsMultipleTrn() {
        return isMultipleTrn;
    }

    /**
     * Sets the value of the isMultipleTrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMultipleTrn(String value) {
        this.isMultipleTrn = value;
    }

}
