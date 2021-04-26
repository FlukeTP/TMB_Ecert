
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Correspondence_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Correspondence_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CorrespondenceIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CorrespondenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CorrespondenceStatCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Correspondence_Type", propOrder = {
    "correspondenceIdent",
    "correspondenceType",
    "correspondenceStatCode"
})
public class CorrespondenceType {

    @XmlElement(name = "CorrespondenceIdent")
    protected String correspondenceIdent;
    @XmlElement(name = "CorrespondenceType")
    protected String correspondenceType;
    @XmlElement(name = "CorrespondenceStatCode")
    protected String correspondenceStatCode;

    /**
     * Gets the value of the correspondenceIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondenceIdent() {
        return correspondenceIdent;
    }

    /**
     * Sets the value of the correspondenceIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondenceIdent(String value) {
        this.correspondenceIdent = value;
    }

    /**
     * Gets the value of the correspondenceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondenceType() {
        return correspondenceType;
    }

    /**
     * Sets the value of the correspondenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondenceType(String value) {
        this.correspondenceType = value;
    }

    /**
     * Gets the value of the correspondenceStatCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondenceStatCode() {
        return correspondenceStatCode;
    }

    /**
     * Sets the value of the correspondenceStatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondenceStatCode(String value) {
        this.correspondenceStatCode = value;
    }

}
