
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditMediaChkData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditMediaChkData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}CreditMediaChkData_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PrintOption" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AcctHoldRef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditMediaChkData_Type", propOrder = {
    "printOption",
    "acctHoldRef"
})
public class CreditMediaChkDataType
    extends com.tmb.payment.wsdl.xpress.vo.CreditMediaChkDataType
{

    @XmlElement(name = "PrintOption")
    protected String printOption;
    @XmlElement(name = "AcctHoldRef")
    protected List<AcctHoldRefType> acctHoldRef;

    /**
     * Gets the value of the printOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintOption() {
        return printOption;
    }

    /**
     * Sets the value of the printOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintOption(String value) {
        this.printOption = value;
    }

    /**
     * Gets the value of the acctHoldRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctHoldRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctHoldRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctHoldRefType }
     * 
     * 
     */
    public List<AcctHoldRefType> getAcctHoldRef() {
        if (acctHoldRef == null) {
            acctHoldRef = new ArrayList<AcctHoldRefType>();
        }
        return this.acctHoldRef;
    }

}
