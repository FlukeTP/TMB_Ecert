
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevCimPosition_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevCimPosition_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCimPositionLocation"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCimShutter"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCimPositionStatus"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCimTransport"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevCimTransportItems"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevCimPosition_Type", propOrder = {
    "devCimPositionLocation",
    "devCimShutter",
    "devCimPositionStatus",
    "devCimTransport",
    "devCimTransportItems"
})
public class DevCimPositionType {

    @XmlElement(name = "DevCimPositionLocation", required = true)
    protected String devCimPositionLocation;
    @XmlElement(name = "DevCimShutter", required = true)
    protected String devCimShutter;
    @XmlElement(name = "DevCimPositionStatus", required = true)
    protected String devCimPositionStatus;
    @XmlElement(name = "DevCimTransport", required = true)
    protected String devCimTransport;
    @XmlElement(name = "DevCimTransportItems", required = true)
    protected String devCimTransportItems;

    /**
     * Gets the value of the devCimPositionLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevCimPositionLocation() {
        return devCimPositionLocation;
    }

    /**
     * Sets the value of the devCimPositionLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevCimPositionLocation(String value) {
        this.devCimPositionLocation = value;
    }

    /**
     * Gets the value of the devCimShutter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevCimShutter() {
        return devCimShutter;
    }

    /**
     * Sets the value of the devCimShutter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevCimShutter(String value) {
        this.devCimShutter = value;
    }

    /**
     * Gets the value of the devCimPositionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevCimPositionStatus() {
        return devCimPositionStatus;
    }

    /**
     * Sets the value of the devCimPositionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevCimPositionStatus(String value) {
        this.devCimPositionStatus = value;
    }

    /**
     * Gets the value of the devCimTransport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevCimTransport() {
        return devCimTransport;
    }

    /**
     * Sets the value of the devCimTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevCimTransport(String value) {
        this.devCimTransport = value;
    }

    /**
     * Gets the value of the devCimTransportItems property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevCimTransportItems() {
        return devCimTransportItems;
    }

    /**
     * Sets the value of the devCimTransportItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevCimTransportItems(String value) {
        this.devCimTransportItems = value;
    }

}
