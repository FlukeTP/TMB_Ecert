
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PmtBatchStatRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtBatchStatRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtBatchStatId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtBatchStatInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtBatchStatEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtBatchStatStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtBatchStatRec_Type", propOrder = {
    "pmtBatchStatId",
    "pmtBatchStatInfo",
    "pmtBatchStatEnvr",
    "pmtBatchStatStatus"
})
public class PmtBatchStatRecType {

    @XmlElement(name = "PmtBatchStatId", required = true)
    protected String pmtBatchStatId;
    @XmlElement(name = "PmtBatchStatInfo", required = true)
    protected PmtBatchStatInfoType pmtBatchStatInfo;
    @XmlElement(name = "PmtBatchStatEnvr")
    protected PmtBatchStatEnvrType pmtBatchStatEnvr;
    @XmlElement(name = "PmtBatchStatStatus", required = true)
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
     * Gets the value of the pmtBatchStatInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PmtBatchStatInfoType }
     *     
     */
    public PmtBatchStatInfoType getPmtBatchStatInfo() {
        return pmtBatchStatInfo;
    }

    /**
     * Sets the value of the pmtBatchStatInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtBatchStatInfoType }
     *     
     */
    public void setPmtBatchStatInfo(PmtBatchStatInfoType value) {
        this.pmtBatchStatInfo = value;
    }

    /**
     * Gets the value of the pmtBatchStatEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link PmtBatchStatEnvrType }
     *     
     */
    public PmtBatchStatEnvrType getPmtBatchStatEnvr() {
        return pmtBatchStatEnvr;
    }

    /**
     * Sets the value of the pmtBatchStatEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtBatchStatEnvrType }
     *     
     */
    public void setPmtBatchStatEnvr(PmtBatchStatEnvrType value) {
        this.pmtBatchStatEnvr = value;
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
