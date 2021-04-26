
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevSiuAuxiliaryStatus_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevSiuAuxiliaryStatus_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuVolume"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuUps"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuRemoteStatus"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuAudibleAlarm"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevSiuAuxiliaryStatus_Type", propOrder = {
    "devSiuVolume",
    "devSiuUps",
    "devSiuRemoteStatus",
    "devSiuAudibleAlarm"
})
public class DevSiuAuxiliaryStatusType {

    @XmlElement(name = "DevSiuVolume")
    protected long devSiuVolume;
    @XmlElement(name = "DevSiuUps", required = true)
    protected String devSiuUps;
    @XmlElement(name = "DevSiuRemoteStatus", required = true)
    protected DevSiuRemoteStatusType devSiuRemoteStatus;
    @XmlElement(name = "DevSiuAudibleAlarm", required = true)
    protected String devSiuAudibleAlarm;

    /**
     * Gets the value of the devSiuVolume property.
     * 
     */
    public long getDevSiuVolume() {
        return devSiuVolume;
    }

    /**
     * Sets the value of the devSiuVolume property.
     * 
     */
    public void setDevSiuVolume(long value) {
        this.devSiuVolume = value;
    }

    /**
     * Gets the value of the devSiuUps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevSiuUps() {
        return devSiuUps;
    }

    /**
     * Sets the value of the devSiuUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevSiuUps(String value) {
        this.devSiuUps = value;
    }

    /**
     * Gets the value of the devSiuRemoteStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DevSiuRemoteStatusType }
     *     
     */
    public DevSiuRemoteStatusType getDevSiuRemoteStatus() {
        return devSiuRemoteStatus;
    }

    /**
     * Sets the value of the devSiuRemoteStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevSiuRemoteStatusType }
     *     
     */
    public void setDevSiuRemoteStatus(DevSiuRemoteStatusType value) {
        this.devSiuRemoteStatus = value;
    }

    /**
     * Gets the value of the devSiuAudibleAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevSiuAudibleAlarm() {
        return devSiuAudibleAlarm;
    }

    /**
     * Sets the value of the devSiuAudibleAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevSiuAudibleAlarm(String value) {
        this.devSiuAudibleAlarm = value;
    }

}
