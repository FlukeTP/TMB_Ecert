
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChkOrdInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChkOrdInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctRef"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ChkPrint" minOccurs="0"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ChkText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}PersonData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DeliveryDestination" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Count" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkNumPrefix" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkNumStart" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkNumSuffix" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ChkBkStyleId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DeliveryMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}BillingMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CoverMngrm" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CoverStyleIdent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ArtWorkIdent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IncEndrsmntStmp" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}FontIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}OvrSigText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}IncSecSigLine" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ClubAcctIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}VoucherTypeIdent" minOccurs="0"/&gt;
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
@XmlType(name = "ChkOrdInfo_Type", propOrder = {
    "acctRef",
    "chkPrint",
    "chkText",
    "personData",
    "deliveryDestination",
    "count",
    "chkNumPrefix",
    "chkNumStart",
    "chkNumSuffix",
    "chkBkStyleId",
    "deliveryMethod",
    "billingMethod",
    "coverMngrm",
    "coverStyleIdent",
    "artWorkIdent",
    "incEndrsmntStmp",
    "fontIdent",
    "ovrSigText",
    "incSecSigLine",
    "clubAcctIdent",
    "voucherTypeIdent",
    "baseEnvr"
})
public class ChkOrdInfoType {

    @XmlElement(name = "AcctRef", required = true)
    protected AcctRefType acctRef;
    @XmlElement(name = "ChkPrint")
    protected ChkPrintType chkPrint;
    @XmlElement(name = "ChkText")
    protected List<String> chkText;
    @XmlElementRef(name = "PersonData", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.PersonDataType>> personData;
    @XmlElement(name = "DeliveryDestination")
    protected String deliveryDestination;
    @XmlElement(name = "Count")
    protected Long count;
    @XmlElement(name = "ChkNumPrefix")
    protected String chkNumPrefix;
    @XmlElement(name = "ChkNumStart")
    protected String chkNumStart;
    @XmlElement(name = "ChkNumSuffix")
    protected String chkNumSuffix;
    @XmlElement(name = "ChkBkStyleId")
    protected String chkBkStyleId;
    @XmlElement(name = "DeliveryMethod")
    protected String deliveryMethod;
    @XmlElement(name = "BillingMethod")
    @XmlSchemaType(name = "string")
    protected BillingMethodType billingMethod;
    @XmlElement(name = "CoverMngrm")
    protected List<String> coverMngrm;
    @XmlElement(name = "CoverStyleIdent")
    protected List<String> coverStyleIdent;
    @XmlElement(name = "ArtWorkIdent")
    protected List<String> artWorkIdent;
    @XmlElement(name = "IncEndrsmntStmp")
    protected Boolean incEndrsmntStmp;
    @XmlElement(name = "FontIdent")
    protected String fontIdent;
    @XmlElement(name = "OvrSigText")
    protected List<String> ovrSigText;
    @XmlElement(name = "IncSecSigLine")
    protected Boolean incSecSigLine;
    @XmlElement(name = "ClubAcctIdent")
    protected String clubAcctIdent;
    @XmlElement(name = "VoucherTypeIdent")
    protected String voucherTypeIdent;
    @XmlElement(name = "BaseEnvr")
    protected BaseEnvrType baseEnvr;

    /**
     * Gets the value of the acctRef property.
     * 
     * @return
     *     possible object is
     *     {@link AcctRefType }
     *     
     */
    public AcctRefType getAcctRef() {
        return acctRef;
    }

    /**
     * Sets the value of the acctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctRefType }
     *     
     */
    public void setAcctRef(AcctRefType value) {
        this.acctRef = value;
    }

    /**
     * Gets the value of the chkPrint property.
     * 
     * @return
     *     possible object is
     *     {@link ChkPrintType }
     *     
     */
    public ChkPrintType getChkPrint() {
        return chkPrint;
    }

    /**
     * Sets the value of the chkPrint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkPrintType }
     *     
     */
    public void setChkPrint(ChkPrintType value) {
        this.chkPrint = value;
    }

    /**
     * Gets the value of the chkText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chkText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChkText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getChkText() {
        if (chkText == null) {
            chkText = new ArrayList<String>();
        }
        return this.chkText;
    }

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
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PersonDataType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PersonDataType }{@code >}
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
     * Gets the value of the deliveryDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryDestination() {
        return deliveryDestination;
    }

    /**
     * Sets the value of the deliveryDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryDestination(String value) {
        this.deliveryDestination = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCount(Long value) {
        this.count = value;
    }

    /**
     * Gets the value of the chkNumPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkNumPrefix() {
        return chkNumPrefix;
    }

    /**
     * Sets the value of the chkNumPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkNumPrefix(String value) {
        this.chkNumPrefix = value;
    }

    /**
     * Gets the value of the chkNumStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkNumStart() {
        return chkNumStart;
    }

    /**
     * Sets the value of the chkNumStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkNumStart(String value) {
        this.chkNumStart = value;
    }

    /**
     * Gets the value of the chkNumSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkNumSuffix() {
        return chkNumSuffix;
    }

    /**
     * Sets the value of the chkNumSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkNumSuffix(String value) {
        this.chkNumSuffix = value;
    }

    /**
     * Gets the value of the chkBkStyleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkBkStyleId() {
        return chkBkStyleId;
    }

    /**
     * Sets the value of the chkBkStyleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkBkStyleId(String value) {
        this.chkBkStyleId = value;
    }

    /**
     * Gets the value of the deliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * Sets the value of the deliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryMethod(String value) {
        this.deliveryMethod = value;
    }

    /**
     * Gets the value of the billingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link BillingMethodType }
     *     
     */
    public BillingMethodType getBillingMethod() {
        return billingMethod;
    }

    /**
     * Sets the value of the billingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingMethodType }
     *     
     */
    public void setBillingMethod(BillingMethodType value) {
        this.billingMethod = value;
    }

    /**
     * Gets the value of the coverMngrm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coverMngrm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoverMngrm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCoverMngrm() {
        if (coverMngrm == null) {
            coverMngrm = new ArrayList<String>();
        }
        return this.coverMngrm;
    }

    /**
     * Gets the value of the coverStyleIdent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coverStyleIdent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoverStyleIdent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCoverStyleIdent() {
        if (coverStyleIdent == null) {
            coverStyleIdent = new ArrayList<String>();
        }
        return this.coverStyleIdent;
    }

    /**
     * Gets the value of the artWorkIdent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artWorkIdent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtWorkIdent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getArtWorkIdent() {
        if (artWorkIdent == null) {
            artWorkIdent = new ArrayList<String>();
        }
        return this.artWorkIdent;
    }

    /**
     * Gets the value of the incEndrsmntStmp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncEndrsmntStmp() {
        return incEndrsmntStmp;
    }

    /**
     * Sets the value of the incEndrsmntStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncEndrsmntStmp(Boolean value) {
        this.incEndrsmntStmp = value;
    }

    /**
     * Gets the value of the fontIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontIdent() {
        return fontIdent;
    }

    /**
     * Sets the value of the fontIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontIdent(String value) {
        this.fontIdent = value;
    }

    /**
     * Gets the value of the ovrSigText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ovrSigText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOvrSigText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOvrSigText() {
        if (ovrSigText == null) {
            ovrSigText = new ArrayList<String>();
        }
        return this.ovrSigText;
    }

    /**
     * Gets the value of the incSecSigLine property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncSecSigLine() {
        return incSecSigLine;
    }

    /**
     * Sets the value of the incSecSigLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncSecSigLine(Boolean value) {
        this.incSecSigLine = value;
    }

    /**
     * Gets the value of the clubAcctIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClubAcctIdent() {
        return clubAcctIdent;
    }

    /**
     * Sets the value of the clubAcctIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClubAcctIdent(String value) {
        this.clubAcctIdent = value;
    }

    /**
     * Gets the value of the voucherTypeIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucherTypeIdent() {
        return voucherTypeIdent;
    }

    /**
     * Sets the value of the voucherTypeIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucherTypeIdent(String value) {
        this.voucherTypeIdent = value;
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
