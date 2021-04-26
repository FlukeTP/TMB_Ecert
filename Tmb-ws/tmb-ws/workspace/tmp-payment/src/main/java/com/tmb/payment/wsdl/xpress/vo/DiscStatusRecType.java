
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DiscId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DiscStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscStatusRec_Type", propOrder = {
    "discId",
    "discStatus"
})
public class DiscStatusRecType {

    @XmlElement(name = "DiscId")
    protected String discId;
    @XmlElement(name = "DiscStatus")
    protected DiscStatusType discStatus;

    /**
     * Gets the value of the discId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscId() {
        return discId;
    }

    /**
     * Sets the value of the discId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscId(String value) {
        this.discId = value;
    }

    /**
     * Gets the value of the discStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DiscStatusType }
     *     
     */
    public DiscStatusType getDiscStatus() {
        return discStatus;
    }

    /**
     * Sets the value of the discStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscStatusType }
     *     
     */
    public void setDiscStatus(DiscStatusType value) {
        this.discStatus = value;
    }

}
