
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChkOrdRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChkOrdRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkOrdId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkOrdInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkOrdEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkOrdStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChkOrdRec_Type", propOrder = {
    "chkOrdId",
    "chkOrdInfo",
    "chkOrdEnvr",
    "chkOrdStatus"
})
public class ChkOrdRecType {

    @XmlElement(name = "ChkOrdId", required = true)
    protected String chkOrdId;
    @XmlElement(name = "ChkOrdInfo", required = true)
    protected ChkOrdInfoType chkOrdInfo;
    @XmlElement(name = "ChkOrdEnvr")
    protected ChkOrdEnvrType chkOrdEnvr;
    @XmlElement(name = "ChkOrdStatus", required = true)
    protected ChkOrdStatusType chkOrdStatus;

    /**
     * Gets the value of the chkOrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkOrdId() {
        return chkOrdId;
    }

    /**
     * Sets the value of the chkOrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkOrdId(String value) {
        this.chkOrdId = value;
    }

    /**
     * Gets the value of the chkOrdInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ChkOrdInfoType }
     *     
     */
    public ChkOrdInfoType getChkOrdInfo() {
        return chkOrdInfo;
    }

    /**
     * Sets the value of the chkOrdInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkOrdInfoType }
     *     
     */
    public void setChkOrdInfo(ChkOrdInfoType value) {
        this.chkOrdInfo = value;
    }

    /**
     * Gets the value of the chkOrdEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link ChkOrdEnvrType }
     *     
     */
    public ChkOrdEnvrType getChkOrdEnvr() {
        return chkOrdEnvr;
    }

    /**
     * Sets the value of the chkOrdEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkOrdEnvrType }
     *     
     */
    public void setChkOrdEnvr(ChkOrdEnvrType value) {
        this.chkOrdEnvr = value;
    }

    /**
     * Gets the value of the chkOrdStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ChkOrdStatusType }
     *     
     */
    public ChkOrdStatusType getChkOrdStatus() {
        return chkOrdStatus;
    }

    /**
     * Sets the value of the chkOrdStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkOrdStatusType }
     *     
     */
    public void setChkOrdStatus(ChkOrdStatusType value) {
        this.chkOrdStatus = value;
    }

}
