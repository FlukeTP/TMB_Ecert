
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassbkItemRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassbkItemRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PassbkItemKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PassbkItemRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PassbkItemInfo"/&gt;
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
@XmlType(name = "PassbkItemRef_Type", propOrder = {
    "passbkItemKeys",
    "passbkItemRec",
    "passbkItemInfo"
})
public class PassbkItemRefType {

    @XmlElement(name = "PassbkItemKeys")
    protected PassbkItemKeysType passbkItemKeys;
    @XmlElement(name = "PassbkItemRec")
    protected PassbkItemRecType passbkItemRec;
    @XmlElement(name = "PassbkItemInfo")
    protected PassbkItemInfoType passbkItemInfo;

    /**
     * Gets the value of the passbkItemKeys property.
     * 
     * @return
     *     possible object is
     *     {@link PassbkItemKeysType }
     *     
     */
    public PassbkItemKeysType getPassbkItemKeys() {
        return passbkItemKeys;
    }

    /**
     * Sets the value of the passbkItemKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassbkItemKeysType }
     *     
     */
    public void setPassbkItemKeys(PassbkItemKeysType value) {
        this.passbkItemKeys = value;
    }

    /**
     * Gets the value of the passbkItemRec property.
     * 
     * @return
     *     possible object is
     *     {@link PassbkItemRecType }
     *     
     */
    public PassbkItemRecType getPassbkItemRec() {
        return passbkItemRec;
    }

    /**
     * Sets the value of the passbkItemRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassbkItemRecType }
     *     
     */
    public void setPassbkItemRec(PassbkItemRecType value) {
        this.passbkItemRec = value;
    }

    /**
     * Gets the value of the passbkItemInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PassbkItemInfoType }
     *     
     */
    public PassbkItemInfoType getPassbkItemInfo() {
        return passbkItemInfo;
    }

    /**
     * Sets the value of the passbkItemInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassbkItemInfoType }
     *     
     */
    public void setPassbkItemInfo(PassbkItemInfoType value) {
        this.passbkItemInfo = value;
    }

}
