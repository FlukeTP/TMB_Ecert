
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalObjRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminalObjRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TerminalObjId"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TerminalObjInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TerminalObjEnvr" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TerminalObjStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalObjRec_Type", propOrder = {
    "terminalObjId",
    "terminalObjInfo",
    "terminalObjEnvr",
    "terminalObjStatus"
})
public class TerminalObjRecType {

    @XmlElement(name = "TerminalObjId", required = true)
    protected String terminalObjId;
    @XmlElement(name = "TerminalObjInfo", required = true)
    protected TerminalObjInfoType terminalObjInfo;
    @XmlElement(name = "TerminalObjEnvr")
    protected TerminalObjEnvrType terminalObjEnvr;
    @XmlElement(name = "TerminalObjStatus", required = true)
    protected TerminalObjStatusType terminalObjStatus;

    /**
     * Gets the value of the terminalObjId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalObjId() {
        return terminalObjId;
    }

    /**
     * Sets the value of the terminalObjId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalObjId(String value) {
        this.terminalObjId = value;
    }

    /**
     * Gets the value of the terminalObjInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalObjInfoType }
     *     
     */
    public TerminalObjInfoType getTerminalObjInfo() {
        return terminalObjInfo;
    }

    /**
     * Sets the value of the terminalObjInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalObjInfoType }
     *     
     */
    public void setTerminalObjInfo(TerminalObjInfoType value) {
        this.terminalObjInfo = value;
    }

    /**
     * Gets the value of the terminalObjEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalObjEnvrType }
     *     
     */
    public TerminalObjEnvrType getTerminalObjEnvr() {
        return terminalObjEnvr;
    }

    /**
     * Sets the value of the terminalObjEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalObjEnvrType }
     *     
     */
    public void setTerminalObjEnvr(TerminalObjEnvrType value) {
        this.terminalObjEnvr = value;
    }

    /**
     * Gets the value of the terminalObjStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalObjStatusType }
     *     
     */
    public TerminalObjStatusType getTerminalObjStatus() {
        return terminalObjStatus;
    }

    /**
     * Sets the value of the terminalObjStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalObjStatusType }
     *     
     */
    public void setTerminalObjStatus(TerminalObjStatusType value) {
        this.terminalObjStatus = value;
    }

}
