
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XferStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XferStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}XferId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}XferStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XferStatusRec_Type", propOrder = {
    "xferId",
    "xferStatus"
})
public class XferStatusRecType {

    @XmlElement(name = "XferId")
    protected String xferId;
    @XmlElement(name = "XferStatus")
    protected XferStatusType xferStatus;

    /**
     * Gets the value of the xferId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXferId() {
        return xferId;
    }

    /**
     * Sets the value of the xferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXferId(String value) {
        this.xferId = value;
    }

    /**
     * Gets the value of the xferStatus property.
     * 
     * @return
     *     possible object is
     *     {@link XferStatusType }
     *     
     */
    public XferStatusType getXferStatus() {
        return xferStatus;
    }

    /**
     * Sets the value of the xferStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferStatusType }
     *     
     */
    public void setXferStatus(XferStatusType value) {
        this.xferStatus = value;
    }

}
