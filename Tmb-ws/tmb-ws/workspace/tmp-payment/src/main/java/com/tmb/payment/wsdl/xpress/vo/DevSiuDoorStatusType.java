
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevSiuDoorStatus_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevSiuDoorStatus_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuCabinet"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuSafe"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuVandalShield"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevSiuDoorStatus_Type", propOrder = {
    "devSiuCabinet",
    "devSiuSafe",
    "devSiuVandalShield"
})
public class DevSiuDoorStatusType {

    @XmlElement(name = "DevSiuCabinet", required = true)
    protected String devSiuCabinet;
    @XmlElement(name = "DevSiuSafe", required = true)
    protected String devSiuSafe;
    @XmlElement(name = "DevSiuVandalShield", required = true)
    protected String devSiuVandalShield;

    /**
     * Gets the value of the devSiuCabinet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevSiuCabinet() {
        return devSiuCabinet;
    }

    /**
     * Sets the value of the devSiuCabinet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevSiuCabinet(String value) {
        this.devSiuCabinet = value;
    }

    /**
     * Gets the value of the devSiuSafe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevSiuSafe() {
        return devSiuSafe;
    }

    /**
     * Sets the value of the devSiuSafe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevSiuSafe(String value) {
        this.devSiuSafe = value;
    }

    /**
     * Gets the value of the devSiuVandalShield property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevSiuVandalShield() {
        return devSiuVandalShield;
    }

    /**
     * Sets the value of the devSiuVandalShield property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevSiuVandalShield(String value) {
        this.devSiuVandalShield = value;
    }

}
