
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecXferKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecXferKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SPName" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}RecXferId"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}RecXferKeyData"/&gt;
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
@XmlType(name = "RecXferKeys_Type", propOrder = {
    "spName",
    "recXferId",
    "recXferKeyData"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.RecXferKeysType.class
})
public class RecXferKeysType {

    @XmlElement(name = "SPName")
    protected String spName;
    @XmlElement(name = "RecXferId")
    protected String recXferId;
    @XmlElement(name = "RecXferKeyData")
    protected RecXferKeyDataType recXferKeyData;

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
     * Gets the value of the recXferId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecXferId() {
        return recXferId;
    }

    /**
     * Sets the value of the recXferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecXferId(String value) {
        this.recXferId = value;
    }

    /**
     * Gets the value of the recXferKeyData property.
     * 
     * @return
     *     possible object is
     *     {@link RecXferKeyDataType }
     *     
     */
    public RecXferKeyDataType getRecXferKeyData() {
        return recXferKeyData;
    }

    /**
     * Sets the value of the recXferKeyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecXferKeyDataType }
     *     
     */
    public void setRecXferKeyData(RecXferKeyDataType value) {
        this.recXferKeyData = value;
    }

}
