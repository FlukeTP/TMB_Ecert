
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LOCLoanData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOCLoanData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}LOCLimit" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MinPmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ExpDt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOCLoanData_Type", propOrder = {
    "locLimit",
    "minPmt",
    "expDt"
})
public class LOCLoanDataType {

    @XmlElement(name = "LOCLimit")
    protected LOCLimitType locLimit;
    @XmlElement(name = "MinPmt")
    protected MinPmtType minPmt;
    @XmlElement(name = "ExpDt")
    protected String expDt;

    /**
     * Gets the value of the locLimit property.
     * 
     * @return
     *     possible object is
     *     {@link LOCLimitType }
     *     
     */
    public LOCLimitType getLOCLimit() {
        return locLimit;
    }

    /**
     * Sets the value of the locLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCLimitType }
     *     
     */
    public void setLOCLimit(LOCLimitType value) {
        this.locLimit = value;
    }

    /**
     * Gets the value of the minPmt property.
     * 
     * @return
     *     possible object is
     *     {@link MinPmtType }
     *     
     */
    public MinPmtType getMinPmt() {
        return minPmt;
    }

    /**
     * Sets the value of the minPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinPmtType }
     *     
     */
    public void setMinPmt(MinPmtType value) {
        this.minPmt = value;
    }

    /**
     * Gets the value of the expDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpDt() {
        return expDt;
    }

    /**
     * Sets the value of the expDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpDt(String value) {
        this.expDt = value;
    }

}
