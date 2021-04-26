
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalSPObjRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminalSPObjRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}TerminalSPObjKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}TerminalSPObjRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}TerminalSPObjInfo"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalSPObjRef_Type", propOrder = {
    "terminalSPObjKeys",
    "terminalSPObjRec",
    "terminalSPObjInfo"
})
public class TerminalSPObjRefType {

    @XmlElement(name = "TerminalSPObjKeys")
    protected TerminalSPObjKeysType terminalSPObjKeys;
    @XmlElement(name = "TerminalSPObjRec")
    protected TerminalSPObjRecType terminalSPObjRec;
    @XmlElement(name = "TerminalSPObjInfo")
    protected TerminalSPObjInfoType terminalSPObjInfo;

    /**
     * Gets the value of the terminalSPObjKeys property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalSPObjKeysType }
     *     
     */
    public TerminalSPObjKeysType getTerminalSPObjKeys() {
        return terminalSPObjKeys;
    }

    /**
     * Sets the value of the terminalSPObjKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalSPObjKeysType }
     *     
     */
    public void setTerminalSPObjKeys(TerminalSPObjKeysType value) {
        this.terminalSPObjKeys = value;
    }

    /**
     * Gets the value of the terminalSPObjRec property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalSPObjRecType }
     *     
     */
    public TerminalSPObjRecType getTerminalSPObjRec() {
        return terminalSPObjRec;
    }

    /**
     * Sets the value of the terminalSPObjRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalSPObjRecType }
     *     
     */
    public void setTerminalSPObjRec(TerminalSPObjRecType value) {
        this.terminalSPObjRec = value;
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

}
