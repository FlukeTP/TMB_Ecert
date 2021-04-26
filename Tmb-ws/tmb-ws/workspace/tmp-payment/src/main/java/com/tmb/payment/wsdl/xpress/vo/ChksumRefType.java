
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChksumRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChksumRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ChksumKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ChksumRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ChksumInfo"/&gt;
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
@XmlType(name = "ChksumRef_Type", propOrder = {
    "chksumKeys",
    "chksumRec",
    "chksumInfo"
})
public class ChksumRefType {

    @XmlElement(name = "ChksumKeys")
    protected ChksumKeysType chksumKeys;
    @XmlElement(name = "ChksumRec")
    protected ChksumRecType chksumRec;
    @XmlElement(name = "ChksumInfo")
    protected ChksumInfoType chksumInfo;

    /**
     * Gets the value of the chksumKeys property.
     * 
     * @return
     *     possible object is
     *     {@link ChksumKeysType }
     *     
     */
    public ChksumKeysType getChksumKeys() {
        return chksumKeys;
    }

    /**
     * Sets the value of the chksumKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChksumKeysType }
     *     
     */
    public void setChksumKeys(ChksumKeysType value) {
        this.chksumKeys = value;
    }

    /**
     * Gets the value of the chksumRec property.
     * 
     * @return
     *     possible object is
     *     {@link ChksumRecType }
     *     
     */
    public ChksumRecType getChksumRec() {
        return chksumRec;
    }

    /**
     * Sets the value of the chksumRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChksumRecType }
     *     
     */
    public void setChksumRec(ChksumRecType value) {
        this.chksumRec = value;
    }

    /**
     * Gets the value of the chksumInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ChksumInfoType }
     *     
     */
    public ChksumInfoType getChksumInfo() {
        return chksumInfo;
    }

    /**
     * Sets the value of the chksumInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChksumInfoType }
     *     
     */
    public void setChksumInfo(ChksumInfoType value) {
        this.chksumInfo = value;
    }

}
