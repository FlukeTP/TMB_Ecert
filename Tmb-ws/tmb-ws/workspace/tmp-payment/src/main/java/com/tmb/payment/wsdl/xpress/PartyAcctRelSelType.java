
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyAcctRelSel_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyAcctRelSel_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}PartyAcctRelSel_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ExternalInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}IssuedIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AcctMiscData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}LegalRespCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyAcctRelSel_Type", propOrder = {
    "externalInd",
    "issuedIdent",
    "acctMiscData",
    "legalRespCode"
})
public class PartyAcctRelSelType
    extends com.tmb.payment.wsdl.xpress.vo.PartyAcctRelSelType
{

    @XmlElement(name = "ExternalInd")
    protected Boolean externalInd;
    @XmlElement(name = "IssuedIdent")
    protected IssuedIdentType issuedIdent;
    @XmlElement(name = "AcctMiscData")
    protected List<AcctMiscDataType> acctMiscData;
    @XmlElement(name = "LegalRespCode")
    protected String legalRespCode;

    /**
     * Gets the value of the externalInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExternalInd() {
        return externalInd;
    }

    /**
     * Sets the value of the externalInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExternalInd(Boolean value) {
        this.externalInd = value;
    }

    /**
     * Gets the value of the issuedIdent property.
     * 
     * @return
     *     possible object is
     *     {@link IssuedIdentType }
     *     
     */
    public IssuedIdentType getIssuedIdent() {
        return issuedIdent;
    }

    /**
     * Sets the value of the issuedIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuedIdentType }
     *     
     */
    public void setIssuedIdent(IssuedIdentType value) {
        this.issuedIdent = value;
    }

    /**
     * Gets the value of the acctMiscData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctMiscData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctMiscData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctMiscDataType }
     * 
     * 
     */
    public List<AcctMiscDataType> getAcctMiscData() {
        if (acctMiscData == null) {
            acctMiscData = new ArrayList<AcctMiscDataType>();
        }
        return this.acctMiscData;
    }

    /**
     * Gets the value of the legalRespCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalRespCode() {
        return legalRespCode;
    }

    /**
     * Sets the value of the legalRespCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalRespCode(String value) {
        this.legalRespCode = value;
    }

}
