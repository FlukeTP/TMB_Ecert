
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevDetailCam_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevDetailCam_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCamType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCamOperation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCamStatusArea"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCamStatusMedia" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCamStatusState" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCamStatusPictures" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevDetailCam_Type", propOrder = {
    "devCamType",
    "devCamOperation",
    "devCamStatusArea",
    "devCamStatusMedia",
    "devCamStatusState",
    "devCamStatusPictures"
})
public class DevDetailCamType {

    @XmlElement(name = "DevCamType", required = true)
    protected String devCamType;
    @XmlElement(name = "DevCamOperation")
    protected String devCamOperation;
    @XmlElement(name = "DevCamStatusArea", required = true)
    protected String devCamStatusArea;
    @XmlElement(name = "DevCamStatusMedia")
    @XmlSchemaType(name = "string")
    protected DevCamStatusMediaType devCamStatusMedia;
    @XmlElement(name = "DevCamStatusState")
    @XmlSchemaType(name = "string")
    protected DevCamStatusStateType devCamStatusState;
    @XmlElement(name = "DevCamStatusPictures")
    protected Long devCamStatusPictures;

    /**
     * Gets the value of the devCamType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevCamType() {
        return devCamType;
    }

    /**
     * Sets the value of the devCamType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevCamType(String value) {
        this.devCamType = value;
    }

    /**
     * Gets the value of the devCamOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevCamOperation() {
        return devCamOperation;
    }

    /**
     * Sets the value of the devCamOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevCamOperation(String value) {
        this.devCamOperation = value;
    }

    /**
     * Gets the value of the devCamStatusArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevCamStatusArea() {
        return devCamStatusArea;
    }

    /**
     * Sets the value of the devCamStatusArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevCamStatusArea(String value) {
        this.devCamStatusArea = value;
    }

    /**
     * Gets the value of the devCamStatusMedia property.
     * 
     * @return
     *     possible object is
     *     {@link DevCamStatusMediaType }
     *     
     */
    public DevCamStatusMediaType getDevCamStatusMedia() {
        return devCamStatusMedia;
    }

    /**
     * Sets the value of the devCamStatusMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevCamStatusMediaType }
     *     
     */
    public void setDevCamStatusMedia(DevCamStatusMediaType value) {
        this.devCamStatusMedia = value;
    }

    /**
     * Gets the value of the devCamStatusState property.
     * 
     * @return
     *     possible object is
     *     {@link DevCamStatusStateType }
     *     
     */
    public DevCamStatusStateType getDevCamStatusState() {
        return devCamStatusState;
    }

    /**
     * Sets the value of the devCamStatusState property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevCamStatusStateType }
     *     
     */
    public void setDevCamStatusState(DevCamStatusStateType value) {
        this.devCamStatusState = value;
    }

    /**
     * Gets the value of the devCamStatusPictures property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDevCamStatusPictures() {
        return devCamStatusPictures;
    }

    /**
     * Sets the value of the devCamStatusPictures property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDevCamStatusPictures(Long value) {
        this.devCamStatusPictures = value;
    }

}
