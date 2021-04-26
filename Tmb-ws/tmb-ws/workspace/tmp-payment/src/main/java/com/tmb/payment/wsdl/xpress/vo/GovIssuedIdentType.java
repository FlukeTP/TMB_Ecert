
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GovIssuedIdent_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GovIssuedIdent_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CountryCode"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}GovLevel" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}GovOrgName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StateProv" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GovIssuedIdent_Type", propOrder = {
    "countryCode",
    "govLevel",
    "govOrgName",
    "stateProv"
})
public class GovIssuedIdentType {

    @XmlElement(name = "CountryCode", required = true)
    protected CountryCodeType countryCode;
    @XmlElement(name = "GovLevel")
    protected String govLevel;
    @XmlElement(name = "GovOrgName")
    protected String govOrgName;
    @XmlElement(name = "StateProv")
    protected String stateProv;

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCountryCode(CountryCodeType value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the govLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovLevel() {
        return govLevel;
    }

    /**
     * Sets the value of the govLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovLevel(String value) {
        this.govLevel = value;
    }

    /**
     * Gets the value of the govOrgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovOrgName() {
        return govOrgName;
    }

    /**
     * Sets the value of the govOrgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovOrgName(String value) {
        this.govOrgName = value;
    }

    /**
     * Gets the value of the stateProv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateProv() {
        return stateProv;
    }

    /**
     * Sets the value of the stateProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateProv(String value) {
        this.stateProv = value;
    }

}
