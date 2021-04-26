
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
import com.tmb.payment.wsdl.xpress.AcctHoldAuthType;
import com.tmb.payment.wsdl.xpress.AlertAuthType;
import com.tmb.payment.wsdl.xpress.AnyIDRegisterAuthType;
import com.tmb.payment.wsdl.xpress.BillPmtAuthType;
import com.tmb.payment.wsdl.xpress.OfferAuthType;
import com.tmb.payment.wsdl.xpress.PmtAuthType;
import com.tmb.payment.wsdl.xpress.StmtGrpAuthType;
import com.tmb.payment.wsdl.xpress.TaxDeferredPlanAuthType;


/**
 * <p>Java class for BaseAuth_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseAuth_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;choice&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenCert"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenICC"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenMagCard"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenCard"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenLogin" maxOccurs="unbounded"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenKey"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenSecretAnswer" maxOccurs="unbounded"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenParty"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenObject"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenIssuedIdent"/&gt;
 *           &lt;/choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ResetAuth"/&gt;
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
@XmlType(name = "BaseAuth_Type", propOrder = {
    "secTokenCert",
    "secTokenICC",
    "secTokenMagCard",
    "secTokenCard",
    "secTokenLogin",
    "secTokenKey",
    "secTokenSecretAnswer",
    "secTokenParty",
    "secTokenObject",
    "secTokenIssuedIdent",
    "resetAuth"
})
@XmlSeeAlso({
    OfferAuthType.class,
    AlertAuthType.class,
    StmtGrpAuthType.class,
    CardAuthType.class,
    TaxDeferredPlanAuthType.class,
    AcctHoldAuthType.class,
    PmtAuthType.class,
    BillPmtAuthType.class,
    AnyIDRegisterAuthType.class,
    ChkIssueAuthType.class,
    ForExRateSheetAuthType.class,
    RecXferAuthType.class,
    XferAuthType.class,
    AcctAuthType.class,
    AcctTrnAuthType.class,
    CardAcctRelAuthType.class,
    CreditAuthType.class,
    MediaAcctAuthType.class,
    PartyPartyRelAuthType.class,
    StopChkAuthType.class,
    PartyAcctRelAuthType.class,
    PartyCardRelAuthType.class,
    ForExQuoteAuthType.class,
    XxxAuthType.class
})
public class BaseAuthType {

    @XmlElement(name = "SecTokenCert")
    protected SecTokenCertType secTokenCert;
    @XmlElement(name = "SecTokenICC")
    protected SecTokenICCType secTokenICC;
    @XmlElement(name = "SecTokenMagCard")
    protected SecTokenMagCardType secTokenMagCard;
    @XmlElementRef(name = "SecTokenCard", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.SecTokenCardType> secTokenCard;
    @XmlElementRef(name = "SecTokenLogin", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.SecTokenLoginType>> secTokenLogin;
    @XmlElement(name = "SecTokenKey")
    protected SecTokenKeyType secTokenKey;
    @XmlElementRef(name = "SecTokenSecretAnswer", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.SecTokenSecretAnswerType>> secTokenSecretAnswer;
    @XmlElement(name = "SecTokenParty")
    protected SecTokenPartyType secTokenParty;
    @XmlElement(name = "SecTokenObject")
    protected SecTokenObjectType secTokenObject;
    @XmlElement(name = "SecTokenIssuedIdent")
    protected SecTokenIssuedIdentType secTokenIssuedIdent;
    @XmlElement(name = "ResetAuth")
    protected String resetAuth;

    /**
     * Gets the value of the secTokenCert property.
     * 
     * @return
     *     possible object is
     *     {@link SecTokenCertType }
     *     
     */
    public SecTokenCertType getSecTokenCert() {
        return secTokenCert;
    }

    /**
     * Sets the value of the secTokenCert property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecTokenCertType }
     *     
     */
    public void setSecTokenCert(SecTokenCertType value) {
        this.secTokenCert = value;
    }

    /**
     * Gets the value of the secTokenICC property.
     * 
     * @return
     *     possible object is
     *     {@link SecTokenICCType }
     *     
     */
    public SecTokenICCType getSecTokenICC() {
        return secTokenICC;
    }

    /**
     * Sets the value of the secTokenICC property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecTokenICCType }
     *     
     */
    public void setSecTokenICC(SecTokenICCType value) {
        this.secTokenICC = value;
    }

    /**
     * Gets the value of the secTokenMagCard property.
     * 
     * @return
     *     possible object is
     *     {@link SecTokenMagCardType }
     *     
     */
    public SecTokenMagCardType getSecTokenMagCard() {
        return secTokenMagCard;
    }

    /**
     * Sets the value of the secTokenMagCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecTokenMagCardType }
     *     
     */
    public void setSecTokenMagCard(SecTokenMagCardType value) {
        this.secTokenMagCard = value;
    }

    /**
     * Gets the value of the secTokenCard property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.SecTokenCardType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.SecTokenCardType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.SecTokenCardType> getSecTokenCard() {
        return secTokenCard;
    }

    /**
     * Sets the value of the secTokenCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.SecTokenCardType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.SecTokenCardType }{@code >}
     *     
     */
    public void setSecTokenCard(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.SecTokenCardType> value) {
        this.secTokenCard = value;
    }

    /**
     * Gets the value of the secTokenLogin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secTokenLogin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecTokenLogin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.SecTokenLoginType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.SecTokenLoginType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.SecTokenLoginType>> getSecTokenLogin() {
        if (secTokenLogin == null) {
            secTokenLogin = new ArrayList<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.SecTokenLoginType>>();
        }
        return this.secTokenLogin;
    }

    /**
     * Gets the value of the secTokenKey property.
     * 
     * @return
     *     possible object is
     *     {@link SecTokenKeyType }
     *     
     */
    public SecTokenKeyType getSecTokenKey() {
        return secTokenKey;
    }

    /**
     * Sets the value of the secTokenKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecTokenKeyType }
     *     
     */
    public void setSecTokenKey(SecTokenKeyType value) {
        this.secTokenKey = value;
    }

    /**
     * Gets the value of the secTokenSecretAnswer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secTokenSecretAnswer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecTokenSecretAnswer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.SecTokenSecretAnswerType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.SecTokenSecretAnswerType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.SecTokenSecretAnswerType>> getSecTokenSecretAnswer() {
        if (secTokenSecretAnswer == null) {
            secTokenSecretAnswer = new ArrayList<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.SecTokenSecretAnswerType>>();
        }
        return this.secTokenSecretAnswer;
    }

    /**
     * Gets the value of the secTokenParty property.
     * 
     * @return
     *     possible object is
     *     {@link SecTokenPartyType }
     *     
     */
    public SecTokenPartyType getSecTokenParty() {
        return secTokenParty;
    }

    /**
     * Sets the value of the secTokenParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecTokenPartyType }
     *     
     */
    public void setSecTokenParty(SecTokenPartyType value) {
        this.secTokenParty = value;
    }

    /**
     * Gets the value of the secTokenObject property.
     * 
     * @return
     *     possible object is
     *     {@link SecTokenObjectType }
     *     
     */
    public SecTokenObjectType getSecTokenObject() {
        return secTokenObject;
    }

    /**
     * Sets the value of the secTokenObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecTokenObjectType }
     *     
     */
    public void setSecTokenObject(SecTokenObjectType value) {
        this.secTokenObject = value;
    }

    /**
     * Gets the value of the secTokenIssuedIdent property.
     * 
     * @return
     *     possible object is
     *     {@link SecTokenIssuedIdentType }
     *     
     */
    public SecTokenIssuedIdentType getSecTokenIssuedIdent() {
        return secTokenIssuedIdent;
    }

    /**
     * Sets the value of the secTokenIssuedIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecTokenIssuedIdentType }
     *     
     */
    public void setSecTokenIssuedIdent(SecTokenIssuedIdentType value) {
        this.secTokenIssuedIdent = value;
    }

    /**
     * Gets the value of the resetAuth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResetAuth() {
        return resetAuth;
    }

    /**
     * Sets the value of the resetAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResetAuth(String value) {
        this.resetAuth = value;
    }

}
