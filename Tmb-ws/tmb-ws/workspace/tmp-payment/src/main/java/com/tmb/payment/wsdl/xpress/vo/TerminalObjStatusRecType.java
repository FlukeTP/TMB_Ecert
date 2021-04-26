
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalObjStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminalObjStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TerminalObjId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TerminalObjStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalObjStatusRec_Type", propOrder = {
    "terminalObjId",
    "terminalObjStatus"
})
public class TerminalObjStatusRecType {

    @XmlElement(name = "TerminalObjId")
    protected String terminalObjId;
    @XmlElement(name = "TerminalObjStatus")
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
