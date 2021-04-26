
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocCtrlIn_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocCtrlIn_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DeliveryMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DeliveryMedia" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PageCountLimit" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocCtrlIn_Type", propOrder = {
    "deliveryMethod",
    "deliveryMedia",
    "pageCountLimit"
})
public class DocCtrlInType {

    @XmlElement(name = "DeliveryMethod")
    protected String deliveryMethod;
    @XmlElement(name = "DeliveryMedia")
    protected String deliveryMedia;
    @XmlElement(name = "PageCountLimit")
    protected PageCountLimitType pageCountLimit;

    /**
     * Gets the value of the deliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * Sets the value of the deliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryMethod(String value) {
        this.deliveryMethod = value;
    }

    /**
     * Gets the value of the deliveryMedia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryMedia() {
        return deliveryMedia;
    }

    /**
     * Sets the value of the deliveryMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryMedia(String value) {
        this.deliveryMedia = value;
    }

    /**
     * Gets the value of the pageCountLimit property.
     * 
     * @return
     *     possible object is
     *     {@link PageCountLimitType }
     *     
     */
    public PageCountLimitType getPageCountLimit() {
        return pageCountLimit;
    }

    /**
     * Sets the value of the pageCountLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageCountLimitType }
     *     
     */
    public void setPageCountLimit(PageCountLimitType value) {
        this.pageCountLimit = value;
    }

}
