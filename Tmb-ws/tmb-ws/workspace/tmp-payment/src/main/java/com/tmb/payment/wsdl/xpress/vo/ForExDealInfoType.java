
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForExDealInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForExDealInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ForExQuoteKeys"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForExDealInfo_Type", propOrder = {
    "forExQuoteKeys"
})
public class ForExDealInfoType {

    @XmlElement(name = "ForExQuoteKeys", required = true)
    protected ForExQuoteKeysType forExQuoteKeys;

    /**
     * Gets the value of the forExQuoteKeys property.
     * 
     * @return
     *     possible object is
     *     {@link ForExQuoteKeysType }
     *     
     */
    public ForExQuoteKeysType getForExQuoteKeys() {
        return forExQuoteKeys;
    }

    /**
     * Sets the value of the forExQuoteKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExQuoteKeysType }
     *     
     */
    public void setForExQuoteKeys(ForExQuoteKeysType value) {
        this.forExQuoteKeys = value;
    }

}
