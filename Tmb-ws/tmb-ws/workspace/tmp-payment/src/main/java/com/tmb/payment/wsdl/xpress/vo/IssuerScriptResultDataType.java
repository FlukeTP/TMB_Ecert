
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for IssuerScriptResultData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssuerScriptResultData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IssuerScriptResult"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IssuerScriptIdent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssuerScriptResultData_Type", propOrder = {
    "issuerScriptResult",
    "issuerScriptIdent"
})
public class IssuerScriptResultDataType {

    @XmlElement(name = "IssuerScriptResult", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] issuerScriptResult;
    @XmlElement(name = "IssuerScriptIdent", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] issuerScriptIdent;

    /**
     * Gets the value of the issuerScriptResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getIssuerScriptResult() {
        return issuerScriptResult;
    }

    /**
     * Sets the value of the issuerScriptResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerScriptResult(byte[] value) {
        this.issuerScriptResult = value;
    }

    /**
     * Gets the value of the issuerScriptIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getIssuerScriptIdent() {
        return issuerScriptIdent;
    }

    /**
     * Sets the value of the issuerScriptIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerScriptIdent(byte[] value) {
        this.issuerScriptIdent = value;
    }

}
