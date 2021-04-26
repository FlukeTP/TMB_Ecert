
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DrawerSeqNumRange_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DrawerSeqNumRange_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DrawerSeqNumStart" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DrawerSeqNumEnd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DrawerSeqNumRange_Type", propOrder = {
    "drawerSeqNumStart",
    "drawerSeqNumEnd"
})
public class DrawerSeqNumRangeType {

    @XmlElement(name = "DrawerSeqNumStart")
    protected String drawerSeqNumStart;
    @XmlElement(name = "DrawerSeqNumEnd")
    protected String drawerSeqNumEnd;

    /**
     * Gets the value of the drawerSeqNumStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrawerSeqNumStart() {
        return drawerSeqNumStart;
    }

    /**
     * Sets the value of the drawerSeqNumStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrawerSeqNumStart(String value) {
        this.drawerSeqNumStart = value;
    }

    /**
     * Gets the value of the drawerSeqNumEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrawerSeqNumEnd() {
        return drawerSeqNumEnd;
    }

    /**
     * Sets the value of the drawerSeqNumEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrawerSeqNumEnd(String value) {
        this.drawerSeqNumEnd = value;
    }

}
