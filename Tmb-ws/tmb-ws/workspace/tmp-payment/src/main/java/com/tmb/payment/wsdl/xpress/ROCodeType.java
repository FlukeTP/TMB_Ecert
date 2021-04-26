
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ROCode_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ROCode_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Segment" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SubSegment" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ServiceModel" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TellerId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ROCode_Type", propOrder = {
    "segment",
    "subSegment",
    "serviceModel",
    "tellerId"
})
public class ROCodeType {

    @XmlElement(name = "Segment")
    protected String segment;
    @XmlElement(name = "SubSegment")
    protected String subSegment;
    @XmlElement(name = "ServiceModel")
    protected String serviceModel;
    @XmlElement(name = "TellerId")
    protected String tellerId;

    /**
     * Gets the value of the segment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment() {
        return segment;
    }

    /**
     * Sets the value of the segment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment(String value) {
        this.segment = value;
    }

    /**
     * Gets the value of the subSegment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSegment() {
        return subSegment;
    }

    /**
     * Sets the value of the subSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubSegment(String value) {
        this.subSegment = value;
    }

    /**
     * Gets the value of the serviceModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceModel() {
        return serviceModel;
    }

    /**
     * Sets the value of the serviceModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceModel(String value) {
        this.serviceModel = value;
    }

    /**
     * Gets the value of the tellerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTellerId() {
        return tellerId;
    }

    /**
     * Sets the value of the tellerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTellerId(String value) {
        this.tellerId = value;
    }

}
