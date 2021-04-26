
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DebitRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DebitRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DebitKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DebitRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DebitInfo"/&gt;
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
@XmlType(name = "DebitRef_Type", propOrder = {
    "debitKeys",
    "debitRec",
    "debitInfo"
})
public class DebitRefType {

    @XmlElement(name = "DebitKeys")
    protected DebitKeysType debitKeys;
    @XmlElement(name = "DebitRec")
    protected DebitRecType debitRec;
    @XmlElement(name = "DebitInfo")
    protected DebitInfoType debitInfo;

    /**
     * Gets the value of the debitKeys property.
     * 
     * @return
     *     possible object is
     *     {@link DebitKeysType }
     *     
     */
    public DebitKeysType getDebitKeys() {
        return debitKeys;
    }

    /**
     * Sets the value of the debitKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitKeysType }
     *     
     */
    public void setDebitKeys(DebitKeysType value) {
        this.debitKeys = value;
    }

    /**
     * Gets the value of the debitRec property.
     * 
     * @return
     *     possible object is
     *     {@link DebitRecType }
     *     
     */
    public DebitRecType getDebitRec() {
        return debitRec;
    }

    /**
     * Sets the value of the debitRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitRecType }
     *     
     */
    public void setDebitRec(DebitRecType value) {
        this.debitRec = value;
    }

    /**
     * Gets the value of the debitInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DebitInfoType }
     *     
     */
    public DebitInfoType getDebitInfo() {
        return debitInfo;
    }

    /**
     * Sets the value of the debitInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitInfoType }
     *     
     */
    public void setDebitInfo(DebitInfoType value) {
        this.debitInfo = value;
    }

}
