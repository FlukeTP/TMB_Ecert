
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PersonPartyInfo"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}OrgPartyInfo"/&gt;
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
@XmlType(name = "PartyInfo_Type", propOrder = {
    "personPartyInfo",
    "orgPartyInfo"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.PartyInfoType.class
})
public class PartyInfoType {

    @XmlElementRef(name = "PersonPartyInfo", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PersonPartyInfoType> personPartyInfo;
    @XmlElementRef(name = "OrgPartyInfo", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.OrgPartyInfoType> orgPartyInfo;

    /**
     * Gets the value of the personPartyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PersonPartyInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PersonPartyInfoType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PersonPartyInfoType> getPersonPartyInfo() {
        return personPartyInfo;
    }

    /**
     * Sets the value of the personPartyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PersonPartyInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PersonPartyInfoType }{@code >}
     *     
     */
    public void setPersonPartyInfo(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PersonPartyInfoType> value) {
        this.personPartyInfo = value;
    }

    /**
     * Gets the value of the orgPartyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.OrgPartyInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.OrgPartyInfoType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.OrgPartyInfoType> getOrgPartyInfo() {
        return orgPartyInfo;
    }

    /**
     * Sets the value of the orgPartyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.OrgPartyInfoType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.OrgPartyInfoType }{@code >}
     *     
     */
    public void setOrgPartyInfo(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.OrgPartyInfoType> value) {
        this.orgPartyInfo = value;
    }

}
