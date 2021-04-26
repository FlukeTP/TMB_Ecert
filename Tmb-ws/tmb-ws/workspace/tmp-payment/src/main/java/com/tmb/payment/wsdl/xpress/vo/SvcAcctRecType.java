
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SvcAcctRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SvcAcctRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}delete.SvcAcctId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SvcAcctInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SvcAcctEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SvcAcctStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SvcAcctRec_Type", propOrder = {
    "deleteSvcAcctId",
    "svcAcctInfo",
    "svcAcctEnvr",
    "svcAcctStatus"
})
public class SvcAcctRecType {

    @XmlElement(name = "delete.SvcAcctId", required = true)
    protected DeleteSvcAcctIdType deleteSvcAcctId;
    @XmlElement(name = "SvcAcctInfo", required = true)
    protected SvcAcctInfoType svcAcctInfo;
    @XmlElement(name = "SvcAcctEnvr")
    protected SvcAcctEnvrType svcAcctEnvr;
    @XmlElement(name = "SvcAcctStatus", required = true)
    protected SvcAcctStatusType svcAcctStatus;

    /**
     * Gets the value of the deleteSvcAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteSvcAcctIdType }
     *     
     */
    public DeleteSvcAcctIdType getDeleteSvcAcctId() {
        return deleteSvcAcctId;
    }

    /**
     * Sets the value of the deleteSvcAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteSvcAcctIdType }
     *     
     */
    public void setDeleteSvcAcctId(DeleteSvcAcctIdType value) {
        this.deleteSvcAcctId = value;
    }

    /**
     * Gets the value of the svcAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SvcAcctInfoType }
     *     
     */
    public SvcAcctInfoType getSvcAcctInfo() {
        return svcAcctInfo;
    }

    /**
     * Sets the value of the svcAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcAcctInfoType }
     *     
     */
    public void setSvcAcctInfo(SvcAcctInfoType value) {
        this.svcAcctInfo = value;
    }

    /**
     * Gets the value of the svcAcctEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link SvcAcctEnvrType }
     *     
     */
    public SvcAcctEnvrType getSvcAcctEnvr() {
        return svcAcctEnvr;
    }

    /**
     * Sets the value of the svcAcctEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcAcctEnvrType }
     *     
     */
    public void setSvcAcctEnvr(SvcAcctEnvrType value) {
        this.svcAcctEnvr = value;
    }

    /**
     * Gets the value of the svcAcctStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SvcAcctStatusType }
     *     
     */
    public SvcAcctStatusType getSvcAcctStatus() {
        return svcAcctStatus;
    }

    /**
     * Sets the value of the svcAcctStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcAcctStatusType }
     *     
     */
    public void setSvcAcctStatus(SvcAcctStatusType value) {
        this.svcAcctStatus = value;
    }

}
