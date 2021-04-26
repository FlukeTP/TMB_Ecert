
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecXferStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecXferStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RecXferId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RecXferStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecXferStatusRec_Type", propOrder = {
    "recXferId",
    "recXferStatus"
})
public class RecXferStatusRecType {

    @XmlElement(name = "RecXferId")
    protected String recXferId;
    @XmlElement(name = "RecXferStatus")
    protected RecXferStatusType recXferStatus;

    /**
     * Gets the value of the recXferId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecXferId() {
        return recXferId;
    }

    /**
     * Sets the value of the recXferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecXferId(String value) {
        this.recXferId = value;
    }

    /**
     * Gets the value of the recXferStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RecXferStatusType }
     *     
     */
    public RecXferStatusType getRecXferStatus() {
        return recXferStatus;
    }

    /**
     * Sets the value of the recXferStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecXferStatusType }
     *     
     */
    public void setRecXferStatus(RecXferStatusType value) {
        this.recXferStatus = value;
    }

}
