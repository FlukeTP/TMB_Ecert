
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemitRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemitRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}RemitKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}RemitRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}RemitInfo"/&gt;
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
@XmlType(name = "RemitRef_Type", propOrder = {
    "remitKeys",
    "remitRec",
    "remitInfo"
})
public class RemitRefType {

    @XmlElement(name = "RemitKeys")
    protected RemitKeysType remitKeys;
    @XmlElement(name = "RemitRec")
    protected RemitRecType remitRec;
    @XmlElement(name = "RemitInfo")
    protected RemitInfoType remitInfo;

    /**
     * Gets the value of the remitKeys property.
     * 
     * @return
     *     possible object is
     *     {@link RemitKeysType }
     *     
     */
    public RemitKeysType getRemitKeys() {
        return remitKeys;
    }

    /**
     * Sets the value of the remitKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemitKeysType }
     *     
     */
    public void setRemitKeys(RemitKeysType value) {
        this.remitKeys = value;
    }

    /**
     * Gets the value of the remitRec property.
     * 
     * @return
     *     possible object is
     *     {@link RemitRecType }
     *     
     */
    public RemitRecType getRemitRec() {
        return remitRec;
    }

    /**
     * Sets the value of the remitRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemitRecType }
     *     
     */
    public void setRemitRec(RemitRecType value) {
        this.remitRec = value;
    }

    /**
     * Gets the value of the remitInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RemitInfoType }
     *     
     */
    public RemitInfoType getRemitInfo() {
        return remitInfo;
    }

    /**
     * Sets the value of the remitInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemitInfoType }
     *     
     */
    public void setRemitInfo(RemitInfoType value) {
        this.remitInfo = value;
    }

}
