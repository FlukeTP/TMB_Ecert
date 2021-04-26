
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankSvcChkSumSel_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankSvcChkSumSel_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}BankSvcChkSumKeys"/&gt;
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
@XmlType(name = "BankSvcChkSumSel_Type", propOrder = {
    "bankSvcChkSumKeys"
})
public class BankSvcChkSumSelType {

    @XmlElement(name = "BankSvcChkSumKeys")
    protected List<BankSvcChkSumKeysType> bankSvcChkSumKeys;

    /**
     * Gets the value of the bankSvcChkSumKeys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankSvcChkSumKeys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankSvcChkSumKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankSvcChkSumKeysType }
     * 
     * 
     */
    public List<BankSvcChkSumKeysType> getBankSvcChkSumKeys() {
        if (bankSvcChkSumKeys == null) {
            bankSvcChkSumKeys = new ArrayList<BankSvcChkSumKeysType>();
        }
        return this.bankSvcChkSumKeys;
    }

}
