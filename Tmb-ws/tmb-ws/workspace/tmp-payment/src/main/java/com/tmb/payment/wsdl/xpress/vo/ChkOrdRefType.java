
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChkOrdRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChkOrdRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ChkOrdKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ChkOrdRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ChkOrdInfo"/&gt;
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
@XmlType(name = "ChkOrdRef_Type", propOrder = {
    "chkOrdKeys",
    "chkOrdRec",
    "chkOrdInfo"
})
public class ChkOrdRefType {

    @XmlElement(name = "ChkOrdKeys")
    protected ChkOrdKeysType chkOrdKeys;
    @XmlElement(name = "ChkOrdRec")
    protected ChkOrdRecType chkOrdRec;
    @XmlElement(name = "ChkOrdInfo")
    protected ChkOrdInfoType chkOrdInfo;

    /**
     * Gets the value of the chkOrdKeys property.
     * 
     * @return
     *     possible object is
     *     {@link ChkOrdKeysType }
     *     
     */
    public ChkOrdKeysType getChkOrdKeys() {
        return chkOrdKeys;
    }

    /**
     * Sets the value of the chkOrdKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkOrdKeysType }
     *     
     */
    public void setChkOrdKeys(ChkOrdKeysType value) {
        this.chkOrdKeys = value;
    }

    /**
     * Gets the value of the chkOrdRec property.
     * 
     * @return
     *     possible object is
     *     {@link ChkOrdRecType }
     *     
     */
    public ChkOrdRecType getChkOrdRec() {
        return chkOrdRec;
    }

    /**
     * Sets the value of the chkOrdRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkOrdRecType }
     *     
     */
    public void setChkOrdRec(ChkOrdRecType value) {
        this.chkOrdRec = value;
    }

    /**
     * Gets the value of the chkOrdInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ChkOrdInfoType }
     *     
     */
    public ChkOrdInfoType getChkOrdInfo() {
        return chkOrdInfo;
    }

    /**
     * Sets the value of the chkOrdInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkOrdInfoType }
     *     
     */
    public void setChkOrdInfo(ChkOrdInfoType value) {
        this.chkOrdInfo = value;
    }

}
