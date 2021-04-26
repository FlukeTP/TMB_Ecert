
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevDetailAlm_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevDetailAlm_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevAlmType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevAlmOperation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevAlmAlarm"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevDetailAlm_Type", propOrder = {
    "devAlmType",
    "devAlmOperation",
    "devAlmAlarm"
})
public class DevDetailAlmType {

    @XmlElement(name = "DevAlmType", required = true)
    protected String devAlmType;
    @XmlElement(name = "DevAlmOperation")
    protected String devAlmOperation;
    @XmlElement(name = "DevAlmAlarm", required = true)
    @XmlSchemaType(name = "string")
    protected DevAlmAlarmType devAlmAlarm;

    /**
     * Gets the value of the devAlmType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevAlmType() {
        return devAlmType;
    }

    /**
     * Sets the value of the devAlmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevAlmType(String value) {
        this.devAlmType = value;
    }

    /**
     * Gets the value of the devAlmOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevAlmOperation() {
        return devAlmOperation;
    }

    /**
     * Sets the value of the devAlmOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevAlmOperation(String value) {
        this.devAlmOperation = value;
    }

    /**
     * Gets the value of the devAlmAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link DevAlmAlarmType }
     *     
     */
    public DevAlmAlarmType getDevAlmAlarm() {
        return devAlmAlarm;
    }

    /**
     * Sets the value of the devAlmAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevAlmAlarmType }
     *     
     */
    public void setDevAlmAlarm(DevAlmAlarmType value) {
        this.devAlmAlarm = value;
    }

}
