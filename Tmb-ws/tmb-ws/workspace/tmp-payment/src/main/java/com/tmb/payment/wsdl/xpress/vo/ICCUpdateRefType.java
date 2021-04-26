
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ICCUpdateRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ICCUpdateRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ICCUpdateKeys"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ICCUpdateRec"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ICCUpdateInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICCUpdateRef_Type", propOrder = {
    "iccUpdateKeys",
    "iccUpdateRec",
    "iccUpdateInfo"
})
public class ICCUpdateRefType {

    @XmlElement(name = "ICCUpdateKeys", required = true)
    protected ICCUpdateKeysType iccUpdateKeys;
    @XmlElement(name = "ICCUpdateRec", required = true)
    protected ICCUpdateRecType iccUpdateRec;
    @XmlElement(name = "ICCUpdateInfo", required = true)
    protected ICCUpdateInfoType iccUpdateInfo;

    /**
     * Gets the value of the iccUpdateKeys property.
     * 
     * @return
     *     possible object is
     *     {@link ICCUpdateKeysType }
     *     
     */
    public ICCUpdateKeysType getICCUpdateKeys() {
        return iccUpdateKeys;
    }

    /**
     * Sets the value of the iccUpdateKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICCUpdateKeysType }
     *     
     */
    public void setICCUpdateKeys(ICCUpdateKeysType value) {
        this.iccUpdateKeys = value;
    }

    /**
     * Gets the value of the iccUpdateRec property.
     * 
     * @return
     *     possible object is
     *     {@link ICCUpdateRecType }
     *     
     */
    public ICCUpdateRecType getICCUpdateRec() {
        return iccUpdateRec;
    }

    /**
     * Sets the value of the iccUpdateRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICCUpdateRecType }
     *     
     */
    public void setICCUpdateRec(ICCUpdateRecType value) {
        this.iccUpdateRec = value;
    }

    /**
     * Gets the value of the iccUpdateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ICCUpdateInfoType }
     *     
     */
    public ICCUpdateInfoType getICCUpdateInfo() {
        return iccUpdateInfo;
    }

    /**
     * Sets the value of the iccUpdateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICCUpdateInfoType }
     *     
     */
    public void setICCUpdateInfo(ICCUpdateInfoType value) {
        this.iccUpdateInfo = value;
    }

}
