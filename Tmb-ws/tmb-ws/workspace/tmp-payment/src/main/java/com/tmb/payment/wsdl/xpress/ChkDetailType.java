
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.AcctTypeType;


/**
 * <p>Java class for ChkDetail_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChkDetail_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}ChkDetail_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SecondaryName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RiskScore" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}IsLocal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctUse" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DocumentVerifyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChkDetail_Type", propOrder = {
    "secondaryName",
    "acctType",
    "riskScore",
    "isLocal",
    "acctUse",
    "documentVerifyType"
})
public class ChkDetailType
    extends com.tmb.payment.wsdl.xpress.vo.ChkDetailType
{

    @XmlElement(name = "SecondaryName")
    protected String secondaryName;
    @XmlElement(name = "AcctType", namespace = "urn:ifxforum-org:XSD:1")
    protected AcctTypeType acctType;
    @XmlElement(name = "RiskScore")
    protected String riskScore;
    @XmlElement(name = "IsLocal")
    protected Boolean isLocal;
    @XmlElement(name = "AcctUse", namespace = "urn:ifxforum-org:XSD:1")
    protected String acctUse;
    @XmlElement(name = "DocumentVerifyType")
    protected String documentVerifyType;

    /**
     * Gets the value of the secondaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryName() {
        return secondaryName;
    }

    /**
     * Sets the value of the secondaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryName(String value) {
        this.secondaryName = value;
    }

    /**
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeType }
     *     
     */
    public AcctTypeType getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeType }
     *     
     */
    public void setAcctType(AcctTypeType value) {
        this.acctType = value;
    }

    /**
     * Gets the value of the riskScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskScore() {
        return riskScore;
    }

    /**
     * Sets the value of the riskScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskScore(String value) {
        this.riskScore = value;
    }

    /**
     * Gets the value of the isLocal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLocal() {
        return isLocal;
    }

    /**
     * Sets the value of the isLocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLocal(Boolean value) {
        this.isLocal = value;
    }

    /**
     * Gets the value of the acctUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctUse() {
        return acctUse;
    }

    /**
     * Sets the value of the acctUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctUse(String value) {
        this.acctUse = value;
    }

    /**
     * Gets the value of the documentVerifyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentVerifyType() {
        return documentVerifyType;
    }

    /**
     * Sets the value of the documentVerifyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentVerifyType(String value) {
        this.documentVerifyType = value;
    }

}
