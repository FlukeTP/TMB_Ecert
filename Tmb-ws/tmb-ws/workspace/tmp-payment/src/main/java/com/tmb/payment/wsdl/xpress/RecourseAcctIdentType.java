
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.AcctIdentType;
import com.tmb.payment.wsdl.xpress.vo.AcctTypeType;


/**
 * <p>Java class for RecourseAcctIdent_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecourseAcctIdent_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}AcctIdent"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RecourseAcctType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecourseAcctIdent_Type", propOrder = {
    "acctIdent",
    "recourseAcctType"
})
public class RecourseAcctIdentType {

    @XmlElement(name = "AcctIdent", namespace = "urn:ifxforum-org:XSD:1", required = true)
    protected AcctIdentType acctIdent;
    @XmlElement(name = "RecourseAcctType")
    protected AcctTypeType recourseAcctType;

    /**
     * Gets the value of the acctIdent property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdentType }
     *     
     */
    public AcctIdentType getAcctIdent() {
        return acctIdent;
    }

    /**
     * Sets the value of the acctIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdentType }
     *     
     */
    public void setAcctIdent(AcctIdentType value) {
        this.acctIdent = value;
    }

    /**
     * Gets the value of the recourseAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeType }
     *     
     */
    public AcctTypeType getRecourseAcctType() {
        return recourseAcctType;
    }

    /**
     * Sets the value of the recourseAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeType }
     *     
     */
    public void setRecourseAcctType(AcctTypeType value) {
        this.recourseAcctType = value;
    }

}
