
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForExQuoteSel_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForExQuoteSel_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}ForExQuoteKeys"/&gt;
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
@XmlType(name = "ForExQuoteSel_Type", propOrder = {
    "forExQuoteKeys"
})
public class ForExQuoteSelType {

    @XmlElement(name = "ForExQuoteKeys")
    protected List<ForExQuoteKeysType> forExQuoteKeys;

    /**
     * Gets the value of the forExQuoteKeys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forExQuoteKeys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForExQuoteKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForExQuoteKeysType }
     * 
     * 
     */
    public List<ForExQuoteKeysType> getForExQuoteKeys() {
        if (forExQuoteKeys == null) {
            forExQuoteKeys = new ArrayList<ForExQuoteKeysType>();
        }
        return this.forExQuoteKeys;
    }

}
