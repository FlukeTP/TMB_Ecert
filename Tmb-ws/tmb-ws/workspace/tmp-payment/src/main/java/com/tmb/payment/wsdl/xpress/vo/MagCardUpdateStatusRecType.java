
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MagCardUpdateStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MagCardUpdateStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MagCardUpdateId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MagCardUpdateStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MagCardUpdateStatusRec_Type", propOrder = {
    "magCardUpdateId",
    "magCardUpdateStatus"
})
public class MagCardUpdateStatusRecType {

    @XmlElement(name = "MagCardUpdateId", required = true)
    protected String magCardUpdateId;
    @XmlElement(name = "MagCardUpdateStatus", required = true)
    protected MagCardUpdateStatusType magCardUpdateStatus;

    /**
     * Gets the value of the magCardUpdateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMagCardUpdateId() {
        return magCardUpdateId;
    }

    /**
     * Sets the value of the magCardUpdateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMagCardUpdateId(String value) {
        this.magCardUpdateId = value;
    }

    /**
     * Gets the value of the magCardUpdateStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MagCardUpdateStatusType }
     *     
     */
    public MagCardUpdateStatusType getMagCardUpdateStatus() {
        return magCardUpdateStatus;
    }

    /**
     * Sets the value of the magCardUpdateStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagCardUpdateStatusType }
     *     
     */
    public void setMagCardUpdateStatus(MagCardUpdateStatusType value) {
        this.magCardUpdateStatus = value;
    }

}
