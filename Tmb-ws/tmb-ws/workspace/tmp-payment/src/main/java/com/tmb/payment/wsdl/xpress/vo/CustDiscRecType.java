
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustDiscRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustDiscRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustDiscId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustDiscInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustDiscEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustDiscStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustDiscRec_Type", propOrder = {
    "custDiscId",
    "custDiscInfo",
    "custDiscEnvr",
    "custDiscStatus"
})
public class CustDiscRecType {

    @XmlElement(name = "CustDiscId", required = true)
    protected String custDiscId;
    @XmlElement(name = "CustDiscInfo", required = true)
    protected CustDiscInfoType custDiscInfo;
    @XmlElement(name = "CustDiscEnvr")
    protected CustDiscEnvrType custDiscEnvr;
    @XmlElement(name = "CustDiscStatus", required = true)
    protected CustDiscStatusType custDiscStatus;

    /**
     * Gets the value of the custDiscId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustDiscId() {
        return custDiscId;
    }

    /**
     * Sets the value of the custDiscId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustDiscId(String value) {
        this.custDiscId = value;
    }

    /**
     * Gets the value of the custDiscInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustDiscInfoType }
     *     
     */
    public CustDiscInfoType getCustDiscInfo() {
        return custDiscInfo;
    }

    /**
     * Sets the value of the custDiscInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustDiscInfoType }
     *     
     */
    public void setCustDiscInfo(CustDiscInfoType value) {
        this.custDiscInfo = value;
    }

    /**
     * Gets the value of the custDiscEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link CustDiscEnvrType }
     *     
     */
    public CustDiscEnvrType getCustDiscEnvr() {
        return custDiscEnvr;
    }

    /**
     * Sets the value of the custDiscEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustDiscEnvrType }
     *     
     */
    public void setCustDiscEnvr(CustDiscEnvrType value) {
        this.custDiscEnvr = value;
    }

    /**
     * Gets the value of the custDiscStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CustDiscStatusType }
     *     
     */
    public CustDiscStatusType getCustDiscStatus() {
        return custDiscStatus;
    }

    /**
     * Sets the value of the custDiscStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustDiscStatusType }
     *     
     */
    public void setCustDiscStatus(CustDiscStatusType value) {
        this.custDiscStatus = value;
    }

}
