
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PmtEnclRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtEnclRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtEnclId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtEnclInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtEnclEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtEnclStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtEnclRec_Type", propOrder = {
    "pmtEnclId",
    "pmtEnclInfo",
    "pmtEnclEnvr",
    "pmtEnclStatus"
})
public class PmtEnclRecType {

    @XmlElement(name = "PmtEnclId", required = true)
    protected String pmtEnclId;
    @XmlElement(name = "PmtEnclInfo", required = true)
    protected PmtEnclInfoType pmtEnclInfo;
    @XmlElement(name = "PmtEnclEnvr")
    protected PmtEnclEnvrType pmtEnclEnvr;
    @XmlElement(name = "PmtEnclStatus", required = true)
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
     * Gets the value of the pmtEnclInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PmtEnclInfoType }
     *     
     */
    public PmtEnclInfoType getPmtEnclInfo() {
        return pmtEnclInfo;
    }

    /**
     * Sets the value of the pmtEnclInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtEnclInfoType }
     *     
     */
    public void setPmtEnclInfo(PmtEnclInfoType value) {
        this.pmtEnclInfo = value;
    }

    /**
     * Gets the value of the pmtEnclEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link PmtEnclEnvrType }
     *     
     */
    public PmtEnclEnvrType getPmtEnclEnvr() {
        return pmtEnclEnvr;
    }

    /**
     * Sets the value of the pmtEnclEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtEnclEnvrType }
     *     
     */
    public void setPmtEnclEnvr(PmtEnclEnvrType value) {
        this.pmtEnclEnvr = value;
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
