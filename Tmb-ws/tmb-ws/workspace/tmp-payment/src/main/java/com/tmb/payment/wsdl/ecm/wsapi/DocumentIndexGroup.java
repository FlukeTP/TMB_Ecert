
package com.tmb.payment.wsdl.ecm.wsapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for documentIndexGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="documentIndexGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="no" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="documentIndexs" type="{http://wsapi.svc.ecm.clevel.com/}documentIndex" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentIndexGroup", propOrder = {
    "no",
    "documentIndexs"
})
public class DocumentIndexGroup {

    protected int no;
    protected List<DocumentIndex> documentIndexs;

    /**
     * Gets the value of the no property.
     * 
     */
    public int getNo() {
        return no;
    }

    /**
     * Sets the value of the no property.
     * 
     */
    public void setNo(int value) {
        this.no = value;
    }

    /**
     * Gets the value of the documentIndexs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentIndexs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentIndexs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentIndex }
     * 
     * 
     */
    public List<DocumentIndex> getDocumentIndexs() {
        if (documentIndexs == null) {
            documentIndexs = new ArrayList<DocumentIndex>();
        }
        return this.documentIndexs;
    }

}
