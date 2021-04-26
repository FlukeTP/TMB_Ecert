package com.tmb.payment.ws.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tmb.payment.ws.constant.ProjectConstant.WS_RESPONE;
import com.tmb.payment.ws.service.RealtimePaymentService;
import com.tmb.payment.ws.vo.RealtimePaymentRequest;
import com.tmb.payment.ws.vo.RealtimePaymentResponse;

@RestController
@RequestMapping("api-payment")
public class RealtimePaymentController {

	
	private static final Logger log = LoggerFactory.getLogger(RealtimePaymentController.class);

	@Autowired
	private RealtimePaymentService realtimePaymentService;
	
	@PostMapping("realTimePayment")
	public RealtimePaymentResponse realTimePayment(@RequestBody RealtimePaymentRequest realtimePaymentRequest) {
		RealtimePaymentResponse rsp = new RealtimePaymentResponse();
		try {
			rsp = realtimePaymentService.process(realtimePaymentRequest);			
		}catch (Exception e) {
			log.error("realTimePayment", e);
			rsp.setStatusCode(WS_RESPONE.FAILED_CODE);
			rsp.setDescription("Internal Webervice Error : please see in log");
		}
		
		return rsp;
	}
	
	
}
