
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DiscId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DiscInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DiscEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DiscStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscRec_Type", propOrder = {
    "discId",
    "discInfo",
    "discEnvr",
    "discStatus"
})
public class DiscRecType {

    @XmlElement(name = "DiscId", required = true)
    protected String discId;
    @XmlElement(name = "DiscInfo", required = true)
    protected DiscInfoType discInfo;
    @XmlElement(name = "DiscEnvr")
    protected DiscEnvrType discEnvr;
    @XmlElement(name = "DiscStatus", required = true)
    protected DiscStatusType discStatus;

    /**
     * Gets the value of the discId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscId() {
        return discId;
    }

    /**
     * Sets the value of the discId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscId(String value) {
        this.discId = value;
    }

    /**
     * Gets the value of the discInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DiscInfoType }
     *     
     */
    public DiscInfoType getDiscInfo() {
        return discInfo;
    }

    /**
     * Sets the value of the discInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscInfoType }
     *     
     */
    public void setDiscInfo(DiscInfoType value) {
        this.discInfo = value;
    }

    /**
     * Gets the value of the discEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link DiscEnvrType }
     *     
     */
    public DiscEnvrType getDiscEnvr() {
        return discEnvr;
    }

    /**
     * Sets the value of the discEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscEnvrType }
     *     
     */
    public void setDiscEnvr(DiscEnvrType value) {
        this.discEnvr = value;
    }

    /**
     * Gets the value of the discStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DiscStatusType }
     *     
     */
    public DiscStatusType getDiscStatus() {
        return discStatus;
    }

    /**
     * Sets the value of the discStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscStatusType }
     *     
     */
    public void setDiscStatus(DiscStatusType value) {
        this.discStatus = value;
    }

}
