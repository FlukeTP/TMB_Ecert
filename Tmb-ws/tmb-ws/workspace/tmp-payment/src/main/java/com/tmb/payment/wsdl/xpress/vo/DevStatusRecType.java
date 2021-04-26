
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevStatusRec_Type", propOrder = {
    "devId",
    "devStatus"
})
public class DevStatusRecType {

    @XmlElement(name = "DevId")
    protected String devId;
    @XmlElement(name = "DevStatus")
    protected DevStatusType devStatus;

    /**
     * Gets the value of the devId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevId() {
        return devId;
    }

    /**
     * Sets the value of the devId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevId(String value) {
        this.devId = value;
    }

    /**
     * Gets the value of the devStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DevStatusType }
     *     
     */
    public DevStatusType getDevStatus() {
        return devStatus;
    }

    /**
     * Sets the value of the devStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevStatusType }
     *     
     */
    public void setDevStatus(DevStatusType value) {
        this.devStatus = value;
    }

}
