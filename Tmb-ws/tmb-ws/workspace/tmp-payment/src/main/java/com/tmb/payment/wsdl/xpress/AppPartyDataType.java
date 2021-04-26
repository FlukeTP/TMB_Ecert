
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.PartyRefType;


/**
 * <p>Java class for AppPartyData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppPartyData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyRef"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PrimaryApplicantInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}EnrollStatCd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SecretWrd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}UpdApplicantInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ProcessStat" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CreationStat" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SkipPartyAddInd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppPartyData_Type", propOrder = {
    "partyRef",
    "primaryApplicantInd",
    "enrollStatCd",
    "secretWrd",
    "updApplicantInd",
    "processStat",
    "creationStat",
    "skipPartyAddInd"
})
public class AppPartyDataType {

    @XmlElement(name = "PartyRef", namespace = "urn:ifxforum-org:XSD:1", required = true)
    protected PartyRefType partyRef;
    @XmlElement(name = "PrimaryApplicantInd")
    protected Boolean primaryApplicantInd;
    @XmlElement(name = "EnrollStatCd")
    protected String enrollStatCd;
    @XmlElement(name = "SecretWrd")
    protected String secretWrd;
    @XmlElement(name = "UpdApplicantInd")
    protected Boolean updApplicantInd;
    @XmlElement(name = "ProcessStat", nillable = true)
    protected List<ProcessStatType> processStat;
    @XmlElement(name = "CreationStat", nillable = true)
    protected List<CreationStatType> creationStat;
    @XmlElement(name = "SkipPartyAddInd")
    protected Boolean skipPartyAddInd;

    /**
     * Gets the value of the partyRef property.
     * 
     * @return
     *     possible object is
     *     {@link PartyRefType }
     *     
     */
    public PartyRefType getPartyRef() {
        return partyRef;
    }

    /**
     * Sets the value of the partyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRefType }
     *     
     */
    public void setPartyRef(PartyRefType value) {
        this.partyRef = value;
    }

    /**
     * Gets the value of the primaryApplicantInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryApplicantInd() {
        return primaryApplicantInd;
    }

    /**
     * Sets the value of the primaryApplicantInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryApplicantInd(Boolean value) {
        this.primaryApplicantInd = value;
    }

    /**
     * Gets the value of the enrollStatCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrollStatCd() {
        return enrollStatCd;
    }

    /**
     * Sets the value of the enrollStatCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollStatCd(String value) {
        this.enrollStatCd = value;
    }

    /**
     * Gets the value of the secretWrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecretWrd() {
        return secretWrd;
    }

    /**
     * Sets the value of the secretWrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecretWrd(String value) {
        this.secretWrd = value;
    }

    /**
     * Gets the value of the updApplicantInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdApplicantInd() {
        return updApplicantInd;
    }

    /**
     * Sets the value of the updApplicantInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdApplicantInd(Boolean value) {
        this.updApplicantInd = value;
    }

    /**
     * Gets the value of the processStat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processStat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessStat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessStatType }
     * 
     * 
     */
    public List<ProcessStatType> getProcessStat() {
        if (processStat == null) {
            processStat = new ArrayList<ProcessStatType>();
        }
        return this.processStat;
    }

    /**
     * Gets the value of the creationStat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creationStat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreationStat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreationStatType }
     * 
     * 
     */
    public List<CreationStatType> getCreationStat() {
        if (creationStat == null) {
            creationStat = new ArrayList<CreationStatType>();
        }
        return this.creationStat;
    }

    /**
     * Gets the value of the skipPartyAddInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipPartyAddInd() {
        return skipPartyAddInd;
    }

    /**
     * Sets the value of the skipPartyAddInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipPartyAddInd(Boolean value) {
        this.skipPartyAddInd = value;
    }

}
