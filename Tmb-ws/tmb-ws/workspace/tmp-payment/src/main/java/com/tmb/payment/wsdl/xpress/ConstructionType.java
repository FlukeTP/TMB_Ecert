
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Construction_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Construction_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PurchaserName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}UnderContractInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ContractDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PermitDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SurveyDt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Construction_Type", propOrder = {
    "purchaserName",
    "underContractInd",
    "contractDt",
    "permitDt",
    "surveyDt"
})
public class ConstructionType {

    @XmlElement(name = "PurchaserName")
    protected String purchaserName;
    @XmlElement(name = "UnderContractInd")
    protected Boolean underContractInd;
    @XmlElement(name = "ContractDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractDt;
    @XmlElement(name = "PermitDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar permitDt;
    @XmlElement(name = "SurveyDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar surveyDt;

    /**
     * Gets the value of the purchaserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaserName() {
        return purchaserName;
    }

    /**
     * Sets the value of the purchaserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaserName(String value) {
        this.purchaserName = value;
    }

    /**
     * Gets the value of the underContractInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnderContractInd() {
        return underContractInd;
    }

    /**
     * Sets the value of the underContractInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnderContractInd(Boolean value) {
        this.underContractInd = value;
    }

    /**
     * Gets the value of the contractDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractDt() {
        return contractDt;
    }

    /**
     * Sets the value of the contractDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractDt(XMLGregorianCalendar value) {
        this.contractDt = value;
    }

    /**
     * Gets the value of the permitDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPermitDt() {
        return permitDt;
    }

    /**
     * Sets the value of the permitDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPermitDt(XMLGregorianCalendar value) {
        this.permitDt = value;
    }

    /**
     * Gets the value of the surveyDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSurveyDt() {
        return surveyDt;
    }

    /**
     * Sets the value of the surveyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSurveyDt(XMLGregorianCalendar value) {
        this.surveyDt = value;
    }

}
