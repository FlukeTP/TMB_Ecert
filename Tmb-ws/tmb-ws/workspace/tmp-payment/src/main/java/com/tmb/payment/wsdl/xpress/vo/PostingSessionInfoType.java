
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PostingSessionInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostingSessionInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SessionLogin"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SessionDt"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SessionPostingDt"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PhysicalLocIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PhysicalLocName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SessionLocIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SessionLocName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ExpDt" minOccurs="0"/&gt;
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
@XmlType(name = "PostingSessionInfo_Type", propOrder = {
    "sessionLogin",
    "sessionDt",
    "sessionPostingDt",
    "physicalLocIdent",
    "physicalLocName",
    "sessionLocIdent",
    "sessionLocName",
    "expDt",
    "baseEnvr"
})
public class PostingSessionInfoType {

    @XmlElement(name = "SessionLogin", required = true)
    protected String sessionLogin;
    @XmlElement(name = "SessionDt", required = true)
    protected String sessionDt;
    @XmlElement(name = "SessionPostingDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sessionPostingDt;
    @XmlElement(name = "PhysicalLocIdent")
    protected String physicalLocIdent;
    @XmlElement(name = "PhysicalLocName")
    protected String physicalLocName;
    @XmlElement(name = "SessionLocIdent")
    protected String sessionLocIdent;
    @XmlElement(name = "SessionLocName")
    protected String sessionLocName;
    @XmlElement(name = "ExpDt")
    protected String expDt;
    @XmlElement(name = "BaseEnvr")
    protected BaseEnvrType baseEnvr;

    /**
     * Gets the value of the sessionLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionLogin() {
        return sessionLogin;
    }

    /**
     * Sets the value of the sessionLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionLogin(String value) {
        this.sessionLogin = value;
    }

    /**
     * Gets the value of the sessionDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionDt() {
        return sessionDt;
    }

    /**
     * Sets the value of the sessionDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionDt(String value) {
        this.sessionDt = value;
    }

    /**
     * Gets the value of the sessionPostingDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSessionPostingDt() {
        return sessionPostingDt;
    }

    /**
     * Sets the value of the sessionPostingDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSessionPostingDt(XMLGregorianCalendar value) {
        this.sessionPostingDt = value;
    }

    /**
     * Gets the value of the physicalLocIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalLocIdent() {
        return physicalLocIdent;
    }

    /**
     * Sets the value of the physicalLocIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalLocIdent(String value) {
        this.physicalLocIdent = value;
    }

    /**
     * Gets the value of the physicalLocName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalLocName() {
        return physicalLocName;
    }

    /**
     * Sets the value of the physicalLocName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalLocName(String value) {
        this.physicalLocName = value;
    }

    /**
     * Gets the value of the sessionLocIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionLocIdent() {
        return sessionLocIdent;
    }

    /**
     * Sets the value of the sessionLocIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionLocIdent(String value) {
        this.sessionLocIdent = value;
    }

    /**
     * Gets the value of the sessionLocName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionLocName() {
        return sessionLocName;
    }

    /**
     * Sets the value of the sessionLocName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionLocName(String value) {
        this.sessionLocName = value;
    }

    /**
     * Gets the value of the expDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpDt() {
        return expDt;
    }

    /**
     * Sets the value of the expDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpDt(String value) {
        this.expDt = value;
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
