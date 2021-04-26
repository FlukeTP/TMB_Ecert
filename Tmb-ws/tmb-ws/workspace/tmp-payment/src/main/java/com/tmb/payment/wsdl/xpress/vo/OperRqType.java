
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperRq_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperRq_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OperRqUID"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OperRqHdr"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperRq_Type", propOrder = {
    "operRqUID",
    "operRqHdr"
})
public class OperRqType {

    @XmlElement(name = "OperRqUID", required = true)
    protected String operRqUID;
    @XmlElement(name = "OperRqHdr", required = true)
    protected OperRqHdrType operRqHdr;

    /**
     * Gets the value of the operRqUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperRqUID() {
        return operRqUID;
    }

    /**
     * Sets the value of the operRqUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperRqUID(String value) {
        this.operRqUID = value;
    }

    /**
     * Gets the value of the operRqHdr property.
     * 
     * @return
     *     possible object is
     *     {@link OperRqHdrType }
     *     
     */
    public OperRqHdrType getOperRqHdr() {
        return operRqHdr;
    }

    /**
     * Sets the value of the operRqHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperRqHdrType }
     *     
     */
    public void setOperRqHdr(OperRqHdrType value) {
        this.operRqHdr = value;
    }

}
