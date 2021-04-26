
package com.tmb.payment.wsdl.xpress;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MiscDetail_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MiscDetail_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}MiscText"/&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}MiscDate"/&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}MiscNum"/&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}MiscInd"/&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}MiscDecimal"/&gt;
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
@XmlType(name = "MiscDetail_Type", propOrder = {
    "miscText",
    "miscDate",
    "miscNum",
    "miscInd",
    "miscDecimal"
})
@XmlSeeAlso({
    AddrMiscDataType.class,
    ContactMiscDataType.class,
    PartyPartyRelMiscDataType.class,
    AcctTrnMiscDataType.class,
    CorrespdnceMiscDataType.class,
    AppMiscDetailType.class,
    CalendarMiscDataType.class
})
public class MiscDetailType {

    @XmlElement(name = "MiscText")
    protected String miscText;
    @XmlElement(name = "MiscDate")
    protected String miscDate;
    @XmlElement(name = "MiscNum")
    protected String miscNum;
    @XmlElement(name = "MiscInd")
    protected Boolean miscInd;
    @XmlElement(name = "MiscDecimal")
    protected BigDecimal miscDecimal;

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
