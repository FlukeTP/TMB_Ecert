
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecChkOrdRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecChkOrdRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}RecChkOrdKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}RecChkOrdRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}RecChkOrdInfo"/&gt;
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
@XmlType(name = "RecChkOrdRef_Type", propOrder = {
    "recChkOrdKeys",
    "recChkOrdRec",
    "recChkOrdInfo"
})
public class RecChkOrdRefType {

    @XmlElement(name = "RecChkOrdKeys")
    protected RecChkOrdKeysType recChkOrdKeys;
    @XmlElement(name = "RecChkOrdRec")
    protected RecChkOrdRecType recChkOrdRec;
    @XmlElement(name = "RecChkOrdInfo")
    protected RecChkOrdInfoType recChkOrdInfo;

    /**
     * Gets the value of the recChkOrdKeys property.
     * 
     * @return
     *     possible object is
     *     {@link RecChkOrdKeysType }
     *     
     */
    public RecChkOrdKeysType getRecChkOrdKeys() {
        return recChkOrdKeys;
    }

    /**
     * Sets the value of the recChkOrdKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecChkOrdKeysType }
     *     
     */
    public void setRecChkOrdKeys(RecChkOrdKeysType value) {
        this.recChkOrdKeys = value;
    }

    /**
     * Gets the value of the recChkOrdRec property.
     * 
     * @return
     *     possible object is
     *     {@link RecChkOrdRecType }
     *     
     */
    public RecChkOrdRecType getRecChkOrdRec() {
        return recChkOrdRec;
    }

    /**
     * Sets the value of the recChkOrdRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecChkOrdRecType }
     *     
     */
    public void setRecChkOrdRec(RecChkOrdRecType value) {
        this.recChkOrdRec = value;
    }

    /**
     * Gets the value of the recChkOrdInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RecChkOrdInfoType }
     *     
     */
    public RecChkOrdInfoType getRecChkOrdInfo() {
        return recChkOrdInfo;
    }

    /**
     * Sets the value of the recChkOrdInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecChkOrdInfoType }
     *     
     */
    public void setRecChkOrdInfo(RecChkOrdInfoType value) {
        this.recChkOrdInfo = value;
    }

}
