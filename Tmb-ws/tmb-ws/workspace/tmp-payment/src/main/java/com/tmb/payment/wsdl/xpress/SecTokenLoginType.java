
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.SubjectPswdType;


/**
 * <p>Java class for SecTokenLogin_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecTokenLogin_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}SecTokenLogin_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OldSubjectPswd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PswdHint" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PswdResetValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecTokenLogin_Type", propOrder = {
    "oldSubjectPswd",
    "pswdHint",
    "pswdResetValue"
})
public class SecTokenLoginType
    extends com.tmb.payment.wsdl.xpress.vo.SecTokenLoginType
{

    @XmlElement(name = "OldSubjectPswd")
    protected SubjectPswdType oldSubjectPswd;
    @XmlElement(name = "PswdHint")
    protected String pswdHint;
    @XmlElement(name = "PswdResetValue")
    protected String pswdResetValue;

    /**
     * Gets the value of the oldSubjectPswd property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectPswdType }
     *     
     */
    public SubjectPswdType getOldSubjectPswd() {
        return oldSubjectPswd;
    }

    /**
     * Sets the value of the oldSubjectPswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectPswdType }
     *     
     */
    public void setOldSubjectPswd(SubjectPswdType value) {
        this.oldSubjectPswd = value;
    }

    /**
     * Gets the value of the pswdHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPswdHint() {
        return pswdHint;
    }

    /**
     * Sets the value of the pswdHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPswdHint(String value) {
        this.pswdHint = value;
    }

    /**
     * Gets the value of the pswdResetValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPswdResetValue() {
        return pswdResetValue;
    }

    /**
     * Sets the value of the pswdResetValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPswdResetValue(String value) {
        this.pswdResetValue = value;
    }

}
