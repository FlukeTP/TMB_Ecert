
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApproverData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApproverData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}LoginName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ApproverName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OverridePwd" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TerminalIdent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApproverData_Type", propOrder = {
    "loginName",
    "approverName",
    "overridePwd",
    "terminalIdent"
})
public class ApproverDataType {

    @XmlElement(name = "LoginName", namespace = "urn:ifxforum-org:XSD:1")
    protected String loginName;
    @XmlElement(name = "ApproverName")
    protected String approverName;
    @XmlElement(name = "OverridePwd")
    protected byte[] overridePwd;
    @XmlElement(name = "TerminalIdent", namespace = "urn:ifxforum-org:XSD:1")
    protected String terminalIdent;

    /**
     * Gets the value of the loginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * Sets the value of the loginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginName(String value) {
        this.loginName = value;
    }

    /**
     * Gets the value of the approverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproverName() {
        return approverName;
    }

    /**
     * Sets the value of the approverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproverName(String value) {
        this.approverName = value;
    }

    /**
     * Gets the value of the overridePwd property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getOverridePwd() {
        return overridePwd;
    }

    /**
     * Sets the value of the overridePwd property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setOverridePwd(byte[] value) {
        this.overridePwd = value;
    }

    /**
     * Gets the value of the terminalIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalIdent() {
        return terminalIdent;
    }

    /**
     * Sets the value of the terminalIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalIdent(String value) {
        this.terminalIdent = value;
    }

}
