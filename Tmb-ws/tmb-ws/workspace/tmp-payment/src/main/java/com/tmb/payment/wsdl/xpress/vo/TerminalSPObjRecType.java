
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalSPObjRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminalSPObjRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TerminalSPObjId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TerminalSPObjInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TerminalSPObjEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TerminalSPObjStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalSPObjRec_Type", propOrder = {
    "terminalSPObjId",
    "terminalSPObjInfo",
    "terminalSPObjEnvr",
    "terminalSPObjStatus"
})
public class TerminalSPObjRecType {

    @XmlElement(name = "TerminalSPObjId", required = true)
    protected String terminalSPObjId;
    @XmlElement(name = "TerminalSPObjInfo", required = true)
    protected TerminalSPObjInfoType terminalSPObjInfo;
    @XmlElement(name = "TerminalSPObjEnvr")
    protected TerminalSPObjEnvrType terminalSPObjEnvr;
    @XmlElement(name = "TerminalSPObjStatus", required = true)
    protected TerminalSPObjStatusType terminalSPObjStatus;

    /**
     * Gets the value of the terminalSPObjId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalSPObjId() {
        return terminalSPObjId;
    }

    /**
     * Sets the value of the terminalSPObjId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalSPObjId(String value) {
        this.terminalSPObjId = value;
    }

    /**
     * Gets the value of the terminalSPObjInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalSPObjInfoType }
     *     
     */
    public TerminalSPObjInfoType getTerminalSPObjInfo() {
        return terminalSPObjInfo;
    }

    /**
     * Sets the value of the terminalSPObjInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalSPObjInfoType }
     *     
     */
    public void setTerminalSPObjInfo(TerminalSPObjInfoType value) {
        this.terminalSPObjInfo = value;
    }

    /**
     * Gets the value of the terminalSPObjEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalSPObjEnvrType }
     *     
     */
    public TerminalSPObjEnvrType getTerminalSPObjEnvr() {
        return terminalSPObjEnvr;
    }

    /**
     * Sets the value of the terminalSPObjEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalSPObjEnvrType }
     *     
     */
    public void setTerminalSPObjEnvr(TerminalSPObjEnvrType value) {
        this.terminalSPObjEnvr = value;
    }

    /**
     * Gets the value of the terminalSPObjStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalSPObjStatusType }
     *     
     */
    public TerminalSPObjStatusType getTerminalSPObjStatus() {
        return terminalSPObjStatus;
    }

    /**
     * Sets the value of the terminalSPObjStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalSPObjStatusType }
     *     
     */
    public void setTerminalSPObjStatus(TerminalSPObjStatusType value) {
        this.terminalSPObjStatus = value;
    }

}
