
package com.tmb.payment.wsdl.ecm.wsapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for documentIndexKey.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="documentIndexKey"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FILE_RES_CODE"/&gt;
 *     &lt;enumeration value="FILE_RES_DESC"/&gt;
 *     &lt;enumeration value="ECM_DOC_ID"/&gt;
 *     &lt;enumeration value="FILE_NAME"/&gt;
 *     &lt;enumeration value="DOC_TYPE_CODE"/&gt;
 *     &lt;enumeration value="ECM_CUS_ID"/&gt;
 *     &lt;enumeration value="TMB_CUS_ID"/&gt;
 *     &lt;enumeration value="CITIZEN_ID"/&gt;
 *     &lt;enumeration value="REGISTRATION_ID"/&gt;
 *     &lt;enumeration value="PASSPORT_NO"/&gt;
 *     &lt;enumeration value="IMPORT_DATE"/&gt;
 *     &lt;enumeration value="EXPIRYDATE"/&gt;
 *     &lt;enumeration value="MIME_TYPE"/&gt;
 *     &lt;enumeration value="STATUS_CODE"/&gt;
 *     &lt;enumeration value="STATUS_DESC"/&gt;
 *     &lt;enumeration value="REASON_CODE"/&gt;
 *     &lt;enumeration value="REASON_DESC"/&gt;
 *     &lt;enumeration value="CREATE_ZONE"/&gt;
 *     &lt;enumeration value="REMARK"/&gt;
 *     &lt;enumeration value="CREATE_BY"/&gt;
 *     &lt;enumeration value="CREATE_DATE"/&gt;
 *     &lt;enumeration value="MODIFY_BY"/&gt;
 *     &lt;enumeration value="MODIFY_DATE"/&gt;
 *     &lt;enumeration value="NEW_FILE_NAME"/&gt;
 *     &lt;enumeration value="APPLICATION_NO"/&gt;
 *     &lt;enumeration value="REF_APP_NO"/&gt;
 *     &lt;enumeration value="REF_APP_NO_2"/&gt;
 *     &lt;enumeration value="REF_APP_NO_3"/&gt;
 *     &lt;enumeration value="REF_APP_NO_4"/&gt;
 *     &lt;enumeration value="REF_APP_NO_5"/&gt;
 *     &lt;enumeration value="APP_TYPE_CODE"/&gt;
 *     &lt;enumeration value="ACCOUNT_NO"/&gt;
 *     &lt;enumeration value="CUS_NAME"/&gt;
 *     &lt;enumeration value="CUS_MID_NAME"/&gt;
 *     &lt;enumeration value="CUS_SURNAME"/&gt;
 *     &lt;enumeration value="APP_STATUS_CODE"/&gt;
 *     &lt;enumeration value="UPLOAD_TIMESTAMP"/&gt;
 *     &lt;enumeration value="PUBLISH_FLAG"/&gt;
 *     &lt;enumeration value="DOC_VIEWER_URL"/&gt;
 *     &lt;enumeration value="PUBLISH_DATE"/&gt;
 *     &lt;enumeration value="REF_CHANNEL_ID"/&gt;
 *     &lt;enumeration value="ECM_DOC_ID_RESUBMIT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "documentIndexKey")
@XmlEnum
public enum DocumentIndexKey {

    FILE_RES_CODE,
    FILE_RES_DESC,
    ECM_DOC_ID,
    FILE_NAME,
    DOC_TYPE_CODE,
    ECM_CUS_ID,
    TMB_CUS_ID,
    CITIZEN_ID,
    REGISTRATION_ID,
    PASSPORT_NO,
    IMPORT_DATE,
    EXPIRYDATE,
    MIME_TYPE,
    STATUS_CODE,
    STATUS_DESC,
    REASON_CODE,
    REASON_DESC,
    CREATE_ZONE,
    REMARK,
    CREATE_BY,
    CREATE_DATE,
    MODIFY_BY,
    MODIFY_DATE,
    NEW_FILE_NAME,
    APPLICATION_NO,
    REF_APP_NO,
    REF_APP_NO_2,
    REF_APP_NO_3,
    REF_APP_NO_4,
    REF_APP_NO_5,
    APP_TYPE_CODE,
    ACCOUNT_NO,
    CUS_NAME,
    CUS_MID_NAME,
    CUS_SURNAME,
    APP_STATUS_CODE,
    UPLOAD_TIMESTAMP,
    PUBLISH_FLAG,
    DOC_VIEWER_URL,
    PUBLISH_DATE,
    REF_CHANNEL_ID,
    ECM_DOC_ID_RESUBMIT;

    public String value() {
        return name();
    }

    public static DocumentIndexKey fromValue(String v) {
        return valueOf(v);
    }

}
