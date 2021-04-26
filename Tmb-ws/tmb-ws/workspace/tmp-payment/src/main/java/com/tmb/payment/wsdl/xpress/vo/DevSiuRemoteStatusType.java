
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevSiuRemoteStatus_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevSiuRemoteStatus_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuGreenLed"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuRedLed"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevSiuAmberLed"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevSiuRemoteStatus_Type", propOrder = {
    "devSiuGreenLed",
    "devSiuRedLed",
    "devSiuAmberLed"
})
public class DevSiuRemoteStatusType {

    @XmlElement(name = "DevSiuGreenLed", required = true)
    @XmlSchemaType(name = "string")
    protected DevSiuGreenLedType devSiuGreenLed;
    @XmlElement(name = "DevSiuRedLed", required = true)
    @XmlSchemaType(name = "string")
    protected DevSiuRedLedType devSiuRedLed;
    @XmlElement(name = "DevSiuAmberLed", required = true)
    @XmlSchemaType(name = "string")
    protected DevSiuAmberLedType devSiuAmberLed;

    /**
     * Gets the value of the devSiuGreenLed property.
     * 
     * @return
     *     possible object is
     *     {@link DevSiuGreenLedType }
     *     
     */
    public DevSiuGreenLedType getDevSiuGreenLed() {
        return devSiuGreenLed;
    }

    /**
     * Sets the value of the devSiuGreenLed property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevSiuGreenLedType }
     *     
     */
    public void setDevSiuGreenLed(DevSiuGreenLedType value) {
        this.devSiuGreenLed = value;
    }

    /**
     * Gets the value of the devSiuRedLed property.
     * 
     * @return
     *     possible object is
     *     {@link DevSiuRedLedType }
     *     
     */
    public DevSiuRedLedType getDevSiuRedLed() {
        return devSiuRedLed;
    }

    /**
     * Sets the value of the devSiuRedLed property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevSiuRedLedType }
     *     
     */
    public void setDevSiuRedLed(DevSiuRedLedType value) {
        this.devSiuRedLed = value;
    }

    /**
     * Gets the value of the devSiuAmberLed property.
     * 
     * @return
     *     possible object is
     *     {@link DevSiuAmberLedType }
     *     
     */
    public DevSiuAmberLedType getDevSiuAmberLed() {
        return devSiuAmberLed;
    }

    /**
     * Sets the value of the devSiuAmberLed property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevSiuAmberLedType }
     *     
     */
    public void setDevSiuAmberLed(DevSiuAmberLedType value) {
        this.devSiuAmberLed = value;
    }

}
