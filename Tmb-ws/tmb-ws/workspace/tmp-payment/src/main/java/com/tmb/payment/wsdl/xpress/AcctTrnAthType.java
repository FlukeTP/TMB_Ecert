
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.CreditAthRefType;


/**
 * <p>Java class for AcctTrnAth_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctTrnAth_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.fnf.com/xes}AcctTrnAthId"/&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}CreditAthRef"/&gt;
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
@XmlType(name = "AcctTrnAth_Type", propOrder = {
    "acctTrnAthId",
    "creditAthRef"
})
public class AcctTrnAthType {

    @XmlElement(name = "AcctTrnAthId")
    protected String acctTrnAthId;
    @XmlElement(name = "CreditAthRef", namespace = "urn:ifxforum-org:XSD:1")
    protected CreditAthRefType creditAthRef;

    /**
     * Gets the value of the acctTrnAthId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctTrnAthId() {
        return acctTrnAthId;
    }

    /**
     * Sets the value of the acctTrnAthId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctTrnAthId(String value) {
        this.acctTrnAthId = value;
    }

    /**
     * Gets the value of the creditAthRef property.
     * 
     * @return
     *     possible object is
     *     {@link CreditAthRefType }
     *     
     */
    public CreditAthRefType getCreditAthRef() {
        return creditAthRef;
    }

    /**
     * Sets the value of the creditAthRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditAthRefType }
     *     
     */
    public void setCreditAthRef(CreditAthRefType value) {
        this.creditAthRef = value;
    }

}
