
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PmtAthRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtAthRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtAthId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtAthInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtAthEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtAthStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtAthRec_Type", propOrder = {
    "pmtAthId",
    "pmtAthInfo",
    "pmtAthEnvr",
    "pmtAthStatus"
})
public class PmtAthRecType {

    @XmlElement(name = "PmtAthId", required = true)
    protected String pmtAthId;
    @XmlElement(name = "PmtAthInfo", required = true)
    protected PmtAthInfoType pmtAthInfo;
    @XmlElement(name = "PmtAthEnvr")
    protected PmtAthEnvrType pmtAthEnvr;
    @XmlElement(name = "PmtAthStatus", required = true)
    protected PmtAthStatusType pmtAthStatus;

    /**
     * Gets the value of the pmtAthId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtAthId() {
        return pmtAthId;
    }

    /**
     * Sets the value of the pmtAthId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtAthId(String value) {
        this.pmtAthId = value;
    }

    /**
     * Gets the value of the pmtAthInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PmtAthInfoType }
     *     
     */
    public PmtAthInfoType getPmtAthInfo() {
        return pmtAthInfo;
    }

    /**
     * Sets the value of the pmtAthInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtAthInfoType }
     *     
     */
    public void setPmtAthInfo(PmtAthInfoType value) {
        this.pmtAthInfo = value;
    }

    /**
     * Gets the value of the pmtAthEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link PmtAthEnvrType }
     *     
     */
    public PmtAthEnvrType getPmtAthEnvr() {
        return pmtAthEnvr;
    }

    /**
     * Sets the value of the pmtAthEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtAthEnvrType }
     *     
     */
    public void setPmtAthEnvr(PmtAthEnvrType value) {
        this.pmtAthEnvr = value;
    }

    /**
     * Gets the value of the pmtAthStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PmtAthStatusType }
     *     
     */
    public PmtAthStatusType getPmtAthStatus() {
        return pmtAthStatus;
    }

    /**
     * Sets the value of the pmtAthStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtAthStatusType }
     *     
     */
    public void setPmtAthStatus(PmtAthStatusType value) {
        this.pmtAthStatus = value;
    }

}
