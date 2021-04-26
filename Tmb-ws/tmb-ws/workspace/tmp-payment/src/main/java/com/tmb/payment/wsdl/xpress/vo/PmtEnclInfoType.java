
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PmtEnclInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtEnclInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtEnclType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PmtEnclPayeeInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CreditMediaItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CompositeCurAmt" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Category" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PrcDt" minOccurs="0"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}DueDt" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BaseEnvr" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtEnclInfo_Type", propOrder = {
    "pmtEnclType",
    "pmtEnclPayeeInfo",
    "creditMediaItem",
    "compositeCurAmt",
    "category",
    "prcDt",
    "dueDt",
    "baseEnvr"
})
public class PmtEnclInfoType {

    @XmlElement(name = "PmtEnclType", required = true)
    protected String pmtEnclType;
    @XmlElement(name = "PmtEnclPayeeInfo")
    protected PmtEnclPayeeInfoType pmtEnclPayeeInfo;
    @XmlElement(name = "CreditMediaItem")
    protected List<CreditMediaItemType> creditMediaItem;
    @XmlElement(name = "CompositeCurAmt", required = true)
    protected List<CompositeCurAmtType> compositeCurAmt;
    @XmlElement(name = "Category")
    protected String category;
    @XmlElement(name = "PrcDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prcDt;
    @XmlElement(name = "DueDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDt;
    @XmlElement(name = "BaseEnvr")
    protected BaseEnvrType baseEnvr;

    /**
     * Gets the value of the pmtEnclType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtEnclType() {
        return pmtEnclType;
    }

    /**
     * Sets the value of the pmtEnclType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtEnclType(String value) {
        this.pmtEnclType = value;
    }

    /**
     * Gets the value of the pmtEnclPayeeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PmtEnclPayeeInfoType }
     *     
     */
    public PmtEnclPayeeInfoType getPmtEnclPayeeInfo() {
        return pmtEnclPayeeInfo;
    }

    /**
     * Sets the value of the pmtEnclPayeeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtEnclPayeeInfoType }
     *     
     */
    public void setPmtEnclPayeeInfo(PmtEnclPayeeInfoType value) {
        this.pmtEnclPayeeInfo = value;
    }

    /**
     * Gets the value of the creditMediaItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditMediaItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditMediaItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditMediaItemType }
     * 
     * 
     */
    public List<CreditMediaItemType> getCreditMediaItem() {
        if (creditMediaItem == null) {
            creditMediaItem = new ArrayList<CreditMediaItemType>();
        }
        return this.creditMediaItem;
    }

    /**
     * Gets the value of the compositeCurAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compositeCurAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompositeCurAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompositeCurAmtType }
     * 
     * 
     */
    public List<CompositeCurAmtType> getCompositeCurAmt() {
        if (compositeCurAmt == null) {
            compositeCurAmt = new ArrayList<CompositeCurAmtType>();
        }
        return this.compositeCurAmt;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
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
     * Gets the value of the dueDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDt() {
        return dueDt;
    }

    /**
     * Sets the value of the dueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDt(XMLGregorianCalendar value) {
        this.dueDt = value;
    }

    /**
     * Gets the value of the baseEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link BaseEnvrType }
     *     
     */
    public BaseEnvrType getBaseEnvr() {
        return baseEnvr;
    }

    /**
     * Sets the value of the baseEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseEnvrType }
     *     
     */
    public void setBaseEnvr(BaseEnvrType value) {
        this.baseEnvr = value;
    }

}
