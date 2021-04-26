
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostingSessionSel_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostingSessionSel_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}PostingSessionKeys"/&gt;
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
@XmlType(name = "PostingSessionSel_Type", propOrder = {
    "postingSessionKeys"
})
public class PostingSessionSelType {

    @XmlElement(name = "PostingSessionKeys")
    protected List<PostingSessionKeysType> postingSessionKeys;

    /**
     * Gets the value of the postingSessionKeys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postingSessionKeys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostingSessionKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostingSessionKeysType }
     * 
     * 
     */
    public List<PostingSessionKeysType> getPostingSessionKeys() {
        if (postingSessionKeys == null) {
            postingSessionKeys = new ArrayList<PostingSessionKeysType>();
        }
        return this.postingSessionKeys;
    }

}
