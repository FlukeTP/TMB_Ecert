
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctTrnLimit_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctTrnLimit_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TrnType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TrnSubType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctTrnUse" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TrnSrc" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}LimitType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CurAmt" minOccurs="0"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}LimitCount" minOccurs="0"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}LimitResetDt" minOccurs="0"/&gt;
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
@XmlType(name = "AcctTrnLimit_Type", propOrder = {
    "trnType",
    "trnSubType",
    "acctTrnUse",
    "trnSrc",
    "limitType",
    "curAmt",
    "limitCount",
    "limitResetDt"
})
@XmlSeeAlso({
    CardTrnLimitType.class
})
public class AcctTrnLimitType {

    @XmlElement(name = "TrnType", required = true)
    protected TrnTypeType trnType;
    @XmlElement(name = "TrnSubType")
    protected String trnSubType;
    @XmlElement(name = "AcctTrnUse")
    protected String acctTrnUse;
    @XmlElement(name = "TrnSrc")
    protected List<String> trnSrc;
    @XmlElement(name = "LimitType")
    protected List<String> limitType;
    @XmlElement(name = "CurAmt")
    protected CurAmtType curAmt;
    @XmlElement(name = "LimitCount")
    protected Long limitCount;
    @XmlElement(name = "LimitResetDt")
    protected String limitResetDt;

    /**
     * Gets the value of the trnType property.
     * 
     * @return
     *     possible object is
     *     {@link TrnTypeType }
     *     
     */
    public TrnTypeType getTrnType() {
        return trnType;
    }

    /**
     * Sets the value of the trnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnTypeType }
     *     
     */
    public void setTrnType(TrnTypeType value) {
        this.trnType = value;
    }

    /**
     * Gets the value of the trnSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnSubType() {
        return trnSubType;
    }

    /**
     * Sets the value of the trnSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnSubType(String value) {
        this.trnSubType = value;
    }

    /**
     * Gets the value of the acctTrnUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctTrnUse() {
        return acctTrnUse;
    }

    /**
     * Sets the value of the acctTrnUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctTrnUse(String value) {
        this.acctTrnUse = value;
    }

    /**
     * Gets the value of the trnSrc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trnSrc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrnSrc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTrnSrc() {
        if (trnSrc == null) {
            trnSrc = new ArrayList<String>();
        }
        return this.trnSrc;
    }

    /**
     * Gets the value of the limitType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the limitType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLimitType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLimitType() {
        if (limitType == null) {
            limitType = new ArrayList<String>();
        }
        return this.limitType;
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
     * Gets the value of the limitCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLimitCount() {
        return limitCount;
    }

    /**
     * Sets the value of the limitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLimitCount(Long value) {
        this.limitCount = value;
    }

    /**
     * Gets the value of the limitResetDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitResetDt() {
        return limitResetDt;
    }

    /**
     * Sets the value of the limitResetDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitResetDt(String value) {
        this.limitResetDt = value;
    }

}
