
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
 * <p>Java class for AcctTrnImgSel_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctTrnImgSel_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element ref="{urn:ifxforum-org:XSD:1}AcctTrnImgKeys"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}AcctKeys"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}CurAmtRange" minOccurs="0"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}ChkNum" minOccurs="0"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}ChkNumRange" minOccurs="0"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}DtRange" minOccurs="0"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}TrnType" minOccurs="0"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}TrnSubType" minOccurs="0"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}TrnSrc" minOccurs="0"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}RecordCountLimit" minOccurs="0"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}AcctTrnKeys" minOccurs="0"/&gt;
 *             &lt;element ref="{urn:ifxforum-org:XSD:1}RefData" minOccurs="0"/&gt;
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
@XmlType(name = "AcctTrnImgSel_Type", propOrder = {
    "acctTrnImgKeysOrAcctKeysAndCurAmtRange"
})
public class AcctTrnImgSelType {

    @XmlElementRefs({
        @XmlElementRef(name = "ChkNum", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ChkNumRange", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TrnType", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TrnSubType", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RecordCountLimit", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RefData", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DtRange", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TrnSrc", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AcctKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AcctTrnKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AcctTrnImgKeys", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CurAmtRange", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> acctTrnImgKeysOrAcctKeysAndCurAmtRange;

    /**
     * Gets the value of the acctTrnImgKeysOrAcctKeysAndCurAmtRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctTrnImgKeysOrAcctKeysAndCurAmtRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctTrnImgKeysOrAcctKeysAndCurAmtRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.AcctKeysType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.AcctKeysType }{@code >}
     * {@link JAXBElement }{@code <}{@link AcctTrnKeysType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.DtRangeType }{@code >}
     * {@link JAXBElement }{@code <}{@link AcctTrnImgKeysType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.CurAmtRangeType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.CurAmtRangeType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link ChkNumRangeType }{@code >}
     * {@link JAXBElement }{@code <}{@link TrnTypeType }{@code >}
     * {@link JAXBElement }{@code <}{@link RecordCountLimitType }{@code >}
     * {@link JAXBElement }{@code <}{@link RefDataType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.DtRangeType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getAcctTrnImgKeysOrAcctKeysAndCurAmtRange() {
        if (acctTrnImgKeysOrAcctKeysAndCurAmtRange == null) {
            acctTrnImgKeysOrAcctKeysAndCurAmtRange = new ArrayList<JAXBElement<?>>();
        }
        return this.acctTrnImgKeysOrAcctKeysAndCurAmtRange;
    }

}
