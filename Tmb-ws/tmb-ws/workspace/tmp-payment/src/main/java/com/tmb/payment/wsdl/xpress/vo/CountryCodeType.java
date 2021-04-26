
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryCode_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountryCode_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CountryCodeSource" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CountryCodeValue"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryCode_Type", propOrder = {
    "countryCodeSource",
    "countryCodeValue"
})
@XmlSeeAlso({
    ClearingLangCodeType.class,
    ResidenceCountryType.class,
    SupplyingCountryType.class,
    TaxCountryType.class,
    TaxResidenceCountryType.class
})
public class CountryCodeType {

    @XmlElement(name = "CountryCodeSource")
    protected String countryCodeSource;
    @XmlElement(name = "CountryCodeValue", required = true)
    protected String countryCodeValue;

    /**
     * Gets the value of the countryCodeSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCodeSource() {
        return countryCodeSource;
    }

    /**
     * Sets the value of the countryCodeSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCodeSource(String value) {
        this.countryCodeSource = value;
    }

    /**
     * Gets the value of the countryCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCodeValue() {
        return countryCodeValue;
    }

    /**
     * Sets the value of the countryCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCodeValue(String value) {
        this.countryCodeValue = value;
    }

}
