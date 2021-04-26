
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.ChkNumRangeType;


/**
 * <p>Java class for AcctTrnSel_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctTrnSel_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}AcctTrnSel_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkNumRange" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TrnSeqNum" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RefIdentRange" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AcctTrnMiscData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SortCriteria" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PendingInd" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctTrnSel_Type", propOrder = {
    "chkNumRange",
    "trnSeqNum",
    "refIdentRange",
    "acctTrnMiscData",
    "sortCriteria",
    "pendingInd"
})
public class AcctTrnSelType
    extends com.tmb.payment.wsdl.xpress.vo.AcctTrnSelType
{

    @XmlElement(name = "ChkNumRange", namespace = "urn:ifxforum-org:XSD:1")
    protected ChkNumRangeType chkNumRange;
    @XmlElement(name = "TrnSeqNum")
    protected String trnSeqNum;
    @XmlElement(name = "RefIdentRange")
    protected RefIdentRangeType refIdentRange;
    @XmlElement(name = "AcctTrnMiscData")
    protected List<AcctTrnMiscDataType> acctTrnMiscData;
    @XmlElement(name = "SortCriteria")
    protected String sortCriteria;
    @XmlElement(name = "PendingInd")
    protected Boolean pendingInd;

    /**
     * Gets the value of the chkNumRange property.
     * 
     * @return
     *     possible object is
     *     {@link ChkNumRangeType }
     *     
     */
    public ChkNumRangeType getChkNumRange() {
        return chkNumRange;
    }

    /**
     * Sets the value of the chkNumRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkNumRangeType }
     *     
     */
    public void setChkNumRange(ChkNumRangeType value) {
        this.chkNumRange = value;
    }

    /**
     * Gets the value of the trnSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnSeqNum() {
        return trnSeqNum;
    }

    /**
     * Sets the value of the trnSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnSeqNum(String value) {
        this.trnSeqNum = value;
    }

    /**
     * Gets the value of the refIdentRange property.
     * 
     * @return
     *     possible object is
     *     {@link RefIdentRangeType }
     *     
     */
    public RefIdentRangeType getRefIdentRange() {
        return refIdentRange;
    }

    /**
     * Sets the value of the refIdentRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefIdentRangeType }
     *     
     */
    public void setRefIdentRange(RefIdentRangeType value) {
        this.refIdentRange = value;
    }

    /**
     * Gets the value of the acctTrnMiscData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctTrnMiscData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctTrnMiscData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctTrnMiscDataType }
     * 
     * 
     */
    public List<AcctTrnMiscDataType> getAcctTrnMiscData() {
        if (acctTrnMiscData == null) {
            acctTrnMiscData = new ArrayList<AcctTrnMiscDataType>();
        }
        return this.acctTrnMiscData;
    }

    /**
     * Gets the value of the sortCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortCriteria() {
        return sortCriteria;
    }

    /**
     * Sets the value of the sortCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortCriteria(String value) {
        this.sortCriteria = value;
    }

    /**
     * Gets the value of the pendingInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPendingInd() {
        return pendingInd;
    }

    /**
     * Sets the value of the pendingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPendingInd(Boolean value) {
        this.pendingInd = value;
    }

}
