
package com.tmb.payment.wsdl.xpress.vo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaAcctEnvr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaAcctEnvr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}BaseEnvr_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}DefaultDrawerInd" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}MediaAcctSummary" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}ActionSummary" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaAcctEnvr_Type", propOrder = {
    "defaultDrawerInd",
    "mediaAcctSummary",
    "actionSummary"
})
public class MediaAcctEnvrType
    extends BaseEnvrType
{

    @XmlElement(name = "DefaultDrawerInd")
    protected Boolean defaultDrawerInd;
    @XmlElementRef(name = "MediaAcctSummary", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.MediaAcctSummaryType>> mediaAcctSummary;
    @XmlElement(name = "ActionSummary")
    protected List<ActionSummaryType> actionSummary;

    /**
     * Gets the value of the defaultDrawerInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultDrawerInd() {
        return defaultDrawerInd;
    }

    /**
     * Sets the value of the defaultDrawerInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultDrawerInd(Boolean value) {
        this.defaultDrawerInd = value;
    }

    /**
     * Gets the value of the mediaAcctSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaAcctSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaAcctSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.MediaAcctSummaryType }{@code >}
     * {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.MediaAcctSummaryType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.MediaAcctSummaryType>> getMediaAcctSummary() {
        if (mediaAcctSummary == null) {
            mediaAcctSummary = new ArrayList<JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.MediaAcctSummaryType>>();
        }
        return this.mediaAcctSummary;
    }

    /**
     * Gets the value of the actionSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionSummaryType }
     * 
     * 
     */
    public List<ActionSummaryType> getActionSummary() {
        if (actionSummary == null) {
            actionSummary = new ArrayList<ActionSummaryType>();
        }
        return this.actionSummary;
    }

}
