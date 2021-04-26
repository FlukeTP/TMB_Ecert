
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RecurRule_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurRule_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RecurType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RecurInterval" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RecurInstance" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DayOfWeek" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DayOfMonth" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Month" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TimeOfDay" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RecurStartDate" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}Occurrences"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}RecurEndDate"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AdjDays" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AdjDaysBasis" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurRule_Type", propOrder = {
    "recurType",
    "recurInterval",
    "recurInstance",
    "dayOfWeek",
    "dayOfMonth",
    "month",
    "timeOfDay",
    "recurStartDate",
    "occurrences",
    "recurEndDate",
    "adjDays",
    "adjDaysBasis"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.RecurRuleType.class
})
public class RecurRuleType {

    @XmlElement(name = "RecurType")
    @XmlSchemaType(name = "string")
    protected RecurTypeType recurType;
    @XmlElement(name = "RecurInterval")
    protected Long recurInterval;
    @XmlElement(name = "RecurInstance")
    protected Long recurInstance;
    @XmlElement(name = "DayOfWeek")
    @XmlSchemaType(name = "string")
    protected DayOfWeekType dayOfWeek;
    @XmlElement(name = "DayOfMonth")
    protected String dayOfMonth;
    @XmlElement(name = "Month")
    protected Long month;
    @XmlElement(name = "TimeOfDay")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar timeOfDay;
    @XmlElement(name = "RecurStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar recurStartDate;
    @XmlElement(name = "Occurrences")
    protected Long occurrences;
    @XmlElement(name = "RecurEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar recurEndDate;
    @XmlElement(name = "AdjDays")
    protected Long adjDays;
    @XmlElement(name = "AdjDaysBasis")
    protected String adjDaysBasis;

    /**
     * Gets the value of the recurType property.
     * 
     * @return
     *     possible object is
     *     {@link RecurTypeType }
     *     
     */
    public RecurTypeType getRecurType() {
        return recurType;
    }

    /**
     * Sets the value of the recurType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurTypeType }
     *     
     */
    public void setRecurType(RecurTypeType value) {
        this.recurType = value;
    }

    /**
     * Gets the value of the recurInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecurInterval() {
        return recurInterval;
    }

    /**
     * Sets the value of the recurInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecurInterval(Long value) {
        this.recurInterval = value;
    }

    /**
     * Gets the value of the recurInstance property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecurInstance() {
        return recurInstance;
    }

    /**
     * Sets the value of the recurInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecurInstance(Long value) {
        this.recurInstance = value;
    }

    /**
     * Gets the value of the dayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekType }
     *     
     */
    public DayOfWeekType getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Sets the value of the dayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekType }
     *     
     */
    public void setDayOfWeek(DayOfWeekType value) {
        this.dayOfWeek = value;
    }

    /**
     * Gets the value of the dayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayOfMonth() {
        return dayOfMonth;
    }

    /**
     * Sets the value of the dayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayOfMonth(String value) {
        this.dayOfMonth = value;
    }

    /**
     * Gets the value of the month property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMonth(Long value) {
        this.month = value;
    }

    /**
     * Gets the value of the timeOfDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeOfDay() {
        return timeOfDay;
    }

    /**
     * Sets the value of the timeOfDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeOfDay(XMLGregorianCalendar value) {
        this.timeOfDay = value;
    }

    /**
     * Gets the value of the recurStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecurStartDate() {
        return recurStartDate;
    }

    /**
     * Sets the value of the recurStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecurStartDate(XMLGregorianCalendar value) {
        this.recurStartDate = value;
    }

    /**
     * Gets the value of the occurrences property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOccurrences() {
        return occurrences;
    }

    /**
     * Sets the value of the occurrences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOccurrences(Long value) {
        this.occurrences = value;
    }

    /**
     * Gets the value of the recurEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecurEndDate() {
        return recurEndDate;
    }

    /**
     * Sets the value of the recurEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecurEndDate(XMLGregorianCalendar value) {
        this.recurEndDate = value;
    }

    /**
     * Gets the value of the adjDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdjDays() {
        return adjDays;
    }

    /**
     * Sets the value of the adjDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdjDays(Long value) {
        this.adjDays = value;
    }

    /**
     * Gets the value of the adjDaysBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjDaysBasis() {
        return adjDaysBasis;
    }

    /**
     * Sets the value of the adjDaysBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjDaysBasis(String value) {
        this.adjDaysBasis = value;
    }

}
