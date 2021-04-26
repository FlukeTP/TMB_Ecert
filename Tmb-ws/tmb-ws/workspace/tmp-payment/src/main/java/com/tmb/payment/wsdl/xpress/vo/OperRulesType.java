
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperRules_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperRules_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ProcessConcurrent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OnWarning" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OnError" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperRules_Type", propOrder = {
    "processConcurrent",
    "onWarning",
    "onError"
})
public class OperRulesType {

    @XmlElement(name = "ProcessConcurrent")
    protected Boolean processConcurrent;
    @XmlElement(name = "OnWarning")
    @XmlSchemaType(name = "string")
    protected OnWarningType onWarning;
    @XmlElement(name = "OnError")
    @XmlSchemaType(name = "string")
    protected OnErrorType onError;

    /**
     * Gets the value of the processConcurrent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProcessConcurrent() {
        return processConcurrent;
    }

    /**
     * Sets the value of the processConcurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessConcurrent(Boolean value) {
        this.processConcurrent = value;
    }

    /**
     * Gets the value of the onWarning property.
     * 
     * @return
     *     possible object is
     *     {@link OnWarningType }
     *     
     */
    public OnWarningType getOnWarning() {
        return onWarning;
    }

    /**
     * Sets the value of the onWarning property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnWarningType }
     *     
     */
    public void setOnWarning(OnWarningType value) {
        this.onWarning = value;
    }

    /**
     * Gets the value of the onError property.
     * 
     * @return
     *     possible object is
     *     {@link OnErrorType }
     *     
     */
    public OnErrorType getOnError() {
        return onError;
    }

    /**
     * Sets the value of the onError property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnErrorType }
     *     
     */
    public void setOnError(OnErrorType value) {
        this.onError = value;
    }

}
