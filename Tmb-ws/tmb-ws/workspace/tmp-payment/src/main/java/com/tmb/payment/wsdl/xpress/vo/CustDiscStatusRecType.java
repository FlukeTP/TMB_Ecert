
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustDiscStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustDiscStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustDiscId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustDiscStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustDiscStatusRec_Type", propOrder = {
    "custDiscId",
    "custDiscStatus"
})
public class CustDiscStatusRecType {

    @XmlElement(name = "CustDiscId")
    protected String custDiscId;
    @XmlElement(name = "CustDiscStatus")
    protected CustDiscStatusType custDiscStatus;

    /**
     * Gets the value of the custDiscId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustDiscId() {
        return custDiscId;
    }

    /**
     * Sets the value of the custDiscId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustDiscId(String value) {
        this.custDiscId = value;
    }

    /**
     * Gets the value of the custDiscStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CustDiscStatusType }
     *     
     */
    public CustDiscStatusType getCustDiscStatus() {
        return custDiscStatus;
    }

    /**
     * Sets the value of the custDiscStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustDiscStatusType }
     *     
     */
    public void setCustDiscStatus(CustDiscStatusType value) {
        this.custDiscStatus = value;
    }

}
