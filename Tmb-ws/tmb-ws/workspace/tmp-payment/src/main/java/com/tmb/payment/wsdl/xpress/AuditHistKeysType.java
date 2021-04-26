
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuditHistKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuditHistKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AuditHistId"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}ObjectIdent"/&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}SeqNum" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditHistKeys_Type", propOrder = {
    "auditHistId",
    "objectIdent",
    "seqNum"
})
public class AuditHistKeysType {

    @XmlElement(name = "AuditHistId")
    protected String auditHistId;
    @XmlElement(name = "ObjectIdent")
    protected ObjectIdentType objectIdent;
    @XmlElement(name = "SeqNum")
    protected String seqNum;

    /**
     * Gets the value of the auditHistId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditHistId() {
        return auditHistId;
    }

    /**
     * Sets the value of the auditHistId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditHistId(String value) {
        this.auditHistId = value;
    }

    /**
     * Gets the value of the objectIdent property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIdentType }
     *     
     */
    public ObjectIdentType getObjectIdent() {
        return objectIdent;
    }

    /**
     * Sets the value of the objectIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIdentType }
     *     
     */
    public void setObjectIdent(ObjectIdentType value) {
        this.objectIdent = value;
    }

    /**
     * Gets the value of the seqNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqNum() {
        return seqNum;
    }

    /**
     * Sets the value of the seqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqNum(String value) {
        this.seqNum = value;
    }

}
