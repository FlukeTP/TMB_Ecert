package com.tmb.payment.wsdl.dbd;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-10-11T17:37:35.588+07:00
 * Generated source version: 3.2.6
 *
 */
@WebServiceClient(name = "DbdPaymentService",
                  targetNamespace = "http://service.payment.dbd.gov/")
public class DbdPaymentService extends Service {

    public final static URL WSDL_LOCATION = null;

    public final static QName SERVICE = new QName("http://service.payment.dbd.gov/", "DbdPaymentService");
    public final static QName DbdPaymentPort = new QName("http://service.payment.dbd.gov/", "DbdPaymentPort");

    public DbdPaymentService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public DbdPaymentService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DbdPaymentService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public DbdPaymentService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public DbdPaymentService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public DbdPaymentService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns DbdPayment
     */
    @WebEndpoint(name = "DbdPaymentPort")
    public DbdPayment getDbdPaymentPort() {
        return super.getPort(DbdPaymentPort, DbdPayment.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DbdPayment
     */
    @WebEndpoint(name = "DbdPaymentPort")
    public DbdPayment getDbdPaymentPort(WebServiceFeature... features) {
        return super.getPort(DbdPaymentPort, DbdPayment.class, features);
    }

}
