
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaAcctRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaAcctRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SvcIdent" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}MediaAcctId"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}MediaAcctKeys"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MediaAcctInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MediaAcctEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MediaAcctAuth" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MediaAcctStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaAcctRec_Type", propOrder = {
    "svcIdent",
    "mediaAcctId",
    "mediaAcctKeys",
    "mediaAcctInfo",
    "mediaAcctEnvr",
    "mediaAcctAuth",
    "mediaAcctStatus"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.MediaAcctRecType.class
})
public class MediaAcctRecType {

    @XmlElement(name = "SvcIdent")
    protected String svcIdent;
    @XmlElement(name = "MediaAcctId")
    protected String mediaAcctId;
    @XmlElement(name = "MediaAcctKeys")
    protected MediaAcctKeysType mediaAcctKeys;
    @XmlElement(name = "MediaAcctInfo", required = true)
    protected MediaAcctInfoType mediaAcctInfo;
    @XmlElement(name = "MediaAcctEnvr")
    protected MediaAcctEnvrType mediaAcctEnvr;
    @XmlElement(name = "MediaAcctAuth")
    protected MediaAcctAuthType mediaAcctAuth;
    @XmlElement(name = "MediaAcctStatus", required = true)
    protected MediaAcctStatusType mediaAcctStatus;

    /**
     * Gets the value of the svcIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcIdent() {
        return svcIdent;
    }

    /**
     * Sets the value of the svcIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcIdent(String value) {
        this.svcIdent = value;
    }

    /**
     * Gets the value of the mediaAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaAcctId() {
        return mediaAcctId;
    }

    /**
     * Sets the value of the mediaAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaAcctId(String value) {
        this.mediaAcctId = value;
    }

    /**
     * Gets the value of the mediaAcctKeys property.
     * 
     * @return
     *     possible object is
     *     {@link MediaAcctKeysType }
     *     
     */
    public MediaAcctKeysType getMediaAcctKeys() {
        return mediaAcctKeys;
    }

    /**
     * Sets the value of the mediaAcctKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaAcctKeysType }
     *     
     */
    public void setMediaAcctKeys(MediaAcctKeysType value) {
        this.mediaAcctKeys = value;
    }

    /**
     * Gets the value of the mediaAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MediaAcctInfoType }
     *     
     */
    public MediaAcctInfoType getMediaAcctInfo() {
        return mediaAcctInfo;
    }

    /**
     * Sets the value of the mediaAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaAcctInfoType }
     *     
     */
    public void setMediaAcctInfo(MediaAcctInfoType value) {
        this.mediaAcctInfo = value;
    }

    /**
     * Gets the value of the mediaAcctEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link MediaAcctEnvrType }
     *     
     */
    public MediaAcctEnvrType getMediaAcctEnvr() {
        return mediaAcctEnvr;
    }

    /**
     * Sets the value of the mediaAcctEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaAcctEnvrType }
     *     
     */
    public void setMediaAcctEnvr(MediaAcctEnvrType value) {
        this.mediaAcctEnvr = value;
    }

    /**
     * Gets the value of the mediaAcctAuth property.
     * 
     * @return
     *     possible object is
     *     {@link MediaAcctAuthType }
     *     
     */
    public MediaAcctAuthType getMediaAcctAuth() {
        return mediaAcctAuth;
    }

    /**
     * Sets the value of the mediaAcctAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaAcctAuthType }
     *     
     */
    public void setMediaAcctAuth(MediaAcctAuthType value) {
        this.mediaAcctAuth = value;
    }

    /**
     * Gets the value of the mediaAcctStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MediaAcctStatusType }
     *     
     */
    public MediaAcctStatusType getMediaAcctStatus() {
        return mediaAcctStatus;
    }

    /**
     * Sets the value of the mediaAcctStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaAcctStatusType }
     *     
     */
    public void setMediaAcctStatus(MediaAcctStatusType value) {
        this.mediaAcctStatus = value;
    }

}
