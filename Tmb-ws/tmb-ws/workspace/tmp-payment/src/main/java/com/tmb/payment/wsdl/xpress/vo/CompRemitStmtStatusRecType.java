
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompRemitStmtStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompRemitStmtStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CompRemitStmtId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CompRemitStmtStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompRemitStmtStatusRec_Type", propOrder = {
    "compRemitStmtId",
    "compRemitStmtStatus"
})
public class CompRemitStmtStatusRecType {

    @XmlElement(name = "CompRemitStmtId")
    protected String compRemitStmtId;
    @XmlElement(name = "CompRemitStmtStatus")
    protected CompRemitStmtStatusType compRemitStmtStatus;

    /**
     * Gets the value of the compRemitStmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompRemitStmtId() {
        return compRemitStmtId;
    }

    /**
     * Sets the value of the compRemitStmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompRemitStmtId(String value) {
        this.compRemitStmtId = value;
    }

    /**
     * Gets the value of the compRemitStmtStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CompRemitStmtStatusType }
     *     
     */
    public CompRemitStmtStatusType getCompRemitStmtStatus() {
        return compRemitStmtStatus;
    }

    /**
     * Sets the value of the compRemitStmtStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompRemitStmtStatusType }
     *     
     */
    public void setCompRemitStmtStatus(CompRemitStmtStatusType value) {
        this.compRemitStmtStatus = value;
    }

}
