
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaAcctSel_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaAcctSel_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}MediaAcctKeys"/&gt;
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
@XmlType(name = "MediaAcctSel_Type", propOrder = {
    "mediaAcctKeys"
})
public class MediaAcctSelType {

    @XmlElement(name = "MediaAcctKeys")
    protected MediaAcctKeysType mediaAcctKeys;

    /**
     * Gets the value of the mediaAcctKeys property.
     * 
     * @return
     *     possible object is
     *     {@link MediaAcctKeysType }
     *     
     */
    public MediaAcctKeysType getMediaAcctKeys() {
        return mediaAcctKeys;
    }

    /**
     * Sets the value of the mediaAcctKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaAcctKeysType }
     *     
     */
    public void setMediaAcctKeys(MediaAcctKeysType value) {
        this.mediaAcctKeys = value;
    }

}
