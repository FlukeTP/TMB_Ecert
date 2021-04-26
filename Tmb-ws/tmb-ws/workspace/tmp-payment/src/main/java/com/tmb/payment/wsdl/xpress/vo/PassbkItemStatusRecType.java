
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassbkItemStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassbkItemStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PassbkItemId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PassbkItemStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassbkItemStatusRec_Type", propOrder = {
    "passbkItemId",
    "passbkItemStatus"
})
public class PassbkItemStatusRecType {

    @XmlElement(name = "PassbkItemId", required = true)
    protected String passbkItemId;
    @XmlElement(name = "PassbkItemStatus", required = true)
    protected PassbkItemStatusType passbkItemStatus;

    /**
     * Gets the value of the passbkItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassbkItemId() {
        return passbkItemId;
    }

    /**
     * Sets the value of the passbkItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassbkItemId(String value) {
        this.passbkItemId = value;
    }

    /**
     * Gets the value of the passbkItemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PassbkItemStatusType }
     *     
     */
    public PassbkItemStatusType getPassbkItemStatus() {
        return passbkItemStatus;
    }

    /**
     * Sets the value of the passbkItemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassbkItemStatusType }
     *     
     */
    public void setPassbkItemStatus(PassbkItemStatusType value) {
        this.passbkItemStatus = value;
    }

}
