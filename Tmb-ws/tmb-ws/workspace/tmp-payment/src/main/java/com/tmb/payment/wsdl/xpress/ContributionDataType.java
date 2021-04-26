
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.CurAmtType;


/**
 * <p>Java class for ContributionData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContributionData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurAmt"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ContributionYr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ContributionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RolloverFromAcctType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContributionData_Type", propOrder = {
    "curAmt",
    "contributionYr",
    "contributionCode",
    "rolloverFromAcctType"
})
public class ContributionDataType {

    @XmlElement(name = "CurAmt", namespace = "urn:ifxforum-org:XSD:1", required = true)
    protected CurAmtType curAmt;
    @XmlElement(name = "ContributionYr")
    @XmlSchemaType(name = "string")
    protected ContributionYrType contributionYr;
    @XmlElement(name = "ContributionCode")
    protected String contributionCode;
    @XmlElement(name = "RolloverFromAcctType")
    protected String rolloverFromAcctType;

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
     * Gets the value of the contributionYr property.
     * 
     * @return
     *     possible object is
     *     {@link ContributionYrType }
     *     
     */
    public ContributionYrType getContributionYr() {
        return contributionYr;
    }

    /**
     * Sets the value of the contributionYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContributionYrType }
     *     
     */
    public void setContributionYr(ContributionYrType value) {
        this.contributionYr = value;
    }

    /**
     * Gets the value of the contributionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContributionCode() {
        return contributionCode;
    }

    /**
     * Sets the value of the contributionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContributionCode(String value) {
        this.contributionCode = value;
    }

    /**
     * Gets the value of the rolloverFromAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRolloverFromAcctType() {
        return rolloverFromAcctType;
    }

    /**
     * Sets the value of the rolloverFromAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRolloverFromAcctType(String value) {
        this.rolloverFromAcctType = value;
    }

}
