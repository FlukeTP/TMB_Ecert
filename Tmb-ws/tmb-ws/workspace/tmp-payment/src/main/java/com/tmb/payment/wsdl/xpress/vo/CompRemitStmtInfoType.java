
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
 * <p>Java class for CompRemitStmtInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompRemitStmtInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}LockboxDepIdent" minOccurs="0"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}AcctRef" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurAmt"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Count" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RefData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PrcDt"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BatchData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}LockboxURL" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompRemitStmtInfo_Type", propOrder = {
    "lockboxDepIdent",
    "acctRef",
    "curAmt",
    "count",
    "refData",
    "prcDt",
    "batchData",
    "lockboxURL"
})
public class CompRemitStmtInfoType {

    @XmlElement(name = "LockboxDepIdent")
    protected LockboxDepIdentType lockboxDepIdent;
    @XmlElement(name = "AcctRef")
    protected AcctRefType acctRef;
    @XmlElement(name = "CurAmt", required = true)
    protected CurAmtType curAmt;
    @XmlElement(name = "Count")
    protected Long count;
    @XmlElement(name = "RefData")
    protected RefDataType refData;
    @XmlElement(name = "PrcDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prcDt;
    @XmlElement(name = "BatchData")
    protected List<BatchDataType> batchData;
    @XmlElement(name = "LockboxURL")
    protected String lockboxURL;

    /**
     * Gets the value of the lockboxDepIdent property.
     * 
     * @return
     *     possible object is
     *     {@link LockboxDepIdentType }
     *     
     */
    public LockboxDepIdentType getLockboxDepIdent() {
        return lockboxDepIdent;
    }

    /**
     * Sets the value of the lockboxDepIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LockboxDepIdentType }
     *     
     */
    public void setLockboxDepIdent(LockboxDepIdentType value) {
        this.lockboxDepIdent = value;
    }

    /**
     * Gets the value of the acctRef property.
     * 
     * @return
     *     possible object is
     *     {@link AcctRefType }
     *     
     */
    public AcctRefType getAcctRef() {
        return acctRef;
    }

    /**
     * Sets the value of the acctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctRefType }
     *     
     */
    public void setAcctRef(AcctRefType value) {
        this.acctRef = value;
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
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCount(Long value) {
        this.count = value;
    }

    /**
     * Gets the value of the refData property.
     * 
     * @return
     *     possible object is
     *     {@link RefDataType }
     *     
     */
    public RefDataType getRefData() {
        return refData;
    }

    /**
     * Sets the value of the refData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefDataType }
     *     
     */
    public void setRefData(RefDataType value) {
        this.refData = value;
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
     * Gets the value of the batchData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batchData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatchData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchDataType }
     * 
     * 
     */
    public List<BatchDataType> getBatchData() {
        if (batchData == null) {
            batchData = new ArrayList<BatchDataType>();
        }
        return this.batchData;
    }

    /**
     * Gets the value of the lockboxURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockboxURL() {
        return lockboxURL;
    }

    /**
     * Sets the value of the lockboxURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockboxURL(String value) {
        this.lockboxURL = value;
    }

}
