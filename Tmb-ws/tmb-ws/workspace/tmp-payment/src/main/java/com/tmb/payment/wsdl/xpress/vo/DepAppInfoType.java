
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
 * <p>Java class for DepAppInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepAppInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DepApplicant" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DepAppAcctIdent"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctInfo"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CardType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OverdraftFunding" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CreatedDt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepAppInfo_Type", propOrder = {
    "depApplicant",
    "depAppAcctIdent",
    "acctInfo",
    "cardType",
    "overdraftFunding",
    "createdDt"
})
public class DepAppInfoType {

    @XmlElement(name = "DepApplicant", required = true)
    protected List<DepApplicantType> depApplicant;
    @XmlElement(name = "DepAppAcctIdent", required = true)
    protected DepAppAcctIdentType depAppAcctIdent;
    @XmlElementRef(name = "AcctInfo", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctInfoType> acctInfo;
    @XmlElement(name = "CardType")
    protected String cardType;
    @XmlElement(name = "OverdraftFunding")
    protected List<OverdraftFundingType> overdraftFunding;
    @XmlElement(name = "CreatedDt")
    protected String createdDt;

    /**
     * Gets the value of the depApplicant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the depApplicant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepApplicant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DepApplicantType }
     * 
     * 
     */
    public List<DepApplicantType> getDepApplicant() {
        if (depApplicant == null) {
            depApplicant = new ArrayList<DepApplicantType>();
        }
        return this.depApplicant;
    }

    /**
     * Gets the value of the depAppAcctIdent property.
     * 
     * @return
     *     possible object is
     *     {@link DepAppAcctIdentType }
     *     
     */
    public DepAppAcctIdentType getDepAppAcctIdent() {
        return depAppAcctIdent;
    }

    /**
     * Sets the value of the depAppAcctIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAppAcctIdentType }
     *     
     */
    public void setDepAppAcctIdent(DepAppAcctIdentType value) {
        this.depAppAcctIdent = value;
    }

    /**
     * Gets the value of the acctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctInfoType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctInfoType> getAcctInfo() {
        return acctInfo;
    }

    /**
     * Sets the value of the acctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctInfoType }{@code >}
     *     
     */
    public void setAcctInfo(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctInfoType> value) {
        this.acctInfo = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the overdraftFunding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overdraftFunding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverdraftFunding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OverdraftFundingType }
     * 
     * 
     */
    public List<OverdraftFundingType> getOverdraftFunding() {
        if (overdraftFunding == null) {
            overdraftFunding = new ArrayList<OverdraftFundingType>();
        }
        return this.overdraftFunding;
    }

    /**
     * Gets the value of the createdDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedDt() {
        return createdDt;
    }

    /**
     * Sets the value of the createdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedDt(String value) {
        this.createdDt = value;
    }

}
