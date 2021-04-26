
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.OrgDataType;


/**
 * <p>Java class for DebtorData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DebtorData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PersonData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}OrgData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DebtorAcctNumWithCreditor" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebtorData_Type", propOrder = {
    "personData",
    "orgData",
    "debtorAcctNumWithCreditor"
})
public class DebtorDataType {

    @XmlElementRef(name = "PersonData", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PersonDataType>> personData;
    @XmlElement(name = "OrgData", namespace = "urn:ifxforum-org:XSD:1")
    protected List<OrgDataType> orgData;
    @XmlElement(name = "DebtorAcctNumWithCreditor")
    protected String debtorAcctNumWithCreditor;

    /**
     * Gets the value of the personData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PersonDataType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PersonDataType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PersonDataType>> getPersonData() {
        if (personData == null) {
            personData = new ArrayList<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PersonDataType>>();
        }
        return this.personData;
    }

    /**
     * Gets the value of the orgData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orgData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrgDataType }
     * 
     * 
     */
    public List<OrgDataType> getOrgData() {
        if (orgData == null) {
            orgData = new ArrayList<OrgDataType>();
        }
        return this.orgData;
    }

    /**
     * Gets the value of the debtorAcctNumWithCreditor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtorAcctNumWithCreditor() {
        return debtorAcctNumWithCreditor;
    }

    /**
     * Sets the value of the debtorAcctNumWithCreditor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtorAcctNumWithCreditor(String value) {
        this.debtorAcctNumWithCreditor = value;
    }

}
