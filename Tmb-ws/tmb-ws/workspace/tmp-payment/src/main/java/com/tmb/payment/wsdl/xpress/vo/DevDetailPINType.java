
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevDetailPIN_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevDetailPIN_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevPINType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevPINOperation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevPINEncStat" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevDetailPIN_Type", propOrder = {
    "devPINType",
    "devPINOperation",
    "devPINEncStat"
})
public class DevDetailPINType {

    @XmlElement(name = "DevPINType", required = true)
    protected String devPINType;
    @XmlElement(name = "DevPINOperation")
    protected String devPINOperation;
    @XmlElement(name = "DevPINEncStat")
    @XmlSchemaType(name = "string")
    protected DevPINEncStatType devPINEncStat;

    /**
     * Gets the value of the devPINType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevPINType() {
        return devPINType;
    }

    /**
     * Sets the value of the devPINType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevPINType(String value) {
        this.devPINType = value;
    }

    /**
     * Gets the value of the devPINOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevPINOperation() {
        return devPINOperation;
    }

    /**
     * Sets the value of the devPINOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevPINOperation(String value) {
        this.devPINOperation = value;
    }

    /**
     * Gets the value of the devPINEncStat property.
     * 
     * @return
     *     possible object is
     *     {@link DevPINEncStatType }
     *     
     */
    public DevPINEncStatType getDevPINEncStat() {
        return devPINEncStat;
    }

    /**
     * Sets the value of the devPINEncStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevPINEncStatType }
     *     
     */
    public void setDevPINEncStat(DevPINEncStatType value) {
        this.devPINEncStat = value;
    }

}
