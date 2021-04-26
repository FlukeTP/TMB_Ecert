
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GNAKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GNAKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GNAId" type="{urn:ifxforum-org:XSD:1}Identifier_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GNAKeys_Type", propOrder = {
    "gnaId"
})
public class GNAKeysType {

    @XmlElement(name = "GNAId", required = true)
    protected String gnaId;

    /**
     * Gets the value of the gnaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGNAId() {
        return gnaId;
    }

    /**
     * Sets the value of the gnaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGNAId(String value) {
        this.gnaId = value;
    }

}
