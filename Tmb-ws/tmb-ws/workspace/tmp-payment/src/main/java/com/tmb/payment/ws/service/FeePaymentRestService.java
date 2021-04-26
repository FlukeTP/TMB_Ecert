package com.tmb.payment.ws.service;

import java.text.ParseException;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.tmb.payment.ws.constant.ProjectConstant.WS_RESPONE;
import com.tmb.payment.ws.consumer.FeePaymentConsumer;
import com.tmb.payment.ws.utils.SoapDateUtils;
import com.tmb.payment.ws.vo.FeePaymentRequest;
import com.tmb.payment.ws.vo.FeePaymentResponse;

@Service
public class FeePaymentRestService {

	private static final Logger log = LoggerFactory.getLogger(FeePaymentRestService.class);

	@Autowired
	private FeePaymentConsumer feePaymentConsumer;

	public FeePaymentResponse process(FeePaymentRequest feePaymentRequest) {

		try {

			Assert.isTrue(StringUtils.isNotEmpty(feePaymentRequest.getRqUid()), "RqUID is Null");

			Assert.isTrue(StringUtils.isNotEmpty(feePaymentRequest.getFromAccountIdent()), "FromAccountIdent is Empty");

//			Assert.isTrue(StringUtils.isEmpty(feePaymentRequest.getFromAccountType()),"FromAccountType is Empty");			

			Assert.notNull(feePaymentRequest.getCurAmt(), "curAmt is null");
			Assert.notNull(feePaymentRequest.getBillPmtFee(), "BillPmtFee is null");

			Assert.notNull(feePaymentRequest.getRef1(), "Ref1 is null");
			Assert.notNull(feePaymentRequest.getRef2(), "Ref2 is null");

			Assert.notNull(feePaymentRequest.getPostedDate(), "PostedDate is null");
			Date posttedDate = SoapDateUtils.parsePostDate(feePaymentRequest.getPostedDate());
			Assert.notNull(posttedDate, "PostedDate is invalid format : " + SoapDateUtils.POST_DATE_FORMAT);			
			
			final String POST_TIME_INPUT_FORMAT = "HH:mm:SS";
			try {
				Date date = DateUtils.parseDate(feePaymentRequest.getPostedTime(), POST_TIME_INPUT_FORMAT);
				String pTime = SoapDateUtils.parsePostTime(date);
				feePaymentRequest.setPostedTime(pTime);
			} catch (ParseException e) {
				throw new IllegalArgumentException("PostedTime  invalid format  : " + POST_TIME_INPUT_FORMAT);
			}

		} catch (IllegalArgumentException e) {
			FeePaymentResponse sp = new FeePaymentResponse();
			sp.setStatusCode(WS_RESPONE.FAILED_CODE);
			sp.setDescription(e.getMessage());
			return sp;
		}

		log.debug("Input is OK.");
		return feePaymentConsumer.add(feePaymentRequest);
	}

}
