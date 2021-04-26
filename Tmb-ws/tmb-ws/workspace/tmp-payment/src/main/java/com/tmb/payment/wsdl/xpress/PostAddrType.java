
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tmb.payment.wsdl.xpress.vo.DurationType;


/**
 * <p>Java class for PostAddr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostAddr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}PostAddr_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PostAddrIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AddrMiscData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AddrStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}UpDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}LegalInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PrevInd" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Duration" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AddrSubtype" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}YearsAtAddr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MonthsAtAddr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CensusTract" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CensusBlock" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostAddr_Type", propOrder = {
    "postAddrIdent",
    "addrMiscData",
    "addrStatus",
    "upDt",
    "legalInd",
    "prevInd",
    "duration",
    "addrSubtype",
    "yearsAtAddr",
    "monthsAtAddr",
    "censusTract",
    "censusBlock"
})
@XmlSeeAlso({
    ContactPostAddrType.class
})
public class PostAddrType
    extends com.tmb.payment.wsdl.xpress.vo.PostAddrType
{

    @XmlElement(name = "PostAddrIdent")
    protected String postAddrIdent;
    @XmlElement(name = "AddrMiscData")
    protected List<AddrMiscDataType> addrMiscData;
    @XmlElement(name = "AddrStatus")
    protected String addrStatus;
    @XmlElement(name = "UpDt", namespace = "urn:ifxforum-org:XSD:1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar upDt;
    @XmlElement(name = "LegalInd")
    protected Boolean legalInd;
    @XmlElement(name = "PrevInd")
    protected Boolean prevInd;
    @XmlElement(name = "Duration", namespace = "urn:ifxforum-org:XSD:1")
    protected DurationType duration;
    @XmlElement(name = "AddrSubtype")
    protected String addrSubtype;
    @XmlElement(name = "YearsAtAddr")
    protected Long yearsAtAddr;
    @XmlElement(name = "MonthsAtAddr")
    protected Long monthsAtAddr;
    @XmlElement(name = "CensusTract")
    protected String censusTract;
    @XmlElement(name = "CensusBlock")
    protected String censusBlock;

    /**
     * Gets the value of the postAddrIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostAddrIdent() {
        return postAddrIdent;
    }

    /**
     * Sets the value of the postAddrIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostAddrIdent(String value) {
        this.postAddrIdent = value;
    }

    /**
     * Gets the value of the addrMiscData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addrMiscData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddrMiscData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddrMiscDataType }
     * 
     * 
     */
    public List<AddrMiscDataType> getAddrMiscData() {
        if (addrMiscData == null) {
            addrMiscData = new ArrayList<AddrMiscDataType>();
        }
        return this.addrMiscData;
    }

    /**
     * Gets the value of the addrStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrStatus() {
        return addrStatus;
    }

    /**
     * Sets the value of the addrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrStatus(String value) {
        this.addrStatus = value;
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

    /**
     * Gets the value of the legalInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLegalInd() {
        return legalInd;
    }

    /**
     * Sets the value of the legalInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLegalInd(Boolean value) {
        this.legalInd = value;
    }

    /**
     * Gets the value of the prevInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrevInd() {
        return prevInd;
    }

    /**
     * Sets the value of the prevInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrevInd(Boolean value) {
        this.prevInd = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link DurationType }
     *     
     */
    public DurationType getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationType }
     *     
     */
    public void setDuration(DurationType value) {
        this.duration = value;
    }

    /**
     * Gets the value of the addrSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrSubtype() {
        return addrSubtype;
    }

    /**
     * Sets the value of the addrSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrSubtype(String value) {
        this.addrSubtype = value;
    }

    /**
     * Gets the value of the yearsAtAddr property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getYearsAtAddr() {
        return yearsAtAddr;
    }

    /**
     * Sets the value of the yearsAtAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setYearsAtAddr(Long value) {
        this.yearsAtAddr = value;
    }

    /**
     * Gets the value of the monthsAtAddr property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMonthsAtAddr() {
        return monthsAtAddr;
    }

    /**
     * Sets the value of the monthsAtAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMonthsAtAddr(Long value) {
        this.monthsAtAddr = value;
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
     * Gets the value of the censusBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCensusBlock() {
        return censusBlock;
    }

    /**
     * Sets the value of the censusBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCensusBlock(String value) {
        this.censusBlock = value;
    }

}
