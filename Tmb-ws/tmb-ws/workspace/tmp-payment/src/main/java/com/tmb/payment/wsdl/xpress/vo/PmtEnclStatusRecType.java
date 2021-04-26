
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PmtEnclStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtEnclStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtEnclId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtEnclStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtEnclStatusRec_Type", propOrder = {
    "pmtEnclId",
    "pmtEnclStatus"
})
public class PmtEnclStatusRecType {

    @XmlElement(name = "PmtEnclId")
    protected String pmtEnclId;
    @XmlElement(name = "PmtEnclStatus")
    protected PmtEnclStatusType pmtEnclStatus;

    /**
     * Gets the value of the pmtEnclId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtEnclId() {
        return pmtEnclId;
    }

    /**
     * Sets the value of the pmtEnclId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtEnclId(String value) {
        this.pmtEnclId = value;
    }

    /**
     * Gets the value of the pmtEnclStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PmtEnclStatusType }
     *     
     */
    public PmtEnclStatusType getPmtEnclStatus() {
        return pmtEnclStatus;
    }

    /**
     * Sets the value of the pmtEnclStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtEnclStatusType }
     *     
     */
    public void setPmtEnclStatus(PmtEnclStatusType value) {
        this.pmtEnclStatus = value;
    }

}
