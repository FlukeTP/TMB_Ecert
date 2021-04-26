
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustIncomeSourceSection_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustIncomeSourceSection_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CustIncomeSource" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustIncomeSourceSection_Type", propOrder = {
    "custIncomeSource"
})
public class CustIncomeSourceSectionType {

    @XmlElement(name = "CustIncomeSource")
    protected String custIncomeSource;

    /**
     * Gets the value of the custIncomeSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustIncomeSource() {
        return custIncomeSource;
    }

    /**
     * Sets the value of the custIncomeSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustIncomeSource(String value) {
        this.custIncomeSource = value;
    }

}
