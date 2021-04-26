
package com.tmb.payment.wsdl.xpress;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyPartyRelInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyPartyRelInfo_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}PartyPartyRelInfo_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PartyTier" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}OwnerPercent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ContactInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}PartyPartyRelMiscData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyPartyRelInfo_Type", propOrder = {
    "partyTier",
    "ownerPercent",
    "contactInd",
    "partyPartyRelMiscData"
})
public class PartyPartyRelInfoType
    extends com.tmb.payment.wsdl.xpress.vo.PartyPartyRelInfoType
{

    @XmlElement(name = "PartyTier")
    protected String partyTier;
    @XmlElement(name = "OwnerPercent")
    protected BigDecimal ownerPercent;
    @XmlElement(name = "ContactInd")
    protected Boolean contactInd;
    @XmlElement(name = "PartyPartyRelMiscData")
    protected List<PartyPartyRelMiscDataType> partyPartyRelMiscData;

    /**
     * Gets the value of the partyTier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyTier() {
        return partyTier;
    }

    /**
     * Sets the value of the partyTier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyTier(String value) {
        this.partyTier = value;
    }

    /**
     * Gets the value of the ownerPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOwnerPercent() {
        return ownerPercent;
    }

    /**
     * Sets the value of the ownerPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOwnerPercent(BigDecimal value) {
        this.ownerPercent = value;
    }

    /**
     * Gets the value of the contactInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContactInd() {
        return contactInd;
    }

    /**
     * Sets the value of the contactInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContactInd(Boolean value) {
        this.contactInd = value;
    }

    /**
     * Gets the value of the partyPartyRelMiscData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyPartyRelMiscData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyPartyRelMiscData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyPartyRelMiscDataType }
     * 
     * 
     */
    public List<PartyPartyRelMiscDataType> getPartyPartyRelMiscData() {
        if (partyPartyRelMiscData == null) {
            partyPartyRelMiscData = new ArrayList<PartyPartyRelMiscDataType>();
        }
        return this.partyPartyRelMiscData;
    }

}
