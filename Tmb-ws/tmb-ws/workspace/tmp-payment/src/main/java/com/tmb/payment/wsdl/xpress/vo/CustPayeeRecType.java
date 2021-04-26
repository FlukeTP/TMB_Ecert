
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustPayeeRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustPayeeRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustPayeeId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustPayeeInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustPayeeEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustPayeeStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustPayeeRec_Type", propOrder = {
    "custPayeeId",
    "custPayeeInfo",
    "custPayeeEnvr",
    "custPayeeStatus"
})
public class CustPayeeRecType {

    @XmlElement(name = "CustPayeeId", required = true)
    protected String custPayeeId;
    @XmlElement(name = "CustPayeeInfo", required = true)
    protected CustPayeeInfoType custPayeeInfo;
    @XmlElement(name = "CustPayeeEnvr")
    protected CustPayeeEnvrType custPayeeEnvr;
    @XmlElement(name = "CustPayeeStatus", required = true)
    protected CustPayeeStatusType custPayeeStatus;

    /**
     * Gets the value of the custPayeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustPayeeId() {
        return custPayeeId;
    }

    /**
     * Sets the value of the custPayeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustPayeeId(String value) {
        this.custPayeeId = value;
    }

    /**
     * Gets the value of the custPayeeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustPayeeInfoType }
     *     
     */
    public CustPayeeInfoType getCustPayeeInfo() {
        return custPayeeInfo;
    }

    /**
     * Sets the value of the custPayeeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustPayeeInfoType }
     *     
     */
    public void setCustPayeeInfo(CustPayeeInfoType value) {
        this.custPayeeInfo = value;
    }

    /**
     * Gets the value of the custPayeeEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link CustPayeeEnvrType }
     *     
     */
    public CustPayeeEnvrType getCustPayeeEnvr() {
        return custPayeeEnvr;
    }

    /**
     * Sets the value of the custPayeeEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustPayeeEnvrType }
     *     
     */
    public void setCustPayeeEnvr(CustPayeeEnvrType value) {
        this.custPayeeEnvr = value;
    }

    /**
     * Gets the value of the custPayeeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CustPayeeStatusType }
     *     
     */
    public CustPayeeStatusType getCustPayeeStatus() {
        return custPayeeStatus;
    }

    /**
     * Sets the value of the custPayeeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustPayeeStatusType }
     *     
     */
    public void setCustPayeeStatus(CustPayeeStatusType value) {
        this.custPayeeStatus = value;
    }

}
