
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustSvcRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustSvcRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CustSvcKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CustSvcRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CustSvcInfo"/&gt;
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
@XmlType(name = "CustSvcRef_Type", propOrder = {
    "custSvcKeys",
    "custSvcRec",
    "custSvcInfo"
})
public class CustSvcRefType {

    @XmlElement(name = "CustSvcKeys")
    protected CustSvcKeysType custSvcKeys;
    @XmlElement(name = "CustSvcRec")
    protected CustSvcRecType custSvcRec;
    @XmlElement(name = "CustSvcInfo")
    protected CustSvcInfoType custSvcInfo;

    /**
     * Gets the value of the custSvcKeys property.
     * 
     * @return
     *     possible object is
     *     {@link CustSvcKeysType }
     *     
     */
    public CustSvcKeysType getCustSvcKeys() {
        return custSvcKeys;
    }

    /**
     * Sets the value of the custSvcKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustSvcKeysType }
     *     
     */
    public void setCustSvcKeys(CustSvcKeysType value) {
        this.custSvcKeys = value;
    }

    /**
     * Gets the value of the custSvcRec property.
     * 
     * @return
     *     possible object is
     *     {@link CustSvcRecType }
     *     
     */
    public CustSvcRecType getCustSvcRec() {
        return custSvcRec;
    }

    /**
     * Sets the value of the custSvcRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustSvcRecType }
     *     
     */
    public void setCustSvcRec(CustSvcRecType value) {
        this.custSvcRec = value;
    }

    /**
     * Gets the value of the custSvcInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustSvcInfoType }
     *     
     */
    public CustSvcInfoType getCustSvcInfo() {
        return custSvcInfo;
    }

    /**
     * Sets the value of the custSvcInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustSvcInfoType }
     *     
     */
    public void setCustSvcInfo(CustSvcInfoType value) {
        this.custSvcInfo = value;
    }

}
