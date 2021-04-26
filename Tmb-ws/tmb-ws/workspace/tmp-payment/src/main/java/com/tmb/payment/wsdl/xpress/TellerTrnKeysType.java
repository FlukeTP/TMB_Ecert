
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TellerTrnKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TellerTrnKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SPName" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}TellerTrnId"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{http://www.fnf.com/xes}TrnKeyType"/&gt;
 *             &lt;choice&gt;
 *               &lt;element ref="{urn:ifxforum-org:XSD:1}BranchIdent"/&gt;
 *               &lt;element ref="{http://www.fnf.com/xes}DrawerData"/&gt;
 *             &lt;/choice&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}NotAvailInd"/&gt;
 *           &lt;/sequence&gt;
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
@XmlType(name = "TellerTrnKeys_Type", propOrder = {
    "spName",
    "tellerTrnId",
    "trnKeyType",
    "branchIdent",
    "drawerData",
    "notAvailInd"
})
public class TellerTrnKeysType {

    @XmlElement(name = "SPName", namespace = "urn:ifxforum-org:XSD:1")
    protected String spName;
    @XmlElement(name = "TellerTrnId")
    protected String tellerTrnId;
    @XmlElement(name = "TrnKeyType")
    @XmlSchemaType(name = "string")
    protected TrnKeyTypeType trnKeyType;
    @XmlElement(name = "BranchIdent", namespace = "urn:ifxforum-org:XSD:1")
    protected String branchIdent;
    @XmlElement(name = "DrawerData")
    protected DrawerDataType drawerData;
    @XmlElement(name = "NotAvailInd", namespace = "urn:ifxforum-org:XSD:1")
    protected Boolean notAvailInd;

    /**
     * Gets the value of the spName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPName() {
        return spName;
    }

    /**
     * Sets the value of the spName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPName(String value) {
        this.spName = value;
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

    /**
     * Gets the value of the trnKeyType property.
     * 
     * @return
     *     possible object is
     *     {@link TrnKeyTypeType }
     *     
     */
    public TrnKeyTypeType getTrnKeyType() {
        return trnKeyType;
    }

    /**
     * Sets the value of the trnKeyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnKeyTypeType }
     *     
     */
    public void setTrnKeyType(TrnKeyTypeType value) {
        this.trnKeyType = value;
    }

    /**
     * Gets the value of the branchIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchIdent() {
        return branchIdent;
    }

    /**
     * Sets the value of the branchIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchIdent(String value) {
        this.branchIdent = value;
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
     * Gets the value of the notAvailInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotAvailInd() {
        return notAvailInd;
    }

    /**
     * Sets the value of the notAvailInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotAvailInd(Boolean value) {
        this.notAvailInd = value;
    }

}
