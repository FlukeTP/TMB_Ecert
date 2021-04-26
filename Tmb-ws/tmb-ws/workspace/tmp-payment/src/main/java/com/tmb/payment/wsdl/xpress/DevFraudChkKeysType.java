
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevFraudChkKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevFraudChkKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DevFraudChkId"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevFraudChkKeys_Type", propOrder = {
    "devFraudChkId"
})
public class DevFraudChkKeysType {

    @XmlElement(name = "DevFraudChkId", required = true)
    protected String devFraudChkId;

    /**
     * Gets the value of the devFraudChkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevFraudChkId() {
        return devFraudChkId;
    }

    /**
     * Sets the value of the devFraudChkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevFraudChkId(String value) {
        this.devFraudChkId = value;
    }

}
