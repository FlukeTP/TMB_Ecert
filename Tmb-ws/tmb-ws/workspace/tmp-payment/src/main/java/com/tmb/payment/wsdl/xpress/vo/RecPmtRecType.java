
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecPmtRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecPmtRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RecPmtId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RecPmtInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RecPmtEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RecPmtStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecPmtRec_Type", propOrder = {
    "recPmtId",
    "recPmtInfo",
    "recPmtEnvr",
    "recPmtStatus"
})
public class RecPmtRecType {

    @XmlElement(name = "RecPmtId", required = true)
    protected String recPmtId;
    @XmlElement(name = "RecPmtInfo", required = true)
    protected RecPmtInfoType recPmtInfo;
    @XmlElement(name = "RecPmtEnvr")
    protected RecPmtEnvrType recPmtEnvr;
    @XmlElement(name = "RecPmtStatus", required = true)
    protected RecPmtStatusType recPmtStatus;

    /**
     * Gets the value of the recPmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecPmtId() {
        return recPmtId;
    }

    /**
     * Sets the value of the recPmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecPmtId(String value) {
        this.recPmtId = value;
    }

    /**
     * Gets the value of the recPmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RecPmtInfoType }
     *     
     */
    public RecPmtInfoType getRecPmtInfo() {
        return recPmtInfo;
    }

    /**
     * Sets the value of the recPmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecPmtInfoType }
     *     
     */
    public void setRecPmtInfo(RecPmtInfoType value) {
        this.recPmtInfo = value;
    }

    /**
     * Gets the value of the recPmtEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link RecPmtEnvrType }
     *     
     */
    public RecPmtEnvrType getRecPmtEnvr() {
        return recPmtEnvr;
    }

    /**
     * Sets the value of the recPmtEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecPmtEnvrType }
     *     
     */
    public void setRecPmtEnvr(RecPmtEnvrType value) {
        this.recPmtEnvr = value;
    }

    /**
     * Gets the value of the recPmtStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RecPmtStatusType }
     *     
     */
    public RecPmtStatusType getRecPmtStatus() {
        return recPmtStatus;
    }

    /**
     * Sets the value of the recPmtStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecPmtStatusType }
     *     
     */
    public void setRecPmtStatus(RecPmtStatusType value) {
        this.recPmtStatus = value;
    }

}
