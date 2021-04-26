
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}BillKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}BillRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}BillInfo"/&gt;
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
@XmlType(name = "BillRef_Type", propOrder = {
    "billKeys",
    "billRec",
    "billInfo"
})
public class BillRefType {

    @XmlElement(name = "BillKeys")
    protected BillKeysType billKeys;
    @XmlElement(name = "BillRec")
    protected BillRecType billRec;
    @XmlElement(name = "BillInfo")
    protected BillInfoType billInfo;

    /**
     * Gets the value of the billKeys property.
     * 
     * @return
     *     possible object is
     *     {@link BillKeysType }
     *     
     */
    public BillKeysType getBillKeys() {
        return billKeys;
    }

    /**
     * Sets the value of the billKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillKeysType }
     *     
     */
    public void setBillKeys(BillKeysType value) {
        this.billKeys = value;
    }

    /**
     * Gets the value of the billRec property.
     * 
     * @return
     *     possible object is
     *     {@link BillRecType }
     *     
     */
    public BillRecType getBillRec() {
        return billRec;
    }

    /**
     * Sets the value of the billRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillRecType }
     *     
     */
    public void setBillRec(BillRecType value) {
        this.billRec = value;
    }

    /**
     * Gets the value of the billInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BillInfoType }
     *     
     */
    public BillInfoType getBillInfo() {
        return billInfo;
    }

    /**
     * Sets the value of the billInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillInfoType }
     *     
     */
    public void setBillInfo(BillInfoType value) {
        this.billInfo = value;
    }

}
