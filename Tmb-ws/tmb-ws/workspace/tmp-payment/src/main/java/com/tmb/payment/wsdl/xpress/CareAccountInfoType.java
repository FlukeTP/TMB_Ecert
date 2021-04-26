
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CareAccountInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CareAccountInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}BenefitialryName"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}BenefitialryRelationship"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}BenefitialryPercentage"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CareAccountInfo_Type", propOrder = {
    "benefitialryName",
    "benefitialryRelationship",
    "benefitialryPercentage"
})
public class CareAccountInfoType {

    @XmlElement(name = "BenefitialryName", required = true)
    protected String benefitialryName;
    @XmlElement(name = "BenefitialryRelationship", required = true)
    protected String benefitialryRelationship;
    @XmlElement(name = "BenefitialryPercentage")
    protected long benefitialryPercentage;

    /**
     * Gets the value of the benefitialryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitialryName() {
        return benefitialryName;
    }

    /**
     * Sets the value of the benefitialryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitialryName(String value) {
        this.benefitialryName = value;
    }

    /**
     * Gets the value of the benefitialryRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitialryRelationship() {
        return benefitialryRelationship;
    }

    /**
     * Sets the value of the benefitialryRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitialryRelationship(String value) {
        this.benefitialryRelationship = value;
    }

    /**
     * Gets the value of the benefitialryPercentage property.
     * 
     */
    public long getBenefitialryPercentage() {
        return benefitialryPercentage;
    }

    /**
     * Sets the value of the benefitialryPercentage property.
     * 
     */
    public void setBenefitialryPercentage(long value) {
        this.benefitialryPercentage = value;
    }

}
