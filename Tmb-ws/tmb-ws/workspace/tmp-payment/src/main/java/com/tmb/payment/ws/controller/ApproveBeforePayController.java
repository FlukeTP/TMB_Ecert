package com.tmb.payment.ws.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tmb.payment.ws.constant.ProjectConstant.WS_RESPONE;
import com.tmb.payment.ws.service.ApproveBeforePayService;
import com.tmb.payment.ws.vo.ApproveBeforePayRequest;
import com.tmb.payment.ws.vo.ApproveBeforePayResponse;

@RestController
@RequestMapping("api-payment")
public class ApproveBeforePayController {
	
	private static final Logger log = LoggerFactory.getLogger(ApproveBeforePayController.class);

	@Autowired
	private ApproveBeforePayService approveBeforePayService;
	
	@PostMapping("approveBeforePay")
	public ApproveBeforePayResponse approveBeforePay(@RequestBody ApproveBeforePayRequest approveBeforePayRequest) {
		ApproveBeforePayResponse rsp = new ApproveBeforePayResponse();
		try {
			rsp = approveBeforePayService.process(approveBeforePayRequest);			
		}catch (Exception e) {
			log.error("approveBeforePay", e);
			rsp.setStatusCode(WS_RESPONE.FAILED_CODE);
			rsp.setDescription("Internal Webervice Error : please see in log");
		}
		
		return rsp;
	}
	
	
}
