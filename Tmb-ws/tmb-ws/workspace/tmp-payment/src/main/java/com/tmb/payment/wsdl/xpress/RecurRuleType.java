
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecurRule_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurRule_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}RecurRule_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}BusinesDayOption" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}EndOfMonthInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RecurDesc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurRule_Type", propOrder = {
    "businesDayOption",
    "endOfMonthInd",
    "recurDesc"
})
public class RecurRuleType
    extends com.tmb.payment.wsdl.xpress.vo.RecurRuleType
{

    @XmlElement(name = "BusinesDayOption")
    protected String businesDayOption;
    @XmlElement(name = "EndOfMonthInd")
    protected Boolean endOfMonthInd;
    @XmlElement(name = "RecurDesc")
    protected String recurDesc;

    /**
     * Gets the value of the businesDayOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinesDayOption() {
        return businesDayOption;
    }

    /**
     * Sets the value of the businesDayOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinesDayOption(String value) {
        this.businesDayOption = value;
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

}
