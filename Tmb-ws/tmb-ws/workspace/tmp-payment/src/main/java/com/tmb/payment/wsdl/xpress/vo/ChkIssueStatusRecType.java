
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChkIssueStatusRec_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChkIssueStatusRec_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkIssueId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkIssueStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChkIssueStatusRec_Type", propOrder = {
    "chkIssueId",
    "chkIssueStatus"
})
public class ChkIssueStatusRecType {

    @XmlElement(name = "ChkIssueId")
    protected String chkIssueId;
    @XmlElement(name = "ChkIssueStatus")
    protected ChkIssueStatusType chkIssueStatus;

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
     * Gets the value of the chkIssueStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ChkIssueStatusType }
     *     
     */
    public ChkIssueStatusType getChkIssueStatus() {
        return chkIssueStatus;
    }

    /**
     * Sets the value of the chkIssueStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkIssueStatusType }
     *     
     */
    public void setChkIssueStatus(ChkIssueStatusType value) {
        this.chkIssueStatus = value;
    }

}
