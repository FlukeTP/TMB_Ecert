
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecTokenSecretAnswer_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecTokenSecretAnswer_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}SecToken_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecretIdent"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CryptType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecObjId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}Secret"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CryptSecret"/&gt;
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
@XmlType(name = "SecTokenSecretAnswer_Type", propOrder = {
    "secretIdent",
    "cryptType",
    "secObjId",
    "secret",
    "cryptSecret"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.SecTokenSecretAnswerType.class
})
public class SecTokenSecretAnswerType
    extends SecTokenType
{

    @XmlElement(name = "SecretIdent", required = true)
    protected String secretIdent;
    @XmlElement(name = "CryptType", required = true)
    protected String cryptType;
    @XmlElement(name = "SecObjId")
    protected List<String> secObjId;
    @XmlElement(name = "Secret")
    protected String secret;
    @XmlElement(name = "CryptSecret")
    protected CryptSecretType cryptSecret;

    /**
     * Gets the value of the secretIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecretIdent() {
        return secretIdent;
    }

    /**
     * Sets the value of the secretIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecretIdent(String value) {
        this.secretIdent = value;
    }

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
     * Gets the value of the secObjId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secObjId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecObjId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSecObjId() {
        if (secObjId == null) {
            secObjId = new ArrayList<String>();
        }
        return this.secObjId;
    }

    /**
     * Gets the value of the secret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecret() {
        return secret;
    }

    /**
     * Sets the value of the secret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecret(String value) {
        this.secret = value;
    }

    /**
     * Gets the value of the cryptSecret property.
     * 
     * @return
     *     possible object is
     *     {@link CryptSecretType }
     *     
     */
    public CryptSecretType getCryptSecret() {
        return cryptSecret;
    }

    /**
     * Sets the value of the cryptSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptSecretType }
     *     
     */
    public void setCryptSecret(CryptSecretType value) {
        this.cryptSecret = value;
    }

}
