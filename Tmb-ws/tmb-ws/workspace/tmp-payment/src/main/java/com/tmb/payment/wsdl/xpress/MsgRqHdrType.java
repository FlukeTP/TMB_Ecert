
package com.tmb.payment.wsdl.xpress;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MsgRqHdr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MsgRqHdr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}MsgRqHdr_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}DvcRqHdr" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}RuleData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SvcIdent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MsgRqHdr_Type", propOrder = {
    "dvcRqHdr",
    "ruleData",
    "svcIdent"
})
public class MsgRqHdrType
    extends com.tmb.payment.wsdl.xpress.vo.MsgRqHdrType
{

    @XmlElement(name = "DvcRqHdr")
    protected DvcRqHdrType dvcRqHdr;
    @XmlElement(name = "RuleData")
    protected List<RuleDataType> ruleData;
    @XmlElement(name = "SvcIdent")
    protected SvcIdentType svcIdent;

    /**
     * Gets the value of the dvcRqHdr property.
     * 
     * @return
     *     possible object is
     *     {@link DvcRqHdrType }
     *     
     */
    public DvcRqHdrType getDvcRqHdr() {
        return dvcRqHdr;
    }

    /**
     * Sets the value of the dvcRqHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DvcRqHdrType }
     *     
     */
    public void setDvcRqHdr(DvcRqHdrType value) {
        this.dvcRqHdr = value;
    }

    /**
     * Gets the value of the ruleData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuleData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuleDataType }
     * 
     * 
     */
    public List<RuleDataType> getRuleData() {
        if (ruleData == null) {
            ruleData = new ArrayList<RuleDataType>();
        }
        return this.ruleData;
    }

    /**
     * Gets the value of the svcIdent property.
     * 
     * @return
     *     possible object is
     *     {@link SvcIdentType }
     *     
     */
    public SvcIdentType getSvcIdent() {
        return svcIdent;
    }

    /**
     * Sets the value of the svcIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcIdentType }
     *     
     */
    public void setSvcIdent(SvcIdentType value) {
        this.svcIdent = value;
    }

}
