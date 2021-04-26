
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustSvcRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustSvcRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustSvcId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustSvcInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustSvcEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustSvcStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustSvcRec_Type", propOrder = {
    "custSvcId",
    "custSvcInfo",
    "custSvcEnvr",
    "custSvcStatus"
})
public class CustSvcRecType {

    @XmlElement(name = "CustSvcId", required = true)
    protected CustSvcIdType custSvcId;
    @XmlElement(name = "CustSvcInfo", required = true)
    protected CustSvcInfoType custSvcInfo;
    @XmlElement(name = "CustSvcEnvr")
    protected CustSvcEnvrType custSvcEnvr;
    @XmlElement(name = "CustSvcStatus", required = true)
    protected CustSvcStatusType custSvcStatus;

    /**
     * Gets the value of the custSvcId property.
     * 
     * @return
     *     possible object is
     *     {@link CustSvcIdType }
     *     
     */
    public CustSvcIdType getCustSvcId() {
        return custSvcId;
    }

    /**
     * Sets the value of the custSvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustSvcIdType }
     *     
     */
    public void setCustSvcId(CustSvcIdType value) {
        this.custSvcId = value;
    }

    /**
     * Gets the value of the custSvcInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustSvcInfoType }
     *     
     */
    public CustSvcInfoType getCustSvcInfo() {
        return custSvcInfo;
    }

    /**
     * Sets the value of the custSvcInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustSvcInfoType }
     *     
     */
    public void setCustSvcInfo(CustSvcInfoType value) {
        this.custSvcInfo = value;
    }

    /**
     * Gets the value of the custSvcEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link CustSvcEnvrType }
     *     
     */
    public CustSvcEnvrType getCustSvcEnvr() {
        return custSvcEnvr;
    }

    /**
     * Sets the value of the custSvcEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustSvcEnvrType }
     *     
     */
    public void setCustSvcEnvr(CustSvcEnvrType value) {
        this.custSvcEnvr = value;
    }

    /**
     * Gets the value of the custSvcStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CustSvcStatusType }
     *     
     */
    public CustSvcStatusType getCustSvcStatus() {
        return custSvcStatus;
    }

    /**
     * Sets the value of the custSvcStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustSvcStatusType }
     *     
     */
    public void setCustSvcStatus(CustSvcStatusType value) {
        this.custSvcStatus = value;
    }

}
