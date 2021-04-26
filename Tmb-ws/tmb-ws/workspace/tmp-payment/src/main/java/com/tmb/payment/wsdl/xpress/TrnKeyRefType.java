
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrnKeyRef_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrnKeyRef_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}KeyRefType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TrnTypeId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}JournalId" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}DrawerData" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}TellerTrnId" minOccurs="0"/&gt;
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
@XmlType(name = "TrnKeyRef_Type", propOrder = {
    "keyRefType",
    "trnTypeId",
    "journalId",
    "drawerData",
    "tellerTrnId"
})
public class TrnKeyRefType {

    @XmlElement(name = "KeyRefType")
    @XmlSchemaType(name = "string")
    protected KeyRefTypeType keyRefType;
    @XmlElement(name = "TrnTypeId")
    protected String trnTypeId;
    @XmlElement(name = "JournalId")
    protected String journalId;
    @XmlElement(name = "DrawerData")
    protected DrawerDataType drawerData;
    @XmlElement(name = "TellerTrnId")
    protected String tellerTrnId;

    /**
     * Gets the value of the keyRefType property.
     * 
     * @return
     *     possible object is
     *     {@link KeyRefTypeType }
     *     
     */
    public KeyRefTypeType getKeyRefType() {
        return keyRefType;
    }

    /**
     * Sets the value of the keyRefType property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyRefTypeType }
     *     
     */
    public void setKeyRefType(KeyRefTypeType value) {
        this.keyRefType = value;
    }

    /**
     * Gets the value of the trnTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnTypeId() {
        return trnTypeId;
    }

    /**
     * Sets the value of the trnTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnTypeId(String value) {
        this.trnTypeId = value;
    }

    /**
     * Gets the value of the journalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalId() {
        return journalId;
    }

    /**
     * Sets the value of the journalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalId(String value) {
        this.journalId = value;
    }

    /**
     * Gets the value of the drawerData property.
     * 
     * @return
     *     possible object is
     *     {@link DrawerDataType }
     *     
     */
    public DrawerDataType getDrawerData() {
        return drawerData;
    }

    /**
     * Sets the value of the drawerData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrawerDataType }
     *     
     */
    public void setDrawerData(DrawerDataType value) {
        this.drawerData = value;
    }

    /**
     * Gets the value of the tellerTrnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTellerTrnId() {
        return tellerTrnId;
    }

    /**
     * Sets the value of the tellerTrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTellerTrnId(String value) {
        this.tellerTrnId = value;
    }

}
