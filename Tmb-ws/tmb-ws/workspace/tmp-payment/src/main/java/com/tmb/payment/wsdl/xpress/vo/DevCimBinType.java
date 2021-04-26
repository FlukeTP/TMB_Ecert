
package com.tmb.payment.wsdl.xpress.vo;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevCimBin_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevCimBin_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCimBinNum"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCimBinType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCimBinStatus"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCimBinCurCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCimBinDenomination" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCimBinCount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCimBinMaxCount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevCimBin_Type", propOrder = {
    "devCimBinNum",
    "devCimBinType",
    "devCimBinStatus",
    "devCimBinCurCode",
    "devCimBinDenomination",
    "devCimBinCount",
    "devCimBinMaxCount"
})
public class DevCimBinType {

    @XmlElement(name = "DevCimBinNum")
    protected long devCimBinNum;
    @XmlElement(name = "DevCimBinType", required = true)
    protected String devCimBinType;
    @XmlElement(name = "DevCimBinStatus", required = true)
    @XmlSchemaType(name = "string")
    protected DevCimBinStatusType devCimBinStatus;
    @XmlElement(name = "DevCimBinCurCode")
    protected DevCimBinCurCodeType devCimBinCurCode;
    @XmlElement(name = "DevCimBinDenomination")
    protected BigDecimal devCimBinDenomination;
    @XmlElement(name = "DevCimBinCount")
    protected Long devCimBinCount;
    @XmlElement(name = "DevCimBinMaxCount")
    protected Long devCimBinMaxCount;

    /**
     * Gets the value of the devCimBinNum property.
     * 
     */
    public long getDevCimBinNum() {
        return devCimBinNum;
    }

    /**
     * Sets the value of the devCimBinNum property.
     * 
     */
    public void setDevCimBinNum(long value) {
        this.devCimBinNum = value;
    }

    /**
     * Gets the value of the devCimBinType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevCimBinType() {
        return devCimBinType;
    }

    /**
     * Sets the value of the devCimBinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevCimBinType(String value) {
        this.devCimBinType = value;
    }

    /**
     * Gets the value of the devCimBinStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DevCimBinStatusType }
     *     
     */
    public DevCimBinStatusType getDevCimBinStatus() {
        return devCimBinStatus;
    }

    /**
     * Sets the value of the devCimBinStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevCimBinStatusType }
     *     
     */
    public void setDevCimBinStatus(DevCimBinStatusType value) {
        this.devCimBinStatus = value;
    }

    /**
     * Gets the value of the devCimBinCurCode property.
     * 
     * @return
     *     possible object is
     *     {@link DevCimBinCurCodeType }
     *     
     */
    public DevCimBinCurCodeType getDevCimBinCurCode() {
        return devCimBinCurCode;
    }

    /**
     * Sets the value of the devCimBinCurCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevCimBinCurCodeType }
     *     
     */
    public void setDevCimBinCurCode(DevCimBinCurCodeType value) {
        this.devCimBinCurCode = value;
    }

    /**
     * Gets the value of the devCimBinDenomination property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDevCimBinDenomination() {
        return devCimBinDenomination;
    }

    /**
     * Sets the value of the devCimBinDenomination property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDevCimBinDenomination(BigDecimal value) {
        this.devCimBinDenomination = value;
    }

    /**
     * Gets the value of the devCimBinCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDevCimBinCount() {
        return devCimBinCount;
    }

    /**
     * Sets the value of the devCimBinCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDevCimBinCount(Long value) {
        this.devCimBinCount = value;
    }

    /**
     * Gets the value of the devCimBinMaxCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDevCimBinMaxCount() {
        return devCimBinMaxCount;
    }

    /**
     * Sets the value of the devCimBinMaxCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDevCimBinMaxCount(Long value) {
        this.devCimBinMaxCount = value;
    }

}
