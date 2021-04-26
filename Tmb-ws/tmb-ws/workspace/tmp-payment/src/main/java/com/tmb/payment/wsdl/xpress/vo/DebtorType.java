
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Debtor_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Debtor_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PersonData"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}OrgData"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Debtor_Type", propOrder = {
    "personData",
    "orgData"
})
public class DebtorType {

    @XmlElementRef(name = "PersonData", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PersonDataType> personData;
    @XmlElement(name = "OrgData")
    protected OrgDataType orgData;

    /**
     * Gets the value of the personData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PersonDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PersonDataType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PersonDataType> getPersonData() {
        return personData;
    }

    /**
     * Sets the value of the personData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PersonDataType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PersonDataType }{@code >}
     *     
     */
    public void setPersonData(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PersonDataType> value) {
        this.personData = value;
    }

    /**
     * Gets the value of the orgData property.
     * 
     * @return
     *     possible object is
     *     {@link OrgDataType }
     *     
     */
    public OrgDataType getOrgData() {
        return orgData;
    }

    /**
     * Sets the value of the orgData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgDataType }
     *     
     */
    public void setOrgData(OrgDataType value) {
        this.orgData = value;
    }

}
