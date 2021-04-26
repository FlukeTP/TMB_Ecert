
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PartyDetail_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyDetail_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyPref" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FinancialData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EstablishedDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ServiceLevel" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OriginatingBranch" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OriginatingBank" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PreferredBranch" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PreferredBank" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ResponsibleBranch" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ResponsibleBank" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ResidenceCountry" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TaxResidenceCountry" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}LastContactDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}LastPrivacyNoteDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MktgMaterial" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyDetail_Type", propOrder = {
    "partyPref",
    "financialData",
    "establishedDt",
    "serviceLevel",
    "originatingBranch",
    "originatingBank",
    "preferredBranch",
    "preferredBank",
    "responsibleBranch",
    "responsibleBank",
    "residenceCountry",
    "taxResidenceCountry",
    "lastContactDt",
    "lastPrivacyNoteDt",
    "mktgMaterial"
})
@XmlSeeAlso({
    OrgPartyInfoType.class,
    PersonPartyInfoType.class
})
public class PartyDetailType {

    @XmlElementRef(name = "PartyPref", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyPrefType> partyPref;
    @XmlElementRef(name = "FinancialData", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.FinancialDataType>> financialData;
    @XmlElement(name = "EstablishedDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar establishedDt;
    @XmlElement(name = "ServiceLevel")
    protected String serviceLevel;
    @XmlElement(name = "OriginatingBranch")
    protected String originatingBranch;
    @XmlElement(name = "OriginatingBank")
    protected String originatingBank;
    @XmlElement(name = "PreferredBranch")
    protected String preferredBranch;
    @XmlElement(name = "PreferredBank")
    protected String preferredBank;
    @XmlElement(name = "ResponsibleBranch")
    protected String responsibleBranch;
    @XmlElement(name = "ResponsibleBank")
    protected String responsibleBank;
    @XmlElement(name = "ResidenceCountry")
    protected ResidenceCountryType residenceCountry;
    @XmlElement(name = "TaxResidenceCountry")
    protected TaxResidenceCountryType taxResidenceCountry;
    @XmlElement(name = "LastContactDt")
    protected String lastContactDt;
    @XmlElement(name = "LastPrivacyNoteDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastPrivacyNoteDt;
    @XmlElement(name = "MktgMaterial")
    protected MktgMaterialType mktgMaterial;

    /**
     * Gets the value of the partyPref property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyPrefType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyPrefType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyPrefType> getPartyPref() {
        return partyPref;
    }

    /**
     * Sets the value of the partyPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyPrefType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyPrefType }{@code >}
     *     
     */
    public void setPartyPref(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyPrefType> value) {
        this.partyPref = value;
    }

    /**
     * Gets the value of the financialData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.FinancialDataType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.FinancialDataType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.FinancialDataType>> getFinancialData() {
        if (financialData == null) {
            financialData = new ArrayList<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.FinancialDataType>>();
        }
        return this.financialData;
    }

    /**
     * Gets the value of the establishedDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstablishedDt() {
        return establishedDt;
    }

    /**
     * Sets the value of the establishedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstablishedDt(XMLGregorianCalendar value) {
        this.establishedDt = value;
    }

    /**
     * Gets the value of the serviceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLevel() {
        return serviceLevel;
    }

    /**
     * Sets the value of the serviceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLevel(String value) {
        this.serviceLevel = value;
    }

    /**
     * Gets the value of the originatingBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingBranch() {
        return originatingBranch;
    }

    /**
     * Sets the value of the originatingBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingBranch(String value) {
        this.originatingBranch = value;
    }

    /**
     * Gets the value of the originatingBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingBank() {
        return originatingBank;
    }

    /**
     * Sets the value of the originatingBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingBank(String value) {
        this.originatingBank = value;
    }

    /**
     * Gets the value of the preferredBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredBranch() {
        return preferredBranch;
    }

    /**
     * Sets the value of the preferredBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredBranch(String value) {
        this.preferredBranch = value;
    }

    /**
     * Gets the value of the preferredBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredBank() {
        return preferredBank;
    }

    /**
     * Sets the value of the preferredBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredBank(String value) {
        this.preferredBank = value;
    }

    /**
     * Gets the value of the responsibleBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsibleBranch() {
        return responsibleBranch;
    }

    /**
     * Sets the value of the responsibleBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsibleBranch(String value) {
        this.responsibleBranch = value;
    }

    /**
     * Gets the value of the responsibleBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsibleBank() {
        return responsibleBank;
    }

    /**
     * Sets the value of the responsibleBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsibleBank(String value) {
        this.responsibleBank = value;
    }

    /**
     * Gets the value of the residenceCountry property.
     * 
     * @return
     *     possible object is
     *     {@link ResidenceCountryType }
     *     
     */
    public ResidenceCountryType getResidenceCountry() {
        return residenceCountry;
    }

    /**
     * Sets the value of the residenceCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceCountryType }
     *     
     */
    public void setResidenceCountry(ResidenceCountryType value) {
        this.residenceCountry = value;
    }

    /**
     * Gets the value of the taxResidenceCountry property.
     * 
     * @return
     *     possible object is
     *     {@link TaxResidenceCountryType }
     *     
     */
    public TaxResidenceCountryType getTaxResidenceCountry() {
        return taxResidenceCountry;
    }

    /**
     * Sets the value of the taxResidenceCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxResidenceCountryType }
     *     
     */
    public void setTaxResidenceCountry(TaxResidenceCountryType value) {
        this.taxResidenceCountry = value;
    }

    /**
     * Gets the value of the lastContactDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastContactDt() {
        return lastContactDt;
    }

    /**
     * Sets the value of the lastContactDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastContactDt(String value) {
        this.lastContactDt = value;
    }

    /**
     * Gets the value of the lastPrivacyNoteDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastPrivacyNoteDt() {
        return lastPrivacyNoteDt;
    }

    /**
     * Sets the value of the lastPrivacyNoteDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastPrivacyNoteDt(XMLGregorianCalendar value) {
        this.lastPrivacyNoteDt = value;
    }

    /**
     * Gets the value of the mktgMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link MktgMaterialType }
     *     
     */
    public MktgMaterialType getMktgMaterial() {
        return mktgMaterial;
    }

    /**
     * Sets the value of the mktgMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link MktgMaterialType }
     *     
     */
    public void setMktgMaterial(MktgMaterialType value) {
        this.mktgMaterial = value;
    }

}
