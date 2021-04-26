
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompRemitStmtRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompRemitStmtRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CompRemitStmtId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CompRemitStmtInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CompRemitStmtEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CompRemitStmtStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompRemitStmtRec_Type", propOrder = {
    "compRemitStmtId",
    "compRemitStmtInfo",
    "compRemitStmtEnvr",
    "compRemitStmtStatus"
})
public class CompRemitStmtRecType {

    @XmlElement(name = "CompRemitStmtId", required = true)
    protected String compRemitStmtId;
    @XmlElement(name = "CompRemitStmtInfo", required = true)
    protected CompRemitStmtInfoType compRemitStmtInfo;
    @XmlElement(name = "CompRemitStmtEnvr")
    protected CompRemitStmtEnvrType compRemitStmtEnvr;
    @XmlElement(name = "CompRemitStmtStatus", required = true)
    protected CompRemitStmtStatusType compRemitStmtStatus;

    /**
     * Gets the value of the compRemitStmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompRemitStmtId() {
        return compRemitStmtId;
    }

    /**
     * Sets the value of the compRemitStmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompRemitStmtId(String value) {
        this.compRemitStmtId = value;
    }

    /**
     * Gets the value of the compRemitStmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CompRemitStmtInfoType }
     *     
     */
    public CompRemitStmtInfoType getCompRemitStmtInfo() {
        return compRemitStmtInfo;
    }

    /**
     * Sets the value of the compRemitStmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompRemitStmtInfoType }
     *     
     */
    public void setCompRemitStmtInfo(CompRemitStmtInfoType value) {
        this.compRemitStmtInfo = value;
    }

    /**
     * Gets the value of the compRemitStmtEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link CompRemitStmtEnvrType }
     *     
     */
    public CompRemitStmtEnvrType getCompRemitStmtEnvr() {
        return compRemitStmtEnvr;
    }

    /**
     * Sets the value of the compRemitStmtEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompRemitStmtEnvrType }
     *     
     */
    public void setCompRemitStmtEnvr(CompRemitStmtEnvrType value) {
        this.compRemitStmtEnvr = value;
    }

    /**
     * Gets the value of the compRemitStmtStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CompRemitStmtStatusType }
     *     
     */
    public CompRemitStmtStatusType getCompRemitStmtStatus() {
        return compRemitStmtStatus;
    }

    /**
     * Sets the value of the compRemitStmtStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompRemitStmtStatusType }
     *     
     */
    public void setCompRemitStmtStatus(CompRemitStmtStatusType value) {
        this.compRemitStmtStatus = value;
    }

}
