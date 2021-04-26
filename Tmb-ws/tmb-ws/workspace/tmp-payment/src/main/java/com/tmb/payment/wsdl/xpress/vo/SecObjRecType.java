
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecObjRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecObjRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecObjId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecObjInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecObjEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecObjStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecObjRec_Type", propOrder = {
    "secObjId",
    "secObjInfo",
    "secObjEnvr",
    "secObjStatus"
})
public class SecObjRecType {

    @XmlElement(name = "SecObjId", required = true)
    protected String secObjId;
    @XmlElement(name = "SecObjInfo", required = true)
    protected SecObjInfoType secObjInfo;
    @XmlElement(name = "SecObjEnvr")
    protected SecObjEnvrType secObjEnvr;
    @XmlElement(name = "SecObjStatus", required = true)
    protected SecObjStatusType secObjStatus;

    /**
     * Gets the value of the secObjId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecObjId() {
        return secObjId;
    }

    /**
     * Sets the value of the secObjId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecObjId(String value) {
        this.secObjId = value;
    }

    /**
     * Gets the value of the secObjInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SecObjInfoType }
     *     
     */
    public SecObjInfoType getSecObjInfo() {
        return secObjInfo;
    }

    /**
     * Sets the value of the secObjInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecObjInfoType }
     *     
     */
    public void setSecObjInfo(SecObjInfoType value) {
        this.secObjInfo = value;
    }

    /**
     * Gets the value of the secObjEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link SecObjEnvrType }
     *     
     */
    public SecObjEnvrType getSecObjEnvr() {
        return secObjEnvr;
    }

    /**
     * Sets the value of the secObjEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecObjEnvrType }
     *     
     */
    public void setSecObjEnvr(SecObjEnvrType value) {
        this.secObjEnvr = value;
    }

    /**
     * Gets the value of the secObjStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SecObjStatusType }
     *     
     */
    public SecObjStatusType getSecObjStatus() {
        return secObjStatus;
    }

    /**
     * Sets the value of the secObjStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecObjStatusType }
     *     
     */
    public void setSecObjStatus(SecObjStatusType value) {
        this.secObjStatus = value;
    }

}
