
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustPayeeRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustPayeeRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CustPayeeKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CustPayeeRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CustPayeeInfo"/&gt;
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
@XmlType(name = "CustPayeeRef_Type", propOrder = {
    "custPayeeKeys",
    "custPayeeRec",
    "custPayeeInfo"
})
public class CustPayeeRefType {

    @XmlElement(name = "CustPayeeKeys")
    protected CustPayeeKeysType custPayeeKeys;
    @XmlElement(name = "CustPayeeRec")
    protected CustPayeeRecType custPayeeRec;
    @XmlElement(name = "CustPayeeInfo")
    protected CustPayeeInfoType custPayeeInfo;

    /**
     * Gets the value of the custPayeeKeys property.
     * 
     * @return
     *     possible object is
     *     {@link CustPayeeKeysType }
     *     
     */
    public CustPayeeKeysType getCustPayeeKeys() {
        return custPayeeKeys;
    }

    /**
     * Sets the value of the custPayeeKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustPayeeKeysType }
     *     
     */
    public void setCustPayeeKeys(CustPayeeKeysType value) {
        this.custPayeeKeys = value;
    }

    /**
     * Gets the value of the custPayeeRec property.
     * 
     * @return
     *     possible object is
     *     {@link CustPayeeRecType }
     *     
     */
    public CustPayeeRecType getCustPayeeRec() {
        return custPayeeRec;
    }

    /**
     * Sets the value of the custPayeeRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustPayeeRecType }
     *     
     */
    public void setCustPayeeRec(CustPayeeRecType value) {
        this.custPayeeRec = value;
    }

    /**
     * Gets the value of the custPayeeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustPayeeInfoType }
     *     
     */
    public CustPayeeInfoType getCustPayeeInfo() {
        return custPayeeInfo;
    }

    /**
     * Sets the value of the custPayeeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustPayeeInfoType }
     *     
     */
    public void setCustPayeeInfo(CustPayeeInfoType value) {
        this.custPayeeInfo = value;
    }

}
