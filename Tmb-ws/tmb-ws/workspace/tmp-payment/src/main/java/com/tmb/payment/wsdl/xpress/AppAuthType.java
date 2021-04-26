
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppAuth_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppAuth_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SecTokenSecretAnswer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppAuth_Type", propOrder = {
    "secTokenSecretAnswer"
})
public class AppAuthType {

    @XmlElementRef(name = "SecTokenSecretAnswer", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.SecTokenSecretAnswerType> secTokenSecretAnswer;

    /**
     * Gets the value of the secTokenSecretAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.SecTokenSecretAnswerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.SecTokenSecretAnswerType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.SecTokenSecretAnswerType> getSecTokenSecretAnswer() {
        return secTokenSecretAnswer;
    }

    /**
     * Sets the value of the secTokenSecretAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.SecTokenSecretAnswerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.SecTokenSecretAnswerType }{@code >}
     *     
     */
    public void setSecTokenSecretAnswer(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.SecTokenSecretAnswerType> value) {
        this.secTokenSecretAnswer = value;
    }

}
