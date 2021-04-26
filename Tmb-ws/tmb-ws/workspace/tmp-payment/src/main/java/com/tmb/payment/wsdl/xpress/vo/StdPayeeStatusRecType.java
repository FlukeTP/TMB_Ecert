
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StdPayeeStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StdPayeeStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StdPayeeId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StdPayeeStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StdPayeeStatusRec_Type", propOrder = {
    "stdPayeeId",
    "stdPayeeStatus"
})
public class StdPayeeStatusRecType {

    @XmlElement(name = "StdPayeeId")
    protected StdPayeeIdType stdPayeeId;
    @XmlElement(name = "StdPayeeStatus")
    protected StdPayeeStatusType stdPayeeStatus;

    /**
     * Gets the value of the stdPayeeId property.
     * 
     * @return
     *     possible object is
     *     {@link StdPayeeIdType }
     *     
     */
    public StdPayeeIdType getStdPayeeId() {
        return stdPayeeId;
    }

    /**
     * Sets the value of the stdPayeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link StdPayeeIdType }
     *     
     */
    public void setStdPayeeId(StdPayeeIdType value) {
        this.stdPayeeId = value;
    }

    /**
     * Gets the value of the stdPayeeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link StdPayeeStatusType }
     *     
     */
    public StdPayeeStatusType getStdPayeeStatus() {
        return stdPayeeStatus;
    }

    /**
     * Sets the value of the stdPayeeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StdPayeeStatusType }
     *     
     */
    public void setStdPayeeStatus(StdPayeeStatusType value) {
        this.stdPayeeStatus = value;
    }

}
