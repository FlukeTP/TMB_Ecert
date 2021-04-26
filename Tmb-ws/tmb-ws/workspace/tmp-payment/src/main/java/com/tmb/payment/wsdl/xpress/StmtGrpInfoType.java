
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StmtGrpInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StmtGrpInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyKeys" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}StmtGrpIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AcctList" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PrintType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TruncationCd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ElectronicStmtInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}StmtGrpMiscData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StmtGrpInfo_Type", propOrder = {
    "partyKeys",
    "stmtGrpIdent",
    "acctList",
    "printType",
    "truncationCd",
    "electronicStmtInd",
    "stmtGrpMiscData"
})
public class StmtGrpInfoType {

    @XmlElementRef(name = "PartyKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyKeysType> partyKeys;
    @XmlElement(name = "StmtGrpIdent")
    protected String stmtGrpIdent;
    @XmlElement(name = "AcctList", required = true)
    protected List<AcctListType> acctList;
    @XmlElement(name = "PrintType")
    protected String printType;
    @XmlElement(name = "TruncationCd")
    protected String truncationCd;
    @XmlElement(name = "ElectronicStmtInd")
    protected Boolean electronicStmtInd;
    @XmlElement(name = "StmtGrpMiscData")
    protected List<StmtGrpMiscDataType> stmtGrpMiscData;

    /**
     * Gets the value of the partyKeys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyKeysType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyKeysType> getPartyKeys() {
        return partyKeys;
    }

    /**
     * Sets the value of the partyKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyKeysType }{@code >}
     *     
     */
    public void setPartyKeys(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyKeysType> value) {
        this.partyKeys = value;
    }

    /**
     * Gets the value of the stmtGrpIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtGrpIdent() {
        return stmtGrpIdent;
    }

    /**
     * Sets the value of the stmtGrpIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtGrpIdent(String value) {
        this.stmtGrpIdent = value;
    }

    /**
     * Gets the value of the acctList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctListType }
     * 
     * 
     */
    public List<AcctListType> getAcctList() {
        if (acctList == null) {
            acctList = new ArrayList<AcctListType>();
        }
        return this.acctList;
    }

    /**
     * Gets the value of the printType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintType() {
        return printType;
    }

    /**
     * Sets the value of the printType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintType(String value) {
        this.printType = value;
    }

    /**
     * Gets the value of the truncationCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTruncationCd() {
        return truncationCd;
    }

    /**
     * Sets the value of the truncationCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTruncationCd(String value) {
        this.truncationCd = value;
    }

    /**
     * Gets the value of the electronicStmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isElectronicStmtInd() {
        return electronicStmtInd;
    }

    /**
     * Sets the value of the electronicStmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setElectronicStmtInd(Boolean value) {
        this.electronicStmtInd = value;
    }

    /**
     * Gets the value of the stmtGrpMiscData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stmtGrpMiscData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStmtGrpMiscData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StmtGrpMiscDataType }
     * 
     * 
     */
    public List<StmtGrpMiscDataType> getStmtGrpMiscData() {
        if (stmtGrpMiscData == null) {
            stmtGrpMiscData = new ArrayList<StmtGrpMiscDataType>();
        }
        return this.stmtGrpMiscData;
    }

}
