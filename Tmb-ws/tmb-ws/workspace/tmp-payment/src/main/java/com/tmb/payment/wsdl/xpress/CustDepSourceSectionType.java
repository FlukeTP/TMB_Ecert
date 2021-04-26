
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustDepSourceSection_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustDepSourceSection_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CustDepSource" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustDepSourceSection_Type", propOrder = {
    "custDepSource"
})
public class CustDepSourceSectionType {

    @XmlElement(name = "CustDepSource")
    protected String custDepSource;

    /**
     * Gets the value of the custDepSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustDepSource() {
        return custDepSource;
    }

    /**
     * Sets the value of the custDepSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustDepSource(String value) {
        this.custDepSource = value;
    }

}
