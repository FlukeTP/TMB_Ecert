
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepAcctData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepAcctData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctKey" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SignatureReqd" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SignatureCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IntDispData" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RetirementPlanIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RenewalOption" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepAcctData_Type", propOrder = {
    "acctKey",
    "signatureReqd",
    "signatureCode",
    "intDispData",
    "retirementPlanIdent",
    "renewalOption"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.DepAcctDataType.class
})
public class DepAcctDataType {

    @XmlElement(name = "AcctKey")
    protected String acctKey;
    @XmlElement(name = "SignatureReqd")
    protected List<SignatureReqdType> signatureReqd;
    @XmlElement(name = "SignatureCode")
    protected String signatureCode;
    @XmlElementRef(name = "IntDispData", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.IntDispDataType> intDispData;
    @XmlElement(name = "RetirementPlanIdent")
    protected String retirementPlanIdent;
    @XmlElement(name = "RenewalOption")
    protected String renewalOption;

    /**
     * Gets the value of the acctKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctKey() {
        return acctKey;
    }

    /**
     * Sets the value of the acctKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctKey(String value) {
        this.acctKey = value;
    }

    /**
     * Gets the value of the signatureReqd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signatureReqd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignatureReqd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignatureReqdType }
     * 
     * 
     */
    public List<SignatureReqdType> getSignatureReqd() {
        if (signatureReqd == null) {
            signatureReqd = new ArrayList<SignatureReqdType>();
        }
        return this.signatureReqd;
    }

    /**
     * Gets the value of the signatureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureCode() {
        return signatureCode;
    }

    /**
     * Sets the value of the signatureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureCode(String value) {
        this.signatureCode = value;
    }

    /**
     * Gets the value of the intDispData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.IntDispDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.IntDispDataType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.IntDispDataType> getIntDispData() {
        return intDispData;
    }

    /**
     * Sets the value of the intDispData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.IntDispDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.IntDispDataType }{@code >}
     *     
     */
    public void setIntDispData(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.IntDispDataType> value) {
        this.intDispData = value;
    }

    /**
     * Gets the value of the retirementPlanIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetirementPlanIdent() {
        return retirementPlanIdent;
    }

    /**
     * Sets the value of the retirementPlanIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetirementPlanIdent(String value) {
        this.retirementPlanIdent = value;
    }

    /**
     * Gets the value of the renewalOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenewalOption() {
        return renewalOption;
    }

    /**
     * Sets the value of the renewalOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenewalOption(String value) {
        this.renewalOption = value;
    }

}
