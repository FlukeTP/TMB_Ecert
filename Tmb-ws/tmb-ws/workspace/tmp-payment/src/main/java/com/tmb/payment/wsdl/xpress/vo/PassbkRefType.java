
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassbkRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassbkRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PassbkKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PassbkRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PassbkInfo"/&gt;
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
@XmlType(name = "PassbkRef_Type", propOrder = {
    "passbkKeys",
    "passbkRec",
    "passbkInfo"
})
public class PassbkRefType {

    @XmlElement(name = "PassbkKeys")
    protected PassbkKeysType passbkKeys;
    @XmlElement(name = "PassbkRec")
    protected PassbkRecType passbkRec;
    @XmlElement(name = "PassbkInfo")
    protected PassbkInfoType passbkInfo;

    /**
     * Gets the value of the passbkKeys property.
     * 
     * @return
     *     possible object is
     *     {@link PassbkKeysType }
     *     
     */
    public PassbkKeysType getPassbkKeys() {
        return passbkKeys;
    }

    /**
     * Sets the value of the passbkKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassbkKeysType }
     *     
     */
    public void setPassbkKeys(PassbkKeysType value) {
        this.passbkKeys = value;
    }

    /**
     * Gets the value of the passbkRec property.
     * 
     * @return
     *     possible object is
     *     {@link PassbkRecType }
     *     
     */
    public PassbkRecType getPassbkRec() {
        return passbkRec;
    }

    /**
     * Sets the value of the passbkRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassbkRecType }
     *     
     */
    public void setPassbkRec(PassbkRecType value) {
        this.passbkRec = value;
    }

    /**
     * Gets the value of the passbkInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PassbkInfoType }
     *     
     */
    public PassbkInfoType getPassbkInfo() {
        return passbkInfo;
    }

    /**
     * Sets the value of the passbkInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassbkInfoType }
     *     
     */
    public void setPassbkInfo(PassbkInfoType value) {
        this.passbkInfo = value;
    }

}
