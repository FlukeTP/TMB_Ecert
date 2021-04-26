
package com.tmb.payment.wsdl.xpress;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.CurrencyAmountType;


/**
 * <p>Java class for FamilyFinancialInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FamilyFinancialInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}HomeAppraisalValue" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OwnershipType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FinancialData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MonthlyCost" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}NetWorthAgremntType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FamilyFinancialInfo_Type", propOrder = {
    "homeAppraisalValue",
    "ownershipType",
    "financialData",
    "monthlyCost",
    "netWorthAgremntType"
})
public class FamilyFinancialInfoType {

    @XmlElement(name = "HomeAppraisalValue")
    protected BigDecimal homeAppraisalValue;
    @XmlElement(name = "OwnershipType")
    protected String ownershipType;
    @XmlElementRef(name = "FinancialData", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.FinancialDataType>> financialData;
    @XmlElement(name = "MonthlyCost")
    protected CurrencyAmountType monthlyCost;
    @XmlElement(name = "NetWorthAgremntType")
    protected String netWorthAgremntType;

    /**
     * Gets the value of the homeAppraisalValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHomeAppraisalValue() {
        return homeAppraisalValue;
    }

    /**
     * Sets the value of the homeAppraisalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHomeAppraisalValue(BigDecimal value) {
        this.homeAppraisalValue = value;
    }

    /**
     * Gets the value of the ownershipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnershipType() {
        return ownershipType;
    }

    /**
     * Sets the value of the ownershipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnershipType(String value) {
        this.ownershipType = value;
    }

    /**
     * Gets the value of the financialData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.FinancialDataType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.FinancialDataType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.FinancialDataType>> getFinancialData() {
        if (financialData == null) {
            financialData = new ArrayList<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.FinancialDataType>>();
        }
        return this.financialData;
    }

    /**
     * Gets the value of the monthlyCost property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getMonthlyCost() {
        return monthlyCost;
    }

    /**
     * Sets the value of the monthlyCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setMonthlyCost(CurrencyAmountType value) {
        this.monthlyCost = value;
    }

    /**
     * Gets the value of the netWorthAgremntType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetWorthAgremntType() {
        return netWorthAgremntType;
    }

    /**
     * Sets the value of the netWorthAgremntType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetWorthAgremntType(String value) {
        this.netWorthAgremntType = value;
    }

}
