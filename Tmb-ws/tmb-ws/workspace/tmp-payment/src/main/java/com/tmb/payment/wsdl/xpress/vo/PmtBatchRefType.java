
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PmtBatchRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtBatchRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PmtBatchKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PmtBatchRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PmtBatchInfo"/&gt;
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
@XmlType(name = "PmtBatchRef_Type", propOrder = {
    "pmtBatchKeys",
    "pmtBatchRec",
    "pmtBatchInfo"
})
public class PmtBatchRefType {

    @XmlElement(name = "PmtBatchKeys")
    protected PmtBatchKeysType pmtBatchKeys;
    @XmlElement(name = "PmtBatchRec")
    protected PmtBatchRecType pmtBatchRec;
    @XmlElement(name = "PmtBatchInfo")
    protected PmtBatchInfoType pmtBatchInfo;

    /**
     * Gets the value of the pmtBatchKeys property.
     * 
     * @return
     *     possible object is
     *     {@link PmtBatchKeysType }
     *     
     */
    public PmtBatchKeysType getPmtBatchKeys() {
        return pmtBatchKeys;
    }

    /**
     * Sets the value of the pmtBatchKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtBatchKeysType }
     *     
     */
    public void setPmtBatchKeys(PmtBatchKeysType value) {
        this.pmtBatchKeys = value;
    }

    /**
     * Gets the value of the pmtBatchRec property.
     * 
     * @return
     *     possible object is
     *     {@link PmtBatchRecType }
     *     
     */
    public PmtBatchRecType getPmtBatchRec() {
        return pmtBatchRec;
    }

    /**
     * Sets the value of the pmtBatchRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtBatchRecType }
     *     
     */
    public void setPmtBatchRec(PmtBatchRecType value) {
        this.pmtBatchRec = value;
    }

    /**
     * Gets the value of the pmtBatchInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PmtBatchInfoType }
     *     
     */
    public PmtBatchInfoType getPmtBatchInfo() {
        return pmtBatchInfo;
    }

    /**
     * Sets the value of the pmtBatchInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtBatchInfoType }
     *     
     */
    public void setPmtBatchInfo(PmtBatchInfoType value) {
        this.pmtBatchInfo = value;
    }

}
