
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SPRefIdCorrect_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SPRefIdCorrect_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}SPRefIdent"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CorrectAction"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SPRefIdCorrect_Type", propOrder = {
    "spRefIdent",
    "correctAction"
})
public class SPRefIdCorrectType {

    @XmlElement(name = "SPRefIdent", required = true)
    protected String spRefIdent;
    @XmlElement(name = "CorrectAction", required = true)
    @XmlSchemaType(name = "string")
    protected CorrectActionType correctAction;

    /**
     * Gets the value of the spRefIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPRefIdent() {
        return spRefIdent;
    }

    /**
     * Sets the value of the spRefIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPRefIdent(String value) {
        this.spRefIdent = value;
    }

    /**
     * Gets the value of the correctAction property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectActionType }
     *     
     */
    public CorrectActionType getCorrectAction() {
        return correctAction;
    }

    /**
     * Sets the value of the correctAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectActionType }
     *     
     */
    public void setCorrectAction(CorrectActionType value) {
        this.correctAction = value;
    }

}
