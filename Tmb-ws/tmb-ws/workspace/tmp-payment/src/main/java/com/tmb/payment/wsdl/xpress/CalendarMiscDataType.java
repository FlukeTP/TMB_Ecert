
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalendarMiscData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalendarMiscData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fnf.com/xes}MiscDetail_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CalendarMiscType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarMiscData_Type", propOrder = {
    "calendarMiscType"
})
public class CalendarMiscDataType
    extends MiscDetailType
{

    @XmlElement(name = "CalendarMiscType", required = true)
    protected String calendarMiscType;

    /**
     * Gets the value of the calendarMiscType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendarMiscType() {
        return calendarMiscType;
    }

    /**
     * Sets the value of the calendarMiscType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendarMiscType(String value) {
        this.calendarMiscType = value;
    }

}
