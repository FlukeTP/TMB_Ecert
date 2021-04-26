
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustPayeeInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustPayeeInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Nickname" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}StdPayeeId"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}FSPayee"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}XferPayee"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}BillerPayee"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BillingAcct" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctPayAcctId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DfltPmtData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustPayeeInfo_Type", propOrder = {
    "name",
    "nickname",
    "stdPayeeId",
    "fsPayee",
    "xferPayee",
    "billerPayee",
    "billingAcct",
    "acctPayAcctId",
    "dfltPmtData"
})
public class CustPayeeInfoType {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Nickname")
    protected String nickname;
    @XmlElement(name = "StdPayeeId")
    protected StdPayeeIdType stdPayeeId;
    @XmlElement(name = "FSPayee")
    protected FSPayeeType fsPayee;
    @XmlElement(name = "XferPayee")
    protected XferPayeeType xferPayee;
    @XmlElement(name = "BillerPayee")
    protected BillerPayeeType billerPayee;
    @XmlElement(name = "BillingAcct")
    protected String billingAcct;
    @XmlElement(name = "AcctPayAcctId")
    protected String acctPayAcctId;
    @XmlElement(name = "DfltPmtData")
    protected DfltPmtDataType dfltPmtData;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Sets the value of the nickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickname(String value) {
        this.nickname = value;
    }

    /**
     * Gets the value of the stdPayeeId property.
     * 
     * @return
     *     possible object is
     *     {@link StdPayeeIdType }
     *     
     */
    public StdPayeeIdType getStdPayeeId() {
        return stdPayeeId;
    }

    /**
     * Sets the value of the stdPayeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link StdPayeeIdType }
     *     
     */
    public void setStdPayeeId(StdPayeeIdType value) {
        this.stdPayeeId = value;
    }

    /**
     * Gets the value of the fsPayee property.
     * 
     * @return
     *     possible object is
     *     {@link FSPayeeType }
     *     
     */
    public FSPayeeType getFSPayee() {
        return fsPayee;
    }

    /**
     * Sets the value of the fsPayee property.
     * 
     * @param value
     *     allowed object is
     *     {@link FSPayeeType }
     *     
     */
    public void setFSPayee(FSPayeeType value) {
        this.fsPayee = value;
    }

    /**
     * Gets the value of the xferPayee property.
     * 
     * @return
     *     possible object is
     *     {@link XferPayeeType }
     *     
     */
    public XferPayeeType getXferPayee() {
        return xferPayee;
    }

    /**
     * Sets the value of the xferPayee property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferPayeeType }
     *     
     */
    public void setXferPayee(XferPayeeType value) {
        this.xferPayee = value;
    }

    /**
     * Gets the value of the billerPayee property.
     * 
     * @return
     *     possible object is
     *     {@link BillerPayeeType }
     *     
     */
    public BillerPayeeType getBillerPayee() {
        return billerPayee;
    }

    /**
     * Sets the value of the billerPayee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillerPayeeType }
     *     
     */
    public void setBillerPayee(BillerPayeeType value) {
        this.billerPayee = value;
    }

    /**
     * Gets the value of the billingAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAcct() {
        return billingAcct;
    }

    /**
     * Sets the value of the billingAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAcct(String value) {
        this.billingAcct = value;
    }

    /**
     * Gets the value of the acctPayAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctPayAcctId() {
        return acctPayAcctId;
    }

    /**
     * Sets the value of the acctPayAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctPayAcctId(String value) {
        this.acctPayAcctId = value;
    }

    /**
     * Gets the value of the dfltPmtData property.
     * 
     * @return
     *     possible object is
     *     {@link DfltPmtDataType }
     *     
     */
    public DfltPmtDataType getDfltPmtData() {
        return dfltPmtData;
    }

    /**
     * Sets the value of the dfltPmtData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DfltPmtDataType }
     *     
     */
    public void setDfltPmtData(DfltPmtDataType value) {
        this.dfltPmtData = value;
    }

}
