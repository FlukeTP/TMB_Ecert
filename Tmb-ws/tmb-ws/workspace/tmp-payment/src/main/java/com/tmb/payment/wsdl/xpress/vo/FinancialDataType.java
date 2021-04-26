
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FinancialData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FinancialType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FinancialSubType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Freq" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FinancialAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}UpDt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialData_Type", propOrder = {
    "financialType",
    "financialSubType",
    "freq",
    "financialAmt",
    "upDt"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.FinancialDataType.class
})
public class FinancialDataType {

    @XmlElement(name = "FinancialType", required = true)
    protected String financialType;
    @XmlElement(name = "FinancialSubType")
    protected String financialSubType;
    @XmlElement(name = "Freq")
    protected String freq;
    @XmlElement(name = "FinancialAmt")
    protected FinancialAmtType financialAmt;
    @XmlElement(name = "UpDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar upDt;

    /**
     * Gets the value of the financialType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialType() {
        return financialType;
    }

    /**
     * Sets the value of the financialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialType(String value) {
        this.financialType = value;
    }

    /**
     * Gets the value of the financialSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialSubType() {
        return financialSubType;
    }

    /**
     * Sets the value of the financialSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialSubType(String value) {
        this.financialSubType = value;
    }

    /**
     * Gets the value of the freq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreq() {
        return freq;
    }

    /**
     * Sets the value of the freq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreq(String value) {
        this.freq = value;
    }

    /**
     * Gets the value of the financialAmt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmtType }
     *     
     */
    public FinancialAmtType getFinancialAmt() {
        return financialAmt;
    }

    /**
     * Sets the value of the financialAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmtType }
     *     
     */
    public void setFinancialAmt(FinancialAmtType value) {
        this.financialAmt = value;
    }

    /**
     * Gets the value of the upDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpDt() {
        return upDt;
    }

    /**
     * Sets the value of the upDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpDt(XMLGregorianCalendar value) {
        this.upDt = value;
    }

}
