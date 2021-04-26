
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepBkOrdRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepBkOrdRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DepBkOrdId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DepBkOrdInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DepBkOrdEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DepBkOrdStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepBkOrdRec_Type", propOrder = {
    "depBkOrdId",
    "depBkOrdInfo",
    "depBkOrdEnvr",
    "depBkOrdStatus"
})
public class DepBkOrdRecType {

    @XmlElement(name = "DepBkOrdId", required = true)
    protected String depBkOrdId;
    @XmlElement(name = "DepBkOrdInfo", required = true)
    protected DepBkOrdInfoType depBkOrdInfo;
    @XmlElement(name = "DepBkOrdEnvr")
    protected DepBkOrdEnvrType depBkOrdEnvr;
    @XmlElement(name = "DepBkOrdStatus", required = true)
    protected DepBkOrdStatusType depBkOrdStatus;

    /**
     * Gets the value of the depBkOrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepBkOrdId() {
        return depBkOrdId;
    }

    /**
     * Sets the value of the depBkOrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepBkOrdId(String value) {
        this.depBkOrdId = value;
    }

    /**
     * Gets the value of the depBkOrdInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DepBkOrdInfoType }
     *     
     */
    public DepBkOrdInfoType getDepBkOrdInfo() {
        return depBkOrdInfo;
    }

    /**
     * Sets the value of the depBkOrdInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepBkOrdInfoType }
     *     
     */
    public void setDepBkOrdInfo(DepBkOrdInfoType value) {
        this.depBkOrdInfo = value;
    }

    /**
     * Gets the value of the depBkOrdEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link DepBkOrdEnvrType }
     *     
     */
    public DepBkOrdEnvrType getDepBkOrdEnvr() {
        return depBkOrdEnvr;
    }

    /**
     * Sets the value of the depBkOrdEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepBkOrdEnvrType }
     *     
     */
    public void setDepBkOrdEnvr(DepBkOrdEnvrType value) {
        this.depBkOrdEnvr = value;
    }

    /**
     * Gets the value of the depBkOrdStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DepBkOrdStatusType }
     *     
     */
    public DepBkOrdStatusType getDepBkOrdStatus() {
        return depBkOrdStatus;
    }

    /**
     * Sets the value of the depBkOrdStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepBkOrdStatusType }
     *     
     */
    public void setDepBkOrdStatus(DepBkOrdStatusType value) {
        this.depBkOrdStatus = value;
    }

}
