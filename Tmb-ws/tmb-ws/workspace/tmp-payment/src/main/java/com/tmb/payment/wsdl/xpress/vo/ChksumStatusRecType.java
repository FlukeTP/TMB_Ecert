
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChksumStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChksumStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChksumId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChksumStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChksumStatusRec_Type", propOrder = {
    "chksumId",
    "chksumStatus"
})
public class ChksumStatusRecType {

    @XmlElement(name = "ChksumId")
    protected String chksumId;
    @XmlElement(name = "ChksumStatus")
    protected ChksumStatusType chksumStatus;

    /**
     * Gets the value of the chksumId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChksumId() {
        return chksumId;
    }

    /**
     * Sets the value of the chksumId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChksumId(String value) {
        this.chksumId = value;
    }

    /**
     * Gets the value of the chksumStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ChksumStatusType }
     *     
     */
    public ChksumStatusType getChksumStatus() {
        return chksumStatus;
    }

    /**
     * Sets the value of the chksumStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChksumStatusType }
     *     
     */
    public void setChksumStatus(ChksumStatusType value) {
        this.chksumStatus = value;
    }

}
