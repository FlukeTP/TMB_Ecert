
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditAthRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditAthRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CreditAthKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CreditAthRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CreditAthInfo"/&gt;
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
@XmlType(name = "CreditAthRef_Type", propOrder = {
    "creditAthKeys",
    "creditAthRec",
    "creditAthInfo"
})
public class CreditAthRefType {

    @XmlElement(name = "CreditAthKeys")
    protected CreditAthKeysType creditAthKeys;
    @XmlElement(name = "CreditAthRec")
    protected CreditAthRecType creditAthRec;
    @XmlElement(name = "CreditAthInfo")
    protected CreditAthInfoType creditAthInfo;

    /**
     * Gets the value of the creditAthKeys property.
     * 
     * @return
     *     possible object is
     *     {@link CreditAthKeysType }
     *     
     */
    public CreditAthKeysType getCreditAthKeys() {
        return creditAthKeys;
    }

    /**
     * Sets the value of the creditAthKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditAthKeysType }
     *     
     */
    public void setCreditAthKeys(CreditAthKeysType value) {
        this.creditAthKeys = value;
    }

    /**
     * Gets the value of the creditAthRec property.
     * 
     * @return
     *     possible object is
     *     {@link CreditAthRecType }
     *     
     */
    public CreditAthRecType getCreditAthRec() {
        return creditAthRec;
    }

    /**
     * Sets the value of the creditAthRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditAthRecType }
     *     
     */
    public void setCreditAthRec(CreditAthRecType value) {
        this.creditAthRec = value;
    }

    /**
     * Gets the value of the creditAthInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CreditAthInfoType }
     *     
     */
    public CreditAthInfoType getCreditAthInfo() {
        return creditAthInfo;
    }

    /**
     * Sets the value of the creditAthInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditAthInfoType }
     *     
     */
    public void setCreditAthInfo(CreditAthInfoType value) {
        this.creditAthInfo = value;
    }

}
