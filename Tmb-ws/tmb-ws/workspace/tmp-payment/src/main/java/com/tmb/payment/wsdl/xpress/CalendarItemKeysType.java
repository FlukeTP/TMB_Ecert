
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalendarItemKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalendarItemKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}CalendarItemId"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{http://www.fnf.com/xes}CalendarItemIdent"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}NotAvailInd" minOccurs="0"/&gt;
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
@XmlType(name = "CalendarItemKeys_Type", propOrder = {
    "calendarItemId",
    "calendarItemIdent",
    "notAvailInd"
})
public class CalendarItemKeysType {

    @XmlElement(name = "CalendarItemId")
    protected String calendarItemId;
    @XmlElement(name = "CalendarItemIdent")
    protected String calendarItemIdent;
    @XmlElement(name = "NotAvailInd", namespace = "urn:ifxforum-org:XSD:1")
    protected Boolean notAvailInd;

    /**
     * Gets the value of the calendarItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendarItemId() {
        return calendarItemId;
    }

    /**
     * Sets the value of the calendarItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendarItemId(String value) {
        this.calendarItemId = value;
    }

    /**
     * Gets the value of the calendarItemIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendarItemIdent() {
        return calendarItemIdent;
    }

    /**
     * Sets the value of the calendarItemIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendarItemIdent(String value) {
        this.calendarItemIdent = value;
    }

    /**
     * Gets the value of the notAvailInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotAvailInd() {
        return notAvailInd;
    }

    /**
     * Sets the value of the notAvailInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotAvailInd(Boolean value) {
        this.notAvailInd = value;
    }

}
