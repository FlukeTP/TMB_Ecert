
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepBkOrdRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepBkOrdRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DepBkOrdKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DepBkOrdRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DepBkOrdInfo"/&gt;
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
@XmlType(name = "DepBkOrdRef_Type", propOrder = {
    "depBkOrdKeys",
    "depBkOrdRec",
    "depBkOrdInfo"
})
public class DepBkOrdRefType {

    @XmlElement(name = "DepBkOrdKeys")
    protected DepBkOrdKeysType depBkOrdKeys;
    @XmlElement(name = "DepBkOrdRec")
    protected DepBkOrdRecType depBkOrdRec;
    @XmlElement(name = "DepBkOrdInfo")
    protected DepBkOrdInfoType depBkOrdInfo;

    /**
     * Gets the value of the depBkOrdKeys property.
     * 
     * @return
     *     possible object is
     *     {@link DepBkOrdKeysType }
     *     
     */
    public DepBkOrdKeysType getDepBkOrdKeys() {
        return depBkOrdKeys;
    }

    /**
     * Sets the value of the depBkOrdKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepBkOrdKeysType }
     *     
     */
    public void setDepBkOrdKeys(DepBkOrdKeysType value) {
        this.depBkOrdKeys = value;
    }

    /**
     * Gets the value of the depBkOrdRec property.
     * 
     * @return
     *     possible object is
     *     {@link DepBkOrdRecType }
     *     
     */
    public DepBkOrdRecType getDepBkOrdRec() {
        return depBkOrdRec;
    }

    /**
     * Sets the value of the depBkOrdRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepBkOrdRecType }
     *     
     */
    public void setDepBkOrdRec(DepBkOrdRecType value) {
        this.depBkOrdRec = value;
    }

    /**
     * Gets the value of the depBkOrdInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DepBkOrdInfoType }
     *     
     */
    public DepBkOrdInfoType getDepBkOrdInfo() {
        return depBkOrdInfo;
    }

    /**
     * Sets the value of the depBkOrdInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepBkOrdInfoType }
     *     
     */
    public void setDepBkOrdInfo(DepBkOrdInfoType value) {
        this.depBkOrdInfo = value;
    }

}
