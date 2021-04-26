
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PmtStatRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtStatRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtStatId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtStatInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtStatEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtStatStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtStatRec_Type", propOrder = {
    "pmtStatId",
    "pmtStatInfo",
    "pmtStatEnvr",
    "pmtStatStatus"
})
public class PmtStatRecType {

    @XmlElement(name = "PmtStatId", required = true)
    protected String pmtStatId;
    @XmlElement(name = "PmtStatInfo", required = true)
    protected PmtStatInfoType pmtStatInfo;
    @XmlElement(name = "PmtStatEnvr")
    protected PmtStatEnvrType pmtStatEnvr;
    @XmlElement(name = "PmtStatStatus", required = true)
    protected PmtStatStatusType pmtStatStatus;

    /**
     * Gets the value of the pmtStatId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtStatId() {
        return pmtStatId;
    }

    /**
     * Sets the value of the pmtStatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtStatId(String value) {
        this.pmtStatId = value;
    }

    /**
     * Gets the value of the pmtStatInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PmtStatInfoType }
     *     
     */
    public PmtStatInfoType getPmtStatInfo() {
        return pmtStatInfo;
    }

    /**
     * Sets the value of the pmtStatInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtStatInfoType }
     *     
     */
    public void setPmtStatInfo(PmtStatInfoType value) {
        this.pmtStatInfo = value;
    }

    /**
     * Gets the value of the pmtStatEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link PmtStatEnvrType }
     *     
     */
    public PmtStatEnvrType getPmtStatEnvr() {
        return pmtStatEnvr;
    }

    /**
     * Sets the value of the pmtStatEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtStatEnvrType }
     *     
     */
    public void setPmtStatEnvr(PmtStatEnvrType value) {
        this.pmtStatEnvr = value;
    }

    /**
     * Gets the value of the pmtStatStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PmtStatStatusType }
     *     
     */
    public PmtStatStatusType getPmtStatStatus() {
        return pmtStatStatus;
    }

    /**
     * Sets the value of the pmtStatStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtStatStatusType }
     *     
     */
    public void setPmtStatStatus(PmtStatStatusType value) {
        this.pmtStatStatus = value;
    }

}
