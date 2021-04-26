
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevSiuSensorStatus_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevSiuSensorStatus_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuOperatorSwitch" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuTamper"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuIntTamper" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuSeismic"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuHeat"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuProximity"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuAmbientLight"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuEnhancedAudio" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevSiuSensorStatus_Type", propOrder = {
    "devSiuOperatorSwitch",
    "devSiuTamper",
    "devSiuIntTamper",
    "devSiuSeismic",
    "devSiuHeat",
    "devSiuProximity",
    "devSiuAmbientLight",
    "devSiuEnhancedAudio"
})
public class DevSiuSensorStatusType {

    @XmlElement(name = "DevSiuOperatorSwitch")
    protected String devSiuOperatorSwitch;
    @XmlElement(name = "DevSiuTamper", required = true)
    protected String devSiuTamper;
    @XmlElement(name = "DevSiuIntTamper")
    protected String devSiuIntTamper;
    @XmlElement(name = "DevSiuSeismic", required = true)
    protected String devSiuSeismic;
    @XmlElement(name = "DevSiuHeat", required = true)
    protected String devSiuHeat;
    @XmlElement(name = "DevSiuProximity", required = true)
    protected String devSiuProximity;
    @XmlElement(name = "DevSiuAmbientLight", required = true)
    protected String devSiuAmbientLight;
    @XmlElement(name = "DevSiuEnhancedAudio")
    protected String devSiuEnhancedAudio;

    /**
     * Gets the value of the devSiuOperatorSwitch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevSiuOperatorSwitch() {
        return devSiuOperatorSwitch;
    }

    /**
     * Sets the value of the devSiuOperatorSwitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevSiuOperatorSwitch(String value) {
        this.devSiuOperatorSwitch = value;
    }

    /**
     * Gets the value of the devSiuTamper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevSiuTamper() {
        return devSiuTamper;
    }

    /**
     * Sets the value of the devSiuTamper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevSiuTamper(String value) {
        this.devSiuTamper = value;
    }

    /**
     * Gets the value of the devSiuIntTamper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevSiuIntTamper() {
        return devSiuIntTamper;
    }

    /**
     * Sets the value of the devSiuIntTamper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevSiuIntTamper(String value) {
        this.devSiuIntTamper = value;
    }

    /**
     * Gets the value of the devSiuSeismic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevSiuSeismic() {
        return devSiuSeismic;
    }

    /**
     * Sets the value of the devSiuSeismic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevSiuSeismic(String value) {
        this.devSiuSeismic = value;
    }

    /**
     * Gets the value of the devSiuHeat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevSiuHeat() {
        return devSiuHeat;
    }

    /**
     * Sets the value of the devSiuHeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevSiuHeat(String value) {
        this.devSiuHeat = value;
    }

    /**
     * Gets the value of the devSiuProximity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevSiuProximity() {
        return devSiuProximity;
    }

    /**
     * Sets the value of the devSiuProximity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevSiuProximity(String value) {
        this.devSiuProximity = value;
    }

    /**
     * Gets the value of the devSiuAmbientLight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevSiuAmbientLight() {
        return devSiuAmbientLight;
    }

    /**
     * Sets the value of the devSiuAmbientLight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevSiuAmbientLight(String value) {
        this.devSiuAmbientLight = value;
    }

    /**
     * Gets the value of the devSiuEnhancedAudio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevSiuEnhancedAudio() {
        return devSiuEnhancedAudio;
    }

    /**
     * Sets the value of the devSiuEnhancedAudio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevSiuEnhancedAudio(String value) {
        this.devSiuEnhancedAudio = value;
    }

}
