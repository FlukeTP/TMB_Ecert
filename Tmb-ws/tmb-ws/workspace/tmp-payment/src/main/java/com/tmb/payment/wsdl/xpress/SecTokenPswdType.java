
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.CryptPswdType;


/**
 * <p>Java class for SecTokenPswd_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecTokenPswd_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CryptType" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}Pswd"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CryptPswd"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecTokenPswd_Type", propOrder = {
    "cryptType",
    "pswd",
    "cryptPswd"
})
public class SecTokenPswdType {

    @XmlElement(name = "CryptType", namespace = "urn:ifxforum-org:XSD:1")
    protected String cryptType;
    @XmlElement(name = "Pswd", namespace = "urn:ifxforum-org:XSD:1")
    protected String pswd;
    @XmlElement(name = "CryptPswd", namespace = "urn:ifxforum-org:XSD:1")
    protected CryptPswdType cryptPswd;

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
     * Gets the value of the pswd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPswd() {
        return pswd;
    }

    /**
     * Sets the value of the pswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPswd(String value) {
        this.pswd = value;
    }

    /**
     * Gets the value of the cryptPswd property.
     * 
     * @return
     *     possible object is
     *     {@link CryptPswdType }
     *     
     */
    public CryptPswdType getCryptPswd() {
        return cryptPswd;
    }

    /**
     * Sets the value of the cryptPswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptPswdType }
     *     
     */
    public void setCryptPswd(CryptPswdType value) {
        this.cryptPswd = value;
    }

}
