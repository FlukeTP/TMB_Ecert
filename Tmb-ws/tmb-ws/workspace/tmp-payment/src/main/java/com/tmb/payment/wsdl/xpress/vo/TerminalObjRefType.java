
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalObjRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminalObjRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}TerminalObjKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}TerminalObjRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}TerminalObjInfo"/&gt;
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
@XmlType(name = "TerminalObjRef_Type", propOrder = {
    "terminalObjKeys",
    "terminalObjRec",
    "terminalObjInfo"
})
public class TerminalObjRefType {

    @XmlElement(name = "TerminalObjKeys")
    protected TerminalObjKeysType terminalObjKeys;
    @XmlElement(name = "TerminalObjRec")
    protected TerminalObjRecType terminalObjRec;
    @XmlElement(name = "TerminalObjInfo")
    protected TerminalObjInfoType terminalObjInfo;

    /**
     * Gets the value of the terminalObjKeys property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalObjKeysType }
     *     
     */
    public TerminalObjKeysType getTerminalObjKeys() {
        return terminalObjKeys;
    }

    /**
     * Sets the value of the terminalObjKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalObjKeysType }
     *     
     */
    public void setTerminalObjKeys(TerminalObjKeysType value) {
        this.terminalObjKeys = value;
    }

    /**
     * Gets the value of the terminalObjRec property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalObjRecType }
     *     
     */
    public TerminalObjRecType getTerminalObjRec() {
        return terminalObjRec;
    }

    /**
     * Sets the value of the terminalObjRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalObjRecType }
     *     
     */
    public void setTerminalObjRec(TerminalObjRecType value) {
        this.terminalObjRec = value;
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

}
