
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemitStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemitStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RemitId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RemitStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemitStatusRec_Type", propOrder = {
    "remitId",
    "remitStatus"
})
public class RemitStatusRecType {

    @XmlElement(name = "RemitId")
    protected String remitId;
    @XmlElement(name = "RemitStatus")
    protected RemitStatusType remitStatus;

    /**
     * Gets the value of the remitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemitId() {
        return remitId;
    }

    /**
     * Sets the value of the remitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemitId(String value) {
        this.remitId = value;
    }

    /**
     * Gets the value of the remitStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RemitStatusType }
     *     
     */
    public RemitStatusType getRemitStatus() {
        return remitStatus;
    }

    /**
     * Sets the value of the remitStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemitStatusType }
     *     
     */
    public void setRemitStatus(RemitStatusType value) {
        this.remitStatus = value;
    }

}
