
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefIdentRange_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefIdentRange_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RefIdentStart" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RefIdentEnd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefIdentRange_Type", propOrder = {
    "refIdentStart",
    "refIdentEnd"
})
public class RefIdentRangeType {

    @XmlElement(name = "RefIdentStart")
    protected String refIdentStart;
    @XmlElement(name = "RefIdentEnd")
    protected String refIdentEnd;

    /**
     * Gets the value of the refIdentStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefIdentStart() {
        return refIdentStart;
    }

    /**
     * Sets the value of the refIdentStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefIdentStart(String value) {
        this.refIdentStart = value;
    }

    /**
     * Gets the value of the refIdentEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefIdentEnd() {
        return refIdentEnd;
    }

    /**
     * Sets the value of the refIdentEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefIdentEnd(String value) {
        this.refIdentEnd = value;
    }

}
