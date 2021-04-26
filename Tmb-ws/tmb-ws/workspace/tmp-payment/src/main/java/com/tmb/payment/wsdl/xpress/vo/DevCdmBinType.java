
package com.tmb.payment.wsdl.xpress.vo;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevCdmBin_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevCdmBin_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCdmBinNum"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCdmBinType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCdmBinStatus"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCdmBinMedia"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCdmBinCurCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCdmBinDenomination" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCdmBinCount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCdmBinMaxCount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevCdmBin_Type", propOrder = {
    "devCdmBinNum",
    "devCdmBinType",
    "devCdmBinStatus",
    "devCdmBinMedia",
    "devCdmBinCurCode",
    "devCdmBinDenomination",
    "devCdmBinCount",
    "devCdmBinMaxCount"
})
public class DevCdmBinType {

    @XmlElement(name = "DevCdmBinNum")
    protected long devCdmBinNum;
    @XmlElement(name = "DevCdmBinType", required = true)
    protected String devCdmBinType;
    @XmlElement(name = "DevCdmBinStatus", required = true)
    @XmlSchemaType(name = "string")
    protected DevCdmBinStatusType devCdmBinStatus;
    @XmlElement(name = "DevCdmBinMedia", required = true)
    @XmlSchemaType(name = "string")
    protected DevCdmBinMediaType devCdmBinMedia;
    @XmlElement(name = "DevCdmBinCurCode")
    protected DevCdmBinCurCodeType devCdmBinCurCode;
    @XmlElement(name = "DevCdmBinDenomination")
    protected BigDecimal devCdmBinDenomination;
    @XmlElement(name = "DevCdmBinCount")
    protected Long devCdmBinCount;
    @XmlElement(name = "DevCdmBinMaxCount")
    protected Long devCdmBinMaxCount;

    /**
     * Gets the value of the devCdmBinNum property.
     * 
     */
    public long getDevCdmBinNum() {
        return devCdmBinNum;
    }

    /**
     * Sets the value of the devCdmBinNum property.
     * 
     */
    public void setDevCdmBinNum(long value) {
        this.devCdmBinNum = value;
    }

    /**
     * Gets the value of the devCdmBinType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevCdmBinType() {
        return devCdmBinType;
    }

    /**
     * Sets the value of the devCdmBinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevCdmBinType(String value) {
        this.devCdmBinType = value;
    }

    /**
     * Gets the value of the devCdmBinStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DevCdmBinStatusType }
     *     
     */
    public DevCdmBinStatusType getDevCdmBinStatus() {
        return devCdmBinStatus;
    }

    /**
     * Sets the value of the devCdmBinStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevCdmBinStatusType }
     *     
     */
    public void setDevCdmBinStatus(DevCdmBinStatusType value) {
        this.devCdmBinStatus = value;
    }

    /**
     * Gets the value of the devCdmBinMedia property.
     * 
     * @return
     *     possible object is
     *     {@link DevCdmBinMediaType }
     *     
     */
    public DevCdmBinMediaType getDevCdmBinMedia() {
        return devCdmBinMedia;
    }

    /**
     * Sets the value of the devCdmBinMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevCdmBinMediaType }
     *     
     */
    public void setDevCdmBinMedia(DevCdmBinMediaType value) {
        this.devCdmBinMedia = value;
    }

    /**
     * Gets the value of the devCdmBinCurCode property.
     * 
     * @return
     *     possible object is
     *     {@link DevCdmBinCurCodeType }
     *     
     */
    public DevCdmBinCurCodeType getDevCdmBinCurCode() {
        return devCdmBinCurCode;
    }

    /**
     * Sets the value of the devCdmBinCurCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevCdmBinCurCodeType }
     *     
     */
    public void setDevCdmBinCurCode(DevCdmBinCurCodeType value) {
        this.devCdmBinCurCode = value;
    }

    /**
     * Gets the value of the devCdmBinDenomination property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDevCdmBinDenomination() {
        return devCdmBinDenomination;
    }

    /**
     * Sets the value of the devCdmBinDenomination property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDevCdmBinDenomination(BigDecimal value) {
        this.devCdmBinDenomination = value;
    }

    /**
     * Gets the value of the devCdmBinCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDevCdmBinCount() {
        return devCdmBinCount;
    }

    /**
     * Sets the value of the devCdmBinCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDevCdmBinCount(Long value) {
        this.devCdmBinCount = value;
    }

    /**
     * Gets the value of the devCdmBinMaxCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDevCdmBinMaxCount() {
        return devCdmBinMaxCount;
    }

    /**
     * Sets the value of the devCdmBinMaxCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDevCdmBinMaxCount(Long value) {
        this.devCdmBinMaxCount = value;
    }

}
