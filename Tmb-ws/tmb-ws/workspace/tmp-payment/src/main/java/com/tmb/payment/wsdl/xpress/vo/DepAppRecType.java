
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepAppRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepAppRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DepAppId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DepAppInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DepAppEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DepAppStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepAppRec_Type", propOrder = {
    "depAppId",
    "depAppInfo",
    "depAppEnvr",
    "depAppStatus"
})
public class DepAppRecType {

    @XmlElement(name = "DepAppId", required = true)
    protected String depAppId;
    @XmlElement(name = "DepAppInfo", required = true)
    protected DepAppInfoType depAppInfo;
    @XmlElement(name = "DepAppEnvr")
    protected DepAppEnvrType depAppEnvr;
    @XmlElement(name = "DepAppStatus", required = true)
    protected DepAppStatusType depAppStatus;

    /**
     * Gets the value of the depAppId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepAppId() {
        return depAppId;
    }

    /**
     * Sets the value of the depAppId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepAppId(String value) {
        this.depAppId = value;
    }

    /**
     * Gets the value of the depAppInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DepAppInfoType }
     *     
     */
    public DepAppInfoType getDepAppInfo() {
        return depAppInfo;
    }

    /**
     * Sets the value of the depAppInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAppInfoType }
     *     
     */
    public void setDepAppInfo(DepAppInfoType value) {
        this.depAppInfo = value;
    }

    /**
     * Gets the value of the depAppEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link DepAppEnvrType }
     *     
     */
    public DepAppEnvrType getDepAppEnvr() {
        return depAppEnvr;
    }

    /**
     * Sets the value of the depAppEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAppEnvrType }
     *     
     */
    public void setDepAppEnvr(DepAppEnvrType value) {
        this.depAppEnvr = value;
    }

    /**
     * Gets the value of the depAppStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DepAppStatusType }
     *     
     */
    public DepAppStatusType getDepAppStatus() {
        return depAppStatus;
    }

    /**
     * Sets the value of the depAppStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAppStatusType }
     *     
     */
    public void setDepAppStatus(DepAppStatusType value) {
        this.depAppStatus = value;
    }

}
