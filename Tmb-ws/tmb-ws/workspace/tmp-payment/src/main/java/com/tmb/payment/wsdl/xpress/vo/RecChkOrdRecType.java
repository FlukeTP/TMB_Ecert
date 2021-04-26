
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecChkOrdRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecChkOrdRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RecChkOrdId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RecChkOrdInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RecChkOrdEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RecChkOrdStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecChkOrdRec_Type", propOrder = {
    "recChkOrdId",
    "recChkOrdInfo",
    "recChkOrdEnvr",
    "recChkOrdStatus"
})
public class RecChkOrdRecType {

    @XmlElement(name = "RecChkOrdId", required = true)
    protected String recChkOrdId;
    @XmlElement(name = "RecChkOrdInfo", required = true)
    protected RecChkOrdInfoType recChkOrdInfo;
    @XmlElement(name = "RecChkOrdEnvr")
    protected RecChkOrdEnvrType recChkOrdEnvr;
    @XmlElement(name = "RecChkOrdStatus", required = true)
    protected RecChkOrdStatusType recChkOrdStatus;

    /**
     * Gets the value of the recChkOrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecChkOrdId() {
        return recChkOrdId;
    }

    /**
     * Sets the value of the recChkOrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecChkOrdId(String value) {
        this.recChkOrdId = value;
    }

    /**
     * Gets the value of the recChkOrdInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RecChkOrdInfoType }
     *     
     */
    public RecChkOrdInfoType getRecChkOrdInfo() {
        return recChkOrdInfo;
    }

    /**
     * Sets the value of the recChkOrdInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecChkOrdInfoType }
     *     
     */
    public void setRecChkOrdInfo(RecChkOrdInfoType value) {
        this.recChkOrdInfo = value;
    }

    /**
     * Gets the value of the recChkOrdEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link RecChkOrdEnvrType }
     *     
     */
    public RecChkOrdEnvrType getRecChkOrdEnvr() {
        return recChkOrdEnvr;
    }

    /**
     * Sets the value of the recChkOrdEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecChkOrdEnvrType }
     *     
     */
    public void setRecChkOrdEnvr(RecChkOrdEnvrType value) {
        this.recChkOrdEnvr = value;
    }

    /**
     * Gets the value of the recChkOrdStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RecChkOrdStatusType }
     *     
     */
    public RecChkOrdStatusType getRecChkOrdStatus() {
        return recChkOrdStatus;
    }

    /**
     * Sets the value of the recChkOrdStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecChkOrdStatusType }
     *     
     */
    public void setRecChkOrdStatus(RecChkOrdStatusType value) {
        this.recChkOrdStatus = value;
    }

}
