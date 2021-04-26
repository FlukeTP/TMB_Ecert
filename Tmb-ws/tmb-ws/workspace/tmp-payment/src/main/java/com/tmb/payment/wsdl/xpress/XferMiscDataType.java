
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XferMiscData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XferMiscData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RecXferMiscType"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MiscText"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XferMiscData_Type", propOrder = {
    "recXferMiscType",
    "miscText"
})
public class XferMiscDataType {

    @XmlElement(name = "RecXferMiscType", required = true)
    protected String recXferMiscType;
    @XmlElement(name = "MiscText", required = true)
    protected String miscText;

    /**
     * Gets the value of the recXferMiscType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecXferMiscType() {
        return recXferMiscType;
    }

    /**
     * Sets the value of the recXferMiscType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecXferMiscType(String value) {
        this.recXferMiscType = value;
    }

    /**
     * Gets the value of the miscText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscText() {
        return miscText;
    }

    /**
     * Sets the value of the miscText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscText(String value) {
        this.miscText = value;
    }

}
