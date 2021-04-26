
package com.tmb.payment.wsdl.xpress.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PageNumRange_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PageNumRange_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StartSectName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}StartPageNum" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EndSectName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:ifxforum-org:XSD:1}EndPageNum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PageNumRange_Type", propOrder = {
    "startSectName",
    "startPageNum",
    "endSectName",
    "endPageNum"
})
public class PageNumRangeType {

    @XmlElement(name = "StartSectName")
    protected String startSectName;
    @XmlElement(name = "StartPageNum")
    protected Long startPageNum;
    @XmlElement(name = "EndSectName")
    protected String endSectName;
    @XmlElement(name = "EndPageNum")
    protected Long endPageNum;

    /**
     * Gets the value of the startSectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartSectName() {
        return startSectName;
    }

    /**
     * Sets the value of the startSectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartSectName(String value) {
        this.startSectName = value;
    }

    /**
     * Gets the value of the startPageNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStartPageNum() {
        return startPageNum;
    }

    /**
     * Sets the value of the startPageNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStartPageNum(Long value) {
        this.startPageNum = value;
    }

    /**
     * Gets the value of the endSectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndSectName() {
        return endSectName;
    }

    /**
     * Sets the value of the endSectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndSectName(String value) {
        this.endSectName = value;
    }

    /**
     * Gets the value of the endPageNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEndPageNum() {
        return endPageNum;
    }

    /**
     * Sets the value of the endPageNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEndPageNum(Long value) {
        this.endPageNum = value;
    }

}
