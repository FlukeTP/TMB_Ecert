
package com.tmb.payment.wsdl.xpress.vo;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Chksum_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Chksum_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChksumType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChksumValue"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Chksum_Type", propOrder = {
    "chksumType",
    "chksumValue"
})
public class ChksumType {

    @XmlElement(name = "ChksumType", required = true)
    protected String chksumType;
    @XmlElement(name = "ChksumValue", required = true)
    protected BigDecimal chksumValue;

    /**
     * Gets the value of the chksumType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChksumType() {
        return chksumType;
    }

    /**
     * Sets the value of the chksumType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChksumType(String value) {
        this.chksumType = value;
    }

    /**
     * Gets the value of the chksumValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChksumValue() {
        return chksumValue;
    }

    /**
     * Sets the value of the chksumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChksumValue(BigDecimal value) {
        this.chksumValue = value;
    }

}
