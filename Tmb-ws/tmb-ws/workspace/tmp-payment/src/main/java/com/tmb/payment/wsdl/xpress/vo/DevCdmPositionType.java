
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevCdmPosition_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevCdmPosition_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCdmPositionLocation"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCdmShutter"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCdmPositionStatus"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCdmTransport"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCdmTransportItems"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevCdmPosition_Type", propOrder = {
    "devCdmPositionLocation",
    "devCdmShutter",
    "devCdmPositionStatus",
    "devCdmTransport",
    "devCdmTransportItems"
})
public class DevCdmPositionType {

    @XmlElement(name = "DevCdmPositionLocation", required = true)
    protected String devCdmPositionLocation;
    @XmlElement(name = "DevCdmShutter", required = true)
    protected String devCdmShutter;
    @XmlElement(name = "DevCdmPositionStatus", required = true)
    protected String devCdmPositionStatus;
    @XmlElement(name = "DevCdmTransport", required = true)
    protected String devCdmTransport;
    @XmlElement(name = "DevCdmTransportItems", required = true)
    protected String devCdmTransportItems;

    /**
     * Gets the value of the devCdmPositionLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevCdmPositionLocation() {
        return devCdmPositionLocation;
    }

    /**
     * Sets the value of the devCdmPositionLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevCdmPositionLocation(String value) {
        this.devCdmPositionLocation = value;
    }

    /**
     * Gets the value of the devCdmShutter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevCdmShutter() {
        return devCdmShutter;
    }

    /**
     * Sets the value of the devCdmShutter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevCdmShutter(String value) {
        this.devCdmShutter = value;
    }

    /**
     * Gets the value of the devCdmPositionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevCdmPositionStatus() {
        return devCdmPositionStatus;
    }

    /**
     * Sets the value of the devCdmPositionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevCdmPositionStatus(String value) {
        this.devCdmPositionStatus = value;
    }

    /**
     * Gets the value of the devCdmTransport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevCdmTransport() {
        return devCdmTransport;
    }

    /**
     * Sets the value of the devCdmTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevCdmTransport(String value) {
        this.devCdmTransport = value;
    }

    /**
     * Gets the value of the devCdmTransportItems property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevCdmTransportItems() {
        return devCdmTransportItems;
    }

    /**
     * Sets the value of the devCdmTransportItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevCdmTransportItems(String value) {
        this.devCdmTransportItems = value;
    }

}
