
package com.tmb.payment.wsdl.dbd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tmb.payment.wsdl.dbd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ApproveBeforePay_QNAME = new QName("http://service.payment.dbd.gov/", "approveBeforePay");
    private final static QName _ApproveBeforePayResponse_QNAME = new QName("http://service.payment.dbd.gov/", "approveBeforePayResponse");
    private final static QName _RealTimePayment_QNAME = new QName("http://service.payment.dbd.gov/", "realTimePayment");
    private final static QName _RealTimePaymentResponse_QNAME = new QName("http://service.payment.dbd.gov/", "realTimePaymentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tmb.payment.wsdl.dbd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ApproveBeforePay }
     * 
     */
    public ApproveBeforePay createApproveBeforePay() {
        return new ApproveBeforePay();
    }

    /**
     * Create an instance of {@link ApproveBeforePayResponse }
     * 
     */
    public ApproveBeforePayResponse createApproveBeforePayResponse() {
        return new ApproveBeforePayResponse();
    }

    /**
     * Create an instance of {@link RealTimePayment }
     * 
     */
    public RealTimePayment createRealTimePayment() {
        return new RealTimePayment();
    }

    /**
     * Create an instance of {@link RealTimePaymentResponse }
     * 
     */
    public RealTimePaymentResponse createRealTimePaymentResponse() {
        return new RealTimePaymentResponse();
    }

    /**
     * Create an instance of {@link PaymentPayLoad }
     * 
     */
    public PaymentPayLoad createPaymentPayLoad() {
        return new PaymentPayLoad();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApproveBeforePay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.payment.dbd.gov/", name = "approveBeforePay")
    public JAXBElement<ApproveBeforePay> createApproveBeforePay(ApproveBeforePay value) {
        return new JAXBElement<ApproveBeforePay>(_ApproveBeforePay_QNAME, ApproveBeforePay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApproveBeforePayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.payment.dbd.gov/", name = "approveBeforePayResponse")
    public JAXBElement<ApproveBeforePayResponse> createApproveBeforePayResponse(ApproveBeforePayResponse value) {
        return new JAXBElement<ApproveBeforePayResponse>(_ApproveBeforePayResponse_QNAME, ApproveBeforePayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealTimePayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.payment.dbd.gov/", name = "realTimePayment")
    public JAXBElement<RealTimePayment> createRealTimePayment(RealTimePayment value) {
        return new JAXBElement<RealTimePayment>(_RealTimePayment_QNAME, RealTimePayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealTimePaymentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.payment.dbd.gov/", name = "realTimePaymentResponse")
    public JAXBElement<RealTimePaymentResponse> createRealTimePaymentResponse(RealTimePaymentResponse value) {
        return new JAXBElement<RealTimePaymentResponse>(_RealTimePaymentResponse_QNAME, RealTimePaymentResponse.class, null, value);
    }

}
