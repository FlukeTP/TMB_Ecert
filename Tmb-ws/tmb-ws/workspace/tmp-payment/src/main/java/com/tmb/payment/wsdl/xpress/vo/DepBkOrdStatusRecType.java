
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepBkOrdStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepBkOrdStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DepBkOrdId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DepBkOrdStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepBkOrdStatusRec_Type", propOrder = {
    "depBkOrdId",
    "depBkOrdStatus"
})
public class DepBkOrdStatusRecType {

    @XmlElement(name = "DepBkOrdId")
    protected String depBkOrdId;
    @XmlElement(name = "DepBkOrdStatus")
    protected DepBkOrdStatusType depBkOrdStatus;

    /**
     * Gets the value of the depBkOrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepBkOrdId() {
        return depBkOrdId;
    }

    /**
     * Sets the value of the depBkOrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepBkOrdId(String value) {
        this.depBkOrdId = value;
    }

    /**
     * Gets the value of the depBkOrdStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DepBkOrdStatusType }
     *     
     */
    public DepBkOrdStatusType getDepBkOrdStatus() {
        return depBkOrdStatus;
    }

    /**
     * Sets the value of the depBkOrdStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepBkOrdStatusType }
     *     
     */
    public void setDepBkOrdStatus(DepBkOrdStatusType value) {
        this.depBkOrdStatus = value;
    }

}
