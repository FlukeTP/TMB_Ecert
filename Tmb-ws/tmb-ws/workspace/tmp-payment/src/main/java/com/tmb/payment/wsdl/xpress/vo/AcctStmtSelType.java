
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctStmtSel_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctStmtSel_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}AcctStmtKeys"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}AcctKeys" minOccurs="0"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}PartyKeys" minOccurs="0"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}DtRange" minOccurs="0"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}StmtType" minOccurs="0"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}StmtGroup" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
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
@XmlType(name = "AcctStmtSel_Type", propOrder = {
    "acctStmtKeysOrAcctKeysAndPartyKeys"
})
public class AcctStmtSelType {

    @XmlElementRefs({
        @XmlElementRef(name = "StmtGroup", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DtRange", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "StmtType", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AcctStmtKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PartyKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AcctKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> acctStmtKeysOrAcctKeysAndPartyKeys;

    /**
     * Gets the value of the acctStmtKeysOrAcctKeysAndPartyKeys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctStmtKeysOrAcctKeysAndPartyKeys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctStmtKeysOrAcctKeysAndPartyKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.PartyKeysType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.DtRangeType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctKeysType }{@code >}
     * {@link JAXBElement }{@code <}{@link AcctStmtKeysType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.PartyKeysType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctKeysType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.DtRangeType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getAcctStmtKeysOrAcctKeysAndPartyKeys() {
        if (acctStmtKeysOrAcctKeysAndPartyKeys == null) {
            acctStmtKeysOrAcctKeysAndPartyKeys = new ArrayList<JAXBElement<?>>();
        }
        return this.acctStmtKeysOrAcctKeysAndPartyKeys;
    }

}
