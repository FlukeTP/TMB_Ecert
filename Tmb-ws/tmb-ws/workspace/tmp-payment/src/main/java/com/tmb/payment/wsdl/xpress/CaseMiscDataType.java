
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseMiscData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseMiscData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CaseMiscType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CaseMiscValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseMiscData_Type", propOrder = {
    "caseMiscType",
    "caseMiscValue"
})
public class CaseMiscDataType {

    @XmlElement(name = "CaseMiscType")
    protected String caseMiscType;
    @XmlElement(name = "CaseMiscValue")
    protected String caseMiscValue;

    /**
     * Gets the value of the caseMiscType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseMiscType() {
        return caseMiscType;
    }

    /**
     * Sets the value of the caseMiscType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseMiscType(String value) {
        this.caseMiscType = value;
    }

    /**
     * Gets the value of the caseMiscValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseMiscValue() {
        return caseMiscValue;
    }

    /**
     * Sets the value of the caseMiscValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseMiscValue(String value) {
        this.caseMiscValue = value;
    }

}
