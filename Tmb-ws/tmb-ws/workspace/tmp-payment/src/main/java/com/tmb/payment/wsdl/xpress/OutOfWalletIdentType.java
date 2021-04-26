
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutOfWalletIdent_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutOfWalletIdent_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OutOfWalletIdentType" type="{http://www.fnf.com/xes}OutOfWalletIdentType_Type"/&gt;
 *         &lt;element name="OutOfWalletIdentValue" type="{http://www.fnf.com/xes}OutOfWalletIdentValue_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutOfWalletIdent_Type", propOrder = {
    "outOfWalletIdentType",
    "outOfWalletIdentValue"
})
public class OutOfWalletIdentType {

    @XmlElement(name = "OutOfWalletIdentType", required = true)
    protected String outOfWalletIdentType;
    @XmlElement(name = "OutOfWalletIdentValue", required = true)
    protected String outOfWalletIdentValue;

    /**
     * Gets the value of the outOfWalletIdentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfWalletIdentType() {
        return outOfWalletIdentType;
    }

    /**
     * Sets the value of the outOfWalletIdentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfWalletIdentType(String value) {
        this.outOfWalletIdentType = value;
    }

    /**
     * Gets the value of the outOfWalletIdentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfWalletIdentValue() {
        return outOfWalletIdentValue;
    }

    /**
     * Sets the value of the outOfWalletIdentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfWalletIdentValue(String value) {
        this.outOfWalletIdentValue = value;
    }

}
