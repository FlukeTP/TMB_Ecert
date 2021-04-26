
package com.tmb.payment.wsdl.xpress.vo;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevPlatformXfs_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevPlatformXfs_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PlatformXfsRequestId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PlatformXfsTimestamp" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PlatformXfsEventId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PlatformXfsLogicalName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PlatformXfsPhysicalName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PlatformXfsWkstName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PlatformXfsState" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PlatformXfsAppId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PlatformXfsAction" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PlatformXfsDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PlatformXfsCmdCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PlatformXfsCmdHResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevPlatformXfs_Type", propOrder = {
    "platformXfsRequestId",
    "platformXfsTimestamp",
    "platformXfsEventId",
    "platformXfsLogicalName",
    "platformXfsPhysicalName",
    "platformXfsWkstName",
    "platformXfsState",
    "platformXfsAppId",
    "platformXfsAction",
    "platformXfsDesc",
    "platformXfsCmdCode",
    "platformXfsCmdHResult"
})
public class DevPlatformXfsType {

    @XmlElement(name = "PlatformXfsRequestId")
    protected BigDecimal platformXfsRequestId;
    @XmlElement(name = "PlatformXfsTimestamp")
    protected String platformXfsTimestamp;
    @XmlElement(name = "PlatformXfsEventId")
    protected BigDecimal platformXfsEventId;
    @XmlElement(name = "PlatformXfsLogicalName")
    protected String platformXfsLogicalName;
    @XmlElement(name = "PlatformXfsPhysicalName")
    protected String platformXfsPhysicalName;
    @XmlElement(name = "PlatformXfsWkstName")
    protected String platformXfsWkstName;
    @XmlElement(name = "PlatformXfsState")
    protected BigDecimal platformXfsState;
    @XmlElement(name = "PlatformXfsAppId")
    protected String platformXfsAppId;
    @XmlElement(name = "PlatformXfsAction")
    protected BigDecimal platformXfsAction;
    @XmlElement(name = "PlatformXfsDesc")
    protected String platformXfsDesc;
    @XmlElement(name = "PlatformXfsCmdCode")
    protected BigDecimal platformXfsCmdCode;
    @XmlElement(name = "PlatformXfsCmdHResult")
    protected Long platformXfsCmdHResult;

    /**
     * Gets the value of the platformXfsRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPlatformXfsRequestId() {
        return platformXfsRequestId;
    }

    /**
     * Sets the value of the platformXfsRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPlatformXfsRequestId(BigDecimal value) {
        this.platformXfsRequestId = value;
    }

    /**
     * Gets the value of the platformXfsTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformXfsTimestamp() {
        return platformXfsTimestamp;
    }

    /**
     * Sets the value of the platformXfsTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformXfsTimestamp(String value) {
        this.platformXfsTimestamp = value;
    }

    /**
     * Gets the value of the platformXfsEventId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPlatformXfsEventId() {
        return platformXfsEventId;
    }

    /**
     * Sets the value of the platformXfsEventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPlatformXfsEventId(BigDecimal value) {
        this.platformXfsEventId = value;
    }

    /**
     * Gets the value of the platformXfsLogicalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformXfsLogicalName() {
        return platformXfsLogicalName;
    }

    /**
     * Sets the value of the platformXfsLogicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformXfsLogicalName(String value) {
        this.platformXfsLogicalName = value;
    }

    /**
     * Gets the value of the platformXfsPhysicalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformXfsPhysicalName() {
        return platformXfsPhysicalName;
    }

    /**
     * Sets the value of the platformXfsPhysicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformXfsPhysicalName(String value) {
        this.platformXfsPhysicalName = value;
    }

    /**
     * Gets the value of the platformXfsWkstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformXfsWkstName() {
        return platformXfsWkstName;
    }

    /**
     * Sets the value of the platformXfsWkstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformXfsWkstName(String value) {
        this.platformXfsWkstName = value;
    }

    /**
     * Gets the value of the platformXfsState property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPlatformXfsState() {
        return platformXfsState;
    }

    /**
     * Sets the value of the platformXfsState property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPlatformXfsState(BigDecimal value) {
        this.platformXfsState = value;
    }

    /**
     * Gets the value of the platformXfsAppId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformXfsAppId() {
        return platformXfsAppId;
    }

    /**
     * Sets the value of the platformXfsAppId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformXfsAppId(String value) {
        this.platformXfsAppId = value;
    }

    /**
     * Gets the value of the platformXfsAction property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPlatformXfsAction() {
        return platformXfsAction;
    }

    /**
     * Sets the value of the platformXfsAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPlatformXfsAction(BigDecimal value) {
        this.platformXfsAction = value;
    }

    /**
     * Gets the value of the platformXfsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformXfsDesc() {
        return platformXfsDesc;
    }

    /**
     * Sets the value of the platformXfsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformXfsDesc(String value) {
        this.platformXfsDesc = value;
    }

    /**
     * Gets the value of the platformXfsCmdCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPlatformXfsCmdCode() {
        return platformXfsCmdCode;
    }

    /**
     * Sets the value of the platformXfsCmdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPlatformXfsCmdCode(BigDecimal value) {
        this.platformXfsCmdCode = value;
    }

    /**
     * Gets the value of the platformXfsCmdHResult property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlatformXfsCmdHResult() {
        return platformXfsCmdHResult;
    }

    /**
     * Sets the value of the platformXfsCmdHResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlatformXfsCmdHResult(Long value) {
        this.platformXfsCmdHResult = value;
    }

}
