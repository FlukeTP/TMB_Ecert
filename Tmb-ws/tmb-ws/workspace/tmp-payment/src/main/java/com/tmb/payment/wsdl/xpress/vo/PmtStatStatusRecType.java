
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PmtStatStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtStatStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtStatId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtStatStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtStatStatusRec_Type", propOrder = {
    "pmtStatId",
    "pmtStatStatus"
})
public class PmtStatStatusRecType {

    @XmlElement(name = "PmtStatId")
    protected String pmtStatId;
    @XmlElement(name = "PmtStatStatus")
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
