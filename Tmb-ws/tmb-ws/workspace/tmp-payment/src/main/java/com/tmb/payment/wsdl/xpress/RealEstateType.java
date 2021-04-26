
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tmb.payment.wsdl.xpress.vo.CurAmtType;


/**
 * <p>Java class for RealEstate_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RealEstate_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PostAddr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}LienCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AppraisalAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AppraisalDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Ward" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PropertyType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SMSACode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CensusTract" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Parcel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealEstate_Type", propOrder = {
    "postAddr",
    "lienCode",
    "appraisalAmt",
    "appraisalDt",
    "ward",
    "propertyType",
    "smsaCode",
    "censusTract",
    "parcel"
})
public class RealEstateType {

    @XmlElementRef(name = "PostAddr", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PostAddrType> postAddr;
    @XmlElement(name = "LienCode")
    protected String lienCode;
    @XmlElement(name = "AppraisalAmt")
    protected CurAmtType appraisalAmt;
    @XmlElement(name = "AppraisalDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar appraisalDt;
    @XmlElement(name = "Ward")
    protected String ward;
    @XmlElement(name = "PropertyType")
    protected String propertyType;
    @XmlElement(name = "SMSACode")
    protected Long smsaCode;
    @XmlElement(name = "CensusTract")
    protected String censusTract;
    @XmlElement(name = "Parcel")
    protected String parcel;

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
     * Gets the value of the lienCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLienCode() {
        return lienCode;
    }

    /**
     * Sets the value of the lienCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLienCode(String value) {
        this.lienCode = value;
    }

    /**
     * Gets the value of the appraisalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getAppraisalAmt() {
        return appraisalAmt;
    }

    /**
     * Sets the value of the appraisalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setAppraisalAmt(CurAmtType value) {
        this.appraisalAmt = value;
    }

    /**
     * Gets the value of the appraisalDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAppraisalDt() {
        return appraisalDt;
    }

    /**
     * Sets the value of the appraisalDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAppraisalDt(XMLGregorianCalendar value) {
        this.appraisalDt = value;
    }

    /**
     * Gets the value of the ward property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWard() {
        return ward;
    }

    /**
     * Sets the value of the ward property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWard(String value) {
        this.ward = value;
    }

    /**
     * Gets the value of the propertyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyType() {
        return propertyType;
    }

    /**
     * Sets the value of the propertyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyType(String value) {
        this.propertyType = value;
    }

    /**
     * Gets the value of the smsaCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSMSACode() {
        return smsaCode;
    }

    /**
     * Sets the value of the smsaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSMSACode(Long value) {
        this.smsaCode = value;
    }

    /**
     * Gets the value of the censusTract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCensusTract() {
        return censusTract;
    }

    /**
     * Sets the value of the censusTract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCensusTract(String value) {
        this.censusTract = value;
    }

    /**
     * Gets the value of the parcel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcel() {
        return parcel;
    }

    /**
     * Sets the value of the parcel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcel(String value) {
        this.parcel = value;
    }

}
