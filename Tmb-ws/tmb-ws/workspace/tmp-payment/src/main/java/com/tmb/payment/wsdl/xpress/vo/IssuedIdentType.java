
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IssuedIdent_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssuedIdent_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IssuedIdentType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IssuedIdentValue"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Issuer" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IssueDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ExpDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Desc" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IdentImg" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IdentReadMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IdentVerifyMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IdentVerifyResults" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IssuedLoc" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}GovIssuedIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}USA.TaxIdCert" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssuedIdent_Type", propOrder = {
    "issuedIdentType",
    "issuedIdentValue",
    "issuer",
    "issueDt",
    "expDt",
    "desc",
    "identImg",
    "identReadMethod",
    "identVerifyMethod",
    "identVerifyResults",
    "issuedLoc",
    "govIssuedIdent",
    "usaTaxIdCert"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.IssuedIdentType.class
})
public class IssuedIdentType {

    @XmlElement(name = "IssuedIdentType", required = true)
    protected String issuedIdentType;
    @XmlElement(name = "IssuedIdentValue", required = true)
    protected String issuedIdentValue;
    @XmlElement(name = "Issuer")
    protected String issuer;
    @XmlElement(name = "IssueDt")
    protected String issueDt;
    @XmlElement(name = "ExpDt")
    protected String expDt;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "IdentImg")
    protected IdentImgType identImg;
    @XmlElement(name = "IdentReadMethod")
    protected String identReadMethod;
    @XmlElement(name = "IdentVerifyMethod")
    protected String identVerifyMethod;
    @XmlElement(name = "IdentVerifyResults")
    protected String identVerifyResults;
    @XmlElement(name = "IssuedLoc")
    protected String issuedLoc;
    @XmlElement(name = "GovIssuedIdent")
    protected GovIssuedIdentType govIssuedIdent;
    @XmlElementRef(name = "USA.TaxIdCert", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.USATaxIdCertType> usaTaxIdCert;

    /**
     * Gets the value of the issuedIdentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedIdentType() {
        return issuedIdentType;
    }

    /**
     * Sets the value of the issuedIdentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedIdentType(String value) {
        this.issuedIdentType = value;
    }

    /**
     * Gets the value of the issuedIdentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedIdentValue() {
        return issuedIdentValue;
    }

    /**
     * Sets the value of the issuedIdentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedIdentValue(String value) {
        this.issuedIdentValue = value;
    }

    /**
     * Gets the value of the issuer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuer(String value) {
        this.issuer = value;
    }

    /**
     * Gets the value of the issueDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueDt() {
        return issueDt;
    }

    /**
     * Sets the value of the issueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueDt(String value) {
        this.issueDt = value;
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

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the identImg property.
     * 
     * @return
     *     possible object is
     *     {@link IdentImgType }
     *     
     */
    public IdentImgType getIdentImg() {
        return identImg;
    }

    /**
     * Sets the value of the identImg property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentImgType }
     *     
     */
    public void setIdentImg(IdentImgType value) {
        this.identImg = value;
    }

    /**
     * Gets the value of the identReadMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentReadMethod() {
        return identReadMethod;
    }

    /**
     * Sets the value of the identReadMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentReadMethod(String value) {
        this.identReadMethod = value;
    }

    /**
     * Gets the value of the identVerifyMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentVerifyMethod() {
        return identVerifyMethod;
    }

    /**
     * Sets the value of the identVerifyMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentVerifyMethod(String value) {
        this.identVerifyMethod = value;
    }

    /**
     * Gets the value of the identVerifyResults property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentVerifyResults() {
        return identVerifyResults;
    }

    /**
     * Sets the value of the identVerifyResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentVerifyResults(String value) {
        this.identVerifyResults = value;
    }

    /**
     * Gets the value of the issuedLoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedLoc() {
        return issuedLoc;
    }

    /**
     * Sets the value of the issuedLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedLoc(String value) {
        this.issuedLoc = value;
    }

    /**
     * Gets the value of the govIssuedIdent property.
     * 
     * @return
     *     possible object is
     *     {@link GovIssuedIdentType }
     *     
     */
    public GovIssuedIdentType getGovIssuedIdent() {
        return govIssuedIdent;
    }

    /**
     * Sets the value of the govIssuedIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link GovIssuedIdentType }
     *     
     */
    public void setGovIssuedIdent(GovIssuedIdentType value) {
        this.govIssuedIdent = value;
    }

    /**
     * Gets the value of the usaTaxIdCert property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.USATaxIdCertType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.USATaxIdCertType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.USATaxIdCertType> getUSATaxIdCert() {
        return usaTaxIdCert;
    }

    /**
     * Sets the value of the usaTaxIdCert property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.USATaxIdCertType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.USATaxIdCertType }{@code >}
     *     
     */
    public void setUSATaxIdCert(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.USATaxIdCertType> value) {
        this.usaTaxIdCert = value;
    }

}
