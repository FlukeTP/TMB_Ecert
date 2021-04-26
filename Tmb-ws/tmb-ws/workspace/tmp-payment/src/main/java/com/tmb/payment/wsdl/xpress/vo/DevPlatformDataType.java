
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevPlatformData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevPlatformData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevPlatformSource" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevPlatformXfs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevPlatformData_Type", propOrder = {
    "devPlatformSource",
    "devPlatformXfs"
})
public class DevPlatformDataType {

    @XmlElement(name = "DevPlatformSource")
    @XmlSchemaType(name = "string")
    protected DevPlatformSourceType devPlatformSource;
    @XmlElement(name = "DevPlatformXfs")
    protected DevPlatformXfsType devPlatformXfs;

    /**
     * Gets the value of the devPlatformSource property.
     * 
     * @return
     *     possible object is
     *     {@link DevPlatformSourceType }
     *     
     */
    public DevPlatformSourceType getDevPlatformSource() {
        return devPlatformSource;
    }

    /**
     * Sets the value of the devPlatformSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevPlatformSourceType }
     *     
     */
    public void setDevPlatformSource(DevPlatformSourceType value) {
        this.devPlatformSource = value;
    }

    /**
     * Gets the value of the devPlatformXfs property.
     * 
     * @return
     *     possible object is
     *     {@link DevPlatformXfsType }
     *     
     */
    public DevPlatformXfsType getDevPlatformXfs() {
        return devPlatformXfs;
    }

    /**
     * Sets the value of the devPlatformXfs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevPlatformXfsType }
     *     
     */
    public void setDevPlatformXfs(DevPlatformXfsType value) {
        this.devPlatformXfs = value;
    }

}
