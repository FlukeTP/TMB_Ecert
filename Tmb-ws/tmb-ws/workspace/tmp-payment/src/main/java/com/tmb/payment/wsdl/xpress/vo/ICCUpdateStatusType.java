
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ICCUpdateStatus_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ICCUpdateStatus_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ICCUpdateStatusCode"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IssuerScriptResultData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EffDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ApprovalIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StatusModBy" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICCUpdateStatus_Type", propOrder = {
    "iccUpdateStatusCode",
    "issuerScriptResultData",
    "effDt",
    "approvalIdent",
    "statusModBy"
})
public class ICCUpdateStatusType {

    @XmlElement(name = "ICCUpdateStatusCode", required = true)
    protected String iccUpdateStatusCode;
    @XmlElement(name = "IssuerScriptResultData")
    protected IssuerScriptResultDataType issuerScriptResultData;
    @XmlElement(name = "EffDt")
    protected String effDt;
    @XmlElement(name = "ApprovalIdent")
    protected String approvalIdent;
    @XmlElement(name = "StatusModBy")
    protected String statusModBy;

    /**
     * Gets the value of the iccUpdateStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICCUpdateStatusCode() {
        return iccUpdateStatusCode;
    }

    /**
     * Sets the value of the iccUpdateStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICCUpdateStatusCode(String value) {
        this.iccUpdateStatusCode = value;
    }

    /**
     * Gets the value of the issuerScriptResultData property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerScriptResultDataType }
     *     
     */
    public IssuerScriptResultDataType getIssuerScriptResultData() {
        return issuerScriptResultData;
    }

    /**
     * Sets the value of the issuerScriptResultData property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerScriptResultDataType }
     *     
     */
    public void setIssuerScriptResultData(IssuerScriptResultDataType value) {
        this.issuerScriptResultData = value;
    }

    /**
     * Gets the value of the effDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffDt() {
        return effDt;
    }

    /**
     * Sets the value of the effDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffDt(String value) {
        this.effDt = value;
    }

    /**
     * Gets the value of the approvalIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalIdent() {
        return approvalIdent;
    }

    /**
     * Sets the value of the approvalIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalIdent(String value) {
        this.approvalIdent = value;
    }

    /**
     * Gets the value of the statusModBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusModBy() {
        return statusModBy;
    }

    /**
     * Sets the value of the statusModBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusModBy(String value) {
        this.statusModBy = value;
    }

}
