
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MagCardUpdateRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MagCardUpdateRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MagCardUpdateKeys"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MagCardUpdateRec"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MagCardUpdateInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MagCardUpdateRef_Type", propOrder = {
    "magCardUpdateKeys",
    "magCardUpdateRec",
    "magCardUpdateInfo"
})
public class MagCardUpdateRefType {

    @XmlElement(name = "MagCardUpdateKeys", required = true)
    protected MagCardUpdateKeysType magCardUpdateKeys;
    @XmlElement(name = "MagCardUpdateRec", required = true)
    protected MagCardUpdateRecType magCardUpdateRec;
    @XmlElement(name = "MagCardUpdateInfo", required = true)
    protected MagCardUpdateInfoType magCardUpdateInfo;

    /**
     * Gets the value of the magCardUpdateKeys property.
     * 
     * @return
     *     possible object is
     *     {@link MagCardUpdateKeysType }
     *     
     */
    public MagCardUpdateKeysType getMagCardUpdateKeys() {
        return magCardUpdateKeys;
    }

    /**
     * Sets the value of the magCardUpdateKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagCardUpdateKeysType }
     *     
     */
    public void setMagCardUpdateKeys(MagCardUpdateKeysType value) {
        this.magCardUpdateKeys = value;
    }

    /**
     * Gets the value of the magCardUpdateRec property.
     * 
     * @return
     *     possible object is
     *     {@link MagCardUpdateRecType }
     *     
     */
    public MagCardUpdateRecType getMagCardUpdateRec() {
        return magCardUpdateRec;
    }

    /**
     * Sets the value of the magCardUpdateRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagCardUpdateRecType }
     *     
     */
    public void setMagCardUpdateRec(MagCardUpdateRecType value) {
        this.magCardUpdateRec = value;
    }

    /**
     * Gets the value of the magCardUpdateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MagCardUpdateInfoType }
     *     
     */
    public MagCardUpdateInfoType getMagCardUpdateInfo() {
        return magCardUpdateInfo;
    }

    /**
     * Sets the value of the magCardUpdateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagCardUpdateInfoType }
     *     
     */
    public void setMagCardUpdateInfo(MagCardUpdateInfoType value) {
        this.magCardUpdateInfo = value;
    }

}
