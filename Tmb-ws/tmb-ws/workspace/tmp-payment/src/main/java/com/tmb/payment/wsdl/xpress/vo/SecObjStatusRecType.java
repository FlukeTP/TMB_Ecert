
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecObjStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecObjStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecObjId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecObjStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecObjStatusRec_Type", propOrder = {
    "secObjId",
    "secObjStatus"
})
public class SecObjStatusRecType {

    @XmlElement(name = "SecObjId")
    protected String secObjId;
    @XmlElement(name = "SecObjStatus")
    protected SecObjStatusType secObjStatus;

    /**
     * Gets the value of the secObjId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecObjId() {
        return secObjId;
    }

    /**
     * Sets the value of the secObjId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecObjId(String value) {
        this.secObjId = value;
    }

    /**
     * Gets the value of the secObjStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SecObjStatusType }
     *     
     */
    public SecObjStatusType getSecObjStatus() {
        return secObjStatus;
    }

    /**
     * Sets the value of the secObjStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecObjStatusType }
     *     
     */
    public void setSecObjStatus(SecObjStatusType value) {
        this.secObjStatus = value;
    }

}
