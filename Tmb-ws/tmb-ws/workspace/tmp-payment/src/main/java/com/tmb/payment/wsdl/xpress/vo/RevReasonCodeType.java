
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RevReasonCode_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RevReasonCode_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RevReasonCodeValue" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RevReasonCodeSource" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevReasonCode_Type", propOrder = {
    "revReasonCodeValue",
    "revReasonCodeSource"
})
public class RevReasonCodeType {

    @XmlElement(name = "RevReasonCodeValue")
    protected String revReasonCodeValue;
    @XmlElement(name = "RevReasonCodeSource")
    protected String revReasonCodeSource;

    /**
     * Gets the value of the revReasonCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevReasonCodeValue() {
        return revReasonCodeValue;
    }

    /**
     * Sets the value of the revReasonCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevReasonCodeValue(String value) {
        this.revReasonCodeValue = value;
    }

    /**
     * Gets the value of the revReasonCodeSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevReasonCodeSource() {
        return revReasonCodeSource;
    }

    /**
     * Sets the value of the revReasonCodeSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevReasonCodeSource(String value) {
        this.revReasonCodeSource = value;
    }

}
