
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillSummAmt_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillSummAmt_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BillSummAmtIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BillSummAmtCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ShortDesc"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Desc" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Memo" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurAmt"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BillSummAmtType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BillSummSubAmt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillSummAmt_Type", propOrder = {
    "billSummAmtIdent",
    "billSummAmtCode",
    "shortDesc",
    "desc",
    "memo",
    "curAmt",
    "billSummAmtType",
    "billSummSubAmt"
})
public class BillSummAmtType {

    @XmlElement(name = "BillSummAmtIdent")
    protected String billSummAmtIdent;
    @XmlElement(name = "BillSummAmtCode")
    protected String billSummAmtCode;
    @XmlElement(name = "ShortDesc", required = true)
    protected String shortDesc;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "CurAmt", required = true)
    protected CurAmtType curAmt;
    @XmlElement(name = "BillSummAmtType", required = true)
    @XmlSchemaType(name = "string")
    protected BillSummAmtTypeType billSummAmtType;
    @XmlElement(name = "BillSummSubAmt")
    protected List<BillSummSubAmtType> billSummSubAmt;

    /**
     * Gets the value of the billSummAmtIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillSummAmtIdent() {
        return billSummAmtIdent;
    }

    /**
     * Sets the value of the billSummAmtIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillSummAmtIdent(String value) {
        this.billSummAmtIdent = value;
    }

    /**
     * Gets the value of the billSummAmtCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillSummAmtCode() {
        return billSummAmtCode;
    }

    /**
     * Sets the value of the billSummAmtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillSummAmtCode(String value) {
        this.billSummAmtCode = value;
    }

    /**
     * Gets the value of the shortDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortDesc() {
        return shortDesc;
    }

    /**
     * Sets the value of the shortDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDesc(String value) {
        this.shortDesc = value;
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
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
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
     * Gets the value of the billSummAmtType property.
     * 
     * @return
     *     possible object is
     *     {@link BillSummAmtTypeType }
     *     
     */
    public BillSummAmtTypeType getBillSummAmtType() {
        return billSummAmtType;
    }

    /**
     * Sets the value of the billSummAmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillSummAmtTypeType }
     *     
     */
    public void setBillSummAmtType(BillSummAmtTypeType value) {
        this.billSummAmtType = value;
    }

    /**
     * Gets the value of the billSummSubAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billSummSubAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillSummSubAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillSummSubAmtType }
     * 
     * 
     */
    public List<BillSummSubAmtType> getBillSummSubAmt() {
        if (billSummSubAmt == null) {
            billSummSubAmt = new ArrayList<BillSummSubAmtType>();
        }
        return this.billSummSubAmt;
    }

}
