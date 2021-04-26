
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PmtBatchStatRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtBatchStatRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PmtBatchStatKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PmtBatchStatRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PmtBatchStatInfo"/&gt;
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
@XmlType(name = "PmtBatchStatRef_Type", propOrder = {
    "pmtBatchStatKeys",
    "pmtBatchStatRec",
    "pmtBatchStatInfo"
})
public class PmtBatchStatRefType {

    @XmlElement(name = "PmtBatchStatKeys")
    protected PmtBatchStatKeysType pmtBatchStatKeys;
    @XmlElement(name = "PmtBatchStatRec")
    protected PmtBatchStatRecType pmtBatchStatRec;
    @XmlElement(name = "PmtBatchStatInfo")
    protected PmtBatchStatInfoType pmtBatchStatInfo;

    /**
     * Gets the value of the pmtBatchStatKeys property.
     * 
     * @return
     *     possible object is
     *     {@link PmtBatchStatKeysType }
     *     
     */
    public PmtBatchStatKeysType getPmtBatchStatKeys() {
        return pmtBatchStatKeys;
    }

    /**
     * Sets the value of the pmtBatchStatKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtBatchStatKeysType }
     *     
     */
    public void setPmtBatchStatKeys(PmtBatchStatKeysType value) {
        this.pmtBatchStatKeys = value;
    }

    /**
     * Gets the value of the pmtBatchStatRec property.
     * 
     * @return
     *     possible object is
     *     {@link PmtBatchStatRecType }
     *     
     */
    public PmtBatchStatRecType getPmtBatchStatRec() {
        return pmtBatchStatRec;
    }

    /**
     * Sets the value of the pmtBatchStatRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtBatchStatRecType }
     *     
     */
    public void setPmtBatchStatRec(PmtBatchStatRecType value) {
        this.pmtBatchStatRec = value;
    }

    /**
     * Gets the value of the pmtBatchStatInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PmtBatchStatInfoType }
     *     
     */
    public PmtBatchStatInfoType getPmtBatchStatInfo() {
        return pmtBatchStatInfo;
    }

    /**
     * Sets the value of the pmtBatchStatInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtBatchStatInfoType }
     *     
     */
    public void setPmtBatchStatInfo(PmtBatchStatInfoType value) {
        this.pmtBatchStatInfo = value;
    }

}
