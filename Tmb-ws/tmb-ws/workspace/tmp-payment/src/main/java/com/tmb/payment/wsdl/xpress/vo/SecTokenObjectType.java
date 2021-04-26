
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecTokenObject_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecTokenObject_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}SecToken_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CardVerifyType"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DocumentVerifyType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecTokenObject_Type", propOrder = {
    "cardVerifyType",
    "documentVerifyType"
})
public class SecTokenObjectType
    extends SecTokenType
{

    @XmlElement(name = "CardVerifyType")
    protected String cardVerifyType;
    @XmlElement(name = "DocumentVerifyType")
    protected String documentVerifyType;

    /**
     * Gets the value of the cardVerifyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardVerifyType() {
        return cardVerifyType;
    }

    /**
     * Sets the value of the cardVerifyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardVerifyType(String value) {
        this.cardVerifyType = value;
    }

    /**
     * Gets the value of the documentVerifyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentVerifyType() {
        return documentVerifyType;
    }

    /**
     * Sets the value of the documentVerifyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentVerifyType(String value) {
        this.documentVerifyType = value;
    }

}
