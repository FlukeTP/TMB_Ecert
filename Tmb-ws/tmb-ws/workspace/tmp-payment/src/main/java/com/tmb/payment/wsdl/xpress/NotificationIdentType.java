
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationIdent_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationIdent_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}NotificationIdentType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}NotificationIdentValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationIdent_Type", propOrder = {
    "notificationIdentType",
    "notificationIdentValue"
})
public class NotificationIdentType {

    @XmlElement(name = "NotificationIdentType")
    protected String notificationIdentType;
    @XmlElement(name = "NotificationIdentValue")
    protected String notificationIdentValue;

    /**
     * Gets the value of the notificationIdentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationIdentType() {
        return notificationIdentType;
    }

    /**
     * Sets the value of the notificationIdentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationIdentType(String value) {
        this.notificationIdentType = value;
    }

    /**
     * Gets the value of the notificationIdentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationIdentValue() {
        return notificationIdentValue;
    }

    /**
     * Sets the value of the notificationIdentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationIdentValue(String value) {
        this.notificationIdentValue = value;
    }

}
