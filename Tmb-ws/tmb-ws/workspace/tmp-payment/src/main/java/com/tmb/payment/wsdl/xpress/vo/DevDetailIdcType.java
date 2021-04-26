
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevDetailIdc_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevDetailIdc_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevIdcType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevIdcOperation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevIdcMedia"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevIdcRetainBin"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevIdcCards" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevIdcRetainedCard" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevIdcSecurity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DevIdcChipPower" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevDetailIdc_Type", propOrder = {
    "devIdcType",
    "devIdcOperation",
    "devIdcMedia",
    "devIdcRetainBin",
    "devIdcCards",
    "devIdcRetainedCard",
    "devIdcSecurity",
    "devIdcChipPower"
})
public class DevDetailIdcType {

    @XmlElement(name = "DevIdcType", required = true)
    protected String devIdcType;
    @XmlElement(name = "DevIdcOperation")
    protected String devIdcOperation;
    @XmlElement(name = "DevIdcMedia", required = true)
    @XmlSchemaType(name = "string")
    protected DevIdcMediaType devIdcMedia;
    @XmlElement(name = "DevIdcRetainBin", required = true)
    @XmlSchemaType(name = "string")
    protected DevIdcRetainBinType devIdcRetainBin;
    @XmlElement(name = "DevIdcCards")
    protected Long devIdcCards;
    @XmlElement(name = "DevIdcRetainedCard")
    protected DevIdcRetainedCardType devIdcRetainedCard;
    @XmlElement(name = "DevIdcSecurity")
    @XmlSchemaType(name = "string")
    protected DevIdcSecurityType devIdcSecurity;
    @XmlElement(name = "DevIdcChipPower")
    @XmlSchemaType(name = "string")
    protected DevIdcChipPowerType devIdcChipPower;

    /**
     * Gets the value of the devIdcType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevIdcType() {
        return devIdcType;
    }

    /**
     * Sets the value of the devIdcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevIdcType(String value) {
        this.devIdcType = value;
    }

    /**
     * Gets the value of the devIdcOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevIdcOperation() {
        return devIdcOperation;
    }

    /**
     * Sets the value of the devIdcOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevIdcOperation(String value) {
        this.devIdcOperation = value;
    }

    /**
     * Gets the value of the devIdcMedia property.
     * 
     * @return
     *     possible object is
     *     {@link DevIdcMediaType }
     *     
     */
    public DevIdcMediaType getDevIdcMedia() {
        return devIdcMedia;
    }

    /**
     * Sets the value of the devIdcMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevIdcMediaType }
     *     
     */
    public void setDevIdcMedia(DevIdcMediaType value) {
        this.devIdcMedia = value;
    }

    /**
     * Gets the value of the devIdcRetainBin property.
     * 
     * @return
     *     possible object is
     *     {@link DevIdcRetainBinType }
     *     
     */
    public DevIdcRetainBinType getDevIdcRetainBin() {
        return devIdcRetainBin;
    }

    /**
     * Sets the value of the devIdcRetainBin property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevIdcRetainBinType }
     *     
     */
    public void setDevIdcRetainBin(DevIdcRetainBinType value) {
        this.devIdcRetainBin = value;
    }

    /**
     * Gets the value of the devIdcCards property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDevIdcCards() {
        return devIdcCards;
    }

    /**
     * Sets the value of the devIdcCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDevIdcCards(Long value) {
        this.devIdcCards = value;
    }

    /**
     * Gets the value of the devIdcRetainedCard property.
     * 
     * @return
     *     possible object is
     *     {@link DevIdcRetainedCardType }
     *     
     */
    public DevIdcRetainedCardType getDevIdcRetainedCard() {
        return devIdcRetainedCard;
    }

    /**
     * Sets the value of the devIdcRetainedCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevIdcRetainedCardType }
     *     
     */
    public void setDevIdcRetainedCard(DevIdcRetainedCardType value) {
        this.devIdcRetainedCard = value;
    }

    /**
     * Gets the value of the devIdcSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link DevIdcSecurityType }
     *     
     */
    public DevIdcSecurityType getDevIdcSecurity() {
        return devIdcSecurity;
    }

    /**
     * Sets the value of the devIdcSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevIdcSecurityType }
     *     
     */
    public void setDevIdcSecurity(DevIdcSecurityType value) {
        this.devIdcSecurity = value;
    }

    /**
     * Gets the value of the devIdcChipPower property.
     * 
     * @return
     *     possible object is
     *     {@link DevIdcChipPowerType }
     *     
     */
    public DevIdcChipPowerType getDevIdcChipPower() {
        return devIdcChipPower;
    }

    /**
     * Sets the value of the devIdcChipPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevIdcChipPowerType }
     *     
     */
    public void setDevIdcChipPower(DevIdcChipPowerType value) {
        this.devIdcChipPower = value;
    }

}
