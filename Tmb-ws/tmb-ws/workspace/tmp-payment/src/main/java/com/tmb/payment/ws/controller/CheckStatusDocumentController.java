package com.tmb.payment.ws.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tmb.payment.ws.constant.ProjectConstant.WS_RESPONE;
import com.tmb.payment.ws.service.CheckStatusDocumentService;
import com.tmb.payment.ws.vo.CheckStatusDocumentRequest;
import com.tmb.payment.ws.vo.CheckStatusDocumentResponse;

@RestController
@RequestMapping("api-payment")
public class CheckStatusDocumentController {

	private static final Logger log = LoggerFactory.getLogger(CheckStatusDocumentController.class);

	@Autowired
	private CheckStatusDocumentService checkStatusDocumentService;
	
	@PostMapping("checkStatusDocument")
	public CheckStatusDocumentResponse checkStatusDocument(@RequestBody CheckStatusDocumentRequest request) {
		CheckStatusDocumentResponse rsp = new CheckStatusDocumentResponse();
		try {
			rsp = checkStatusDocumentService.process(request);			
		}catch (Exception e) {
			log.error("realTimePayment", e);
			rsp.setStatusCode(WS_RESPONE.FAILED_CODE);
			rsp.setDescription("Internal Webervice Error : please see in log");
		}
		
		return rsp;
	}
	
}
