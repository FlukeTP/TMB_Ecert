
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecPmtRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecPmtRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}RecPmtKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}RecPmtRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}RecPmtInfo"/&gt;
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
@XmlType(name = "RecPmtRef_Type", propOrder = {
    "recPmtKeys",
    "recPmtRec",
    "recPmtInfo"
})
public class RecPmtRefType {

    @XmlElement(name = "RecPmtKeys")
    protected RecPmtKeysType recPmtKeys;
    @XmlElement(name = "RecPmtRec")
    protected RecPmtRecType recPmtRec;
    @XmlElement(name = "RecPmtInfo")
    protected RecPmtInfoType recPmtInfo;

    /**
     * Gets the value of the recPmtKeys property.
     * 
     * @return
     *     possible object is
     *     {@link RecPmtKeysType }
     *     
     */
    public RecPmtKeysType getRecPmtKeys() {
        return recPmtKeys;
    }

    /**
     * Sets the value of the recPmtKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecPmtKeysType }
     *     
     */
    public void setRecPmtKeys(RecPmtKeysType value) {
        this.recPmtKeys = value;
    }

    /**
     * Gets the value of the recPmtRec property.
     * 
     * @return
     *     possible object is
     *     {@link RecPmtRecType }
     *     
     */
    public RecPmtRecType getRecPmtRec() {
        return recPmtRec;
    }

    /**
     * Sets the value of the recPmtRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecPmtRecType }
     *     
     */
    public void setRecPmtRec(RecPmtRecType value) {
        this.recPmtRec = value;
    }

    /**
     * Gets the value of the recPmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RecPmtInfoType }
     *     
     */
    public RecPmtInfoType getRecPmtInfo() {
        return recPmtInfo;
    }

    /**
     * Sets the value of the recPmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecPmtInfoType }
     *     
     */
    public void setRecPmtInfo(RecPmtInfoType value) {
        this.recPmtInfo = value;
    }

}
