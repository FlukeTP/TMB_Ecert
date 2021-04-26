
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepAcctData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepAcctData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}DepAcctData_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AcctHashValue" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TaxDeferredPlanRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}MatDispData" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FormImgLoc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepAcctData_Type", propOrder = {
    "acctHashValue",
    "taxDeferredPlanRef",
    "matDispData",
    "formImgLoc"
})
public class DepAcctDataType
    extends com.tmb.payment.wsdl.xpress.vo.DepAcctDataType
{

    @XmlElement(name = "AcctHashValue")
    protected String acctHashValue;
    @XmlElement(name = "TaxDeferredPlanRef")
    protected TaxDeferredPlanRefType taxDeferredPlanRef;
    @XmlElement(name = "MatDispData")
    protected MatDispDataType matDispData;
    @XmlElement(name = "FormImgLoc")
    protected String formImgLoc;

    /**
     * Gets the value of the acctHashValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctHashValue() {
        return acctHashValue;
    }

    /**
     * Sets the value of the acctHashValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctHashValue(String value) {
        this.acctHashValue = value;
    }

    /**
     * Gets the value of the taxDeferredPlanRef property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDeferredPlanRefType }
     *     
     */
    public TaxDeferredPlanRefType getTaxDeferredPlanRef() {
        return taxDeferredPlanRef;
    }

    /**
     * Sets the value of the taxDeferredPlanRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDeferredPlanRefType }
     *     
     */
    public void setTaxDeferredPlanRef(TaxDeferredPlanRefType value) {
        this.taxDeferredPlanRef = value;
    }

    /**
     * Gets the value of the matDispData property.
     * 
     * @return
     *     possible object is
     *     {@link MatDispDataType }
     *     
     */
    public MatDispDataType getMatDispData() {
        return matDispData;
    }

    /**
     * Sets the value of the matDispData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatDispDataType }
     *     
     */
    public void setMatDispData(MatDispDataType value) {
        this.matDispData = value;
    }

    /**
     * Gets the value of the formImgLoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormImgLoc() {
        return formImgLoc;
    }

    /**
     * Sets the value of the formImgLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormImgLoc(String value) {
        this.formImgLoc = value;
    }

}
