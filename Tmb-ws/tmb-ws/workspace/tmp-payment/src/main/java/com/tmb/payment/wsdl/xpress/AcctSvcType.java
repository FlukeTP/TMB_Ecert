
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctSvc_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctSvc_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AcctSvcIdent"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CompleteInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SrvBookInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SvcRemoveInd" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StmtGroup" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TempPartyIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RecurrenceRule" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ProcessStat" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SvcAvailCd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctSvc_Type", propOrder = {
    "acctSvcIdent",
    "completeInd",
    "srvBookInd",
    "svcRemoveInd",
    "stmtGroup",
    "tempPartyIdent",
    "recurrenceRule",
    "processStat",
    "svcAvailCd"
})
public class AcctSvcType {

    @XmlElement(name = "AcctSvcIdent", required = true)
    protected String acctSvcIdent;
    @XmlElement(name = "CompleteInd")
    protected Boolean completeInd;
    @XmlElement(name = "SrvBookInd")
    protected Boolean srvBookInd;
    @XmlElement(name = "SvcRemoveInd")
    protected Boolean svcRemoveInd;
    @XmlElement(name = "StmtGroup", namespace = "urn:ifxforum-org:XSD:1")
    protected String stmtGroup;
    @XmlElement(name = "TempPartyIdent")
    protected String tempPartyIdent;
    @XmlElement(name = "RecurrenceRule")
    protected RecurrenceRuleType recurrenceRule;
    @XmlElement(name = "ProcessStat", nillable = true)
    protected ProcessStatType processStat;
    @XmlElement(name = "SvcAvailCd")
    protected String svcAvailCd;

    /**
     * Gets the value of the acctSvcIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctSvcIdent() {
        return acctSvcIdent;
    }

    /**
     * Sets the value of the acctSvcIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctSvcIdent(String value) {
        this.acctSvcIdent = value;
    }

    /**
     * Gets the value of the completeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompleteInd() {
        return completeInd;
    }

    /**
     * Sets the value of the completeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompleteInd(Boolean value) {
        this.completeInd = value;
    }

    /**
     * Gets the value of the srvBookInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSrvBookInd() {
        return srvBookInd;
    }

    /**
     * Sets the value of the srvBookInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSrvBookInd(Boolean value) {
        this.srvBookInd = value;
    }

    /**
     * Gets the value of the svcRemoveInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSvcRemoveInd() {
        return svcRemoveInd;
    }

    /**
     * Sets the value of the svcRemoveInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSvcRemoveInd(Boolean value) {
        this.svcRemoveInd = value;
    }

    /**
     * Gets the value of the stmtGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtGroup() {
        return stmtGroup;
    }

    /**
     * Sets the value of the stmtGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtGroup(String value) {
        this.stmtGroup = value;
    }

    /**
     * Gets the value of the tempPartyIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempPartyIdent() {
        return tempPartyIdent;
    }

    /**
     * Sets the value of the tempPartyIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempPartyIdent(String value) {
        this.tempPartyIdent = value;
    }

    /**
     * Gets the value of the recurrenceRule property.
     * 
     * @return
     *     possible object is
     *     {@link RecurrenceRuleType }
     *     
     */
    public RecurrenceRuleType getRecurrenceRule() {
        return recurrenceRule;
    }

    /**
     * Sets the value of the recurrenceRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrenceRuleType }
     *     
     */
    public void setRecurrenceRule(RecurrenceRuleType value) {
        this.recurrenceRule = value;
    }

    /**
     * Gets the value of the processStat property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessStatType }
     *     
     */
    public ProcessStatType getProcessStat() {
        return processStat;
    }

    /**
     * Sets the value of the processStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessStatType }
     *     
     */
    public void setProcessStat(ProcessStatType value) {
        this.processStat = value;
    }

    /**
     * Gets the value of the svcAvailCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcAvailCd() {
        return svcAvailCd;
    }

    /**
     * Sets the value of the svcAvailCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcAvailCd(String value) {
        this.svcAvailCd = value;
    }

}
