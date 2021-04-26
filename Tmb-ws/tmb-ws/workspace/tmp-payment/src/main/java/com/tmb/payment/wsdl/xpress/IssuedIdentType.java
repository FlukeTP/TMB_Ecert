
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for IssuedIdent_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssuedIdent_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}IssuedIdent_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}IssuedIdentIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}IdentVerifyDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}IdentName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Discrepancy" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Resolution" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TaxIDInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PrimaryInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}IssuedIdentSubType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}UpDt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssuedIdent_Type", propOrder = {
    "issuedIdentIdent",
    "identVerifyDt",
    "identName",
    "discrepancy",
    "resolution",
    "taxIDInd",
    "primaryInd",
    "issuedIdentSubType",
    "upDt"
})
public class IssuedIdentType
    extends com.tmb.payment.wsdl.xpress.vo.IssuedIdentType
{

    @XmlElement(name = "IssuedIdentIdent")
    protected String issuedIdentIdent;
    @XmlElement(name = "IdentVerifyDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar identVerifyDt;
    @XmlElement(name = "IdentName")
    protected String identName;
    @XmlElement(name = "Discrepancy")
    protected String discrepancy;
    @XmlElement(name = "Resolution")
    protected String resolution;
    @XmlElement(name = "TaxIDInd")
    protected Boolean taxIDInd;
    @XmlElement(name = "PrimaryInd")
    protected Boolean primaryInd;
    @XmlElement(name = "IssuedIdentSubType")
    protected String issuedIdentSubType;
    @XmlElement(name = "UpDt", namespace = "urn:ifxforum-org:XSD:1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar upDt;

    /**
     * Gets the value of the issuedIdentIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedIdentIdent() {
        return issuedIdentIdent;
    }

    /**
     * Sets the value of the issuedIdentIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedIdentIdent(String value) {
        this.issuedIdentIdent = value;
    }

    /**
     * Gets the value of the identVerifyDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIdentVerifyDt() {
        return identVerifyDt;
    }

    /**
     * Sets the value of the identVerifyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIdentVerifyDt(XMLGregorianCalendar value) {
        this.identVerifyDt = value;
    }

    /**
     * Gets the value of the identName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentName() {
        return identName;
    }

    /**
     * Sets the value of the identName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentName(String value) {
        this.identName = value;
    }

    /**
     * Gets the value of the discrepancy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscrepancy() {
        return discrepancy;
    }

    /**
     * Sets the value of the discrepancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscrepancy(String value) {
        this.discrepancy = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolution(String value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the taxIDInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxIDInd() {
        return taxIDInd;
    }

    /**
     * Sets the value of the taxIDInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxIDInd(Boolean value) {
        this.taxIDInd = value;
    }

    /**
     * Gets the value of the primaryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryInd() {
        return primaryInd;
    }

    /**
     * Sets the value of the primaryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryInd(Boolean value) {
        this.primaryInd = value;
    }

    /**
     * Gets the value of the issuedIdentSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedIdentSubType() {
        return issuedIdentSubType;
    }

    /**
     * Sets the value of the issuedIdentSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedIdentSubType(String value) {
        this.issuedIdentSubType = value;
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
