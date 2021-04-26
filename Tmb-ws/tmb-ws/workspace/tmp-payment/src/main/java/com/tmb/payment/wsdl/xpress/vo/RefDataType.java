
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RefType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RefIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RefDesc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefData_Type", propOrder = {
    "refType",
    "refIdent",
    "refDesc"
})
public class RefDataType {

    @XmlElement(name = "RefType", required = true)
    protected String refType;
    @XmlElement(name = "RefIdent")
    protected String refIdent;
    @XmlElement(name = "RefDesc")
    protected String refDesc;

    /**
     * Gets the value of the refType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefType() {
        return refType;
    }

    /**
     * Sets the value of the refType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefType(String value) {
        this.refType = value;
    }

    /**
     * Gets the value of the refIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefIdent() {
        return refIdent;
    }

    /**
     * Sets the value of the refIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefIdent(String value) {
        this.refIdent = value;
    }

    /**
     * Gets the value of the refDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefDesc() {
        return refDesc;
    }

    /**
     * Sets the value of the refDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefDesc(String value) {
        this.refDesc = value;
    }

}
