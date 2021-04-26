
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrnDesc_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrnDesc_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DescOther1" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DescOther2" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DescOther3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrnDesc_Type", propOrder = {
    "descOther1",
    "descOther2",
    "descOther3"
})
public class TrnDescType {

    @XmlElement(name = "DescOther1")
    protected String descOther1;
    @XmlElement(name = "DescOther2")
    protected String descOther2;
    @XmlElement(name = "DescOther3")
    protected String descOther3;

    /**
     * Gets the value of the descOther1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescOther1() {
        return descOther1;
    }

    /**
     * Sets the value of the descOther1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescOther1(String value) {
        this.descOther1 = value;
    }

    /**
     * Gets the value of the descOther2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescOther2() {
        return descOther2;
    }

    /**
     * Sets the value of the descOther2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescOther2(String value) {
        this.descOther2 = value;
    }

    /**
     * Gets the value of the descOther3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescOther3() {
        return descOther3;
    }

    /**
     * Sets the value of the descOther3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescOther3(String value) {
        this.descOther3 = value;
    }

}
