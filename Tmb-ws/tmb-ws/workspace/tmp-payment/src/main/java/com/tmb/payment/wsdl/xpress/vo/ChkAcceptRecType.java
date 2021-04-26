
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChkAcceptRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChkAcceptRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkAcceptId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkAcceptInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkAcceptEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkAcceptStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChkAcceptRec_Type", propOrder = {
    "chkAcceptId",
    "chkAcceptInfo",
    "chkAcceptEnvr",
    "chkAcceptStatus"
})
public class ChkAcceptRecType {

    @XmlElement(name = "ChkAcceptId", required = true)
    protected String chkAcceptId;
    @XmlElement(name = "ChkAcceptInfo", required = true)
    protected ChkAcceptInfoType chkAcceptInfo;
    @XmlElement(name = "ChkAcceptEnvr")
    protected ChkAcceptEnvrType chkAcceptEnvr;
    @XmlElement(name = "ChkAcceptStatus", required = true)
    protected ChkAcceptStatusType chkAcceptStatus;

    /**
     * Gets the value of the chkAcceptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkAcceptId() {
        return chkAcceptId;
    }

    /**
     * Sets the value of the chkAcceptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkAcceptId(String value) {
        this.chkAcceptId = value;
    }

    /**
     * Gets the value of the chkAcceptInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ChkAcceptInfoType }
     *     
     */
    public ChkAcceptInfoType getChkAcceptInfo() {
        return chkAcceptInfo;
    }

    /**
     * Sets the value of the chkAcceptInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkAcceptInfoType }
     *     
     */
    public void setChkAcceptInfo(ChkAcceptInfoType value) {
        this.chkAcceptInfo = value;
    }

    /**
     * Gets the value of the chkAcceptEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link ChkAcceptEnvrType }
     *     
     */
    public ChkAcceptEnvrType getChkAcceptEnvr() {
        return chkAcceptEnvr;
    }

    /**
     * Sets the value of the chkAcceptEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkAcceptEnvrType }
     *     
     */
    public void setChkAcceptEnvr(ChkAcceptEnvrType value) {
        this.chkAcceptEnvr = value;
    }

    /**
     * Gets the value of the chkAcceptStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ChkAcceptStatusType }
     *     
     */
    public ChkAcceptStatusType getChkAcceptStatus() {
        return chkAcceptStatus;
    }

    /**
     * Sets the value of the chkAcceptStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkAcceptStatusType }
     *     
     */
    public void setChkAcceptStatus(ChkAcceptStatusType value) {
        this.chkAcceptStatus = value;
    }

}
