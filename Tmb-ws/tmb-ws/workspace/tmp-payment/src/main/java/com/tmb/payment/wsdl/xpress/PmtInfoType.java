
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PmtInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}PmtInfo_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CPPData" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DebtorData"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ExpediteInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PmtCreditDetail" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PmtMiscData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PmtInstruction"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PmtInfo_Type", propOrder = {
    "cppData",
    "debtorData",
    "expediteInd",
    "pmtCreditDetail",
    "pmtMiscData",
    "pmtInstruction"
})
public class PmtInfoType
    extends com.tmb.payment.wsdl.xpress.vo.PmtInfoType
{

    @XmlElement(name = "CPPData")
    protected CPPDataType cppData;
    @XmlElement(name = "DebtorData", required = true)
    protected DebtorDataType debtorData;
    @XmlElement(name = "ExpediteInd")
    protected Boolean expediteInd;
    @XmlElement(name = "PmtCreditDetail", required = true)
    protected List<PmtCreditDetailType> pmtCreditDetail;
    @XmlElement(name = "PmtMiscData")
    protected List<PmtMiscDataType> pmtMiscData;
    @XmlElement(name = "PmtInstruction", required = true)
    protected PmtInstructionType pmtInstruction;

    /**
     * Gets the value of the cppData property.
     * 
     * @return
     *     possible object is
     *     {@link CPPDataType }
     *     
     */
    public CPPDataType getCPPData() {
        return cppData;
    }

    /**
     * Sets the value of the cppData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPPDataType }
     *     
     */
    public void setCPPData(CPPDataType value) {
        this.cppData = value;
    }

    /**
     * Gets the value of the debtorData property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorDataType }
     *     
     */
    public DebtorDataType getDebtorData() {
        return debtorData;
    }

    /**
     * Sets the value of the debtorData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorDataType }
     *     
     */
    public void setDebtorData(DebtorDataType value) {
        this.debtorData = value;
    }

    /**
     * Gets the value of the expediteInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpediteInd() {
        return expediteInd;
    }

    /**
     * Sets the value of the expediteInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpediteInd(Boolean value) {
        this.expediteInd = value;
    }

    /**
     * Gets the value of the pmtCreditDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtCreditDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtCreditDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmtCreditDetailType }
     * 
     * 
     */
    public List<PmtCreditDetailType> getPmtCreditDetail() {
        if (pmtCreditDetail == null) {
            pmtCreditDetail = new ArrayList<PmtCreditDetailType>();
        }
        return this.pmtCreditDetail;
    }

    /**
     * Gets the value of the pmtMiscData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtMiscData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtMiscData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmtMiscDataType }
     * 
     * 
     */
    public List<PmtMiscDataType> getPmtMiscData() {
        if (pmtMiscData == null) {
            pmtMiscData = new ArrayList<PmtMiscDataType>();
        }
        return this.pmtMiscData;
    }

    /**
     * Gets the value of the pmtInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link PmtInstructionType }
     *     
     */
    public PmtInstructionType getPmtInstruction() {
        return pmtInstruction;
    }

    /**
     * Sets the value of the pmtInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtInstructionType }
     *     
     */
    public void setPmtInstruction(PmtInstructionType value) {
        this.pmtInstruction = value;
    }

}
