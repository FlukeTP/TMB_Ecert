
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecChkOrdStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecChkOrdStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RecChkOrdId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RecChkOrdStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecChkOrdStatusRec_Type", propOrder = {
    "recChkOrdId",
    "recChkOrdStatus"
})
public class RecChkOrdStatusRecType {

    @XmlElement(name = "RecChkOrdId")
    protected String recChkOrdId;
    @XmlElement(name = "RecChkOrdStatus")
    protected RecChkOrdStatusType recChkOrdStatus;

    /**
     * Gets the value of the recChkOrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecChkOrdId() {
        return recChkOrdId;
    }

    /**
     * Sets the value of the recChkOrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecChkOrdId(String value) {
        this.recChkOrdId = value;
    }

    /**
     * Gets the value of the recChkOrdStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RecChkOrdStatusType }
     *     
     */
    public RecChkOrdStatusType getRecChkOrdStatus() {
        return recChkOrdStatus;
    }

    /**
     * Sets the value of the recChkOrdStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecChkOrdStatusType }
     *     
     */
    public void setRecChkOrdStatus(RecChkOrdStatusType value) {
        this.recChkOrdStatus = value;
    }

}
