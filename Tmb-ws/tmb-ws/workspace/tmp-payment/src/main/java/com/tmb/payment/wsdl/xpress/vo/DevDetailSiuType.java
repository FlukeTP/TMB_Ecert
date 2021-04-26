
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevDetailSiu_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevDetailSiu_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuOperation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuSensorStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuDoorStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuIndicatorStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuAuxiliaryStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuGuidelightStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevDetailSiu_Type", propOrder = {
    "devSiuType",
    "devSiuOperation",
    "devSiuSensorStatus",
    "devSiuDoorStatus",
    "devSiuIndicatorStatus",
    "devSiuAuxiliaryStatus",
    "devSiuGuidelightStatus"
})
public class DevDetailSiuType {

    @XmlElement(name = "DevSiuType", required = true)
    protected DevSiuTypeType devSiuType;
    @XmlElement(name = "DevSiuOperation")
    protected String devSiuOperation;
    @XmlElement(name = "DevSiuSensorStatus")
    protected DevSiuSensorStatusType devSiuSensorStatus;
    @XmlElement(name = "DevSiuDoorStatus")
    protected DevSiuDoorStatusType devSiuDoorStatus;
    @XmlElement(name = "DevSiuIndicatorStatus")
    protected DevSiuIndicatorStatusType devSiuIndicatorStatus;
    @XmlElement(name = "DevSiuAuxiliaryStatus")
    protected DevSiuAuxiliaryStatusType devSiuAuxiliaryStatus;
    @XmlElement(name = "DevSiuGuidelightStatus")
    protected DevSiuGuidelightStatusType devSiuGuidelightStatus;

    /**
     * Gets the value of the devSiuType property.
     * 
     * @return
     *     possible object is
     *     {@link DevSiuTypeType }
     *     
     */
    public DevSiuTypeType getDevSiuType() {
        return devSiuType;
    }

    /**
     * Sets the value of the devSiuType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevSiuTypeType }
     *     
     */
    public void setDevSiuType(DevSiuTypeType value) {
        this.devSiuType = value;
    }

    /**
     * Gets the value of the devSiuOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevSiuOperation() {
        return devSiuOperation;
    }

    /**
     * Sets the value of the devSiuOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevSiuOperation(String value) {
        this.devSiuOperation = value;
    }

    /**
     * Gets the value of the devSiuSensorStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DevSiuSensorStatusType }
     *     
     */
    public DevSiuSensorStatusType getDevSiuSensorStatus() {
        return devSiuSensorStatus;
    }

    /**
     * Sets the value of the devSiuSensorStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevSiuSensorStatusType }
     *     
     */
    public void setDevSiuSensorStatus(DevSiuSensorStatusType value) {
        this.devSiuSensorStatus = value;
    }

    /**
     * Gets the value of the devSiuDoorStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DevSiuDoorStatusType }
     *     
     */
    public DevSiuDoorStatusType getDevSiuDoorStatus() {
        return devSiuDoorStatus;
    }

    /**
     * Sets the value of the devSiuDoorStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevSiuDoorStatusType }
     *     
     */
    public void setDevSiuDoorStatus(DevSiuDoorStatusType value) {
        this.devSiuDoorStatus = value;
    }

    /**
     * Gets the value of the devSiuIndicatorStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DevSiuIndicatorStatusType }
     *     
     */
    public DevSiuIndicatorStatusType getDevSiuIndicatorStatus() {
        return devSiuIndicatorStatus;
    }

    /**
     * Sets the value of the devSiuIndicatorStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevSiuIndicatorStatusType }
     *     
     */
    public void setDevSiuIndicatorStatus(DevSiuIndicatorStatusType value) {
        this.devSiuIndicatorStatus = value;
    }

    /**
     * Gets the value of the devSiuAuxiliaryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DevSiuAuxiliaryStatusType }
     *     
     */
    public DevSiuAuxiliaryStatusType getDevSiuAuxiliaryStatus() {
        return devSiuAuxiliaryStatus;
    }

    /**
     * Sets the value of the devSiuAuxiliaryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevSiuAuxiliaryStatusType }
     *     
     */
    public void setDevSiuAuxiliaryStatus(DevSiuAuxiliaryStatusType value) {
        this.devSiuAuxiliaryStatus = value;
    }

    /**
     * Gets the value of the devSiuGuidelightStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DevSiuGuidelightStatusType }
     *     
     */
    public DevSiuGuidelightStatusType getDevSiuGuidelightStatus() {
        return devSiuGuidelightStatus;
    }

    /**
     * Sets the value of the devSiuGuidelightStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevSiuGuidelightStatusType }
     *     
     */
    public void setDevSiuGuidelightStatus(DevSiuGuidelightStatusType value) {
        this.devSiuGuidelightStatus = value;
    }

}
