
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChkAcceptRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChkAcceptRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ChkAcceptKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ChkAcceptRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ChkAcceptInfo"/&gt;
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
@XmlType(name = "ChkAcceptRef_Type", propOrder = {
    "chkAcceptKeys",
    "chkAcceptRec",
    "chkAcceptInfo"
})
public class ChkAcceptRefType {

    @XmlElement(name = "ChkAcceptKeys")
    protected ChkAcceptKeysType chkAcceptKeys;
    @XmlElement(name = "ChkAcceptRec")
    protected ChkAcceptRecType chkAcceptRec;
    @XmlElement(name = "ChkAcceptInfo")
    protected ChkAcceptInfoType chkAcceptInfo;

    /**
     * Gets the value of the chkAcceptKeys property.
     * 
     * @return
     *     possible object is
     *     {@link ChkAcceptKeysType }
     *     
     */
    public ChkAcceptKeysType getChkAcceptKeys() {
        return chkAcceptKeys;
    }

    /**
     * Sets the value of the chkAcceptKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkAcceptKeysType }
     *     
     */
    public void setChkAcceptKeys(ChkAcceptKeysType value) {
        this.chkAcceptKeys = value;
    }

    /**
     * Gets the value of the chkAcceptRec property.
     * 
     * @return
     *     possible object is
     *     {@link ChkAcceptRecType }
     *     
     */
    public ChkAcceptRecType getChkAcceptRec() {
        return chkAcceptRec;
    }

    /**
     * Sets the value of the chkAcceptRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkAcceptRecType }
     *     
     */
    public void setChkAcceptRec(ChkAcceptRecType value) {
        this.chkAcceptRec = value;
    }

    /**
     * Gets the value of the chkAcceptInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ChkAcceptInfoType }
     *     
     */
    public ChkAcceptInfoType getChkAcceptInfo() {
        return chkAcceptInfo;
    }

    /**
     * Sets the value of the chkAcceptInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkAcceptInfoType }
     *     
     */
    public void setChkAcceptInfo(ChkAcceptInfoType value) {
        this.chkAcceptInfo = value;
    }

}
