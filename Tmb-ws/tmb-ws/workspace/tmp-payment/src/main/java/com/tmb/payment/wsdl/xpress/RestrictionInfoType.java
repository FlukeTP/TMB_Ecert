
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.AcctIdentType;


/**
 * <p>Java class for RestrictionInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RestrictionInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}Source" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RestrictCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RestrictDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OverrideType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OverrideInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ApproverData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestrictionInfo_Type", propOrder = {
    "source",
    "restrictCode",
    "restrictDesc",
    "overrideType",
    "acctIdent",
    "overrideInd",
    "approverData"
})
public class RestrictionInfoType {

    @XmlElement(name = "Source")
    protected String source;
    @XmlElement(name = "RestrictCode")
    protected String restrictCode;
    @XmlElement(name = "RestrictDesc")
    protected String restrictDesc;
    @XmlElement(name = "OverrideType")
    protected String overrideType;
    @XmlElement(name = "AcctIdent", namespace = "urn:ifxforum-org:XSD:1")
    protected AcctIdentType acctIdent;
    @XmlElement(name = "OverrideInd")
    protected Boolean overrideInd;
    @XmlElement(name = "ApproverData", nillable = true)
    protected List<ApproverDataType> approverData;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the restrictCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictCode() {
        return restrictCode;
    }

    /**
     * Sets the value of the restrictCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictCode(String value) {
        this.restrictCode = value;
    }

    /**
     * Gets the value of the restrictDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictDesc() {
        return restrictDesc;
    }

    /**
     * Sets the value of the restrictDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictDesc(String value) {
        this.restrictDesc = value;
    }

    /**
     * Gets the value of the overrideType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideType() {
        return overrideType;
    }

    /**
     * Sets the value of the overrideType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideType(String value) {
        this.overrideType = value;
    }

    /**
     * Gets the value of the acctIdent property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdentType }
     *     
     */
    public AcctIdentType getAcctIdent() {
        return acctIdent;
    }

    /**
     * Sets the value of the acctIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdentType }
     *     
     */
    public void setAcctIdent(AcctIdentType value) {
        this.acctIdent = value;
    }

    /**
     * Gets the value of the overrideInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideInd() {
        return overrideInd;
    }

    /**
     * Sets the value of the overrideInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideInd(Boolean value) {
        this.overrideInd = value;
    }

    /**
     * Gets the value of the approverData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approverData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApproverData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApproverDataType }
     * 
     * 
     */
    public List<ApproverDataType> getApproverData() {
        if (approverData == null) {
            approverData = new ArrayList<ApproverDataType>();
        }
        return this.approverData;
    }

}
