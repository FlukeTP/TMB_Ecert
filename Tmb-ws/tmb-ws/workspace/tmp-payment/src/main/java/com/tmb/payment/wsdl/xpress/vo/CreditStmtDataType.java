
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreditStmtData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditStmtData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ExtAcctBal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DueDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MinAmtDue" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DelinqAging" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditStmtData_Type", propOrder = {
    "extAcctBal",
    "dueDt",
    "minAmtDue",
    "delinqAging"
})
public class CreditStmtDataType {

    @XmlElement(name = "ExtAcctBal")
    protected ExtAcctBalType extAcctBal;
    @XmlElement(name = "DueDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDt;
    @XmlElement(name = "MinAmtDue")
    protected MinAmtDueType minAmtDue;
    @XmlElement(name = "DelinqAging")
    protected List<DelinqAgingType> delinqAging;

    /**
     * Gets the value of the extAcctBal property.
     * 
     * @return
     *     possible object is
     *     {@link ExtAcctBalType }
     *     
     */
    public ExtAcctBalType getExtAcctBal() {
        return extAcctBal;
    }

    /**
     * Sets the value of the extAcctBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtAcctBalType }
     *     
     */
    public void setExtAcctBal(ExtAcctBalType value) {
        this.extAcctBal = value;
    }

    /**
     * Gets the value of the dueDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDt() {
        return dueDt;
    }

    /**
     * Sets the value of the dueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDt(XMLGregorianCalendar value) {
        this.dueDt = value;
    }

    /**
     * Gets the value of the minAmtDue property.
     * 
     * @return
     *     possible object is
     *     {@link MinAmtDueType }
     *     
     */
    public MinAmtDueType getMinAmtDue() {
        return minAmtDue;
    }

    /**
     * Sets the value of the minAmtDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinAmtDueType }
     *     
     */
    public void setMinAmtDue(MinAmtDueType value) {
        this.minAmtDue = value;
    }

    /**
     * Gets the value of the delinqAging property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the delinqAging property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDelinqAging().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DelinqAgingType }
     * 
     * 
     */
    public List<DelinqAgingType> getDelinqAging() {
        if (delinqAging == null) {
            delinqAging = new ArrayList<DelinqAgingType>();
        }
        return this.delinqAging;
    }

}
