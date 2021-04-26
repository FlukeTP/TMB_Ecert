
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevSiuIndicatorStatus_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevSiuIndicatorStatus_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuOpenClose"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuFasciaLight"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuAudio"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuHeating"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevSiuIndicatorStatus_Type", propOrder = {
    "devSiuOpenClose",
    "devSiuFasciaLight",
    "devSiuAudio",
    "devSiuHeating"
})
public class DevSiuIndicatorStatusType {

    @XmlElement(name = "DevSiuOpenClose", required = true)
    protected String devSiuOpenClose;
    @XmlElement(name = "DevSiuFasciaLight", required = true)
    protected String devSiuFasciaLight;
    @XmlElement(name = "DevSiuAudio", required = true)
    protected String devSiuAudio;
    @XmlElement(name = "DevSiuHeating", required = true)
    protected String devSiuHeating;

    /**
     * Gets the value of the devSiuOpenClose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevSiuOpenClose() {
        return devSiuOpenClose;
    }

    /**
     * Sets the value of the devSiuOpenClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevSiuOpenClose(String value) {
        this.devSiuOpenClose = value;
    }

    /**
     * Gets the value of the devSiuFasciaLight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevSiuFasciaLight() {
        return devSiuFasciaLight;
    }

    /**
     * Sets the value of the devSiuFasciaLight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevSiuFasciaLight(String value) {
        this.devSiuFasciaLight = value;
    }

    /**
     * Gets the value of the devSiuAudio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevSiuAudio() {
        return devSiuAudio;
    }

    /**
     * Sets the value of the devSiuAudio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevSiuAudio(String value) {
        this.devSiuAudio = value;
    }

    /**
     * Gets the value of the devSiuHeating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevSiuHeating() {
        return devSiuHeating;
    }

    /**
     * Sets the value of the devSiuHeating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevSiuHeating(String value) {
        this.devSiuHeating = value;
    }

}
