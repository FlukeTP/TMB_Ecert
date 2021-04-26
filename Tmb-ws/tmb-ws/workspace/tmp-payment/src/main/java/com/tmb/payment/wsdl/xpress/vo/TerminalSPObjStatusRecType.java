
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalSPObjStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminalSPObjStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TerminalSPObjId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TerminalSPObjStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalSPObjStatusRec_Type", propOrder = {
    "terminalSPObjId",
    "terminalSPObjStatus"
})
public class TerminalSPObjStatusRecType {

    @XmlElement(name = "TerminalSPObjId")
    protected String terminalSPObjId;
    @XmlElement(name = "TerminalSPObjStatus")
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
