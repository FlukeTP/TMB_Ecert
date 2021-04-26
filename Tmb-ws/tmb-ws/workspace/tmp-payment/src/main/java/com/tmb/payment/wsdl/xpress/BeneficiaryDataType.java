
package com.tmb.payment.wsdl.xpress;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BeneficiaryData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BeneficiaryData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}BeneficiaryIdent"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BirthDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PersonName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Percent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}BeneficiaryType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RelationshipType" minOccurs="0"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}IssuedIdent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}Contact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeneficiaryData_Type", propOrder = {
    "beneficiaryIdent",
    "birthDt",
    "personName",
    "percent",
    "beneficiaryType",
    "relationshipType",
    "issuedIdent",
    "contact"
})
public class BeneficiaryDataType {

    @XmlElement(name = "BeneficiaryIdent", required = true)
    protected String beneficiaryIdent;
    @XmlElement(name = "BirthDt", namespace = "urn:ifxforum-org:XSD:1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDt;
    @XmlElementRef(name = "PersonName", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PersonNameType> personName;
    @XmlElement(name = "Percent")
    protected BigDecimal percent;
    @XmlElement(name = "BeneficiaryType")
    protected String beneficiaryType;
    @XmlElement(name = "RelationshipType")
    protected String relationshipType;
    @XmlElementRef(name = "IssuedIdent", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.IssuedIdentType>> issuedIdent;
    @XmlElementRef(name = "Contact", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ContactType>> contact;

    /**
     * Gets the value of the beneficiaryIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryIdent() {
        return beneficiaryIdent;
    }

    /**
     * Sets the value of the beneficiaryIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryIdent(String value) {
        this.beneficiaryIdent = value;
    }

    /**
     * Gets the value of the birthDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDt() {
        return birthDt;
    }

    /**
     * Sets the value of the birthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDt(XMLGregorianCalendar value) {
        this.birthDt = value;
    }

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PersonNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PersonNameType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PersonNameType> getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PersonNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PersonNameType }{@code >}
     *     
     */
    public void setPersonName(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PersonNameType> value) {
        this.personName = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercent(BigDecimal value) {
        this.percent = value;
    }

    /**
     * Gets the value of the beneficiaryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryType() {
        return beneficiaryType;
    }

    /**
     * Sets the value of the beneficiaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryType(String value) {
        this.beneficiaryType = value;
    }

    /**
     * Gets the value of the relationshipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipType() {
        return relationshipType;
    }

    /**
     * Sets the value of the relationshipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipType(String value) {
        this.relationshipType = value;
    }

    /**
     * Gets the value of the issuedIdent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issuedIdent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssuedIdent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.IssuedIdentType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.IssuedIdentType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.IssuedIdentType>> getIssuedIdent() {
        if (issuedIdent == null) {
            issuedIdent = new ArrayList<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.IssuedIdentType>>();
        }
        return this.issuedIdent;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ContactType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ContactType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ContactType>> getContact() {
        if (contact == null) {
            contact = new ArrayList<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ContactType>>();
        }
        return this.contact;
    }

}
