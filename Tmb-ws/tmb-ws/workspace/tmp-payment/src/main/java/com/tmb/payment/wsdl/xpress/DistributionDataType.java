
package com.tmb.payment.wsdl.xpress;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.CurAmtType;
import com.tmb.payment.wsdl.xpress.vo.PartyRefType;


/**
 * <p>Java class for DistributionData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistributionData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CurAmt" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}DistributionPercent" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}BeneficiaryPartyRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DistributionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DistributionSubCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionData_Type", propOrder = {
    "curAmt",
    "distributionPercent",
    "beneficiaryPartyRef",
    "distributionCode",
    "distributionSubCode"
})
public class DistributionDataType {

    @XmlElement(name = "CurAmt", namespace = "urn:ifxforum-org:XSD:1")
    protected CurAmtType curAmt;
    @XmlElement(name = "DistributionPercent")
    protected BigDecimal distributionPercent;
    @XmlElement(name = "BeneficiaryPartyRef")
    protected PartyRefType beneficiaryPartyRef;
    @XmlElement(name = "DistributionCode")
    protected String distributionCode;
    @XmlElement(name = "DistributionSubCode")
    protected String distributionSubCode;

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
     * Gets the value of the distributionPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistributionPercent() {
        return distributionPercent;
    }

    /**
     * Sets the value of the distributionPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistributionPercent(BigDecimal value) {
        this.distributionPercent = value;
    }

    /**
     * Gets the value of the beneficiaryPartyRef property.
     * 
     * @return
     *     possible object is
     *     {@link PartyRefType }
     *     
     */
    public PartyRefType getBeneficiaryPartyRef() {
        return beneficiaryPartyRef;
    }

    /**
     * Sets the value of the beneficiaryPartyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRefType }
     *     
     */
    public void setBeneficiaryPartyRef(PartyRefType value) {
        this.beneficiaryPartyRef = value;
    }

    /**
     * Gets the value of the distributionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributionCode() {
        return distributionCode;
    }

    /**
     * Sets the value of the distributionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributionCode(String value) {
        this.distributionCode = value;
    }

    /**
     * Gets the value of the distributionSubCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributionSubCode() {
        return distributionSubCode;
    }

    /**
     * Sets the value of the distributionSubCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributionSubCode(String value) {
        this.distributionSubCode = value;
    }

}
