
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PswdStatus_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PswdStatus_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PswdStatusCode"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Desc"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PswdStatusValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PswdStatus_Type", propOrder = {
    "pswdStatusCode",
    "desc",
    "pswdStatusValue"
})
public class PswdStatusType {

    @XmlElement(name = "PswdStatusCode", required = true)
    protected String pswdStatusCode;
    @XmlElement(name = "Desc", namespace = "urn:ifxforum-org:XSD:1", required = true)
    protected String desc;
    @XmlElement(name = "PswdStatusValue")
    protected String pswdStatusValue;

    /**
     * Gets the value of the pswdStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPswdStatusCode() {
        return pswdStatusCode;
    }

    /**
     * Sets the value of the pswdStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPswdStatusCode(String value) {
        this.pswdStatusCode = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the pswdStatusValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPswdStatusValue() {
        return pswdStatusValue;
    }

    /**
     * Sets the value of the pswdStatusValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPswdStatusValue(String value) {
        this.pswdStatusValue = value;
    }

}
