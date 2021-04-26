
package com.tmb.payment.wsdl.xpress;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationMiscData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationMiscData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}NotificationMiscType"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MiscText" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MiscInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MiscDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MiscNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MiscDecimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationMiscData_Type", propOrder = {
    "notificationMiscType",
    "miscText",
    "miscInd",
    "miscDate",
    "miscNum",
    "miscDecimal"
})
public class NotificationMiscDataType {

    @XmlElement(name = "NotificationMiscType", required = true)
    protected String notificationMiscType;
    @XmlElement(name = "MiscText")
    protected String miscText;
    @XmlElement(name = "MiscInd")
    protected Boolean miscInd;
    @XmlElement(name = "MiscDate")
    protected String miscDate;
    @XmlElement(name = "MiscNum")
    protected String miscNum;
    @XmlElement(name = "MiscDecimal")
    protected BigDecimal miscDecimal;

    /**
     * Gets the value of the notificationMiscType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationMiscType() {
        return notificationMiscType;
    }

    /**
     * Sets the value of the notificationMiscType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationMiscType(String value) {
        this.notificationMiscType = value;
    }

    /**
     * Gets the value of the miscText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscText() {
        return miscText;
    }

    /**
     * Sets the value of the miscText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscText(String value) {
        this.miscText = value;
    }

    /**
     * Gets the value of the miscInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMiscInd() {
        return miscInd;
    }

    /**
     * Sets the value of the miscInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMiscInd(Boolean value) {
        this.miscInd = value;
    }

    /**
     * Gets the value of the miscDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscDate() {
        return miscDate;
    }

    /**
     * Sets the value of the miscDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscDate(String value) {
        this.miscDate = value;
    }

    /**
     * Gets the value of the miscNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscNum() {
        return miscNum;
    }

    /**
     * Sets the value of the miscNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscNum(String value) {
        this.miscNum = value;
    }

    /**
     * Gets the value of the miscDecimal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMiscDecimal() {
        return miscDecimal;
    }

    /**
     * Sets the value of the miscDecimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMiscDecimal(BigDecimal value) {
        this.miscDecimal = value;
    }

}
