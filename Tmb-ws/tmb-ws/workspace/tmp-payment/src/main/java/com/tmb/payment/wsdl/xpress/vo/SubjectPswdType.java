
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubjectPswd_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectPswd_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CryptType"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecObjId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}Pswd"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CryptPswd"/&gt;
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
@XmlType(name = "SubjectPswd_Type", propOrder = {
    "cryptType",
    "secObjId",
    "pswd",
    "cryptPswd"
})
@XmlSeeAlso({
    SubjectPassCodeType.class
})
public class SubjectPswdType {

    @XmlElement(name = "CryptType", required = true)
    protected String cryptType;
    @XmlElement(name = "SecObjId")
    protected List<String> secObjId;
    @XmlElement(name = "Pswd")
    protected String pswd;
    @XmlElement(name = "CryptPswd")
    protected CryptPswdType cryptPswd;

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
     * Gets the value of the secObjId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secObjId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecObjId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSecObjId() {
        if (secObjId == null) {
            secObjId = new ArrayList<String>();
        }
        return this.secObjId;
    }

    /**
     * Gets the value of the pswd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPswd() {
        return pswd;
    }

    /**
     * Sets the value of the pswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPswd(String value) {
        this.pswd = value;
    }

    /**
     * Gets the value of the cryptPswd property.
     * 
     * @return
     *     possible object is
     *     {@link CryptPswdType }
     *     
     */
    public CryptPswdType getCryptPswd() {
        return cryptPswd;
    }

    /**
     * Sets the value of the cryptPswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptPswdType }
     *     
     */
    public void setCryptPswd(CryptPswdType value) {
        this.cryptPswd = value;
    }

}
