
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecPmtStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecPmtStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RecPmtId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RecPmtStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecPmtStatusRec_Type", propOrder = {
    "recPmtId",
    "recPmtStatus"
})
public class RecPmtStatusRecType {

    @XmlElement(name = "RecPmtId")
    protected String recPmtId;
    @XmlElement(name = "RecPmtStatus")
    protected RecPmtStatusType recPmtStatus;

    /**
     * Gets the value of the recPmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecPmtId() {
        return recPmtId;
    }

    /**
     * Sets the value of the recPmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecPmtId(String value) {
        this.recPmtId = value;
    }

    /**
     * Gets the value of the recPmtStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RecPmtStatusType }
     *     
     */
    public RecPmtStatusType getRecPmtStatus() {
        return recPmtStatus;
    }

    /**
     * Sets the value of the recPmtStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecPmtStatusType }
     *     
     */
    public void setRecPmtStatus(RecPmtStatusType value) {
        this.recPmtStatus = value;
    }

}
