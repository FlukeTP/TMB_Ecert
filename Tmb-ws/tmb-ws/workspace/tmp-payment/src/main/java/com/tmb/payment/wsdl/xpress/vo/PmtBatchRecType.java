
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PmtBatchRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtBatchRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtBatchId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtBatchInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtBatchEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtBatchStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtBatchRec_Type", propOrder = {
    "pmtBatchId",
    "pmtBatchInfo",
    "pmtBatchEnvr",
    "pmtBatchStatus"
})
public class PmtBatchRecType {

    @XmlElement(name = "PmtBatchId", required = true)
    protected String pmtBatchId;
    @XmlElement(name = "PmtBatchInfo", required = true)
    protected PmtBatchInfoType pmtBatchInfo;
    @XmlElement(name = "PmtBatchEnvr")
    protected PmtBatchEnvrType pmtBatchEnvr;
    @XmlElement(name = "PmtBatchStatus", required = true)
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
     * Gets the value of the pmtBatchInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PmtBatchInfoType }
     *     
     */
    public PmtBatchInfoType getPmtBatchInfo() {
        return pmtBatchInfo;
    }

    /**
     * Sets the value of the pmtBatchInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtBatchInfoType }
     *     
     */
    public void setPmtBatchInfo(PmtBatchInfoType value) {
        this.pmtBatchInfo = value;
    }

    /**
     * Gets the value of the pmtBatchEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link PmtBatchEnvrType }
     *     
     */
    public PmtBatchEnvrType getPmtBatchEnvr() {
        return pmtBatchEnvr;
    }

    /**
     * Sets the value of the pmtBatchEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtBatchEnvrType }
     *     
     */
    public void setPmtBatchEnvr(PmtBatchEnvrType value) {
        this.pmtBatchEnvr = value;
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
