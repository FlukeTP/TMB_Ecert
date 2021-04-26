
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PmtStatRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtStatRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PmtStatKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PmtStatRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PmtStatInfo"/&gt;
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
@XmlType(name = "PmtStatRef_Type", propOrder = {
    "pmtStatKeys",
    "pmtStatRec",
    "pmtStatInfo"
})
public class PmtStatRefType {

    @XmlElement(name = "PmtStatKeys")
    protected PmtStatKeysType pmtStatKeys;
    @XmlElement(name = "PmtStatRec")
    protected PmtStatRecType pmtStatRec;
    @XmlElement(name = "PmtStatInfo")
    protected PmtStatInfoType pmtStatInfo;

    /**
     * Gets the value of the pmtStatKeys property.
     * 
     * @return
     *     possible object is
     *     {@link PmtStatKeysType }
     *     
     */
    public PmtStatKeysType getPmtStatKeys() {
        return pmtStatKeys;
    }

    /**
     * Sets the value of the pmtStatKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtStatKeysType }
     *     
     */
    public void setPmtStatKeys(PmtStatKeysType value) {
        this.pmtStatKeys = value;
    }

    /**
     * Gets the value of the pmtStatRec property.
     * 
     * @return
     *     possible object is
     *     {@link PmtStatRecType }
     *     
     */
    public PmtStatRecType getPmtStatRec() {
        return pmtStatRec;
    }

    /**
     * Sets the value of the pmtStatRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtStatRecType }
     *     
     */
    public void setPmtStatRec(PmtStatRecType value) {
        this.pmtStatRec = value;
    }

    /**
     * Gets the value of the pmtStatInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PmtStatInfoType }
     *     
     */
    public PmtStatInfoType getPmtStatInfo() {
        return pmtStatInfo;
    }

    /**
     * Sets the value of the pmtStatInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtStatInfoType }
     *     
     */
    public void setPmtStatInfo(PmtStatInfoType value) {
        this.pmtStatInfo = value;
    }

}
