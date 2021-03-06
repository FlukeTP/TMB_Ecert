package com.tmb.payment.wsdl.ecmv2;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-12-19T14:38:30.346+07:00
 * Generated source version: 3.2.6
 *
 */
@WebServiceClient(name = "DiscoveryService",
                  targetNamespace = "http://docs.oasis-open.org/ns/cmis/ws/200908/")
public class DiscoveryService extends Service {

    public final static URL WSDL_LOCATION = null;

    public final static QName SERVICE = new QName("http://docs.oasis-open.org/ns/cmis/ws/200908/", "DiscoveryService");
    public final static QName DiscoveryServicePort = new QName("http://docs.oasis-open.org/ns/cmis/ws/200908/", "DiscoveryServicePort");

    public DiscoveryService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public DiscoveryService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DiscoveryService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public DiscoveryService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public DiscoveryService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public DiscoveryService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns DiscoveryServicePort
     */
    @WebEndpoint(name = "DiscoveryServicePort")
    public DiscoveryServicePort getDiscoveryServicePort() {
        return super.getPort(DiscoveryServicePort, DiscoveryServicePort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DiscoveryServicePort
     */
    @WebEndpoint(name = "DiscoveryServicePort")
    public DiscoveryServicePort getDiscoveryServicePort(WebServiceFeature... features) {
        return super.getPort(DiscoveryServicePort, DiscoveryServicePort.class, features);
    }

}
