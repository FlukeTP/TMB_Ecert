
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ICCUpdateStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ICCUpdateStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ICCUpdateId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ICCUpdateStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICCUpdateStatusRec_Type", propOrder = {
    "iccUpdateId",
    "iccUpdateStatus"
})
public class ICCUpdateStatusRecType {

    @XmlElement(name = "ICCUpdateId", required = true)
    protected String iccUpdateId;
    @XmlElement(name = "ICCUpdateStatus", required = true)
    protected ICCUpdateStatusType iccUpdateStatus;

    /**
     * Gets the value of the iccUpdateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICCUpdateId() {
        return iccUpdateId;
    }

    /**
     * Sets the value of the iccUpdateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICCUpdateId(String value) {
        this.iccUpdateId = value;
    }

    /**
     * Gets the value of the iccUpdateStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ICCUpdateStatusType }
     *     
     */
    public ICCUpdateStatusType getICCUpdateStatus() {
        return iccUpdateStatus;
    }

    /**
     * Sets the value of the iccUpdateStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICCUpdateStatusType }
     *     
     */
    public void setICCUpdateStatus(ICCUpdateStatusType value) {
        this.iccUpdateStatus = value;
    }

}
