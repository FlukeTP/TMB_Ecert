
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompRemitStmtRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompRemitStmtRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CompRemitStmtKeys"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CompRemitStmtRec"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CompRemitStmtInfo"/&gt;
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
@XmlType(name = "CompRemitStmtRef_Type", propOrder = {
    "compRemitStmtKeys",
    "compRemitStmtRec",
    "compRemitStmtInfo"
})
public class CompRemitStmtRefType {

    @XmlElement(name = "CompRemitStmtKeys")
    protected CompRemitStmtKeysType compRemitStmtKeys;
    @XmlElement(name = "CompRemitStmtRec")
    protected CompRemitStmtRecType compRemitStmtRec;
    @XmlElement(name = "CompRemitStmtInfo")
    protected CompRemitStmtInfoType compRemitStmtInfo;

    /**
     * Gets the value of the compRemitStmtKeys property.
     * 
     * @return
     *     possible object is
     *     {@link CompRemitStmtKeysType }
     *     
     */
    public CompRemitStmtKeysType getCompRemitStmtKeys() {
        return compRemitStmtKeys;
    }

    /**
     * Sets the value of the compRemitStmtKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompRemitStmtKeysType }
     *     
     */
    public void setCompRemitStmtKeys(CompRemitStmtKeysType value) {
        this.compRemitStmtKeys = value;
    }

    /**
     * Gets the value of the compRemitStmtRec property.
     * 
     * @return
     *     possible object is
     *     {@link CompRemitStmtRecType }
     *     
     */
    public CompRemitStmtRecType getCompRemitStmtRec() {
        return compRemitStmtRec;
    }

    /**
     * Sets the value of the compRemitStmtRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompRemitStmtRecType }
     *     
     */
    public void setCompRemitStmtRec(CompRemitStmtRecType value) {
        this.compRemitStmtRec = value;
    }

    /**
     * Gets the value of the compRemitStmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CompRemitStmtInfoType }
     *     
     */
    public CompRemitStmtInfoType getCompRemitStmtInfo() {
        return compRemitStmtInfo;
    }

    /**
     * Sets the value of the compRemitStmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompRemitStmtInfoType }
     *     
     */
    public void setCompRemitStmtInfo(CompRemitStmtInfoType value) {
        this.compRemitStmtInfo = value;
    }

}
