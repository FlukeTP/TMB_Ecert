
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.tmb.payment.wsdl.xpress.vo.FIDataType;


/**
 * <p>Java class for OrgPartyInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrgPartyInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}OrgPartyInfo_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PartyIdent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PartyRel" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}BankRegion" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CostCenter" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Statement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PartyMiscData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PartyVerifyCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PartyVerifyDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PartyQualificationData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RelationshipMgr" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PartyType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PartySubType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ClosedDt" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ClosedReason" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PartySORData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FIData" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PrivacyOptCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SolicitOptCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrgPartyInfo_Type", propOrder = {
    "partyIdent",
    "partyRel",
    "bankRegion",
    "costCenter",
    "statement",
    "partyMiscData",
    "partyVerifyCode",
    "partyVerifyDt",
    "partyQualificationData",
    "relationshipMgr",
    "partyType",
    "partySubType",
    "closedDt",
    "closedReason",
    "partySORData",
    "fiData",
    "privacyOptCode",
    "solicitOptCode"
})
public class OrgPartyInfoType
    extends com.tmb.payment.wsdl.xpress.vo.OrgPartyInfoType
{

    @XmlElement(name = "PartyIdent")
    protected List<PartyIdentType> partyIdent;
    @XmlElement(name = "PartyRel")
    protected String partyRel;
    @XmlElement(name = "BankRegion")
    protected String bankRegion;
    @XmlElement(name = "CostCenter")
    protected String costCenter;
    @XmlElement(name = "Statement")
    protected List<StatementType> statement;
    @XmlElement(name = "PartyMiscData")
    protected List<PartyMiscDataType> partyMiscData;
    @XmlElement(name = "PartyVerifyCode")
    protected String partyVerifyCode;
    @XmlElement(name = "PartyVerifyDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar partyVerifyDt;
    @XmlElement(name = "PartyQualificationData")
    protected List<PartyQualificationDataType> partyQualificationData;
    @XmlElement(name = "RelationshipMgr")
    protected List<RelationshipMgrType> relationshipMgr;
    @XmlElement(name = "PartyType")
    protected String partyType;
    @XmlElement(name = "PartySubType")
    protected String partySubType;
    @XmlElement(name = "ClosedDt", namespace = "urn:ifxforum-org:XSD:1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar closedDt;
    @XmlElement(name = "ClosedReason")
    protected String closedReason;
    @XmlElement(name = "PartySORData")
    protected List<PartySORDataType> partySORData;
    @XmlElement(name = "FIData", namespace = "urn:ifxforum-org:XSD:1")
    protected FIDataType fiData;
    @XmlElement(name = "PrivacyOptCode")
    protected String privacyOptCode;
    @XmlElement(name = "SolicitOptCode")
    protected String solicitOptCode;

    /**
     * Gets the value of the partyIdent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyIdent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyIdent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentType }
     * 
     * 
     */
    public List<PartyIdentType> getPartyIdent() {
        if (partyIdent == null) {
            partyIdent = new ArrayList<PartyIdentType>();
        }
        return this.partyIdent;
    }

    /**
     * Gets the value of the partyRel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyRel() {
        return partyRel;
    }

    /**
     * Sets the value of the partyRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyRel(String value) {
        this.partyRel = value;
    }

    /**
     * Gets the value of the bankRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankRegion() {
        return bankRegion;
    }

    /**
     * Sets the value of the bankRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankRegion(String value) {
        this.bankRegion = value;
    }

    /**
     * Gets the value of the costCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenter() {
        return costCenter;
    }

    /**
     * Sets the value of the costCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenter(String value) {
        this.costCenter = value;
    }

    /**
     * Gets the value of the statement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementType }
     * 
     * 
     */
    public List<StatementType> getStatement() {
        if (statement == null) {
            statement = new ArrayList<StatementType>();
        }
        return this.statement;
    }

    /**
     * Gets the value of the partyMiscData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyMiscData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyMiscData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyMiscDataType }
     * 
     * 
     */
    public List<PartyMiscDataType> getPartyMiscData() {
        if (partyMiscData == null) {
            partyMiscData = new ArrayList<PartyMiscDataType>();
        }
        return this.partyMiscData;
    }

    /**
     * Gets the value of the partyVerifyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyVerifyCode() {
        return partyVerifyCode;
    }

    /**
     * Sets the value of the partyVerifyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyVerifyCode(String value) {
        this.partyVerifyCode = value;
    }

    /**
     * Gets the value of the partyVerifyDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPartyVerifyDt() {
        return partyVerifyDt;
    }

    /**
     * Sets the value of the partyVerifyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPartyVerifyDt(XMLGregorianCalendar value) {
        this.partyVerifyDt = value;
    }

    /**
     * Gets the value of the partyQualificationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyQualificationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyQualificationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyQualificationDataType }
     * 
     * 
     */
    public List<PartyQualificationDataType> getPartyQualificationData() {
        if (partyQualificationData == null) {
            partyQualificationData = new ArrayList<PartyQualificationDataType>();
        }
        return this.partyQualificationData;
    }

    /**
     * Gets the value of the relationshipMgr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationshipMgr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationshipMgr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationshipMgrType }
     * 
     * 
     */
    public List<RelationshipMgrType> getRelationshipMgr() {
        if (relationshipMgr == null) {
            relationshipMgr = new ArrayList<RelationshipMgrType>();
        }
        return this.relationshipMgr;
    }

    /**
     * Gets the value of the partyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyType() {
        return partyType;
    }

    /**
     * Sets the value of the partyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyType(String value) {
        this.partyType = value;
    }

    /**
     * Gets the value of the partySubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartySubType() {
        return partySubType;
    }

    /**
     * Sets the value of the partySubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartySubType(String value) {
        this.partySubType = value;
    }

    /**
     * Gets the value of the closedDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClosedDt() {
        return closedDt;
    }

    /**
     * Sets the value of the closedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClosedDt(XMLGregorianCalendar value) {
        this.closedDt = value;
    }

    /**
     * Gets the value of the closedReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosedReason() {
        return closedReason;
    }

    /**
     * Sets the value of the closedReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosedReason(String value) {
        this.closedReason = value;
    }

    /**
     * Gets the value of the partySORData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partySORData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartySORData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartySORDataType }
     * 
     * 
     */
    public List<PartySORDataType> getPartySORData() {
        if (partySORData == null) {
            partySORData = new ArrayList<PartySORDataType>();
        }
        return this.partySORData;
    }

    /**
     * Gets the value of the fiData property.
     * 
     * @return
     *     possible object is
     *     {@link FIDataType }
     *     
     */
    public FIDataType getFIData() {
        return fiData;
    }

    /**
     * Sets the value of the fiData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIDataType }
     *     
     */
    public void setFIData(FIDataType value) {
        this.fiData = value;
    }

    /**
     * Gets the value of the privacyOptCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivacyOptCode() {
        return privacyOptCode;
    }

    /**
     * Sets the value of the privacyOptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivacyOptCode(String value) {
        this.privacyOptCode = value;
    }

    /**
     * Gets the value of the solicitOptCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolicitOptCode() {
        return solicitOptCode;
    }

    /**
     * Sets the value of the solicitOptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolicitOptCode(String value) {
        this.solicitOptCode = value;
    }

}
