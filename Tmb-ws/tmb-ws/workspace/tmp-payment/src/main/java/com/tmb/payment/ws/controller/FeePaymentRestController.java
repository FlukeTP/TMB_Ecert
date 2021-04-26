package com.tmb.payment.ws.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tmb.payment.ws.constant.LogContant;
import com.tmb.payment.ws.constant.ProjectConstant.WS_RESPONE;
import com.tmb.payment.ws.service.FeePaymentRestService;
import com.tmb.payment.ws.vo.FeePaymentRequest;
import com.tmb.payment.ws.vo.FeePaymentResponse;

@RestController
@RequestMapping("api-payment")
public class FeePaymentRestController {

	private static final Logger log = LoggerFactory.getLogger(LogContant.XPRESS_LOG);

	@Autowired
	private FeePaymentRestService feePaymentRestService;
	
	@PostMapping("add")
	public FeePaymentResponse addPayment(@RequestBody FeePaymentRequest feePaymentRequest) {
		FeePaymentResponse rsp = new FeePaymentResponse();
		try {
			rsp = feePaymentRestService.process(feePaymentRequest);			
		}catch (Exception e) {
			log.error("addPayment", e);
			rsp.setStatusCode(WS_RESPONE.FAILED_CODE);
			rsp.setDescription("Internal Webervice Error : please see in log");
		}
		
		return rsp;
	}
}
