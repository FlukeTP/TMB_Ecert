
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxWithheldData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxWithheldData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TaxYear" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctTaxData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TaxIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TaxIdentType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxWithheldData_Type", propOrder = {
    "taxYear",
    "acctTaxData",
    "taxIdent",
    "taxIdentType"
})
public class TaxWithheldDataType {

    @XmlElement(name = "TaxYear")
    protected Long taxYear;
    @XmlElementRef(name = "AcctTaxData", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctTaxDataType> acctTaxData;
    @XmlElement(name = "TaxIdent")
    protected String taxIdent;
    @XmlElement(name = "TaxIdentType")
    protected String taxIdentType;

    /**
     * Gets the value of the taxYear property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaxYear() {
        return taxYear;
    }

    /**
     * Sets the value of the taxYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaxYear(Long value) {
        this.taxYear = value;
    }

    /**
     * Gets the value of the acctTaxData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctTaxDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctTaxDataType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctTaxDataType> getAcctTaxData() {
        return acctTaxData;
    }

    /**
     * Sets the value of the acctTaxData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctTaxDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctTaxDataType }{@code >}
     *     
     */
    public void setAcctTaxData(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctTaxDataType> value) {
        this.acctTaxData = value;
    }

    /**
     * Gets the value of the taxIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIdent() {
        return taxIdent;
    }

    /**
     * Sets the value of the taxIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIdent(String value) {
        this.taxIdent = value;
    }

    /**
     * Gets the value of the taxIdentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIdentType() {
        return taxIdentType;
    }

    /**
     * Sets the value of the taxIdentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIdentType(String value) {
        this.taxIdentType = value;
    }

}
