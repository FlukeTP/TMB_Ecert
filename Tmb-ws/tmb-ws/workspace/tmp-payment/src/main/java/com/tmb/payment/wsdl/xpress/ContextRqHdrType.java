
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContextRqHdr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextRqHdr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}ContextRqHdr_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TrnRefIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SecondSessKey" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenLogin" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextRqHdr_Type", propOrder = {
    "trnRefIdent",
    "secondSessKey",
    "secTokenLogin"
})
public class ContextRqHdrType
    extends com.tmb.payment.wsdl.xpress.vo.ContextRqHdrType
{

    @XmlElement(name = "TrnRefIdent")
    protected String trnRefIdent;
    @XmlElement(name = "SecondSessKey")
    protected String secondSessKey;
    @XmlElementRef(name = "SecTokenLogin", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.SecTokenLoginType> secTokenLogin;

    /**
     * Gets the value of the trnRefIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnRefIdent() {
        return trnRefIdent;
    }

    /**
     * Sets the value of the trnRefIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnRefIdent(String value) {
        this.trnRefIdent = value;
    }

    /**
     * Gets the value of the secondSessKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondSessKey() {
        return secondSessKey;
    }

    /**
     * Sets the value of the secondSessKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondSessKey(String value) {
        this.secondSessKey = value;
    }

    /**
     * Gets the value of the secTokenLogin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.SecTokenLoginType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.SecTokenLoginType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.SecTokenLoginType> getSecTokenLogin() {
        return secTokenLogin;
    }

    /**
     * Sets the value of the secTokenLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.SecTokenLoginType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.SecTokenLoginType }{@code >}
     *     
     */
    public void setSecTokenLogin(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.SecTokenLoginType> value) {
        this.secTokenLogin = value;
    }

}
