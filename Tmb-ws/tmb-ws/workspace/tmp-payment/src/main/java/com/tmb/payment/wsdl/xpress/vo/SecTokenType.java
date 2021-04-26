
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecToken_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecToken_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecToken_Type")
@XmlSeeAlso({
    SecTokenLoginType.class,
    SecTokenSecretAnswerType.class,
    SecTokenCardType.class,
    SecTokenCertType.class,
    SecTokenICCType.class,
    SecTokenIssuedIdentType.class,
    SecTokenKeyType.class,
    SecTokenMagCardType.class,
    SecTokenObjectType.class,
    SecTokenPartyType.class
})
public class SecTokenType {


}
