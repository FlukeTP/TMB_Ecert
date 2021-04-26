
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DiscKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DiscRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DiscInfo"/&gt;
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
@XmlType(name = "DiscRef_Type", propOrder = {
    "discKeys",
    "discRec",
    "discInfo"
})
public class DiscRefType {

    @XmlElement(name = "DiscKeys")
    protected DiscKeysType discKeys;
    @XmlElement(name = "DiscRec")
    protected DiscRecType discRec;
    @XmlElement(name = "DiscInfo")
    protected DiscInfoType discInfo;

    /**
     * Gets the value of the discKeys property.
     * 
     * @return
     *     possible object is
     *     {@link DiscKeysType }
     *     
     */
    public DiscKeysType getDiscKeys() {
        return discKeys;
    }

    /**
     * Sets the value of the discKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscKeysType }
     *     
     */
    public void setDiscKeys(DiscKeysType value) {
        this.discKeys = value;
    }

    /**
     * Gets the value of the discRec property.
     * 
     * @return
     *     possible object is
     *     {@link DiscRecType }
     *     
     */
    public DiscRecType getDiscRec() {
        return discRec;
    }

    /**
     * Sets the value of the discRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscRecType }
     *     
     */
    public void setDiscRec(DiscRecType value) {
        this.discRec = value;
    }

    /**
     * Gets the value of the discInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DiscInfoType }
     *     
     */
    public DiscInfoType getDiscInfo() {
        return discInfo;
    }

    /**
     * Sets the value of the discInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscInfoType }
     *     
     */
    public void setDiscInfo(DiscInfoType value) {
        this.discInfo = value;
    }

}
