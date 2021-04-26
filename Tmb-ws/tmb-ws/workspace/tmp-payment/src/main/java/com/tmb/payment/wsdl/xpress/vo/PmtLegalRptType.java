
package com.tmb.payment.wsdl.xpress.vo;

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
 * <p>Java class for PmtLegalRpt_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtLegalRpt_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OrgPartyInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OrgIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PayeeCountry"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurAmt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PrcDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtLegalRptData" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtLegalRpt_Type", propOrder = {
    "orgPartyInfo",
    "orgIdent",
    "payeeCountry",
    "curAmt",
    "prcDt",
    "pmtLegalRptData"
})
public class PmtLegalRptType {

    @XmlElementRef(name = "OrgPartyInfo", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.OrgPartyInfoType> orgPartyInfo;
    @XmlElement(name = "OrgIdent")
    protected OrgIdentType orgIdent;
    @XmlElement(name = "PayeeCountry", required = true)
    protected String payeeCountry;
    @XmlElement(name = "CurAmt")
    protected CurAmtType curAmt;
    @XmlElement(name = "PrcDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prcDt;
    @XmlElement(name = "PmtLegalRptData", required = true)
    protected List<PmtLegalRptDataType> pmtLegalRptData;

    /**
     * Gets the value of the orgPartyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.OrgPartyInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.OrgPartyInfoType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.OrgPartyInfoType> getOrgPartyInfo() {
        return orgPartyInfo;
    }

    /**
     * Sets the value of the orgPartyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.OrgPartyInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.OrgPartyInfoType }{@code >}
     *     
     */
    public void setOrgPartyInfo(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.OrgPartyInfoType> value) {
        this.orgPartyInfo = value;
    }

    /**
     * Gets the value of the orgIdent property.
     * 
     * @return
     *     possible object is
     *     {@link OrgIdentType }
     *     
     */
    public OrgIdentType getOrgIdent() {
        return orgIdent;
    }

    /**
     * Sets the value of the orgIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgIdentType }
     *     
     */
    public void setOrgIdent(OrgIdentType value) {
        this.orgIdent = value;
    }

    /**
     * Gets the value of the payeeCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeCountry() {
        return payeeCountry;
    }

    /**
     * Sets the value of the payeeCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeCountry(String value) {
        this.payeeCountry = value;
    }

    /**
     * Gets the value of the curAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getCurAmt() {
        return curAmt;
    }

    /**
     * Sets the value of the curAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setCurAmt(CurAmtType value) {
        this.curAmt = value;
    }

    /**
     * Gets the value of the prcDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrcDt() {
        return prcDt;
    }

    /**
     * Sets the value of the prcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrcDt(XMLGregorianCalendar value) {
        this.prcDt = value;
    }

    /**
     * Gets the value of the pmtLegalRptData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtLegalRptData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtLegalRptData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmtLegalRptDataType }
     * 
     * 
     */
    public List<PmtLegalRptDataType> getPmtLegalRptData() {
        if (pmtLegalRptData == null) {
            pmtLegalRptData = new ArrayList<PmtLegalRptDataType>();
        }
        return this.pmtLegalRptData;
    }

}
