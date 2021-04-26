
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChkIssueMiscData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChkIssueMiscData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChkIssueMiscType" type="{urn:ifxforum-org:XSD:1}OpenEnum_Type" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MiscIdent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChkIssueMiscData_Type", propOrder = {
    "chkIssueMiscType",
    "miscIdent"
})
public class ChkIssueMiscDataType {

    @XmlElement(name = "ChkIssueMiscType")
    protected String chkIssueMiscType;
    @XmlElement(name = "MiscIdent")
    protected String miscIdent;

    /**
     * Gets the value of the chkIssueMiscType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkIssueMiscType() {
        return chkIssueMiscType;
    }

    /**
     * Sets the value of the chkIssueMiscType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkIssueMiscType(String value) {
        this.chkIssueMiscType = value;
    }

    /**
     * Gets the value of the miscIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscIdent() {
        return miscIdent;
    }

    /**
     * Sets the value of the miscIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscIdent(String value) {
        this.miscIdent = value;
    }

}
