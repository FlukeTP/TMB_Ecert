
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PmtAthStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtAthStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtAthId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtAthStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtAthStatusRec_Type", propOrder = {
    "pmtAthId",
    "pmtAthStatus"
})
public class PmtAthStatusRecType {

    @XmlElement(name = "PmtAthId")
    protected String pmtAthId;
    @XmlElement(name = "PmtAthStatus")
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
