
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorrespdnceIdent_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorrespdnceIdent_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CorrespdnceIdentType"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CorrespdnceIdentValue"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrespdnceIdent_Type", propOrder = {
    "correspdnceIdentType",
    "correspdnceIdentValue"
})
public class CorrespdnceIdentType {

    @XmlElement(name = "CorrespdnceIdentType", required = true)
    protected String correspdnceIdentType;
    @XmlElement(name = "CorrespdnceIdentValue", required = true)
    protected String correspdnceIdentValue;

    /**
     * Gets the value of the correspdnceIdentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespdnceIdentType() {
        return correspdnceIdentType;
    }

    /**
     * Sets the value of the correspdnceIdentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespdnceIdentType(String value) {
        this.correspdnceIdentType = value;
    }

    /**
     * Gets the value of the correspdnceIdentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespdnceIdentValue() {
        return correspdnceIdentValue;
    }

    /**
     * Sets the value of the correspdnceIdentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespdnceIdentValue(String value) {
        this.correspdnceIdentValue = value;
    }

}
