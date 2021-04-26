
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditMediaChkData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditMediaChkData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkEnteredAmt"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkCourtesyAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MicrReadIntegrity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MicrUnformatted" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkImgData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkDetail" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PersonData"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}OrgData"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkAcceptId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditMediaChkData_Type", propOrder = {
    "chkEnteredAmt",
    "chkCourtesyAmt",
    "micrReadIntegrity",
    "micrUnformatted",
    "chkImgData",
    "chkDetail",
    "personData",
    "orgData",
    "chkAcceptId"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.CreditMediaChkDataType.class
})
public class CreditMediaChkDataType {

    @XmlElement(name = "ChkEnteredAmt", required = true)
    protected ChkEnteredAmtType chkEnteredAmt;
    @XmlElement(name = "ChkCourtesyAmt")
    protected ChkCourtesyAmtType chkCourtesyAmt;
    @XmlElement(name = "MicrReadIntegrity")
    protected String micrReadIntegrity;
    @XmlElement(name = "MicrUnformatted")
    protected String micrUnformatted;
    @XmlElementRef(name = "ChkImgData", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ChkImgDataType> chkImgData;
    @XmlElementRef(name = "ChkDetail", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ChkDetailType> chkDetail;
    @XmlElementRef(name = "PersonData", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PersonDataType> personData;
    @XmlElement(name = "OrgData")
    protected OrgDataType orgData;
    @XmlElement(name = "ChkAcceptId")
    protected String chkAcceptId;

    /**
     * Gets the value of the chkEnteredAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ChkEnteredAmtType }
     *     
     */
    public ChkEnteredAmtType getChkEnteredAmt() {
        return chkEnteredAmt;
    }

    /**
     * Sets the value of the chkEnteredAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkEnteredAmtType }
     *     
     */
    public void setChkEnteredAmt(ChkEnteredAmtType value) {
        this.chkEnteredAmt = value;
    }

    /**
     * Gets the value of the chkCourtesyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ChkCourtesyAmtType }
     *     
     */
    public ChkCourtesyAmtType getChkCourtesyAmt() {
        return chkCourtesyAmt;
    }

    /**
     * Sets the value of the chkCourtesyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkCourtesyAmtType }
     *     
     */
    public void setChkCourtesyAmt(ChkCourtesyAmtType value) {
        this.chkCourtesyAmt = value;
    }

    /**
     * Gets the value of the micrReadIntegrity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMicrReadIntegrity() {
        return micrReadIntegrity;
    }

    /**
     * Sets the value of the micrReadIntegrity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMicrReadIntegrity(String value) {
        this.micrReadIntegrity = value;
    }

    /**
     * Gets the value of the micrUnformatted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMicrUnformatted() {
        return micrUnformatted;
    }

    /**
     * Sets the value of the micrUnformatted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMicrUnformatted(String value) {
        this.micrUnformatted = value;
    }

    /**
     * Gets the value of the chkImgData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ChkImgDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ChkImgDataType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ChkImgDataType> getChkImgData() {
        return chkImgData;
    }

    /**
     * Sets the value of the chkImgData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ChkImgDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ChkImgDataType }{@code >}
     *     
     */
    public void setChkImgData(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ChkImgDataType> value) {
        this.chkImgData = value;
    }

    /**
     * Gets the value of the chkDetail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ChkDetailType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ChkDetailType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ChkDetailType> getChkDetail() {
        return chkDetail;
    }

    /**
     * Sets the value of the chkDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.ChkDetailType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.ChkDetailType }{@code >}
     *     
     */
    public void setChkDetail(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.ChkDetailType> value) {
        this.chkDetail = value;
    }

    /**
     * Gets the value of the personData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PersonDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PersonDataType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PersonDataType> getPersonData() {
        return personData;
    }

    /**
     * Sets the value of the personData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PersonDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PersonDataType }{@code >}
     *     
     */
    public void setPersonData(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PersonDataType> value) {
        this.personData = value;
    }

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
     * Gets the value of the chkAcceptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkAcceptId() {
        return chkAcceptId;
    }

    /**
     * Sets the value of the chkAcceptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkAcceptId(String value) {
        this.chkAcceptId = value;
    }

}
