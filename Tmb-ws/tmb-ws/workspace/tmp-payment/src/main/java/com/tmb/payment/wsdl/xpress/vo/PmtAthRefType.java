
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PmtAthRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtAthRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PmtAthKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PmtAthRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PmtAthInfo"/&gt;
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
@XmlType(name = "PmtAthRef_Type", propOrder = {
    "pmtAthKeys",
    "pmtAthRec",
    "pmtAthInfo"
})
public class PmtAthRefType {

    @XmlElement(name = "PmtAthKeys")
    protected PmtAthKeysType pmtAthKeys;
    @XmlElement(name = "PmtAthRec")
    protected PmtAthRecType pmtAthRec;
    @XmlElement(name = "PmtAthInfo")
    protected PmtAthInfoType pmtAthInfo;

    /**
     * Gets the value of the pmtAthKeys property.
     * 
     * @return
     *     possible object is
     *     {@link PmtAthKeysType }
     *     
     */
    public PmtAthKeysType getPmtAthKeys() {
        return pmtAthKeys;
    }

    /**
     * Sets the value of the pmtAthKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtAthKeysType }
     *     
     */
    public void setPmtAthKeys(PmtAthKeysType value) {
        this.pmtAthKeys = value;
    }

    /**
     * Gets the value of the pmtAthRec property.
     * 
     * @return
     *     possible object is
     *     {@link PmtAthRecType }
     *     
     */
    public PmtAthRecType getPmtAthRec() {
        return pmtAthRec;
    }

    /**
     * Sets the value of the pmtAthRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtAthRecType }
     *     
     */
    public void setPmtAthRec(PmtAthRecType value) {
        this.pmtAthRec = value;
    }

    /**
     * Gets the value of the pmtAthInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PmtAthInfoType }
     *     
     */
    public PmtAthInfoType getPmtAthInfo() {
        return pmtAthInfo;
    }

    /**
     * Sets the value of the pmtAthInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtAthInfoType }
     *     
     */
    public void setPmtAthInfo(PmtAthInfoType value) {
        this.pmtAthInfo = value;
    }

}
