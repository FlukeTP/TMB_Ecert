
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchItemStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchItemStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PurchItemId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PurchItemStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchItemStatusRec_Type", propOrder = {
    "purchItemId",
    "purchItemStatus"
})
public class PurchItemStatusRecType {

    @XmlElement(name = "PurchItemId")
    protected String purchItemId;
    @XmlElement(name = "PurchItemStatus")
    protected PurchItemStatusType purchItemStatus;

    /**
     * Gets the value of the purchItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchItemId() {
        return purchItemId;
    }

    /**
     * Sets the value of the purchItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchItemId(String value) {
        this.purchItemId = value;
    }

    /**
     * Gets the value of the purchItemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PurchItemStatusType }
     *     
     */
    public PurchItemStatusType getPurchItemStatus() {
        return purchItemStatus;
    }

    /**
     * Sets the value of the purchItemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchItemStatusType }
     *     
     */
    public void setPurchItemStatus(PurchItemStatusType value) {
        this.purchItemStatus = value;
    }

}
