
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepAppStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepAppStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DepAppId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DepAppStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepAppStatusRec_Type", propOrder = {
    "depAppId",
    "depAppStatus"
})
public class DepAppStatusRecType {

    @XmlElement(name = "DepAppId")
    protected String depAppId;
    @XmlElement(name = "DepAppStatus")
    protected DepAppStatusType depAppStatus;

    /**
     * Gets the value of the depAppId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepAppId() {
        return depAppId;
    }

    /**
     * Sets the value of the depAppId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepAppId(String value) {
        this.depAppId = value;
    }

    /**
     * Gets the value of the depAppStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DepAppStatusType }
     *     
     */
    public DepAppStatusType getDepAppStatus() {
        return depAppStatus;
    }

    /**
     * Sets the value of the depAppStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAppStatusType }
     *     
     */
    public void setDepAppStatus(DepAppStatusType value) {
        this.depAppStatus = value;
    }

}
