
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StdPayeeRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StdPayeeRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}StdPayeeKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}StdPayeeRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}StdPayeeInfo"/&gt;
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
@XmlType(name = "StdPayeeRef_Type", propOrder = {
    "stdPayeeKeys",
    "stdPayeeRec",
    "stdPayeeInfo"
})
public class StdPayeeRefType {

    @XmlElement(name = "StdPayeeKeys")
    protected StdPayeeKeysType stdPayeeKeys;
    @XmlElement(name = "StdPayeeRec")
    protected StdPayeeRecType stdPayeeRec;
    @XmlElement(name = "StdPayeeInfo")
    protected StdPayeeInfoType stdPayeeInfo;

    /**
     * Gets the value of the stdPayeeKeys property.
     * 
     * @return
     *     possible object is
     *     {@link StdPayeeKeysType }
     *     
     */
    public StdPayeeKeysType getStdPayeeKeys() {
        return stdPayeeKeys;
    }

    /**
     * Sets the value of the stdPayeeKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link StdPayeeKeysType }
     *     
     */
    public void setStdPayeeKeys(StdPayeeKeysType value) {
        this.stdPayeeKeys = value;
    }

    /**
     * Gets the value of the stdPayeeRec property.
     * 
     * @return
     *     possible object is
     *     {@link StdPayeeRecType }
     *     
     */
    public StdPayeeRecType getStdPayeeRec() {
        return stdPayeeRec;
    }

    /**
     * Sets the value of the stdPayeeRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link StdPayeeRecType }
     *     
     */
    public void setStdPayeeRec(StdPayeeRecType value) {
        this.stdPayeeRec = value;
    }

    /**
     * Gets the value of the stdPayeeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StdPayeeInfoType }
     *     
     */
    public StdPayeeInfoType getStdPayeeInfo() {
        return stdPayeeInfo;
    }

    /**
     * Sets the value of the stdPayeeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StdPayeeInfoType }
     *     
     */
    public void setStdPayeeInfo(StdPayeeInfoType value) {
        this.stdPayeeInfo = value;
    }

}
