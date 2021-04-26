
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}NotificationId"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{http://www.fnf.com/xes}NotificationIdent" minOccurs="0"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}PartyKeys" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.fnf.com/xes}ApplicationKeys" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
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
@XmlType(name = "NotificationKeys_Type", propOrder = {
    "notificationId",
    "notificationIdent",
    "partyKeys",
    "applicationKeys"
})
public class NotificationKeysType {

    @XmlElement(name = "NotificationId")
    protected String notificationId;
    @XmlElement(name = "NotificationIdent")
    protected NotificationIdentType notificationIdent;
    @XmlElementRef(name = "PartyKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyKeysType> partyKeys;
    @XmlElement(name = "ApplicationKeys")
    protected ApplicationKeysType applicationKeys;

    /**
     * Gets the value of the notificationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationId() {
        return notificationId;
    }

    /**
     * Sets the value of the notificationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationId(String value) {
        this.notificationId = value;
    }

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

    /**
     * Gets the value of the partyKeys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyKeysType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyKeysType> getPartyKeys() {
        return partyKeys;
    }

    /**
     * Sets the value of the partyKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyKeysType }{@code >}
     *     
     */
    public void setPartyKeys(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyKeysType> value) {
        this.partyKeys = value;
    }

    /**
     * Gets the value of the applicationKeys property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationKeysType }
     *     
     */
    public ApplicationKeysType getApplicationKeys() {
        return applicationKeys;
    }

    /**
     * Sets the value of the applicationKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationKeysType }
     *     
     */
    public void setApplicationKeys(ApplicationKeysType value) {
        this.applicationKeys = value;
    }

}
