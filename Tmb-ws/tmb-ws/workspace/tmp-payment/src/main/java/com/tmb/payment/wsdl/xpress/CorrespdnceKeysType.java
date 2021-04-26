
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
 * <p>Java class for CorrespdnceKeys_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorrespdnceKeys_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}CorrespdnceId"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}Version" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.fnf.com/xes}CorrespdnceIdent" maxOccurs="unbounded"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}Name" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.fnf.com/xes}CorrespdnceType" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.fnf.com/xes}ApplicationKeys" minOccurs="0"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}AcctKeys" minOccurs="0"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}PartyKeys" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
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
@XmlType(name = "CorrespdnceKeys_Type", propOrder = {
    "correspdnceId",
    "version",
    "correspdnceIdent",
    "name",
    "correspdnceType",
    "applicationKeys",
    "acctKeys",
    "partyKeys"
})
public class CorrespdnceKeysType {

    @XmlElement(name = "CorrespdnceId")
    protected String correspdnceId;
    @XmlElement(name = "Version", namespace = "urn:ifxforum-org:XSD:1")
    protected String version;
    @XmlElement(name = "CorrespdnceIdent")
    protected List<CorrespdnceIdentType> correspdnceIdent;
    @XmlElement(name = "Name", namespace = "urn:ifxforum-org:XSD:1")
    protected String name;
    @XmlElement(name = "CorrespdnceType")
    protected String correspdnceType;
    @XmlElement(name = "ApplicationKeys")
    protected ApplicationKeysType applicationKeys;
    @XmlElementRef(name = "AcctKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctKeysType> acctKeys;
    @XmlElementRef(name = "PartyKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyKeysType> partyKeys;

    /**
     * Gets the value of the correspdnceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespdnceId() {
        return correspdnceId;
    }

    /**
     * Sets the value of the correspdnceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespdnceId(String value) {
        this.correspdnceId = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the correspdnceIdent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correspdnceIdent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrespdnceIdent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrespdnceIdentType }
     * 
     * 
     */
    public List<CorrespdnceIdentType> getCorrespdnceIdent() {
        if (correspdnceIdent == null) {
            correspdnceIdent = new ArrayList<CorrespdnceIdentType>();
        }
        return this.correspdnceIdent;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the correspdnceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespdnceType() {
        return correspdnceType;
    }

    /**
     * Sets the value of the correspdnceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespdnceType(String value) {
        this.correspdnceType = value;
    }

    /**
     * Gets the value of the applicationKeys property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationKeysType }
     *     
     */
    public ApplicationKeysType getApplicationKeys() {
        return applicationKeys;
    }

    /**
     * Sets the value of the applicationKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationKeysType }
     *     
     */
    public void setApplicationKeys(ApplicationKeysType value) {
        this.applicationKeys = value;
    }

    /**
     * Gets the value of the acctKeys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctKeysType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctKeysType> getAcctKeys() {
        return acctKeys;
    }

    /**
     * Sets the value of the acctKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctKeysType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctKeysType }{@code >}
     *     
     */
    public void setAcctKeys(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.AcctKeysType> value) {
        this.acctKeys = value;
    }

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

}
