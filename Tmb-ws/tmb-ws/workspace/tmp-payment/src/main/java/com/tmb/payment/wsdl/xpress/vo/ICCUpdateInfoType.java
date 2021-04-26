
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ICCUpdateInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ICCUpdateInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IssuerScriptData"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardRef" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICCUpdateInfo_Type", propOrder = {
    "issuerScriptData",
    "cardRef"
})
public class ICCUpdateInfoType {

    @XmlElement(name = "IssuerScriptData", required = true)
    protected IssuerScriptDataType issuerScriptData;
    @XmlElement(name = "CardRef")
    protected CardRefType cardRef;

    /**
     * Gets the value of the issuerScriptData property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerScriptDataType }
     *     
     */
    public IssuerScriptDataType getIssuerScriptData() {
        return issuerScriptData;
    }

    /**
     * Sets the value of the issuerScriptData property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerScriptDataType }
     *     
     */
    public void setIssuerScriptData(IssuerScriptDataType value) {
        this.issuerScriptData = value;
    }

    /**
     * Gets the value of the cardRef property.
     * 
     * @return
     *     possible object is
     *     {@link CardRefType }
     *     
     */
    public CardRefType getCardRef() {
        return cardRef;
    }

    /**
     * Sets the value of the cardRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardRefType }
     *     
     */
    public void setCardRef(CardRefType value) {
        this.cardRef = value;
    }

}
