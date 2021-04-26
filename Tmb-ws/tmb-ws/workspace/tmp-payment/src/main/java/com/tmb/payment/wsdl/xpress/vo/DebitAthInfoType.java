
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DebitAthInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DebitAthInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DebitAthType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CompositeCurAmt" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctRef"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BaseEnvr" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebitAthInfo_Type", propOrder = {
    "debitAthType",
    "compositeCurAmt",
    "acctRef",
    "baseEnvr"
})
public class DebitAthInfoType {

    @XmlElement(name = "DebitAthType", required = true)
    protected String debitAthType;
    @XmlElement(name = "CompositeCurAmt", required = true)
    protected List<CompositeCurAmtType> compositeCurAmt;
    @XmlElement(name = "AcctRef", required = true)
    protected AcctRefType acctRef;
    @XmlElement(name = "BaseEnvr")
    protected BaseEnvrType baseEnvr;

    /**
     * Gets the value of the debitAthType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitAthType() {
        return debitAthType;
    }

    /**
     * Sets the value of the debitAthType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitAthType(String value) {
        this.debitAthType = value;
    }

    /**
     * Gets the value of the compositeCurAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compositeCurAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompositeCurAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompositeCurAmtType }
     * 
     * 
     */
    public List<CompositeCurAmtType> getCompositeCurAmt() {
        if (compositeCurAmt == null) {
            compositeCurAmt = new ArrayList<CompositeCurAmtType>();
        }
        return this.compositeCurAmt;
    }

    /**
     * Gets the value of the acctRef property.
     * 
     * @return
     *     possible object is
     *     {@link AcctRefType }
     *     
     */
    public AcctRefType getAcctRef() {
        return acctRef;
    }

    /**
     * Sets the value of the acctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctRefType }
     *     
     */
    public void setAcctRef(AcctRefType value) {
        this.acctRef = value;
    }

    /**
     * Gets the value of the baseEnvr property.
     * 
     * @return
     *     possible object is
     *     {@link BaseEnvrType }
     *     
     */
    public BaseEnvrType getBaseEnvr() {
        return baseEnvr;
    }

    /**
     * Sets the value of the baseEnvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseEnvrType }
     *     
     */
    public void setBaseEnvr(BaseEnvrType value) {
        this.baseEnvr = value;
    }

}
