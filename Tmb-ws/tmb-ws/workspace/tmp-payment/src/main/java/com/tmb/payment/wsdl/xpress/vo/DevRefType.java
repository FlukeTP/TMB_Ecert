
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DevKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DevRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DevInfo"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevRef_Type", propOrder = {
    "devKeys",
    "devRec",
    "devInfo"
})
public class DevRefType {

    @XmlElement(name = "DevKeys")
    protected DevKeysType devKeys;
    @XmlElement(name = "DevRec")
    protected DevRecType devRec;
    @XmlElement(name = "DevInfo")
    protected DevInfoType devInfo;

    /**
     * Gets the value of the devKeys property.
     * 
     * @return
     *     possible object is
     *     {@link DevKeysType }
     *     
     */
    public DevKeysType getDevKeys() {
        return devKeys;
    }

    /**
     * Sets the value of the devKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevKeysType }
     *     
     */
    public void setDevKeys(DevKeysType value) {
        this.devKeys = value;
    }

    /**
     * Gets the value of the devRec property.
     * 
     * @return
     *     possible object is
     *     {@link DevRecType }
     *     
     */
    public DevRecType getDevRec() {
        return devRec;
    }

    /**
     * Sets the value of the devRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevRecType }
     *     
     */
    public void setDevRec(DevRecType value) {
        this.devRec = value;
    }

    /**
     * Gets the value of the devInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DevInfoType }
     *     
     */
    public DevInfoType getDevInfo() {
        return devInfo;
    }

    /**
     * Sets the value of the devInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevInfoType }
     *     
     */
    public void setDevInfo(DevInfoType value) {
        this.devInfo = value;
    }

}
