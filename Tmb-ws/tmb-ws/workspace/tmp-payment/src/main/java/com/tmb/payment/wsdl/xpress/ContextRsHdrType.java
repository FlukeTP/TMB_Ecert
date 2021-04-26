
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContextRsHdr_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextRsHdr_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}ContextRsHdr_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SecondSessKey" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}SubjectStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextRsHdr_Type", propOrder = {
    "secondSessKey",
    "subjectStatus"
})
public class ContextRsHdrType
    extends com.tmb.payment.wsdl.xpress.vo.ContextRsHdrType
{

    @XmlElement(name = "SecondSessKey")
    protected String secondSessKey;
    @XmlElement(name = "SubjectStatus")
    protected String subjectStatus;

    /**
     * Gets the value of the secondSessKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondSessKey() {
        return secondSessKey;
    }

    /**
     * Sets the value of the secondSessKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondSessKey(String value) {
        this.secondSessKey = value;
    }

    /**
     * Gets the value of the subjectStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectStatus() {
        return subjectStatus;
    }

    /**
     * Sets the value of the subjectStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectStatus(String value) {
        this.subjectStatus = value;
    }

}
