
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PmtBatchStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtBatchStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtBatchId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtBatchStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtBatchStatusRec_Type", propOrder = {
    "pmtBatchId",
    "pmtBatchStatus"
})
public class PmtBatchStatusRecType {

    @XmlElement(name = "PmtBatchId")
    protected String pmtBatchId;
    @XmlElement(name = "PmtBatchStatus")
    protected PmtBatchStatusType pmtBatchStatus;

    /**
     * Gets the value of the pmtBatchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtBatchId() {
        return pmtBatchId;
    }

    /**
     * Sets the value of the pmtBatchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtBatchId(String value) {
        this.pmtBatchId = value;
    }

    /**
     * Gets the value of the pmtBatchStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PmtBatchStatusType }
     *     
     */
    public PmtBatchStatusType getPmtBatchStatus() {
        return pmtBatchStatus;
    }

    /**
     * Sets the value of the pmtBatchStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtBatchStatusType }
     *     
     */
    public void setPmtBatchStatus(PmtBatchStatusType value) {
        this.pmtBatchStatus = value;
    }

}
