
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevSiuType_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevSiuType_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuSensors"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuDoors"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuIndicators"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuGuidelights"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuAuxiliary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevSiuType_Type", propOrder = {
    "devSiuSensors",
    "devSiuDoors",
    "devSiuIndicators",
    "devSiuGuidelights",
    "devSiuAuxiliary"
})
public class DevSiuTypeType {

    @XmlElement(name = "DevSiuSensors", required = true)
    @XmlSchemaType(name = "string")
    protected DevSiuSensorsType devSiuSensors;
    @XmlElement(name = "DevSiuDoors", required = true)
    @XmlSchemaType(name = "string")
    protected DevSiuDoorsType devSiuDoors;
    @XmlElement(name = "DevSiuIndicators", required = true)
    @XmlSchemaType(name = "string")
    protected DevSiuIndicatorsType devSiuIndicators;
    @XmlElement(name = "DevSiuGuidelights", required = true)
    @XmlSchemaType(name = "string")
    protected DevSiuGuidelightsType devSiuGuidelights;
    @XmlElement(name = "DevSiuAuxiliary", required = true)
    @XmlSchemaType(name = "string")
    protected DevSiuAuxiliaryType devSiuAuxiliary;

    /**
     * Gets the value of the devSiuSensors property.
     * 
     * @return
     *     possible object is
     *     {@link DevSiuSensorsType }
     *     
     */
    public DevSiuSensorsType getDevSiuSensors() {
        return devSiuSensors;
    }

    /**
     * Sets the value of the devSiuSensors property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevSiuSensorsType }
     *     
     */
    public void setDevSiuSensors(DevSiuSensorsType value) {
        this.devSiuSensors = value;
    }

    /**
     * Gets the value of the devSiuDoors property.
     * 
     * @return
     *     possible object is
     *     {@link DevSiuDoorsType }
     *     
     */
    public DevSiuDoorsType getDevSiuDoors() {
        return devSiuDoors;
    }

    /**
     * Sets the value of the devSiuDoors property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevSiuDoorsType }
     *     
     */
    public void setDevSiuDoors(DevSiuDoorsType value) {
        this.devSiuDoors = value;
    }

    /**
     * Gets the value of the devSiuIndicators property.
     * 
     * @return
     *     possible object is
     *     {@link DevSiuIndicatorsType }
     *     
     */
    public DevSiuIndicatorsType getDevSiuIndicators() {
        return devSiuIndicators;
    }

    /**
     * Sets the value of the devSiuIndicators property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevSiuIndicatorsType }
     *     
     */
    public void setDevSiuIndicators(DevSiuIndicatorsType value) {
        this.devSiuIndicators = value;
    }

    /**
     * Gets the value of the devSiuGuidelights property.
     * 
     * @return
     *     possible object is
     *     {@link DevSiuGuidelightsType }
     *     
     */
    public DevSiuGuidelightsType getDevSiuGuidelights() {
        return devSiuGuidelights;
    }

    /**
     * Sets the value of the devSiuGuidelights property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevSiuGuidelightsType }
     *     
     */
    public void setDevSiuGuidelights(DevSiuGuidelightsType value) {
        this.devSiuGuidelights = value;
    }

    /**
     * Gets the value of the devSiuAuxiliary property.
     * 
     * @return
     *     possible object is
     *     {@link DevSiuAuxiliaryType }
     *     
     */
    public DevSiuAuxiliaryType getDevSiuAuxiliary() {
        return devSiuAuxiliary;
    }

    /**
     * Sets the value of the devSiuAuxiliary property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevSiuAuxiliaryType }
     *     
     */
    public void setDevSiuAuxiliary(DevSiuAuxiliaryType value) {
        this.devSiuAuxiliary = value;
    }

}
