
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyPartyRelInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyPartyRelInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyRef"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}RelPartyRef" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyRelType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyRelName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PartyRole" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyPartyRelInfo_Type", propOrder = {
    "partyRef",
    "relPartyRef",
    "partyRelType",
    "partyRelName",
    "partyRole"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.PartyPartyRelInfoType.class
})
public class PartyPartyRelInfoType {

    @XmlElement(name = "PartyRef", required = true)
    protected PartyRefType partyRef;
    @XmlElementRef(name = "RelPartyRef", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class)
    protected List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.RelPartyRefType>> relPartyRef;
    @XmlElement(name = "PartyRelType")
    protected String partyRelType;
    @XmlElement(name = "PartyRelName")
    protected String partyRelName;
    @XmlElement(name = "PartyRole")
    protected List<String> partyRole;

    /**
     * Gets the value of the partyRef property.
     * 
     * @return
     *     possible object is
     *     {@link PartyRefType }
     *     
     */
    public PartyRefType getPartyRef() {
        return partyRef;
    }

    /**
     * Sets the value of the partyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRefType }
     *     
     */
    public void setPartyRef(PartyRefType value) {
        this.partyRef = value;
    }

    /**
     * Gets the value of the relPartyRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relPartyRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelPartyRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.RelPartyRefType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.RelPartyRefType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.RelPartyRefType>> getRelPartyRef() {
        if (relPartyRef == null) {
            relPartyRef = new ArrayList<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.RelPartyRefType>>();
        }
        return this.relPartyRef;
    }

    /**
     * Gets the value of the partyRelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyRelType() {
        return partyRelType;
    }

    /**
     * Sets the value of the partyRelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyRelType(String value) {
        this.partyRelType = value;
    }

    /**
     * Gets the value of the partyRelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyRelName() {
        return partyRelName;
    }

    /**
     * Sets the value of the partyRelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyRelName(String value) {
        this.partyRelName = value;
    }

    /**
     * Gets the value of the partyRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPartyRole() {
        if (partyRole == null) {
            partyRole = new ArrayList<String>();
        }
        return this.partyRole;
    }

}
