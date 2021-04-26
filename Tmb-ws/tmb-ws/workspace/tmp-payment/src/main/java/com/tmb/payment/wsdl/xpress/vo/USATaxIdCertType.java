
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for USA.TaxIdCert_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USA.TaxIdCert_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}USA.TaxIdCertCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}USA.TaxIdCertDate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USA.TaxIdCert_Type", propOrder = {
    "usaTaxIdCertCode",
    "usaTaxIdCertDate"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.USATaxIdCertType.class
})
public class USATaxIdCertType {

    @XmlElement(name = "USA.TaxIdCertCode")
    protected String usaTaxIdCertCode;
    @XmlElement(name = "USA.TaxIdCertDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar usaTaxIdCertDate;

    /**
     * Gets the value of the usaTaxIdCertCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSATaxIdCertCode() {
        return usaTaxIdCertCode;
    }

    /**
     * Sets the value of the usaTaxIdCertCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSATaxIdCertCode(String value) {
        this.usaTaxIdCertCode = value;
    }

    /**
     * Gets the value of the usaTaxIdCertDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUSATaxIdCertDate() {
        return usaTaxIdCertDate;
    }

    /**
     * Sets the value of the usaTaxIdCertDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUSATaxIdCertDate(XMLGregorianCalendar value) {
        this.usaTaxIdCertDate = value;
    }

}
