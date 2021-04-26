
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EscalationData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EscalationData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}EscalationIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}EscalationName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}EscalationDisplayName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Desc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}EscalationState" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}NotificationType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}EscalationTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EscalationData_Type", propOrder = {
    "escalationIdent",
    "escalationName",
    "escalationDisplayName",
    "desc",
    "escalationState",
    "notificationType",
    "escalationTime"
})
public class EscalationDataType {

    @XmlElement(name = "EscalationIdent")
    protected String escalationIdent;
    @XmlElement(name = "EscalationName")
    protected String escalationName;
    @XmlElement(name = "EscalationDisplayName")
    protected String escalationDisplayName;
    @XmlElement(name = "Desc", namespace = "urn:ifxforum-org:XSD:1")
    protected String desc;
    @XmlElement(name = "EscalationState")
    protected String escalationState;
    @XmlElement(name = "NotificationType")
    protected String notificationType;
    @XmlElement(name = "EscalationTime")
    protected String escalationTime;

    /**
     * Gets the value of the escalationIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscalationIdent() {
        return escalationIdent;
    }

    /**
     * Sets the value of the escalationIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscalationIdent(String value) {
        this.escalationIdent = value;
    }

    /**
     * Gets the value of the escalationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscalationName() {
        return escalationName;
    }

    /**
     * Sets the value of the escalationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscalationName(String value) {
        this.escalationName = value;
    }

    /**
     * Gets the value of the escalationDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscalationDisplayName() {
        return escalationDisplayName;
    }

    /**
     * Sets the value of the escalationDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscalationDisplayName(String value) {
        this.escalationDisplayName = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the escalationState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscalationState() {
        return escalationState;
    }

    /**
     * Sets the value of the escalationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscalationState(String value) {
        this.escalationState = value;
    }

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
     * Gets the value of the escalationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscalationTime() {
        return escalationTime;
    }

    /**
     * Sets the value of the escalationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscalationTime(String value) {
        this.escalationTime = value;
    }

}
