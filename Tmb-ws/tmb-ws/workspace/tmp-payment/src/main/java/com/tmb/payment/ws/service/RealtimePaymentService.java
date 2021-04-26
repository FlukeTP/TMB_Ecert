package com.tmb.payment.ws.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.tmb.payment.ws.constant.ProjectConstant.DBD_STATUS;
import com.tmb.payment.ws.constant.ProjectConstant.WS_RESPONE;
import com.tmb.payment.ws.consumer.DbdPaymentConsumer;
import com.tmb.payment.ws.utils.SoapDateUtils;
import com.tmb.payment.ws.vo.RealtimePaymentRequest;
import com.tmb.payment.ws.vo.RealtimePaymentResponse;

@Service
public class RealtimePaymentService {

	private static final Logger log = LoggerFactory.getLogger(RealtimePaymentService.class);

	@Autowired
	private DbdPaymentConsumer dbdPaymentConsumer;

	public RealtimePaymentResponse process(RealtimePaymentRequest realtimePaymentRequest) {
		RealtimePaymentResponse sp = new RealtimePaymentResponse();
		try {

			Assert.notNull(realtimePaymentRequest.getServiceCode(), "ServiceCode is null");
			Assert.notNull(realtimePaymentRequest.getTransactionNo(), "TransactionNo is null");
			Assert.notNull(realtimePaymentRequest.getRef1(), "ref1 is null");
			Assert.notNull(realtimePaymentRequest.getRef2(), "ref2 is null");
			Assert.notNull(realtimePaymentRequest.getBankCode(), "bankCode is null");
			Assert.notNull(realtimePaymentRequest.getBranchCode(), "branchCode is null");
			
			Assert.notNull(realtimePaymentRequest.getPaymentType(), "paymentType is null");

			Assert.notNull(realtimePaymentRequest.getPayAmount(), "payAmount is null");

			Assert.notNull(realtimePaymentRequest.getPaymentDate(), "paymentDate is null");
			
			Date pdate = SoapDateUtils.parsePaymentDate(realtimePaymentRequest.getPaymentDate());
			Assert.notNull(pdate, "paymentDate is invalid format : " + SoapDateUtils.PAY_MENT_DATE);

			Assert.notNull(realtimePaymentRequest.getTransactionDate(), "transactionDate is null");
			Date trandate = SoapDateUtils.parsePostDate(realtimePaymentRequest.getTransactionDate());
			Assert.notNull(trandate, "transactionDate is invalid format : " + SoapDateUtils.POST_DATE_FORMAT);

			Assert.notNull(realtimePaymentRequest.getPayloadTS(), "payloadTS is null");
			Date payloadtsDate = SoapDateUtils.parsePaymentDate(realtimePaymentRequest.getPayloadTS());
			Assert.notNull(payloadtsDate, "payloadTS is invalid format : " + SoapDateUtils.PAY_MENT_DATE);
			

			String wsresponse = dbdPaymentConsumer.realTimePayment(realtimePaymentRequest);
			
			if(DBD_STATUS.SUCCESS.equalsIgnoreCase(wsresponse)) {
				sp.setStatusCode(WS_RESPONE.SUCCEEDED_CODE);
				sp.setDescription(WS_RESPONE.SUCCEEDED);
			}else {
				sp.setStatusCode(WS_RESPONE.FAILED_CODE);
				sp.setDescription(wsresponse);

			}
			
		} catch (IllegalArgumentException e) {
			sp.setStatusCode(WS_RESPONE.FAILED_CODE);
			sp.setDescription(e.getMessage());
			log.info(e.getMessage());
		}
		return sp;
	}

}
