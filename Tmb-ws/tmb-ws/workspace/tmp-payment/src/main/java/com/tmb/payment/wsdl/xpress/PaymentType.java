
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tmb.payment.wsdl.xpress.vo.CurAmtType;


/**
 * <p>Java class for Payment_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payment_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TranAmt"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PayBy"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payment_Type", propOrder = {
    "tranAmt",
    "payBy"
})
public class PaymentType {

    @XmlElement(name = "TranAmt", required = true)
    protected CurAmtType tranAmt;
    @XmlElement(name = "PayBy", required = true)
    protected String payBy;

    /**
     * Gets the value of the tranAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurAmtType }
     *     
     */
    public CurAmtType getTranAmt() {
        return tranAmt;
    }

    /**
     * Sets the value of the tranAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAmtType }
     *     
     */
    public void setTranAmt(CurAmtType value) {
        this.tranAmt = value;
    }

    /**
     * Gets the value of the payBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayBy() {
        return payBy;
    }

    /**
     * Sets the value of the payBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayBy(String value) {
        this.payBy = value;
    }

}
