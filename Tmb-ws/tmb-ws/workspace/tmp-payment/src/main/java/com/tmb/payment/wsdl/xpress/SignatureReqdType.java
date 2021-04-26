
package com.tmb.payment.wsdl.xpress;

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
    "numSignatureReqd"
})
public class SignatureReqdType {

    @XmlElement(name = "NumSignatureReqd", namespace = "urn:ifxforum-org:XSD:1")
    protected long numSignatureReqd;

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

}
