
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DvcRsHdr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DvcRsHdr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DvcTokenCookie" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DvcTokenFSO" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}BindingType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Nickname" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DvcStatCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DvcStatDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DvcUpdtStatCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DvcUpdtStatDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RiskScore" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ActionDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ActionType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RuleIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RuleName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AthChallng" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvcRsHdr_Type", propOrder = {
    "dvcTokenCookie",
    "dvcTokenFSO",
    "bindingType",
    "nickname",
    "dvcStatCode",
    "dvcStatDesc",
    "dvcUpdtStatCode",
    "dvcUpdtStatDesc",
    "riskScore",
    "actionDesc",
    "actionType",
    "ruleIdent",
    "ruleName",
    "athChallng"
})
public class DvcRsHdrType {

    @XmlElement(name = "DvcTokenCookie")
    protected String dvcTokenCookie;
    @XmlElement(name = "DvcTokenFSO")
    protected String dvcTokenFSO;
    @XmlElement(name = "BindingType")
    protected String bindingType;
    @XmlElement(name = "Nickname", namespace = "urn:ifxforum-org:XSD:1")
    protected String nickname;
    @XmlElement(name = "DvcStatCode")
    protected String dvcStatCode;
    @XmlElement(name = "DvcStatDesc")
    protected String dvcStatDesc;
    @XmlElement(name = "DvcUpdtStatCode")
    protected String dvcUpdtStatCode;
    @XmlElement(name = "DvcUpdtStatDesc")
    protected String dvcUpdtStatDesc;
    @XmlElement(name = "RiskScore")
    protected String riskScore;
    @XmlElement(name = "ActionDesc")
    protected String actionDesc;
    @XmlElement(name = "ActionType")
    protected String actionType;
    @XmlElement(name = "RuleIdent")
    protected String ruleIdent;
    @XmlElement(name = "RuleName")
    protected String ruleName;
    @XmlElement(name = "AthChallng")
    protected List<AthChallngType> athChallng;

    /**
     * Gets the value of the dvcTokenCookie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvcTokenCookie() {
        return dvcTokenCookie;
    }

    /**
     * Sets the value of the dvcTokenCookie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDvcTokenCookie(String value) {
        this.dvcTokenCookie = value;
    }

    /**
     * Gets the value of the dvcTokenFSO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvcTokenFSO() {
        return dvcTokenFSO;
    }

    /**
     * Sets the value of the dvcTokenFSO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDvcTokenFSO(String value) {
        this.dvcTokenFSO = value;
    }

    /**
     * Gets the value of the bindingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindingType() {
        return bindingType;
    }

    /**
     * Sets the value of the bindingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindingType(String value) {
        this.bindingType = value;
    }

    /**
     * Gets the value of the nickname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Sets the value of the nickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickname(String value) {
        this.nickname = value;
    }

    /**
     * Gets the value of the dvcStatCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvcStatCode() {
        return dvcStatCode;
    }

    /**
     * Sets the value of the dvcStatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDvcStatCode(String value) {
        this.dvcStatCode = value;
    }

    /**
     * Gets the value of the dvcStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvcStatDesc() {
        return dvcStatDesc;
    }

    /**
     * Sets the value of the dvcStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDvcStatDesc(String value) {
        this.dvcStatDesc = value;
    }

    /**
     * Gets the value of the dvcUpdtStatCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvcUpdtStatCode() {
        return dvcUpdtStatCode;
    }

    /**
     * Sets the value of the dvcUpdtStatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDvcUpdtStatCode(String value) {
        this.dvcUpdtStatCode = value;
    }

    /**
     * Gets the value of the dvcUpdtStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvcUpdtStatDesc() {
        return dvcUpdtStatDesc;
    }

    /**
     * Sets the value of the dvcUpdtStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDvcUpdtStatDesc(String value) {
        this.dvcUpdtStatDesc = value;
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
     * Gets the value of the actionDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionDesc() {
        return actionDesc;
    }

    /**
     * Sets the value of the actionDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionDesc(String value) {
        this.actionDesc = value;
    }

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionType(String value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the ruleIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleIdent() {
        return ruleIdent;
    }

    /**
     * Sets the value of the ruleIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleIdent(String value) {
        this.ruleIdent = value;
    }

    /**
     * Gets the value of the ruleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * Sets the value of the ruleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleName(String value) {
        this.ruleName = value;
    }

    /**
     * Gets the value of the athChallng property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the athChallng property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAthChallng().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AthChallngType }
     * 
     * 
     */
    public List<AthChallngType> getAthChallng() {
        if (athChallng == null) {
            athChallng = new ArrayList<AthChallngType>();
        }
        return this.athChallng;
    }

}
