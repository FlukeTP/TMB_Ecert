
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrePaidPurchItemDetail_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrePaidPurchItemDetail_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PrePaidUnits" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrePaidPurchItemDetail_Type", propOrder = {
    "prePaidUnits"
})
public class PrePaidPurchItemDetailType {

    @XmlElement(name = "PrePaidUnits")
    protected PrePaidUnitsType prePaidUnits;

    /**
     * Gets the value of the prePaidUnits property.
     * 
     * @return
     *     possible object is
     *     {@link PrePaidUnitsType }
     *     
     */
    public PrePaidUnitsType getPrePaidUnits() {
        return prePaidUnits;
    }

    /**
     * Sets the value of the prePaidUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePaidUnitsType }
     *     
     */
    public void setPrePaidUnits(PrePaidUnitsType value) {
        this.prePaidUnits = value;
    }

}
