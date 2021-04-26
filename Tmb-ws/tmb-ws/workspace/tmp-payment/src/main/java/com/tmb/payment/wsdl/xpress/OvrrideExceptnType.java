
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OvrrideExceptn_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OvrrideExceptn_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ExceptionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ExceptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OverrideStatInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ExceptionDesc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvrrideExceptn_Type", propOrder = {
    "exceptionCode",
    "exceptionType",
    "overrideStatInd",
    "exceptionDesc"
})
public class OvrrideExceptnType {

    @XmlElement(name = "ExceptionCode")
    protected String exceptionCode;
    @XmlElement(name = "ExceptionType", namespace = "urn:ifxforum-org:XSD:1")
    protected String exceptionType;
    @XmlElement(name = "OverrideStatInd")
    protected Boolean overrideStatInd;
    @XmlElement(name = "ExceptionDesc")
    protected String exceptionDesc;

    /**
     * Gets the value of the exceptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionCode() {
        return exceptionCode;
    }

    /**
     * Sets the value of the exceptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionCode(String value) {
        this.exceptionCode = value;
    }

    /**
     * Gets the value of the exceptionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionType() {
        return exceptionType;
    }

    /**
     * Sets the value of the exceptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionType(String value) {
        this.exceptionType = value;
    }

    /**
     * Gets the value of the overrideStatInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideStatInd() {
        return overrideStatInd;
    }

    /**
     * Sets the value of the overrideStatInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideStatInd(Boolean value) {
        this.overrideStatInd = value;
    }

    /**
     * Gets the value of the exceptionDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionDesc() {
        return exceptionDesc;
    }

    /**
     * Sets the value of the exceptionDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionDesc(String value) {
        this.exceptionDesc = value;
    }

}
