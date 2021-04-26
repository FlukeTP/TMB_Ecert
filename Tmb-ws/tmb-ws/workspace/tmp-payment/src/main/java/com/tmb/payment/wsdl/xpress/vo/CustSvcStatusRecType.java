
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustSvcStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustSvcStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustSvcId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CustSvcStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustSvcStatusRec_Type", propOrder = {
    "custSvcId",
    "custSvcStatus"
})
public class CustSvcStatusRecType {

    @XmlElement(name = "CustSvcId")
    protected CustSvcIdType custSvcId;
    @XmlElement(name = "CustSvcStatus")
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
