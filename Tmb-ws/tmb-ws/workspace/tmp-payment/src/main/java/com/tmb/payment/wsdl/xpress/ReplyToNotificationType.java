
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReplyToNotification_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReplyToNotification_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}NotificationIdent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplyToNotification_Type", propOrder = {
    "notificationIdent"
})
public class ReplyToNotificationType {

    @XmlElement(name = "NotificationIdent")
    protected NotificationIdentType notificationIdent;

    /**
     * Gets the value of the notificationIdent property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationIdentType }
     *     
     */
    public NotificationIdentType getNotificationIdent() {
        return notificationIdent;
    }

    /**
     * Sets the value of the notificationIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationIdentType }
     *     
     */
    public void setNotificationIdent(NotificationIdentType value) {
        this.notificationIdent = value;
    }

}
