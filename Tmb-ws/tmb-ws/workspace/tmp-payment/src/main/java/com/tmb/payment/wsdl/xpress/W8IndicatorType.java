
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for W8Indicator_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="W8Indicator_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}W8IndType"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}W8Ind" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "W8Indicator_Type", propOrder = {
    "w8IndType",
    "w8Ind"
})
public class W8IndicatorType {

    @XmlElement(name = "W8IndType", required = true)
    protected String w8IndType;
    @XmlElement(name = "W8Ind")
    protected Boolean w8Ind;

    /**
     * Gets the value of the w8IndType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getW8IndType() {
        return w8IndType;
    }

    /**
     * Sets the value of the w8IndType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setW8IndType(String value) {
        this.w8IndType = value;
    }

    /**
     * Gets the value of the w8Ind property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isW8Ind() {
        return w8Ind;
    }

    /**
     * Sets the value of the w8Ind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setW8Ind(Boolean value) {
        this.w8Ind = value;
    }

}
