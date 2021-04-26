
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecCtrlIn_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecCtrlIn_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DeliveryMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DeliveryMedia" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}RecCountLimit" minOccurs="0"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}Cursor" minOccurs="0"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}Token" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecCtrlIn_Type", propOrder = {
    "deliveryMethod",
    "deliveryMedia",
    "recCountLimit",
    "cursor",
    "token"
})
public class RecCtrlInType {

    @XmlElement(name = "DeliveryMethod")
    protected String deliveryMethod;
    @XmlElement(name = "DeliveryMedia")
    protected String deliveryMedia;
    @XmlElement(name = "RecCountLimit")
    protected RecCountLimitType recCountLimit;
    @XmlElement(name = "Cursor")
    protected CursorType cursor;
    @XmlElement(name = "Token")
    protected String token;

    /**
     * Gets the value of the deliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * Sets the value of the deliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryMethod(String value) {
        this.deliveryMethod = value;
    }

    /**
     * Gets the value of the deliveryMedia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryMedia() {
        return deliveryMedia;
    }

    /**
     * Sets the value of the deliveryMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryMedia(String value) {
        this.deliveryMedia = value;
    }

    /**
     * Gets the value of the recCountLimit property.
     * 
     * @return
     *     possible object is
     *     {@link RecCountLimitType }
     *     
     */
    public RecCountLimitType getRecCountLimit() {
        return recCountLimit;
    }

    /**
     * Sets the value of the recCountLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecCountLimitType }
     *     
     */
    public void setRecCountLimit(RecCountLimitType value) {
        this.recCountLimit = value;
    }

    /**
     * Gets the value of the cursor property.
     * 
     * @return
     *     possible object is
     *     {@link CursorType }
     *     
     */
    public CursorType getCursor() {
        return cursor;
    }

    /**
     * Sets the value of the cursor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CursorType }
     *     
     */
    public void setCursor(CursorType value) {
        this.cursor = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

}
