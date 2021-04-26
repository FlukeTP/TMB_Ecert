
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChksumRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChksumRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChksumId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChksumInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChksumEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChksumStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChksumRec_Type", propOrder = {
    "chksumId",
    "chksumInfo",
    "chksumEnvr",
    "chksumStatus"
})
public class ChksumRecType {

    @XmlElement(name = "ChksumId", required = true)
    protected String chksumId;
    @XmlElement(name = "ChksumInfo", required = true)
    protected ChksumInfoType chksumInfo;
    @XmlElement(name = "ChksumEnvr")
    protected ChksumEnvrType chksumEnvr;
    @XmlElement(name = "ChksumStatus", required = true)
    protected ChksumStatusType chksumStatus;

    /**
     * Gets the value of the chksumId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChksumId() {
        return chksumId;
    }

    /**
     * Sets the value of the chksumId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChksumId(String value) {
        this.chksumId = value;
    }

    /**
     * Gets the value of the chksumInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ChksumInfoType }
     *     
     */
    public ChksumInfoType getChksumInfo() {
        return chksumInfo;
    }

    /**
     * Sets the value of the chksumInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChksumInfoType }
     *     
     */
    public void setChksumInfo(ChksumInfoType value) {
        this.chksumInfo = value;
    }

    /**
     * Gets the value of the chksumEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link ChksumEnvrType }
     *     
     */
    public ChksumEnvrType getChksumEnvr() {
        return chksumEnvr;
    }

    /**
     * Sets the value of the chksumEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChksumEnvrType }
     *     
     */
    public void setChksumEnvr(ChksumEnvrType value) {
        this.chksumEnvr = value;
    }

    /**
     * Gets the value of the chksumStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ChksumStatusType }
     *     
     */
    public ChksumStatusType getChksumStatus() {
        return chksumStatus;
    }

    /**
     * Sets the value of the chksumStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChksumStatusType }
     *     
     */
    public void setChksumStatus(ChksumStatusType value) {
        this.chksumStatus = value;
    }

}
