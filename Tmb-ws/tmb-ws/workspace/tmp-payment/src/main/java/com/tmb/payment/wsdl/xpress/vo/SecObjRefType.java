
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecObjRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecObjRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SecObjKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SecObjRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SecObjInfo"/&gt;
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
@XmlType(name = "SecObjRef_Type", propOrder = {
    "secObjKeys",
    "secObjRec",
    "secObjInfo"
})
public class SecObjRefType {

    @XmlElement(name = "SecObjKeys")
    protected SecObjKeysType secObjKeys;
    @XmlElement(name = "SecObjRec")
    protected SecObjRecType secObjRec;
    @XmlElement(name = "SecObjInfo")
    protected SecObjInfoType secObjInfo;

    /**
     * Gets the value of the secObjKeys property.
     * 
     * @return
     *     possible object is
     *     {@link SecObjKeysType }
     *     
     */
    public SecObjKeysType getSecObjKeys() {
        return secObjKeys;
    }

    /**
     * Sets the value of the secObjKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecObjKeysType }
     *     
     */
    public void setSecObjKeys(SecObjKeysType value) {
        this.secObjKeys = value;
    }

    /**
     * Gets the value of the secObjRec property.
     * 
     * @return
     *     possible object is
     *     {@link SecObjRecType }
     *     
     */
    public SecObjRecType getSecObjRec() {
        return secObjRec;
    }

    /**
     * Sets the value of the secObjRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecObjRecType }
     *     
     */
    public void setSecObjRec(SecObjRecType value) {
        this.secObjRec = value;
    }

    /**
     * Gets the value of the secObjInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SecObjInfoType }
     *     
     */
    public SecObjInfoType getSecObjInfo() {
        return secObjInfo;
    }

    /**
     * Sets the value of the secObjInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecObjInfoType }
     *     
     */
    public void setSecObjInfo(SecObjInfoType value) {
        this.secObjInfo = value;
    }

}
