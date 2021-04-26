
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchItemRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchItemRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PurchItemKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PurchItemRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PurchItemInfo"/&gt;
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
@XmlType(name = "PurchItemRef_Type", propOrder = {
    "purchItemKeys",
    "purchItemRec",
    "purchItemInfo"
})
public class PurchItemRefType {

    @XmlElement(name = "PurchItemKeys")
    protected PurchItemKeysType purchItemKeys;
    @XmlElement(name = "PurchItemRec")
    protected PurchItemRecType purchItemRec;
    @XmlElement(name = "PurchItemInfo")
    protected PurchItemInfoType purchItemInfo;

    /**
     * Gets the value of the purchItemKeys property.
     * 
     * @return
     *     possible object is
     *     {@link PurchItemKeysType }
     *     
     */
    public PurchItemKeysType getPurchItemKeys() {
        return purchItemKeys;
    }

    /**
     * Sets the value of the purchItemKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchItemKeysType }
     *     
     */
    public void setPurchItemKeys(PurchItemKeysType value) {
        this.purchItemKeys = value;
    }

    /**
     * Gets the value of the purchItemRec property.
     * 
     * @return
     *     possible object is
     *     {@link PurchItemRecType }
     *     
     */
    public PurchItemRecType getPurchItemRec() {
        return purchItemRec;
    }

    /**
     * Sets the value of the purchItemRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchItemRecType }
     *     
     */
    public void setPurchItemRec(PurchItemRecType value) {
        this.purchItemRec = value;
    }

    /**
     * Gets the value of the purchItemInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PurchItemInfoType }
     *     
     */
    public PurchItemInfoType getPurchItemInfo() {
        return purchItemInfo;
    }

    /**
     * Sets the value of the purchItemInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchItemInfoType }
     *     
     */
    public void setPurchItemInfo(PurchItemInfoType value) {
        this.purchItemInfo = value;
    }

}
