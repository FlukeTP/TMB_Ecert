
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfferMiscData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferMiscData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OfferMiscType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MiscText" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MiscDate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MiscNum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferMiscData_Type", propOrder = {
    "offerMiscType",
    "miscText",
    "miscDate",
    "miscNum"
})
public class OfferMiscDataType {

    @XmlElement(name = "OfferMiscType")
    protected String offerMiscType;
    @XmlElement(name = "MiscText")
    protected String miscText;
    @XmlElement(name = "MiscDate")
    protected String miscDate;
    @XmlElement(name = "MiscNum")
    protected String miscNum;

    /**
     * Gets the value of the offerMiscType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferMiscType() {
        return offerMiscType;
    }

    /**
     * Sets the value of the offerMiscType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferMiscType(String value) {
        this.offerMiscType = value;
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

}
