
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepAppAcct_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepAppAcct_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}IntDispData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepAppAcct_Type", propOrder = {
    "intDispData"
})
public class DepAppAcctType {

    @XmlElement(name = "IntDispData")
    protected IntDispDataType intDispData;

    /**
     * Gets the value of the intDispData property.
     * 
     * @return
     *     possible object is
     *     {@link IntDispDataType }
     *     
     */
    public IntDispDataType getIntDispData() {
        return intDispData;
    }

    /**
     * Sets the value of the intDispData property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntDispDataType }
     *     
     */
    public void setIntDispData(IntDispDataType value) {
        this.intDispData = value;
    }

}
