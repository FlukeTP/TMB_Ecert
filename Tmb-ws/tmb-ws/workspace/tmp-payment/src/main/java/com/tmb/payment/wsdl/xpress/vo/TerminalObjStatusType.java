
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalObjStatus_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminalObjStatus_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TerminalObjStatusCode"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RequestedOperationMode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ExpectedOpenDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StatusDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EffDt" minOccurs="0"/&gt;
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
@XmlType(name = "TerminalObjStatus_Type", propOrder = {
    "terminalObjStatusCode",
    "requestedOperationMode",
    "expectedOpenDt",
    "statusDesc",
    "effDt",
    "statusModBy"
})
public class TerminalObjStatusType {

    @XmlElement(name = "TerminalObjStatusCode", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalObjStatusCodeType terminalObjStatusCode;
    @XmlElement(name = "RequestedOperationMode")
    @XmlSchemaType(name = "string")
    protected RequestedOperationModeType requestedOperationMode;
    @XmlElement(name = "ExpectedOpenDt")
    protected String expectedOpenDt;
    @XmlElement(name = "StatusDesc")
    protected String statusDesc;
    @XmlElement(name = "EffDt")
    protected String effDt;
    @XmlElement(name = "StatusModBy")
    protected String statusModBy;

    /**
     * Gets the value of the terminalObjStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalObjStatusCodeType }
     *     
     */
    public TerminalObjStatusCodeType getTerminalObjStatusCode() {
        return terminalObjStatusCode;
    }

    /**
     * Sets the value of the terminalObjStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalObjStatusCodeType }
     *     
     */
    public void setTerminalObjStatusCode(TerminalObjStatusCodeType value) {
        this.terminalObjStatusCode = value;
    }

    /**
     * Gets the value of the requestedOperationMode property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedOperationModeType }
     *     
     */
    public RequestedOperationModeType getRequestedOperationMode() {
        return requestedOperationMode;
    }

    /**
     * Sets the value of the requestedOperationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedOperationModeType }
     *     
     */
    public void setRequestedOperationMode(RequestedOperationModeType value) {
        this.requestedOperationMode = value;
    }

    /**
     * Gets the value of the expectedOpenDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpectedOpenDt() {
        return expectedOpenDt;
    }

    /**
     * Sets the value of the expectedOpenDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedOpenDt(String value) {
        this.expectedOpenDt = value;
    }

    /**
     * Gets the value of the statusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * Sets the value of the statusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDesc(String value) {
        this.statusDesc = value;
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
