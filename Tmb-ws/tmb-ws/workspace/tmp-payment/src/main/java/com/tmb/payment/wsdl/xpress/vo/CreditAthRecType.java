
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditAthRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditAthRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CreditAthId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CreditAthInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CreditAthEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CreditAthStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditAthRec_Type", propOrder = {
    "creditAthId",
    "creditAthInfo",
    "creditAthEnvr",
    "creditAthStatus"
})
public class CreditAthRecType {

    @XmlElement(name = "CreditAthId", required = true)
    protected String creditAthId;
    @XmlElement(name = "CreditAthInfo", required = true)
    protected CreditAthInfoType creditAthInfo;
    @XmlElement(name = "CreditAthEnvr")
    protected CreditAthEnvrType creditAthEnvr;
    @XmlElement(name = "CreditAthStatus", required = true)
    protected CreditAthStatusType creditAthStatus;

    /**
     * Gets the value of the creditAthId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAthId() {
        return creditAthId;
    }

    /**
     * Sets the value of the creditAthId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAthId(String value) {
        this.creditAthId = value;
    }

    /**
     * Gets the value of the creditAthInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CreditAthInfoType }
     *     
     */
    public CreditAthInfoType getCreditAthInfo() {
        return creditAthInfo;
    }

    /**
     * Sets the value of the creditAthInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditAthInfoType }
     *     
     */
    public void setCreditAthInfo(CreditAthInfoType value) {
        this.creditAthInfo = value;
    }

    /**
     * Gets the value of the creditAthEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link CreditAthEnvrType }
     *     
     */
    public CreditAthEnvrType getCreditAthEnvr() {
        return creditAthEnvr;
    }

    /**
     * Sets the value of the creditAthEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditAthEnvrType }
     *     
     */
    public void setCreditAthEnvr(CreditAthEnvrType value) {
        this.creditAthEnvr = value;
    }

    /**
     * Gets the value of the creditAthStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CreditAthStatusType }
     *     
     */
    public CreditAthStatusType getCreditAthStatus() {
        return creditAthStatus;
    }

    /**
     * Sets the value of the creditAthStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditAthStatusType }
     *     
     */
    public void setCreditAthStatus(CreditAthStatusType value) {
        this.creditAthStatus = value;
    }

}
