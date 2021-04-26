
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SafeBoxKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SafeBoxKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SafeBoxId" type="{urn:ifxforum-org:XSD:1}Identifier_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafeBoxKeys_Type", propOrder = {
    "safeBoxId"
})
public class SafeBoxKeysType {

    @XmlElement(name = "SafeBoxId", required = true)
    protected String safeBoxId;

    /**
     * Gets the value of the safeBoxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSafeBoxId() {
        return safeBoxId;
    }

    /**
     * Sets the value of the safeBoxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSafeBoxId(String value) {
        this.safeBoxId = value;
    }

}
