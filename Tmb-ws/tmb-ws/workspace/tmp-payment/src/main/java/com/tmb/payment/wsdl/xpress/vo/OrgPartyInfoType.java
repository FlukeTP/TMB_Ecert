
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrgPartyInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrgPartyInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}PartyDetail_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OrgData"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TaxExempt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}LegalForm" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OrgEstablishDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}NumEmployees" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FiscalYearEnd" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FinancialReportsURL" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrgPartyInfo_Type", propOrder = {
    "orgData",
    "taxExempt",
    "legalForm",
    "orgEstablishDt",
    "numEmployees",
    "fiscalYearEnd",
    "financialReportsURL"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.OrgPartyInfoType.class
})
public class OrgPartyInfoType
    extends PartyDetailType
{

    @XmlElement(name = "OrgData", required = true)
    protected OrgDataType orgData;
    @XmlElement(name = "TaxExempt")
    protected String taxExempt;
    @XmlElement(name = "LegalForm")
    protected String legalForm;
    @XmlElement(name = "OrgEstablishDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orgEstablishDt;
    @XmlElement(name = "NumEmployees")
    protected Long numEmployees;
    @XmlElement(name = "FiscalYearEnd")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fiscalYearEnd;
    @XmlElement(name = "FinancialReportsURL")
    protected String financialReportsURL;

    /**
     * Gets the value of the orgData property.
     * 
     * @return
     *     possible object is
     *     {@link OrgDataType }
     *     
     */
    public OrgDataType getOrgData() {
        return orgData;
    }

    /**
     * Sets the value of the orgData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgDataType }
     *     
     */
    public void setOrgData(OrgDataType value) {
        this.orgData = value;
    }

    /**
     * Gets the value of the taxExempt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxExempt() {
        return taxExempt;
    }

    /**
     * Sets the value of the taxExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxExempt(String value) {
        this.taxExempt = value;
    }

    /**
     * Gets the value of the legalForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalForm() {
        return legalForm;
    }

    /**
     * Sets the value of the legalForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalForm(String value) {
        this.legalForm = value;
    }

    /**
     * Gets the value of the orgEstablishDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrgEstablishDt() {
        return orgEstablishDt;
    }

    /**
     * Sets the value of the orgEstablishDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrgEstablishDt(XMLGregorianCalendar value) {
        this.orgEstablishDt = value;
    }

    /**
     * Gets the value of the numEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumEmployees() {
        return numEmployees;
    }

    /**
     * Sets the value of the numEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumEmployees(Long value) {
        this.numEmployees = value;
    }

    /**
     * Gets the value of the fiscalYearEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFiscalYearEnd() {
        return fiscalYearEnd;
    }

    /**
     * Sets the value of the fiscalYearEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFiscalYearEnd(XMLGregorianCalendar value) {
        this.fiscalYearEnd = value;
    }

    /**
     * Gets the value of the financialReportsURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialReportsURL() {
        return financialReportsURL;
    }

    /**
     * Sets the value of the financialReportsURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialReportsURL(String value) {
        this.financialReportsURL = value;
    }

}
