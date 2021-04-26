
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatDispData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatDispData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MatDistAcctRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MatDisposition" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatDispData_Type", propOrder = {
    "matDistAcctRef",
    "matDisposition"
})
public class MatDispDataType {

    @XmlElement(name = "MatDistAcctRef")
    protected MatDistAcctRefType matDistAcctRef;
    @XmlElement(name = "MatDisposition")
    protected String matDisposition;

    /**
     * Gets the value of the matDistAcctRef property.
     * 
     * @return
     *     possible object is
     *     {@link MatDistAcctRefType }
     *     
     */
    public MatDistAcctRefType getMatDistAcctRef() {
        return matDistAcctRef;
    }

    /**
     * Sets the value of the matDistAcctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatDistAcctRefType }
     *     
     */
    public void setMatDistAcctRef(MatDistAcctRefType value) {
        this.matDistAcctRef = value;
    }

    /**
     * Gets the value of the matDisposition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatDisposition() {
        return matDisposition;
    }

    /**
     * Sets the value of the matDisposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatDisposition(String value) {
        this.matDisposition = value;
    }

}
