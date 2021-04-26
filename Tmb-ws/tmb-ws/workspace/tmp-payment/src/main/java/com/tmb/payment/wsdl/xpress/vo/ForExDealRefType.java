
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForExDealRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForExDealRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ForExDealRef"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ForExDealRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ForExDealInfo"/&gt;
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
@XmlType(name = "ForExDealRef_Type", propOrder = {
    "forExDealRef",
    "forExDealRec",
    "forExDealInfo"
})
public class ForExDealRefType {

    @XmlElement(name = "ForExDealRef")
    protected ForExDealRefType forExDealRef;
    @XmlElement(name = "ForExDealRec")
    protected ForExDealRecType forExDealRec;
    @XmlElement(name = "ForExDealInfo")
    protected ForExDealInfoType forExDealInfo;

    /**
     * Gets the value of the forExDealRef property.
     * 
     * @return
     *     possible object is
     *     {@link ForExDealRefType }
     *     
     */
    public ForExDealRefType getForExDealRef() {
        return forExDealRef;
    }

    /**
     * Sets the value of the forExDealRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExDealRefType }
     *     
     */
    public void setForExDealRef(ForExDealRefType value) {
        this.forExDealRef = value;
    }

    /**
     * Gets the value of the forExDealRec property.
     * 
     * @return
     *     possible object is
     *     {@link ForExDealRecType }
     *     
     */
    public ForExDealRecType getForExDealRec() {
        return forExDealRec;
    }

    /**
     * Sets the value of the forExDealRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExDealRecType }
     *     
     */
    public void setForExDealRec(ForExDealRecType value) {
        this.forExDealRec = value;
    }

    /**
     * Gets the value of the forExDealInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ForExDealInfoType }
     *     
     */
    public ForExDealInfoType getForExDealInfo() {
        return forExDealInfo;
    }

    /**
     * Sets the value of the forExDealInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForExDealInfoType }
     *     
     */
    public void setForExDealInfo(ForExDealInfoType value) {
        this.forExDealInfo = value;
    }

}
