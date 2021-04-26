
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PmtBatchStatStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtBatchStatStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtBatchStatId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtBatchStatStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtBatchStatStatusRec_Type", propOrder = {
    "pmtBatchStatId",
    "pmtBatchStatStatus"
})
public class PmtBatchStatStatusRecType {

    @XmlElement(name = "PmtBatchStatId")
    protected String pmtBatchStatId;
    @XmlElement(name = "PmtBatchStatStatus")
    protected PmtBatchStatStatusType pmtBatchStatStatus;

    /**
     * Gets the value of the pmtBatchStatId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtBatchStatId() {
        return pmtBatchStatId;
    }

    /**
     * Sets the value of the pmtBatchStatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtBatchStatId(String value) {
        this.pmtBatchStatId = value;
    }

    /**
     * Gets the value of the pmtBatchStatStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PmtBatchStatStatusType }
     *     
     */
    public PmtBatchStatStatusType getPmtBatchStatStatus() {
        return pmtBatchStatStatus;
    }

    /**
     * Sets the value of the pmtBatchStatStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtBatchStatStatusType }
     *     
     */
    public void setPmtBatchStatStatus(PmtBatchStatStatusType value) {
        this.pmtBatchStatStatus = value;
    }

}
