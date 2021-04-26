
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplBookKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplBookKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplBookId" type="{urn:ifxforum-org:XSD:1}Identifier_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplBookKeys_Type", propOrder = {
    "applBookId"
})
public class ApplBookKeysType {

    @XmlElement(name = "ApplBookId", required = true)
    protected String applBookId;

    /**
     * Gets the value of the applBookId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplBookId() {
        return applBookId;
    }

    /**
     * Sets the value of the applBookId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplBookId(String value) {
        this.applBookId = value;
    }

}
