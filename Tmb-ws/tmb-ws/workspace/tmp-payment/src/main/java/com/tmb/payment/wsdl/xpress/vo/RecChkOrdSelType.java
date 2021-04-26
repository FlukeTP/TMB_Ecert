
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecChkOrdSel_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecChkOrdSel_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}RecChkOrdKeys"/&gt;
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
@XmlType(name = "RecChkOrdSel_Type", propOrder = {
    "recChkOrdKeys"
})
public class RecChkOrdSelType {

    @XmlElement(name = "RecChkOrdKeys")
    protected List<RecChkOrdKeysType> recChkOrdKeys;

    /**
     * Gets the value of the recChkOrdKeys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recChkOrdKeys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecChkOrdKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecChkOrdKeysType }
     * 
     * 
     */
    public List<RecChkOrdKeysType> getRecChkOrdKeys() {
        if (recChkOrdKeys == null) {
            recChkOrdKeys = new ArrayList<RecChkOrdKeysType>();
        }
        return this.recChkOrdKeys;
    }

}
