
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardVrfyDataBlock_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardVrfyDataBlock_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CryptType"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CardVerifyData"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardVrfyDataBlock_Type", propOrder = {
    "cryptType",
    "cardVerifyData"
})
public class CardVrfyDataBlockType {

    @XmlElement(name = "CryptType", namespace = "urn:ifxforum-org:XSD:1", required = true)
    protected String cryptType;
    @XmlElement(name = "CardVerifyData", required = true)
    protected String cardVerifyData;

    /**
     * Gets the value of the cryptType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCryptType() {
        return cryptType;
    }

    /**
     * Sets the value of the cryptType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCryptType(String value) {
        this.cryptType = value;
    }

    /**
     * Gets the value of the cardVerifyData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardVerifyData() {
        return cardVerifyData;
    }

    /**
     * Sets the value of the cardVerifyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardVerifyData(String value) {
        this.cardVerifyData = value;
    }

}
