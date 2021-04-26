
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevDetailChk_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevDetailChk_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevChkType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevChkOperation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevChkImageEnabled" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevChkMedia"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevChkInk" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevDetailChk_Type", propOrder = {
    "devChkType",
    "devChkOperation",
    "devChkImageEnabled",
    "devChkMedia",
    "devChkInk"
})
public class DevDetailChkType {

    @XmlElement(name = "DevChkType", required = true)
    protected String devChkType;
    @XmlElement(name = "DevChkOperation")
    protected String devChkOperation;
    @XmlElement(name = "DevChkImageEnabled")
    protected Boolean devChkImageEnabled;
    @XmlElement(name = "DevChkMedia", required = true)
    @XmlSchemaType(name = "string")
    protected DevChkMediaType devChkMedia;
    @XmlElement(name = "DevChkInk")
    @XmlSchemaType(name = "string")
    protected DevChkInkType devChkInk;

    /**
     * Gets the value of the devChkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevChkType() {
        return devChkType;
    }

    /**
     * Sets the value of the devChkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevChkType(String value) {
        this.devChkType = value;
    }

    /**
     * Gets the value of the devChkOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevChkOperation() {
        return devChkOperation;
    }

    /**
     * Sets the value of the devChkOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevChkOperation(String value) {
        this.devChkOperation = value;
    }

    /**
     * Gets the value of the devChkImageEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDevChkImageEnabled() {
        return devChkImageEnabled;
    }

    /**
     * Sets the value of the devChkImageEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDevChkImageEnabled(Boolean value) {
        this.devChkImageEnabled = value;
    }

    /**
     * Gets the value of the devChkMedia property.
     * 
     * @return
     *     possible object is
     *     {@link DevChkMediaType }
     *     
     */
    public DevChkMediaType getDevChkMedia() {
        return devChkMedia;
    }

    /**
     * Sets the value of the devChkMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevChkMediaType }
     *     
     */
    public void setDevChkMedia(DevChkMediaType value) {
        this.devChkMedia = value;
    }

    /**
     * Gets the value of the devChkInk property.
     * 
     * @return
     *     possible object is
     *     {@link DevChkInkType }
     *     
     */
    public DevChkInkType getDevChkInk() {
        return devChkInk;
    }

    /**
     * Sets the value of the devChkInk property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevChkInkType }
     *     
     */
    public void setDevChkInk(DevChkInkType value) {
        this.devChkInk = value;
    }

}
