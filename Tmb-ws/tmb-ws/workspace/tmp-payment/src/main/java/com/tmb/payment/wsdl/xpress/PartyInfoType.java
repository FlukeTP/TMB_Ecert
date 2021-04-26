
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}PartyInfo_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}W8Certification" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}W9UserCert" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PartyAdditionalInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyInfo_Type", propOrder = {
    "w8Certification",
    "w9UserCert",
    "partyAdditionalInfo"
})
public class PartyInfoType
    extends com.tmb.payment.wsdl.xpress.vo.PartyInfoType
{

    @XmlElement(name = "W8Certification")
    protected W8CertificationType w8Certification;
    @XmlElement(name = "W9UserCert")
    protected W9UserCertType w9UserCert;
    @XmlElement(name = "PartyAdditionalInfo")
    protected PartyAdditionalInfoType partyAdditionalInfo;

    /**
     * Gets the value of the w8Certification property.
     * 
     * @return
     *     possible object is
     *     {@link W8CertificationType }
     *     
     */
    public W8CertificationType getW8Certification() {
        return w8Certification;
    }

    /**
     * Sets the value of the w8Certification property.
     * 
     * @param value
     *     allowed object is
     *     {@link W8CertificationType }
     *     
     */
    public void setW8Certification(W8CertificationType value) {
        this.w8Certification = value;
    }

    /**
     * Gets the value of the w9UserCert property.
     * 
     * @return
     *     possible object is
     *     {@link W9UserCertType }
     *     
     */
    public W9UserCertType getW9UserCert() {
        return w9UserCert;
    }

    /**
     * Sets the value of the w9UserCert property.
     * 
     * @param value
     *     allowed object is
     *     {@link W9UserCertType }
     *     
     */
    public void setW9UserCert(W9UserCertType value) {
        this.w9UserCert = value;
    }

    /**
     * Gets the value of the partyAdditionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAdditionalInfoType }
     *     
     */
    public PartyAdditionalInfoType getPartyAdditionalInfo() {
        return partyAdditionalInfo;
    }

    /**
     * Sets the value of the partyAdditionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAdditionalInfoType }
     *     
     */
    public void setPartyAdditionalInfo(PartyAdditionalInfoType value) {
        this.partyAdditionalInfo = value;
    }

}
