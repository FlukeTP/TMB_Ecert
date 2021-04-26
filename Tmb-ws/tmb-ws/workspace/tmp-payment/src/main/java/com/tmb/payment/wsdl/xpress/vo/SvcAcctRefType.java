
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SvcAcctRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SvcAcctRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SvcAcctKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SvcAcctRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SvcAcctInfo"/&gt;
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
@XmlType(name = "SvcAcctRef_Type", propOrder = {
    "svcAcctKeys",
    "svcAcctRec",
    "svcAcctInfo"
})
public class SvcAcctRefType {

    @XmlElement(name = "SvcAcctKeys")
    protected SvcAcctKeysType svcAcctKeys;
    @XmlElement(name = "SvcAcctRec")
    protected SvcAcctRecType svcAcctRec;
    @XmlElement(name = "SvcAcctInfo")
    protected SvcAcctInfoType svcAcctInfo;

    /**
     * Gets the value of the svcAcctKeys property.
     * 
     * @return
     *     possible object is
     *     {@link SvcAcctKeysType }
     *     
     */
    public SvcAcctKeysType getSvcAcctKeys() {
        return svcAcctKeys;
    }

    /**
     * Sets the value of the svcAcctKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcAcctKeysType }
     *     
     */
    public void setSvcAcctKeys(SvcAcctKeysType value) {
        this.svcAcctKeys = value;
    }

    /**
     * Gets the value of the svcAcctRec property.
     * 
     * @return
     *     possible object is
     *     {@link SvcAcctRecType }
     *     
     */
    public SvcAcctRecType getSvcAcctRec() {
        return svcAcctRec;
    }

    /**
     * Sets the value of the svcAcctRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcAcctRecType }
     *     
     */
    public void setSvcAcctRec(SvcAcctRecType value) {
        this.svcAcctRec = value;
    }

    /**
     * Gets the value of the svcAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SvcAcctInfoType }
     *     
     */
    public SvcAcctInfoType getSvcAcctInfo() {
        return svcAcctInfo;
    }

    /**
     * Sets the value of the svcAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcAcctInfoType }
     *     
     */
    public void setSvcAcctInfo(SvcAcctInfoType value) {
        this.svcAcctInfo = value;
    }

}
