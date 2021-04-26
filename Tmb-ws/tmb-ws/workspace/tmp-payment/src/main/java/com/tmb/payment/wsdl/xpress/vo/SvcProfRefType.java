
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SvcProfRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SvcProfRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SvcProfKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SvcProfRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SvcProfInfo"/&gt;
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
@XmlType(name = "SvcProfRef_Type", propOrder = {
    "svcProfKeys",
    "svcProfRec",
    "svcProfInfo"
})
public class SvcProfRefType {

    @XmlElement(name = "SvcProfKeys")
    protected SvcProfKeysType svcProfKeys;
    @XmlElement(name = "SvcProfRec")
    protected SvcProfRecType svcProfRec;
    @XmlElement(name = "SvcProfInfo")
    protected SvcProfInfoType svcProfInfo;

    /**
     * Gets the value of the svcProfKeys property.
     * 
     * @return
     *     possible object is
     *     {@link SvcProfKeysType }
     *     
     */
    public SvcProfKeysType getSvcProfKeys() {
        return svcProfKeys;
    }

    /**
     * Sets the value of the svcProfKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcProfKeysType }
     *     
     */
    public void setSvcProfKeys(SvcProfKeysType value) {
        this.svcProfKeys = value;
    }

    /**
     * Gets the value of the svcProfRec property.
     * 
     * @return
     *     possible object is
     *     {@link SvcProfRecType }
     *     
     */
    public SvcProfRecType getSvcProfRec() {
        return svcProfRec;
    }

    /**
     * Sets the value of the svcProfRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcProfRecType }
     *     
     */
    public void setSvcProfRec(SvcProfRecType value) {
        this.svcProfRec = value;
    }

    /**
     * Gets the value of the svcProfInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SvcProfInfoType }
     *     
     */
    public SvcProfInfoType getSvcProfInfo() {
        return svcProfInfo;
    }

    /**
     * Sets the value of the svcProfInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcProfInfoType }
     *     
     */
    public void setSvcProfInfo(SvcProfInfoType value) {
        this.svcProfInfo = value;
    }

}
