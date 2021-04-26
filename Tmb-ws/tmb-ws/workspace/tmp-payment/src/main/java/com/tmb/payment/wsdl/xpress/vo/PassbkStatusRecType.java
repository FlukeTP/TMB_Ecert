
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassbkStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassbkStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PassbkId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PassbkStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassbkStatusRec_Type", propOrder = {
    "passbkId",
    "passbkStatus"
})
public class PassbkStatusRecType {

    @XmlElement(name = "PassbkId", required = true)
    protected String passbkId;
    @XmlElement(name = "PassbkStatus", required = true)
    protected PassbkStatusType passbkStatus;

    /**
     * Gets the value of the passbkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassbkId() {
        return passbkId;
    }

    /**
     * Sets the value of the passbkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassbkId(String value) {
        this.passbkId = value;
    }

    /**
     * Gets the value of the passbkStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PassbkStatusType }
     *     
     */
    public PassbkStatusType getPassbkStatus() {
        return passbkStatus;
    }

    /**
     * Sets the value of the passbkStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassbkStatusType }
     *     
     */
    public void setPassbkStatus(PassbkStatusType value) {
        this.passbkStatus = value;
    }

}
