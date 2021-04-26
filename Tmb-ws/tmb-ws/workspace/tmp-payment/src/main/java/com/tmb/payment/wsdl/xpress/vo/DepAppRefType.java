
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepAppRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepAppRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DepAppKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DepAppRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DepAppInfo"/&gt;
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
@XmlType(name = "DepAppRef_Type", propOrder = {
    "depAppKeys",
    "depAppRec",
    "depAppInfo"
})
public class DepAppRefType {

    @XmlElement(name = "DepAppKeys")
    protected DepAppKeysType depAppKeys;
    @XmlElement(name = "DepAppRec")
    protected DepAppRecType depAppRec;
    @XmlElement(name = "DepAppInfo")
    protected DepAppInfoType depAppInfo;

    /**
     * Gets the value of the depAppKeys property.
     * 
     * @return
     *     possible object is
     *     {@link DepAppKeysType }
     *     
     */
    public DepAppKeysType getDepAppKeys() {
        return depAppKeys;
    }

    /**
     * Sets the value of the depAppKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAppKeysType }
     *     
     */
    public void setDepAppKeys(DepAppKeysType value) {
        this.depAppKeys = value;
    }

    /**
     * Gets the value of the depAppRec property.
     * 
     * @return
     *     possible object is
     *     {@link DepAppRecType }
     *     
     */
    public DepAppRecType getDepAppRec() {
        return depAppRec;
    }

    /**
     * Sets the value of the depAppRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAppRecType }
     *     
     */
    public void setDepAppRec(DepAppRecType value) {
        this.depAppRec = value;
    }

    /**
     * Gets the value of the depAppInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DepAppInfoType }
     *     
     */
    public DepAppInfoType getDepAppInfo() {
        return depAppInfo;
    }

    /**
     * Sets the value of the depAppInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAppInfoType }
     *     
     */
    public void setDepAppInfo(DepAppInfoType value) {
        this.depAppInfo = value;
    }

}
