
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChkAcceptInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChkAcceptInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkAcceptType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CompositeCurAmt" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CreditRef" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SettleInd" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}TruncatedInd" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CreditMediaChkData"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChkAcceptInfo_Type", propOrder = {
    "chkAcceptType",
    "compositeCurAmt",
    "creditRef",
    "settleInd",
    "truncatedInd",
    "creditMediaChkData"
})
public class ChkAcceptInfoType {

    @XmlElement(name = "ChkAcceptType", required = true)
    protected String chkAcceptType;
    @XmlElement(name = "CompositeCurAmt", required = true)
    protected List<CompositeCurAmtType> compositeCurAmt;
    @XmlElement(name = "CreditRef")
    protected CreditRefType creditRef;
    @XmlElement(name = "SettleInd")
    protected Boolean settleInd;
    @XmlElement(name = "TruncatedInd")
    protected Boolean truncatedInd;
    @XmlElementRef(name = "CreditMediaChkData", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CreditMediaChkDataType> creditMediaChkData;

    /**
     * Gets the value of the chkAcceptType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkAcceptType() {
        return chkAcceptType;
    }

    /**
     * Sets the value of the chkAcceptType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkAcceptType(String value) {
        this.chkAcceptType = value;
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
     * Gets the value of the creditRef property.
     * 
     * @return
     *     possible object is
     *     {@link CreditRefType }
     *     
     */
    public CreditRefType getCreditRef() {
        return creditRef;
    }

    /**
     * Sets the value of the creditRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditRefType }
     *     
     */
    public void setCreditRef(CreditRefType value) {
        this.creditRef = value;
    }

    /**
     * Gets the value of the settleInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSettleInd() {
        return settleInd;
    }

    /**
     * Sets the value of the settleInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSettleInd(Boolean value) {
        this.settleInd = value;
    }

    /**
     * Gets the value of the truncatedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTruncatedInd() {
        return truncatedInd;
    }

    /**
     * Sets the value of the truncatedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTruncatedInd(Boolean value) {
        this.truncatedInd = value;
    }

    /**
     * Gets the value of the creditMediaChkData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.CreditMediaChkDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.CreditMediaChkDataType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CreditMediaChkDataType> getCreditMediaChkData() {
        return creditMediaChkData;
    }

    /**
     * Sets the value of the creditMediaChkData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.CreditMediaChkDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.CreditMediaChkDataType }{@code >}
     *     
     */
    public void setCreditMediaChkData(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CreditMediaChkDataType> value) {
        this.creditMediaChkData = value;
    }

}
