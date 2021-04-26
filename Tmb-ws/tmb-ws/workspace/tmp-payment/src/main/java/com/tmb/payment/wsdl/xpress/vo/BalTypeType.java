
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalType_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalType_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BalTypeSource" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BalTypeValues"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalType_Type", propOrder = {
    "balTypeSource",
    "balTypeValues"
})
public class BalTypeType {

    @XmlElement(name = "BalTypeSource")
    protected String balTypeSource;
    @XmlElement(name = "BalTypeValues", required = true)
    protected String balTypeValues;

    /**
     * Gets the value of the balTypeSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalTypeSource() {
        return balTypeSource;
    }

    /**
     * Sets the value of the balTypeSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalTypeSource(String value) {
        this.balTypeSource = value;
    }

    /**
     * Gets the value of the balTypeValues property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalTypeValues() {
        return balTypeValues;
    }

    /**
     * Sets the value of the balTypeValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalTypeValues(String value) {
        this.balTypeValues = value;
    }

}
