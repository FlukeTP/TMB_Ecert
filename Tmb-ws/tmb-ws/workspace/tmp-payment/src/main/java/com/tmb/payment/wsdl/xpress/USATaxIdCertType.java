
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USA.TaxIdCert_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USA.TaxIdCert_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}USA.TaxIdCert_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}ElectronicInd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}TaxClassCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}Memo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USA.TaxIdCert_Type", propOrder = {
    "electronicInd",
    "taxClassCode",
    "memo"
})
public class USATaxIdCertType
    extends com.tmb.payment.wsdl.xpress.vo.USATaxIdCertType
{

    @XmlElement(name = "ElectronicInd")
    protected Boolean electronicInd;
    @XmlElement(name = "TaxClassCode")
    protected String taxClassCode;
    @XmlElement(name = "Memo", namespace = "urn:ifxforum-org:XSD:1")
    protected String memo;

    /**
     * Gets the value of the electronicInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isElectronicInd() {
        return electronicInd;
    }

    /**
     * Sets the value of the electronicInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setElectronicInd(Boolean value) {
        this.electronicInd = value;
    }

    /**
     * Gets the value of the taxClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxClassCode() {
        return taxClassCode;
    }

    /**
     * Sets the value of the taxClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxClassCode(String value) {
        this.taxClassCode = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

}
