
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CredentialsRqHdr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CredentialsRqHdr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SubjectRole"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SvcProviderName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StartSession" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PartyKeys" minOccurs="0"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PartyRef" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SeqNum" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenCert"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenICC"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenMagCard"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenCard"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenLogin"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenKey"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenSecretAnswer"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenParty"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenObject"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenIssuedIdent"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FIIdent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CredentialsRqHdr_Type", propOrder = {
    "subjectRole",
    "svcProviderName",
    "startSession",
    "partyKeys",
    "partyRef",
    "seqNum",
    "secTokenCertOrSecTokenICCOrSecTokenMagCard",
    "fiIdent"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.CredentialsRqHdrType.class
})
public class CredentialsRqHdrType {

    @XmlElement(name = "SubjectRole", required = true)
    protected String subjectRole;
    @XmlElement(name = "SvcProviderName")
    protected String svcProviderName;
    @XmlElement(name = "StartSession")
    protected Boolean startSession;
    @XmlElementRef(name = "PartyKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PartyKeysType> partyKeys;
    @XmlElement(name = "PartyRef")
    protected PartyRefType partyRef;
    @XmlElement(name = "SeqNum")
    protected Long seqNum;
    @XmlElementRefs({
        @XmlElementRef(name = "SecTokenSecretAnswer", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SecTokenObject", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SecTokenICC", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SecTokenCard", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SecTokenKey", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SecTokenMagCard", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SecTokenIssuedIdent", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SecTokenLogin", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SecTokenParty", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SecTokenCert", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends SecTokenType>> secTokenCertOrSecTokenICCOrSecTokenMagCard;
    @XmlElement(name = "FIIdent")
    protected List<String> fiIdent;

    /**
     * Gets the value of the subjectRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectRole() {
        return subjectRole;
    }

    /**
     * Sets the value of the subjectRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectRole(String value) {
        this.subjectRole = value;
    }

    /**
     * Gets the value of the svcProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcProviderName() {
        return svcProviderName;
    }

    /**
     * Sets the value of the svcProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcProviderName(String value) {
        this.svcProviderName = value;
    }

    /**
     * Gets the value of the startSession property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartSession() {
        return startSession;
    }

    /**
     * Sets the value of the startSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartSession(Boolean value) {
        this.startSession = value;
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
     * Gets the value of the seqNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSeqNum() {
        return seqNum;
    }

    /**
     * Sets the value of the seqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSeqNum(Long value) {
        this.seqNum = value;
    }

    /**
     * Gets the value of the secTokenCertOrSecTokenICCOrSecTokenMagCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secTokenCertOrSecTokenICCOrSecTokenMagCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecTokenCertOrSecTokenICCOrSecTokenMagCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.SecTokenCardType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.SecTokenLoginType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.SecTokenSecretAnswerType }{@code >}
     * {@link JAXBElement }{@code <}{@link SecTokenMagCardType }{@code >}
     * {@link JAXBElement }{@code <}{@link SecTokenIssuedIdentType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.SecTokenLoginType }{@code >}
     * {@link JAXBElement }{@code <}{@link SecTokenCertType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.SecTokenCardType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.SecTokenSecretAnswerType }{@code >}
     * {@link JAXBElement }{@code <}{@link SecTokenObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link SecTokenICCType }{@code >}
     * {@link JAXBElement }{@code <}{@link SecTokenKeyType }{@code >}
     * {@link JAXBElement }{@code <}{@link SecTokenPartyType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends SecTokenType>> getSecTokenCertOrSecTokenICCOrSecTokenMagCard() {
        if (secTokenCertOrSecTokenICCOrSecTokenMagCard == null) {
            secTokenCertOrSecTokenICCOrSecTokenMagCard = new ArrayList<JAXBElement<? extends SecTokenType>>();
        }
        return this.secTokenCertOrSecTokenICCOrSecTokenMagCard;
    }

    /**
     * Gets the value of the fiIdent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fiIdent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFIIdent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFIIdent() {
        if (fiIdent == null) {
            fiIdent = new ArrayList<String>();
        }
        return this.fiIdent;
    }

}
