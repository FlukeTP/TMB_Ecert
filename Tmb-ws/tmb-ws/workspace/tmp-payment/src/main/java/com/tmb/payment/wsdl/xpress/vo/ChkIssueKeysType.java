
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChkIssueKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChkIssueKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SPName" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ChkIssueId"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ChkIssueKeyData"/&gt;
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
@XmlType(name = "ChkIssueKeys_Type", propOrder = {
    "spName",
    "chkIssueId",
    "chkIssueKeyData"
})
public class ChkIssueKeysType {

    @XmlElement(name = "SPName")
    protected String spName;
    @XmlElement(name = "ChkIssueId")
    protected String chkIssueId;
    @XmlElement(name = "ChkIssueKeyData")
    protected ChkIssueKeyDataType chkIssueKeyData;

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
     * Gets the value of the chkIssueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkIssueId() {
        return chkIssueId;
    }

    /**
     * Sets the value of the chkIssueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkIssueId(String value) {
        this.chkIssueId = value;
    }

    /**
     * Gets the value of the chkIssueKeyData property.
     * 
     * @return
     *     possible object is
     *     {@link ChkIssueKeyDataType }
     *     
     */
    public ChkIssueKeyDataType getChkIssueKeyData() {
        return chkIssueKeyData;
    }

    /**
     * Sets the value of the chkIssueKeyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkIssueKeyDataType }
     *     
     */
    public void setChkIssueKeyData(ChkIssueKeyDataType value) {
        this.chkIssueKeyData = value;
    }

}
