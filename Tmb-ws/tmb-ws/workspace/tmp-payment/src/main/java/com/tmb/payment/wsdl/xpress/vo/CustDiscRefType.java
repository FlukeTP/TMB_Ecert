
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustDiscRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustDiscRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CustDiscKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CustDiscRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CustDiscInfo"/&gt;
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
@XmlType(name = "CustDiscRef_Type", propOrder = {
    "custDiscKeys",
    "custDiscRec",
    "custDiscInfo"
})
public class CustDiscRefType {

    @XmlElement(name = "CustDiscKeys")
    protected CustDiscKeysType custDiscKeys;
    @XmlElement(name = "CustDiscRec")
    protected CustDiscRecType custDiscRec;
    @XmlElement(name = "CustDiscInfo")
    protected CustDiscInfoType custDiscInfo;

    /**
     * Gets the value of the custDiscKeys property.
     * 
     * @return
     *     possible object is
     *     {@link CustDiscKeysType }
     *     
     */
    public CustDiscKeysType getCustDiscKeys() {
        return custDiscKeys;
    }

    /**
     * Sets the value of the custDiscKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustDiscKeysType }
     *     
     */
    public void setCustDiscKeys(CustDiscKeysType value) {
        this.custDiscKeys = value;
    }

    /**
     * Gets the value of the custDiscRec property.
     * 
     * @return
     *     possible object is
     *     {@link CustDiscRecType }
     *     
     */
    public CustDiscRecType getCustDiscRec() {
        return custDiscRec;
    }

    /**
     * Sets the value of the custDiscRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustDiscRecType }
     *     
     */
    public void setCustDiscRec(CustDiscRecType value) {
        this.custDiscRec = value;
    }

    /**
     * Gets the value of the custDiscInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustDiscInfoType }
     *     
     */
    public CustDiscInfoType getCustDiscInfo() {
        return custDiscInfo;
    }

    /**
     * Sets the value of the custDiscInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustDiscInfoType }
     *     
     */
    public void setCustDiscInfo(CustDiscInfoType value) {
        this.custDiscInfo = value;
    }

}
