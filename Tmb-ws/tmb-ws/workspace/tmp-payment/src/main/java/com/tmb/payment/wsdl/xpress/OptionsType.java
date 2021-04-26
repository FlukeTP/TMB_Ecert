
package com.tmb.payment.wsdl.xpress;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Options_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Options_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OptionSeqNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OptionInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OptionDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OptionText" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OptionDecimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Options_Type", propOrder = {
    "optionType",
    "optionSeqNum",
    "optionInd",
    "optionDate",
    "optionText",
    "optionDecimal"
})
public class OptionsType {

    @XmlElement(name = "OptionType")
    protected String optionType;
    @XmlElement(name = "OptionSeqNum")
    protected Long optionSeqNum;
    @XmlElement(name = "OptionInd")
    protected Boolean optionInd;
    @XmlElement(name = "OptionDate")
    protected String optionDate;
    @XmlElement(name = "OptionText")
    protected String optionText;
    @XmlElement(name = "OptionDecimal")
    protected BigDecimal optionDecimal;

    /**
     * Gets the value of the optionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionType() {
        return optionType;
    }

    /**
     * Sets the value of the optionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionType(String value) {
        this.optionType = value;
    }

    /**
     * Gets the value of the optionSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOptionSeqNum() {
        return optionSeqNum;
    }

    /**
     * Sets the value of the optionSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOptionSeqNum(Long value) {
        this.optionSeqNum = value;
    }

    /**
     * Gets the value of the optionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptionInd() {
        return optionInd;
    }

    /**
     * Sets the value of the optionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptionInd(Boolean value) {
        this.optionInd = value;
    }

    /**
     * Gets the value of the optionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionDate() {
        return optionDate;
    }

    /**
     * Sets the value of the optionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionDate(String value) {
        this.optionDate = value;
    }

    /**
     * Gets the value of the optionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionText() {
        return optionText;
    }

    /**
     * Sets the value of the optionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionText(String value) {
        this.optionText = value;
    }

    /**
     * Gets the value of the optionDecimal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOptionDecimal() {
        return optionDecimal;
    }

    /**
     * Sets the value of the optionDecimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOptionDecimal(BigDecimal value) {
        this.optionDecimal = value;
    }

}
