
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyAuth_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyAuth_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}PartyAuth_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SecTokenImage" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Phrase" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AuthType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SecretWrd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SecTokenPswd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyAuth_Type", propOrder = {
    "secTokenImage",
    "phrase",
    "authType",
    "secretWrd",
    "secTokenPswd"
})
public class PartyAuthType
    extends com.tmb.payment.wsdl.xpress.vo.PartyAuthType
{

    @XmlElement(name = "SecTokenImage")
    protected SecTokenImageType secTokenImage;
    @XmlElement(name = "Phrase")
    protected String phrase;
    @XmlElement(name = "AuthType")
    protected String authType;
    @XmlElement(name = "SecretWrd")
    protected String secretWrd;
    @XmlElement(name = "SecTokenPswd")
    protected SecTokenPswdType secTokenPswd;

    /**
     * Gets the value of the secTokenImage property.
     * 
     * @return
     *     possible object is
     *     {@link SecTokenImageType }
     *     
     */
    public SecTokenImageType getSecTokenImage() {
        return secTokenImage;
    }

    /**
     * Sets the value of the secTokenImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecTokenImageType }
     *     
     */
    public void setSecTokenImage(SecTokenImageType value) {
        this.secTokenImage = value;
    }

    /**
     * Gets the value of the phrase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhrase() {
        return phrase;
    }

    /**
     * Sets the value of the phrase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhrase(String value) {
        this.phrase = value;
    }

    /**
     * Gets the value of the authType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthType() {
        return authType;
    }

    /**
     * Sets the value of the authType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthType(String value) {
        this.authType = value;
    }

    /**
     * Gets the value of the secretWrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecretWrd() {
        return secretWrd;
    }

    /**
     * Sets the value of the secretWrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecretWrd(String value) {
        this.secretWrd = value;
    }

    /**
     * Gets the value of the secTokenPswd property.
     * 
     * @return
     *     possible object is
     *     {@link SecTokenPswdType }
     *     
     */
    public SecTokenPswdType getSecTokenPswd() {
        return secTokenPswd;
    }

    /**
     * Sets the value of the secTokenPswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecTokenPswdType }
     *     
     */
    public void setSecTokenPswd(SecTokenPswdType value) {
        this.secTokenPswd = value;
    }

}
