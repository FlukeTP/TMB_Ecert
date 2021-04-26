
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecTokenCard_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecTokenCard_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}SecToken_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardEmbossNum"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardSeqNum" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Brand" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardTechnology" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ExpDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardVrfyData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CSPhoneNum" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PINData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecTokenCard_Type", propOrder = {
    "cardEmbossNum",
    "cardSeqNum",
    "brand",
    "cardTechnology",
    "expDt",
    "cardVrfyData",
    "name",
    "csPhoneNum",
    "pinData"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.SecTokenCardType.class
})
public class SecTokenCardType
    extends SecTokenType
{

    @XmlElement(name = "CardEmbossNum", required = true)
    protected String cardEmbossNum;
    @XmlElement(name = "CardSeqNum")
    protected String cardSeqNum;
    @XmlElement(name = "Brand")
    protected String brand;
    @XmlElement(name = "CardTechnology")
    protected String cardTechnology;
    @XmlElement(name = "ExpDt")
    protected String expDt;
    @XmlElement(name = "CardVrfyData")
    protected String cardVrfyData;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "CSPhoneNum")
    protected String csPhoneNum;
    @XmlElement(name = "PINData")
    protected PINDataType pinData;

    /**
     * Gets the value of the cardEmbossNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardEmbossNum() {
        return cardEmbossNum;
    }

    /**
     * Sets the value of the cardEmbossNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardEmbossNum(String value) {
        this.cardEmbossNum = value;
    }

    /**
     * Gets the value of the cardSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSeqNum() {
        return cardSeqNum;
    }

    /**
     * Sets the value of the cardSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSeqNum(String value) {
        this.cardSeqNum = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the cardTechnology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardTechnology() {
        return cardTechnology;
    }

    /**
     * Sets the value of the cardTechnology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardTechnology(String value) {
        this.cardTechnology = value;
    }

    /**
     * Gets the value of the expDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpDt() {
        return expDt;
    }

    /**
     * Sets the value of the expDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpDt(String value) {
        this.expDt = value;
    }

    /**
     * Gets the value of the cardVrfyData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardVrfyData() {
        return cardVrfyData;
    }

    /**
     * Sets the value of the cardVrfyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardVrfyData(String value) {
        this.cardVrfyData = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the csPhoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSPhoneNum() {
        return csPhoneNum;
    }

    /**
     * Sets the value of the csPhoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSPhoneNum(String value) {
        this.csPhoneNum = value;
    }

    /**
     * Gets the value of the pinData property.
     * 
     * @return
     *     possible object is
     *     {@link PINDataType }
     *     
     */
    public PINDataType getPINData() {
        return pinData;
    }

    /**
     * Sets the value of the pinData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PINDataType }
     *     
     */
    public void setPINData(PINDataType value) {
        this.pinData = value;
    }

}
