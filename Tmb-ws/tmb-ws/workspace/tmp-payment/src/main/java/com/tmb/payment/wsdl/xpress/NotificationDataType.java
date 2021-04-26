
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NotificationData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}NotificationType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}NotificationStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}NotificationDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}NotificationTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationData_Type", propOrder = {
    "notificationType",
    "notificationStatusCode",
    "notificationDt",
    "notificationTime"
})
public class NotificationDataType {

    @XmlElement(name = "NotificationType")
    protected String notificationType;
    @XmlElement(name = "NotificationStatusCode")
    protected String notificationStatusCode;
    @XmlElement(name = "NotificationDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar notificationDt;
    @XmlElement(name = "NotificationTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar notificationTime;

    /**
     * Gets the value of the notificationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationType() {
        return notificationType;
    }

    /**
     * Sets the value of the notificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationType(String value) {
        this.notificationType = value;
    }

    /**
     * Gets the value of the notificationStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationStatusCode() {
        return notificationStatusCode;
    }

    /**
     * Sets the value of the notificationStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationStatusCode(String value) {
        this.notificationStatusCode = value;
    }

    /**
     * Gets the value of the notificationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNotificationDt() {
        return notificationDt;
    }

    /**
     * Sets the value of the notificationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNotificationDt(XMLGregorianCalendar value) {
        this.notificationDt = value;
    }

    /**
     * Gets the value of the notificationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNotificationTime() {
        return notificationTime;
    }

    /**
     * Sets the value of the notificationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNotificationTime(XMLGregorianCalendar value) {
        this.notificationTime = value;
    }

}
