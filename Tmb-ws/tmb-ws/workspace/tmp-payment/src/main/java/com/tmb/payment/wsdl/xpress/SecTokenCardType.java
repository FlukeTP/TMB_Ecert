
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SecTokenCard_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecTokenCard_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}SecTokenCard_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PINBlock" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CVV2Ind" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BirthDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IssuedIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PINOffset" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CryptType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}CardVrfyDataBlock" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}NewPIN" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecTokenCard_Type", propOrder = {
    "pinBlock",
    "cvv2Ind",
    "birthDt",
    "issuedIdent",
    "pinOffset",
    "cryptType",
    "cardVrfyDataBlock",
    "newPIN"
})
public class SecTokenCardType
    extends com.tmb.payment.wsdl.xpress.vo.SecTokenCardType
{

    @XmlElement(name = "PINBlock", namespace = "urn:ifxforum-org:XSD:1")
    protected String pinBlock;
    @XmlElement(name = "CVV2Ind")
    protected String cvv2Ind;
    @XmlElement(name = "BirthDt", namespace = "urn:ifxforum-org:XSD:1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDt;
    @XmlElementRef(name = "IssuedIdent", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.IssuedIdentType> issuedIdent;
    @XmlElement(name = "PINOffset")
    protected String pinOffset;
    @XmlElement(name = "CryptType", namespace = "urn:ifxforum-org:XSD:1")
    protected String cryptType;
    @XmlElement(name = "CardVrfyDataBlock")
    protected CardVrfyDataBlockType cardVrfyDataBlock;
    @XmlElement(name = "NewPIN")
    protected String newPIN;

    /**
     * Gets the value of the pinBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPINBlock() {
        return pinBlock;
    }

    /**
     * Sets the value of the pinBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPINBlock(String value) {
        this.pinBlock = value;
    }

    /**
     * Gets the value of the cvv2Ind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVV2Ind() {
        return cvv2Ind;
    }

    /**
     * Sets the value of the cvv2Ind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVV2Ind(String value) {
        this.cvv2Ind = value;
    }

    /**
     * Gets the value of the birthDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDt() {
        return birthDt;
    }

    /**
     * Sets the value of the birthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDt(XMLGregorianCalendar value) {
        this.birthDt = value;
    }

    /**
     * Gets the value of the issuedIdent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.IssuedIdentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.IssuedIdentType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.IssuedIdentType> getIssuedIdent() {
        return issuedIdent;
    }

    /**
     * Sets the value of the issuedIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.IssuedIdentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.IssuedIdentType }{@code >}
     *     
     */
    public void setIssuedIdent(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.IssuedIdentType> value) {
        this.issuedIdent = value;
    }

    /**
     * Gets the value of the pinOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPINOffset() {
        return pinOffset;
    }

    /**
     * Sets the value of the pinOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPINOffset(String value) {
        this.pinOffset = value;
    }

    /**
     * Gets the value of the cryptType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCryptType() {
        return cryptType;
    }

    /**
     * Sets the value of the cryptType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCryptType(String value) {
        this.cryptType = value;
    }

    /**
     * Gets the value of the cardVrfyDataBlock property.
     * 
     * @return
     *     possible object is
     *     {@link CardVrfyDataBlockType }
     *     
     */
    public CardVrfyDataBlockType getCardVrfyDataBlock() {
        return cardVrfyDataBlock;
    }

    /**
     * Sets the value of the cardVrfyDataBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardVrfyDataBlockType }
     *     
     */
    public void setCardVrfyDataBlock(CardVrfyDataBlockType value) {
        this.cardVrfyDataBlock = value;
    }

    /**
     * Gets the value of the newPIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPIN() {
        return newPIN;
    }

    /**
     * Sets the value of the newPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPIN(String value) {
        this.newPIN = value;
    }

}
