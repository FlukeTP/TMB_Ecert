
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdentVerification_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentVerification_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}IdentVerifyType"/&gt;
 *         &lt;element name="IdentVerifyResults" type="{urn:ifxforum-org:XSD:1}LongText_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentVerification_Type", propOrder = {
    "identVerifyType",
    "identVerifyResults"
})
public class IdentVerificationType {

    @XmlElement(name = "IdentVerifyType", required = true)
    protected String identVerifyType;
    @XmlElement(name = "IdentVerifyResults")
    protected String identVerifyResults;

    /**
     * Gets the value of the identVerifyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentVerifyType() {
        return identVerifyType;
    }

    /**
     * Sets the value of the identVerifyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentVerifyType(String value) {
        this.identVerifyType = value;
    }

    /**
     * Gets the value of the identVerifyResults property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentVerifyResults() {
        return identVerifyResults;
    }

    /**
     * Sets the value of the identVerifyResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentVerifyResults(String value) {
        this.identVerifyResults = value;
    }

}
