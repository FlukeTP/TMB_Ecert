
package com.tmb.payment.wsdl.ecmv2;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-12-19T14:38:30.159+07:00
 * Generated source version: 3.2.6
 */

@WebFault(name = "cmisFault", targetNamespace = "http://docs.oasis-open.org/ns/cmis/messaging/200908/")
public class CmisException extends Exception {

    private com.tmb.payment.wsdl.ecmv2.CmisFaultType cmisFault;

    public CmisException() {
        super();
    }

    public CmisException(String message) {
        super(message);
    }

    public CmisException(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public CmisException(String message, com.tmb.payment.wsdl.ecmv2.CmisFaultType cmisFault) {
        super(message);
        this.cmisFault = cmisFault;
    }

    public CmisException(String message, com.tmb.payment.wsdl.ecmv2.CmisFaultType cmisFault, java.lang.Throwable cause) {
        super(message, cause);
        this.cmisFault = cmisFault;
    }

    public com.tmb.payment.wsdl.ecmv2.CmisFaultType getFaultInfo() {
        return this.cmisFault;
    }
}
