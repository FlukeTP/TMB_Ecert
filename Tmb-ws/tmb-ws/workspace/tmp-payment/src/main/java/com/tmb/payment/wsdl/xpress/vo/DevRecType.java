
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevRec_Type", propOrder = {
    "devId",
    "devInfo",
    "devEnvr",
    "devStatus"
})
public class DevRecType {

    @XmlElement(name = "DevId", required = true)
    protected String devId;
    @XmlElement(name = "DevInfo", required = true)
    protected DevInfoType devInfo;
    @XmlElement(name = "DevEnvr")
    protected DevEnvrType devEnvr;
    @XmlElement(name = "DevStatus", required = true)
    protected DevStatusType devStatus;

    /**
     * Gets the value of the devId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevId() {
        return devId;
    }

    /**
     * Sets the value of the devId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevId(String value) {
        this.devId = value;
    }

    /**
     * Gets the value of the devInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DevInfoType }
     *     
     */
    public DevInfoType getDevInfo() {
        return devInfo;
    }

    /**
     * Sets the value of the devInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevInfoType }
     *     
     */
    public void setDevInfo(DevInfoType value) {
        this.devInfo = value;
    }

    /**
     * Gets the value of the devEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link DevEnvrType }
     *     
     */
    public DevEnvrType getDevEnvr() {
        return devEnvr;
    }

    /**
     * Sets the value of the devEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevEnvrType }
     *     
     */
    public void setDevEnvr(DevEnvrType value) {
        this.devEnvr = value;
    }

    /**
     * Gets the value of the devStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DevStatusType }
     *     
     */
    public DevStatusType getDevStatus() {
        return devStatus;
    }

    /**
     * Sets the value of the devStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevStatusType }
     *     
     */
    public void setDevStatus(DevStatusType value) {
        this.devStatus = value;
    }

}
