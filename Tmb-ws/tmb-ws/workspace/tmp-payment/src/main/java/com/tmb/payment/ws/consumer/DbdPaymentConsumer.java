package com.tmb.payment.ws.consumer;

import javax.xml.ws.BindingProvider;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.tmb.payment.ws.utils.SoapDateUtils;
import com.tmb.payment.ws.vo.RealtimePaymentRequest;
import com.tmb.payment.wsdl.dbd.DbdPayment;
import com.tmb.payment.wsdl.dbd.DbdPaymentService;
import com.tmb.payment.wsdl.dbd.PaymentPayLoad;

@Service
public class DbdPaymentConsumer {

	private static final Logger log = LoggerFactory.getLogger(DbdPaymentConsumer.class);

	@Value("${dbd.enpoint}")
	String enpoint;


	@Value("${dbd.timeout}")
	long timeout;
	
	
	private DbdPayment port = null;

	private DbdPayment getPort() {

		if (port != null)
			return port;

		DbdPaymentService client = new DbdPaymentService();
		port = client.getDbdPaymentPort();

		BindingProvider bp = (BindingProvider)port;
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, enpoint);
		
		Client cxfClient = ClientProxy.getClient(port);
		HTTPConduit http = (HTTPConduit) cxfClient.getConduit();
		HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
		httpClientPolicy.setConnectionTimeout(timeout);
		httpClientPolicy.setReceiveTimeout(timeout);
		httpClientPolicy.setAllowChunking(false);

		http.setClient(httpClientPolicy);

		XmlInInterceptor xmlInInterceptor = new XmlInInterceptor(log);
		XmlOutInterceptor xmlOutInterceptor = new XmlOutInterceptor(log);
		cxfClient.getInInterceptors().add(xmlInInterceptor);
		cxfClient.getOutInterceptors().add(xmlOutInterceptor);

		return port;
	}

	public String approveBeforePay(String bankCode, String serviceCode, String ref1, String ref2, float amount) {
		String resp = this.getPort().approveBeforePay(bankCode, serviceCode, ref1, ref2, amount);
		log.info("approveBeforePay resp : {}", resp);
		return resp;
	}

	public String realTimePayment(RealtimePaymentRequest realtimePaymentRequest) {
		PaymentPayLoad message = new PaymentPayLoad();
		message.setServiceCode(realtimePaymentRequest.getServiceCode());
		message.setTransactionNo(realtimePaymentRequest.getTransactionNo());
		message.setRef1(realtimePaymentRequest.getRef1());
		message.setRef2(realtimePaymentRequest.getRef2());
		message.setBankCode(realtimePaymentRequest.getBankCode());
		message.setBranchCode(realtimePaymentRequest.getBranchCode());
		message.setPaymentType(realtimePaymentRequest.getPaymentType());
		message.setPayAmount(realtimePaymentRequest.getPayAmount().floatValue());
		message.setPaymentDate(SoapDateUtils.toDate(SoapDateUtils.parsePaymentDate(realtimePaymentRequest.getPaymentDate())));
		message.setPaymentName(realtimePaymentRequest.getPaymentName());
		message.setTransactionDate(SoapDateUtils.toDate(SoapDateUtils.parsePostDate(realtimePaymentRequest.getTransactionDate())));
		message.setPayloadTS(SoapDateUtils.toDate(SoapDateUtils.parsePaymentDate(realtimePaymentRequest.getPayloadTS())));
		
		String resp = this.getPort().realTimePayment(message);
		log.info("resp : {}", resp);
		
		return resp;
	}

}
