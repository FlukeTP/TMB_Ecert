
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelAuditData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelAuditData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RelDataType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RelDataIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RelDataValue" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RelDataName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RelDataDesc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelAuditData_Type", propOrder = {
    "relDataType",
    "relDataIdent",
    "relDataValue",
    "relDataName",
    "relDataDesc"
})
public class RelAuditDataType {

    @XmlElement(name = "RelDataType")
    protected String relDataType;
    @XmlElement(name = "RelDataIdent")
    protected String relDataIdent;
    @XmlElement(name = "RelDataValue")
    protected String relDataValue;
    @XmlElement(name = "RelDataName")
    protected String relDataName;
    @XmlElement(name = "RelDataDesc")
    protected String relDataDesc;

    /**
     * Gets the value of the relDataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelDataType() {
        return relDataType;
    }

    /**
     * Sets the value of the relDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelDataType(String value) {
        this.relDataType = value;
    }

    /**
     * Gets the value of the relDataIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelDataIdent() {
        return relDataIdent;
    }

    /**
     * Sets the value of the relDataIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelDataIdent(String value) {
        this.relDataIdent = value;
    }

    /**
     * Gets the value of the relDataValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelDataValue() {
        return relDataValue;
    }

    /**
     * Sets the value of the relDataValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelDataValue(String value) {
        this.relDataValue = value;
    }

    /**
     * Gets the value of the relDataName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelDataName() {
        return relDataName;
    }

    /**
     * Sets the value of the relDataName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelDataName(String value) {
        this.relDataName = value;
    }

    /**
     * Gets the value of the relDataDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelDataDesc() {
        return relDataDesc;
    }

    /**
     * Sets the value of the relDataDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelDataDesc(String value) {
        this.relDataDesc = value;
    }

}
