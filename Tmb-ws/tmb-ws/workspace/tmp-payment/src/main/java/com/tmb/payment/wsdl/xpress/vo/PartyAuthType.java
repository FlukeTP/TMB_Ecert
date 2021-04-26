
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyAuth_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyAuth_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenCert" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenICC" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenMagCard" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenCard" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenLogin" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenKey" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenSecretAnswer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenObject" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenIssuedIdent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyAuth_Type", propOrder = {
    "secTokenCertAndSecTokenICCAndSecTokenMagCard"
})
@XmlSeeAlso({
    com.tmb.payment.wsdl.xpress.PartyAuthType.class
})
public class PartyAuthType {

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
    protected List<JAXBElement<? extends SecTokenType>> secTokenCertAndSecTokenICCAndSecTokenMagCard;

    /**
     * Gets the value of the secTokenCertAndSecTokenICCAndSecTokenMagCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secTokenCertAndSecTokenICCAndSecTokenMagCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecTokenCertAndSecTokenICCAndSecTokenMagCard().add(newItem);
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
    public List<JAXBElement<? extends SecTokenType>> getSecTokenCertAndSecTokenICCAndSecTokenMagCard() {
        if (secTokenCertAndSecTokenICCAndSecTokenMagCard == null) {
            secTokenCertAndSecTokenICCAndSecTokenMagCard = new ArrayList<JAXBElement<? extends SecTokenType>>();
        }
        return this.secTokenCertAndSecTokenICCAndSecTokenMagCard;
    }

}
