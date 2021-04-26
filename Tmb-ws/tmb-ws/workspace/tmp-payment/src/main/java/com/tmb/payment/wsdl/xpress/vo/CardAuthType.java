
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardAuth_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardAuth_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}BaseAuth_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}InvalidPinAttempts" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAuth_Type", propOrder = {
    "invalidPinAttempts"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.CardAuthType.class
})
public class CardAuthType
    extends BaseAuthType
{

    @XmlElement(name = "InvalidPinAttempts")
    protected Long invalidPinAttempts;

    /**
     * Gets the value of the invalidPinAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInvalidPinAttempts() {
        return invalidPinAttempts;
    }

    /**
     * Sets the value of the invalidPinAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInvalidPinAttempts(Long value) {
        this.invalidPinAttempts = value;
    }

}
