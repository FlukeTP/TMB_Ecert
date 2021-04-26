
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditBureauSummary2_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditBureauSummary2_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CreditBureau" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}BureauScore" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ReportRequestDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ReportDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}NegRecords" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}BureauScoreReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditBureauSummary2_Type", propOrder = {
    "creditBureau",
    "bureauScore",
    "reportRequestDt",
    "reportDetails",
    "negRecords",
    "bureauScoreReason"
})
public class CreditBureauSummary2Type {

    @XmlElement(name = "CreditBureau")
    protected String creditBureau;
    @XmlElement(name = "BureauScore")
    protected Long bureauScore;
    @XmlElement(name = "ReportRequestDt")
    protected String reportRequestDt;
    @XmlElement(name = "ReportDetails")
    protected String reportDetails;
    @XmlElement(name = "NegRecords")
    protected String negRecords;
    @XmlElement(name = "BureauScoreReason")
    protected List<String> bureauScoreReason;

    /**
     * Gets the value of the creditBureau property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditBureau() {
        return creditBureau;
    }

    /**
     * Sets the value of the creditBureau property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditBureau(String value) {
        this.creditBureau = value;
    }

    /**
     * Gets the value of the bureauScore property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBureauScore() {
        return bureauScore;
    }

    /**
     * Sets the value of the bureauScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBureauScore(Long value) {
        this.bureauScore = value;
    }

    /**
     * Gets the value of the reportRequestDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportRequestDt() {
        return reportRequestDt;
    }

    /**
     * Sets the value of the reportRequestDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportRequestDt(String value) {
        this.reportRequestDt = value;
    }

    /**
     * Gets the value of the reportDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportDetails() {
        return reportDetails;
    }

    /**
     * Sets the value of the reportDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportDetails(String value) {
        this.reportDetails = value;
    }

    /**
     * Gets the value of the negRecords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegRecords() {
        return negRecords;
    }

    /**
     * Sets the value of the negRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegRecords(String value) {
        this.negRecords = value;
    }

    /**
     * Gets the value of the bureauScoreReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bureauScoreReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBureauScoreReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBureauScoreReason() {
        if (bureauScoreReason == null) {
            bureauScoreReason = new ArrayList<String>();
        }
        return this.bureauScoreReason;
    }

}
