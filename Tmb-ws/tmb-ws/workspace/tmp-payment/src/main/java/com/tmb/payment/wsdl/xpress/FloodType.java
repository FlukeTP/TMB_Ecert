
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Flood_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Flood_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PlanIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SeqIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PostAddr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CityLimitInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CondoInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FEMAFormInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FloodZoneInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CmtyFloodPgmDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FEMAMapAmendmentInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FEMAMapAmendmentDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FloodCertIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ForceFloodInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CompanyIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FloodCollateralIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CBRAInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}LastUpdateDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DeterminationDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FileSentDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FileRecdDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}VendorName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FloodVendorOrgData" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}NFIP" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Flood_Type", propOrder = {
    "planIdent",
    "seqIdent",
    "postAddr",
    "cityLimitInd",
    "condoInd",
    "femaFormInd",
    "floodZoneInd",
    "cmtyFloodPgmDt",
    "femaMapAmendmentInd",
    "femaMapAmendmentDt",
    "floodCertIdent",
    "forceFloodInd",
    "companyIdent",
    "floodCollateralIdent",
    "cbraInd",
    "lastUpdateDt",
    "determinationDt",
    "fileSentDt",
    "fileRecdDt",
    "vendorName",
    "floodVendorOrgData",
    "nfip"
})
public class FloodType {

    @XmlElement(name = "PlanIdent")
    protected String planIdent;
    @XmlElement(name = "SeqIdent")
    protected String seqIdent;
    @XmlElementRef(name = "PostAddr", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PostAddrType> postAddr;
    @XmlElement(name = "CityLimitInd")
    protected Boolean cityLimitInd;
    @XmlElement(name = "CondoInd")
    protected Boolean condoInd;
    @XmlElement(name = "FEMAFormInd")
    protected Boolean femaFormInd;
    @XmlElement(name = "FloodZoneInd")
    protected Boolean floodZoneInd;
    @XmlElement(name = "CmtyFloodPgmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cmtyFloodPgmDt;
    @XmlElement(name = "FEMAMapAmendmentInd")
    protected Boolean femaMapAmendmentInd;
    @XmlElement(name = "FEMAMapAmendmentDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar femaMapAmendmentDt;
    @XmlElement(name = "FloodCertIdent")
    protected String floodCertIdent;
    @XmlElement(name = "ForceFloodInd")
    protected Boolean forceFloodInd;
    @XmlElement(name = "CompanyIdent")
    protected String companyIdent;
    @XmlElement(name = "FloodCollateralIdent")
    protected String floodCollateralIdent;
    @XmlElement(name = "CBRAInd")
    protected Boolean cbraInd;
    @XmlElement(name = "LastUpdateDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdateDt;
    @XmlElement(name = "DeterminationDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar determinationDt;
    @XmlElement(name = "FileSentDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fileSentDt;
    @XmlElement(name = "FileRecdDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fileRecdDt;
    @XmlElement(name = "VendorName")
    protected String vendorName;
    @XmlElement(name = "FloodVendorOrgData")
    protected FloodVendorOrgDataType floodVendorOrgData;
    @XmlElement(name = "NFIP")
    protected NFIPType nfip;

    /**
     * Gets the value of the planIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanIdent() {
        return planIdent;
    }

    /**
     * Sets the value of the planIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanIdent(String value) {
        this.planIdent = value;
    }

    /**
     * Gets the value of the seqIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqIdent() {
        return seqIdent;
    }

    /**
     * Sets the value of the seqIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqIdent(String value) {
        this.seqIdent = value;
    }

    /**
     * Gets the value of the postAddr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PostAddrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PostAddrType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PostAddrType> getPostAddr() {
        return postAddr;
    }

    /**
     * Sets the value of the postAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PostAddrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PostAddrType }{@code >}
     *     
     */
    public void setPostAddr(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PostAddrType> value) {
        this.postAddr = value;
    }

    /**
     * Gets the value of the cityLimitInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCityLimitInd() {
        return cityLimitInd;
    }

    /**
     * Sets the value of the cityLimitInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCityLimitInd(Boolean value) {
        this.cityLimitInd = value;
    }

    /**
     * Gets the value of the condoInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCondoInd() {
        return condoInd;
    }

    /**
     * Sets the value of the condoInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCondoInd(Boolean value) {
        this.condoInd = value;
    }

    /**
     * Gets the value of the femaFormInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFEMAFormInd() {
        return femaFormInd;
    }

    /**
     * Sets the value of the femaFormInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFEMAFormInd(Boolean value) {
        this.femaFormInd = value;
    }

    /**
     * Gets the value of the floodZoneInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFloodZoneInd() {
        return floodZoneInd;
    }

    /**
     * Sets the value of the floodZoneInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFloodZoneInd(Boolean value) {
        this.floodZoneInd = value;
    }

    /**
     * Gets the value of the cmtyFloodPgmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCmtyFloodPgmDt() {
        return cmtyFloodPgmDt;
    }

    /**
     * Sets the value of the cmtyFloodPgmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCmtyFloodPgmDt(XMLGregorianCalendar value) {
        this.cmtyFloodPgmDt = value;
    }

    /**
     * Gets the value of the femaMapAmendmentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFEMAMapAmendmentInd() {
        return femaMapAmendmentInd;
    }

    /**
     * Sets the value of the femaMapAmendmentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFEMAMapAmendmentInd(Boolean value) {
        this.femaMapAmendmentInd = value;
    }

    /**
     * Gets the value of the femaMapAmendmentDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFEMAMapAmendmentDt() {
        return femaMapAmendmentDt;
    }

    /**
     * Sets the value of the femaMapAmendmentDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFEMAMapAmendmentDt(XMLGregorianCalendar value) {
        this.femaMapAmendmentDt = value;
    }

    /**
     * Gets the value of the floodCertIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloodCertIdent() {
        return floodCertIdent;
    }

    /**
     * Sets the value of the floodCertIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloodCertIdent(String value) {
        this.floodCertIdent = value;
    }

    /**
     * Gets the value of the forceFloodInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceFloodInd() {
        return forceFloodInd;
    }

    /**
     * Sets the value of the forceFloodInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceFloodInd(Boolean value) {
        this.forceFloodInd = value;
    }

    /**
     * Gets the value of the companyIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyIdent() {
        return companyIdent;
    }

    /**
     * Sets the value of the companyIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyIdent(String value) {
        this.companyIdent = value;
    }

    /**
     * Gets the value of the floodCollateralIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloodCollateralIdent() {
        return floodCollateralIdent;
    }

    /**
     * Sets the value of the floodCollateralIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloodCollateralIdent(String value) {
        this.floodCollateralIdent = value;
    }

    /**
     * Gets the value of the cbraInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCBRAInd() {
        return cbraInd;
    }

    /**
     * Sets the value of the cbraInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCBRAInd(Boolean value) {
        this.cbraInd = value;
    }

    /**
     * Gets the value of the lastUpdateDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateDt() {
        return lastUpdateDt;
    }

    /**
     * Sets the value of the lastUpdateDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateDt(XMLGregorianCalendar value) {
        this.lastUpdateDt = value;
    }

    /**
     * Gets the value of the determinationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeterminationDt() {
        return determinationDt;
    }

    /**
     * Sets the value of the determinationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeterminationDt(XMLGregorianCalendar value) {
        this.determinationDt = value;
    }

    /**
     * Gets the value of the fileSentDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFileSentDt() {
        return fileSentDt;
    }

    /**
     * Sets the value of the fileSentDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFileSentDt(XMLGregorianCalendar value) {
        this.fileSentDt = value;
    }

    /**
     * Gets the value of the fileRecdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFileRecdDt() {
        return fileRecdDt;
    }

    /**
     * Sets the value of the fileRecdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFileRecdDt(XMLGregorianCalendar value) {
        this.fileRecdDt = value;
    }

    /**
     * Gets the value of the vendorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorName(String value) {
        this.vendorName = value;
    }

    /**
     * Gets the value of the floodVendorOrgData property.
     * 
     * @return
     *     possible object is
     *     {@link FloodVendorOrgDataType }
     *     
     */
    public FloodVendorOrgDataType getFloodVendorOrgData() {
        return floodVendorOrgData;
    }

    /**
     * Sets the value of the floodVendorOrgData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloodVendorOrgDataType }
     *     
     */
    public void setFloodVendorOrgData(FloodVendorOrgDataType value) {
        this.floodVendorOrgData = value;
    }

    /**
     * Gets the value of the nfip property.
     * 
     * @return
     *     possible object is
     *     {@link NFIPType }
     *     
     */
    public NFIPType getNFIP() {
        return nfip;
    }

    /**
     * Sets the value of the nfip property.
     * 
     * @param value
     *     allowed object is
     *     {@link NFIPType }
     *     
     */
    public void setNFIP(NFIPType value) {
        this.nfip = value;
    }

}
