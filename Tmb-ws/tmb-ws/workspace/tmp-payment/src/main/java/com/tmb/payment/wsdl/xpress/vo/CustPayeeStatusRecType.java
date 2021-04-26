
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustPayeeStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustPayeeStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustPayeeId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustPayeeStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustPayeeStatusRec_Type", propOrder = {
    "custPayeeId",
    "custPayeeStatus"
})
public class CustPayeeStatusRecType {

    @XmlElement(name = "CustPayeeId")
    protected String custPayeeId;
    @XmlElement(name = "CustPayeeStatus")
    protected CustPayeeStatusType custPayeeStatus;

    /**
     * Gets the value of the custPayeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustPayeeId() {
        return custPayeeId;
    }

    /**
     * Sets the value of the custPayeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustPayeeId(String value) {
        this.custPayeeId = value;
    }

    /**
     * Gets the value of the custPayeeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CustPayeeStatusType }
     *     
     */
    public CustPayeeStatusType getCustPayeeStatus() {
        return custPayeeStatus;
    }

    /**
     * Sets the value of the custPayeeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustPayeeStatusType }
     *     
     */
    public void setCustPayeeStatus(CustPayeeStatusType value) {
        this.custPayeeStatus = value;
    }

}
