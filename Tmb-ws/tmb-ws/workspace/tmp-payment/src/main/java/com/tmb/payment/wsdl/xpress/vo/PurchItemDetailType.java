
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchItemDetail_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchItemDetail_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}RetailPurchItemDetail" minOccurs="0"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PrePaidPurchItemDetail" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchItemDetail_Type", propOrder = {
    "retailPurchItemDetail",
    "prePaidPurchItemDetail"
})
public class PurchItemDetailType {

    @XmlElement(name = "RetailPurchItemDetail")
    protected RetailPurchItemDetailType retailPurchItemDetail;
    @XmlElement(name = "PrePaidPurchItemDetail")
    protected PrePaidPurchItemDetailType prePaidPurchItemDetail;

    /**
     * Gets the value of the retailPurchItemDetail property.
     * 
     * @return
     *     possible object is
     *     {@link RetailPurchItemDetailType }
     *     
     */
    public RetailPurchItemDetailType getRetailPurchItemDetail() {
        return retailPurchItemDetail;
    }

    /**
     * Sets the value of the retailPurchItemDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailPurchItemDetailType }
     *     
     */
    public void setRetailPurchItemDetail(RetailPurchItemDetailType value) {
        this.retailPurchItemDetail = value;
    }

    /**
     * Gets the value of the prePaidPurchItemDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PrePaidPurchItemDetailType }
     *     
     */
    public PrePaidPurchItemDetailType getPrePaidPurchItemDetail() {
        return prePaidPurchItemDetail;
    }

    /**
     * Sets the value of the prePaidPurchItemDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePaidPurchItemDetailType }
     *     
     */
    public void setPrePaidPurchItemDetail(PrePaidPurchItemDetailType value) {
        this.prePaidPurchItemDetail = value;
    }

}
