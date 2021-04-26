
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignatureReqd_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignatureReqd_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}NumSignatureReqd"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SignatureAmtLimit" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SignatureTransaction" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SigningInstruction" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureReqd_Type", propOrder = {
    "numSignatureReqd",
    "signatureAmtLimit",
    "signatureTransaction",
    "signingInstruction"
})
public class SignatureReqdType {

    @XmlElement(name = "NumSignatureReqd")
    protected long numSignatureReqd;
    @XmlElement(name = "SignatureAmtLimit")
    protected SignatureAmtLimitType signatureAmtLimit;
    @XmlElement(name = "SignatureTransaction")
    protected String signatureTransaction;
    @XmlElement(name = "SigningInstruction")
    protected String signingInstruction;

    /**
     * Gets the value of the numSignatureReqd property.
     * 
     */
    public long getNumSignatureReqd() {
        return numSignatureReqd;
    }

    /**
     * Sets the value of the numSignatureReqd property.
     * 
     */
    public void setNumSignatureReqd(long value) {
        this.numSignatureReqd = value;
    }

    /**
     * Gets the value of the signatureAmtLimit property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureAmtLimitType }
     *     
     */
    public SignatureAmtLimitType getSignatureAmtLimit() {
        return signatureAmtLimit;
    }

    /**
     * Sets the value of the signatureAmtLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureAmtLimitType }
     *     
     */
    public void setSignatureAmtLimit(SignatureAmtLimitType value) {
        this.signatureAmtLimit = value;
    }

    /**
     * Gets the value of the signatureTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureTransaction() {
        return signatureTransaction;
    }

    /**
     * Sets the value of the signatureTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureTransaction(String value) {
        this.signatureTransaction = value;
    }

    /**
     * Gets the value of the signingInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigningInstruction() {
        return signingInstruction;
    }

    /**
     * Sets the value of the signingInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigningInstruction(String value) {
        this.signingInstruction = value;
    }

}
