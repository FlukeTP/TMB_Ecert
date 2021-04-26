
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SvcAcctStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SvcAcctStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}delete.SvcAcctId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SvcAcctStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SvcAcctStatusRec_Type", propOrder = {
    "deleteSvcAcctId",
    "svcAcctStatus"
})
public class SvcAcctStatusRecType {

    @XmlElement(name = "delete.SvcAcctId")
    protected DeleteSvcAcctIdType deleteSvcAcctId;
    @XmlElement(name = "SvcAcctStatus")
    protected SvcAcctStatusType svcAcctStatus;

    /**
     * Gets the value of the deleteSvcAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteSvcAcctIdType }
     *     
     */
    public DeleteSvcAcctIdType getDeleteSvcAcctId() {
        return deleteSvcAcctId;
    }

    /**
     * Sets the value of the deleteSvcAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteSvcAcctIdType }
     *     
     */
    public void setDeleteSvcAcctId(DeleteSvcAcctIdType value) {
        this.deleteSvcAcctId = value;
    }

    /**
     * Gets the value of the svcAcctStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SvcAcctStatusType }
     *     
     */
    public SvcAcctStatusType getSvcAcctStatus() {
        return svcAcctStatus;
    }

    /**
     * Sets the value of the svcAcctStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcAcctStatusType }
     *     
     */
    public void setSvcAcctStatus(SvcAcctStatusType value) {
        this.svcAcctStatus = value;
    }

}
