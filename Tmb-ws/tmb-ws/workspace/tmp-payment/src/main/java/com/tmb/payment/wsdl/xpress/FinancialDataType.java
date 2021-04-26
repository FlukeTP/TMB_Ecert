
package com.tmb.payment.wsdl.xpress;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FinancialData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialData_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:ifxforum-org:XSD:1}FinancialData_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}StmtIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}StmtDesc" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FinancialDataIdent" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}StmtType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StmtDt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}CurAmtRange" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}AmtRangeCd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.fnf.com/xes}FinancialSrc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialData_Type", propOrder = {
    "stmtIdent",
    "stmtDesc",
    "financialDataIdent",
    "stmtType",
    "stmtDt",
    "curAmtRange",
    "amtRangeCd",
    "financialSrc"
})
public class FinancialDataType
    extends com.tmb.payment.wsdl.xpress.vo.FinancialDataType
{

    @XmlElement(name = "StmtIdent")
    protected String stmtIdent;
    @XmlElement(name = "StmtDesc")
    protected String stmtDesc;
    @XmlElement(name = "FinancialDataIdent")
    protected String financialDataIdent;
    @XmlElement(name = "StmtType")
    protected String stmtType;
    @XmlElement(name = "StmtDt", namespace = "urn:ifxforum-org:XSD:1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar stmtDt;
    @XmlElementRef(name = "CurAmtRange", namespace = "urn:ifxforum-org:XSD:1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CurAmtRangeType> curAmtRange;
    @XmlElement(name = "AmtRangeCd")
    protected String amtRangeCd;
    @XmlElement(name = "FinancialSrc")
    protected String financialSrc;

    /**
     * Gets the value of the stmtIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtIdent() {
        return stmtIdent;
    }

    /**
     * Sets the value of the stmtIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtIdent(String value) {
        this.stmtIdent = value;
    }

    /**
     * Gets the value of the stmtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtDesc() {
        return stmtDesc;
    }

    /**
     * Sets the value of the stmtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtDesc(String value) {
        this.stmtDesc = value;
    }

    /**
     * Gets the value of the financialDataIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialDataIdent() {
        return financialDataIdent;
    }

    /**
     * Sets the value of the financialDataIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialDataIdent(String value) {
        this.financialDataIdent = value;
    }

    /**
     * Gets the value of the stmtType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtType() {
        return stmtType;
    }

    /**
     * Sets the value of the stmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtType(String value) {
        this.stmtType = value;
    }

    /**
     * Gets the value of the stmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStmtDt() {
        return stmtDt;
    }

    /**
     * Sets the value of the stmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStmtDt(XMLGregorianCalendar value) {
        this.stmtDt = value;
    }

    /**
     * Gets the value of the curAmtRange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.CurAmtRangeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.CurAmtRangeType }{@code >}
     *     
     */
    public JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CurAmtRangeType> getCurAmtRange() {
        return curAmtRange;
    }

    /**
     * Sets the value of the curAmtRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.CurAmtRangeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link com.tmb.payment.wsdl.xpress.vo.CurAmtRangeType }{@code >}
     *     
     */
    public void setCurAmtRange(JAXBElement<? extends com.tmb.payment.wsdl.xpress.vo.CurAmtRangeType> value) {
        this.curAmtRange = value;
    }

    /**
     * Gets the value of the amtRangeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmtRangeCd() {
        return amtRangeCd;
    }

    /**
     * Sets the value of the amtRangeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmtRangeCd(String value) {
        this.amtRangeCd = value;
    }

    /**
     * Gets the value of the financialSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialSrc() {
        return financialSrc;
    }

    /**
     * Sets the value of the financialSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialSrc(String value) {
        this.financialSrc = value;
    }

}
