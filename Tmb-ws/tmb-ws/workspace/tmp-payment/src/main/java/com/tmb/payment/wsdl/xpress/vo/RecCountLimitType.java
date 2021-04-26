
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecCountLimit_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecCountLimit_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}LimitPosition" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MaxRecLimit" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurRecLimit" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecCountLimit_Type", propOrder = {
    "limitPosition",
    "maxRecLimit",
    "curRecLimit"
})
public class RecCountLimitType {

    @XmlElement(name = "LimitPosition")
    protected String limitPosition;
    @XmlElement(name = "MaxRecLimit")
    protected Long maxRecLimit;
    @XmlElement(name = "CurRecLimit")
    protected Long curRecLimit;

    /**
     * Gets the value of the limitPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitPosition() {
        return limitPosition;
    }

    /**
     * Sets the value of the limitPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitPosition(String value) {
        this.limitPosition = value;
    }

    /**
     * Gets the value of the maxRecLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxRecLimit() {
        return maxRecLimit;
    }

    /**
     * Sets the value of the maxRecLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxRecLimit(Long value) {
        this.maxRecLimit = value;
    }

    /**
     * Gets the value of the curRecLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurRecLimit() {
        return curRecLimit;
    }

    /**
     * Sets the value of the curRecLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurRecLimit(Long value) {
        this.curRecLimit = value;
    }

}
