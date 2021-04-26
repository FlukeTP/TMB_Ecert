
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RecurrenceRule_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurrenceRule_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}RecurrenceRule_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}BusDayOption" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}IncrementDays" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DecrementDays" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RecurDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ExpDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Occurrences" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RecurStartDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RecurEndDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Month" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}EndOfMonthInd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurrenceRule_Type", propOrder = {
    "busDayOption",
    "incrementDays",
    "decrementDays",
    "recurDesc",
    "expDt",
    "occurrences",
    "recurStartDate",
    "recurEndDate",
    "month",
    "endOfMonthInd"
})
public class RecurrenceRuleType
    extends com.tmb.payment.wsdl.xpress.vo.RecurrenceRuleType
{

    @XmlElement(name = "BusDayOption")
    @XmlSchemaType(name = "string")
    protected BusDayOptionType busDayOption;
    @XmlElement(name = "IncrementDays")
    protected Long incrementDays;
    @XmlElement(name = "DecrementDays")
    protected Long decrementDays;
    @XmlElement(name = "RecurDesc")
    protected String recurDesc;
    @XmlElement(name = "ExpDt", namespace = "urn:ifxforum-org:XSD:1")
    protected String expDt;
    @XmlElement(name = "Occurrences", namespace = "urn:ifxforum-org:XSD:1")
    protected Long occurrences;
    @XmlElement(name = "RecurStartDate", namespace = "urn:ifxforum-org:XSD:1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar recurStartDate;
    @XmlElement(name = "RecurEndDate", namespace = "urn:ifxforum-org:XSD:1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar recurEndDate;
    @XmlElement(name = "Month", namespace = "urn:ifxforum-org:XSD:1")
    protected Long month;
    @XmlElement(name = "EndOfMonthInd")
    protected Boolean endOfMonthInd;

    /**
     * Gets the value of the busDayOption property.
     * 
     * @return
     *     possible object is
     *     {@link BusDayOptionType }
     *     
     */
    public BusDayOptionType getBusDayOption() {
        return busDayOption;
    }

    /**
     * Sets the value of the busDayOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusDayOptionType }
     *     
     */
    public void setBusDayOption(BusDayOptionType value) {
        this.busDayOption = value;
    }

    /**
     * Gets the value of the incrementDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIncrementDays() {
        return incrementDays;
    }

    /**
     * Sets the value of the incrementDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIncrementDays(Long value) {
        this.incrementDays = value;
    }

    /**
     * Gets the value of the decrementDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDecrementDays() {
        return decrementDays;
    }

    /**
     * Sets the value of the decrementDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDecrementDays(Long value) {
        this.decrementDays = value;
    }

    /**
     * Gets the value of the recurDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurDesc() {
        return recurDesc;
    }

    /**
     * Sets the value of the recurDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurDesc(String value) {
        this.recurDesc = value;
    }

    /**
     * Gets the value of the expDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpDt() {
        return expDt;
    }

    /**
     * Sets the value of the expDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpDt(String value) {
        this.expDt = value;
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
     * Gets the value of the endOfMonthInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndOfMonthInd() {
        return endOfMonthInd;
    }

    /**
     * Sets the value of the endOfMonthInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndOfMonthInd(Boolean value) {
        this.endOfMonthInd = value;
    }

}
