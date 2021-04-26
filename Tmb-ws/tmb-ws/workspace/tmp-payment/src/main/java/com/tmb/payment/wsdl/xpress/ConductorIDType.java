
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConductorID_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConductorID_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}IdentID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}IdentNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}IdentityIssBy" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConductorID_Type", propOrder = {
    "identID",
    "identNum",
    "identityIssBy"
})
public class ConductorIDType {

    @XmlElement(name = "IdentID")
    protected String identID;
    @XmlElement(name = "IdentNum")
    protected String identNum;
    @XmlElement(name = "IdentityIssBy")
    protected String identityIssBy;

    /**
     * Gets the value of the identID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentID() {
        return identID;
    }

    /**
     * Sets the value of the identID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentID(String value) {
        this.identID = value;
    }

    /**
     * Gets the value of the identNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentNum() {
        return identNum;
    }

    /**
     * Sets the value of the identNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentNum(String value) {
        this.identNum = value;
    }

    /**
     * Gets the value of the identityIssBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityIssBy() {
        return identityIssBy;
    }

    /**
     * Sets the value of the identityIssBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityIssBy(String value) {
        this.identityIssBy = value;
    }

}
