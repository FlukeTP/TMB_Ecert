
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for YodleeAcctKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="YodleeAcctKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}YodleeAcctId"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YodleeAcctKeys_Type", propOrder = {
    "yodleeAcctId"
})
public class YodleeAcctKeysType {

    @XmlElement(name = "YodleeAcctId", required = true)
    protected String yodleeAcctId;

    /**
     * Gets the value of the yodleeAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYodleeAcctId() {
        return yodleeAcctId;
    }

    /**
     * Sets the value of the yodleeAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYodleeAcctId(String value) {
        this.yodleeAcctId = value;
    }

}
