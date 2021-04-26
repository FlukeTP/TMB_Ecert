
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaAcctStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaAcctStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SvcIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MediaAcctKeys"/&gt;
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
@XmlType(name = "MediaAcctStatusRec_Type", propOrder = {
    "svcIdent",
    "mediaAcctKeys",
    "mediaAcctStatus"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.MediaAcctStatusRecType.class
})
public class MediaAcctStatusRecType {

    @XmlElement(name = "SvcIdent")
    protected String svcIdent;
    @XmlElement(name = "MediaAcctKeys", required = true)
    protected MediaAcctKeysType mediaAcctKeys;
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
