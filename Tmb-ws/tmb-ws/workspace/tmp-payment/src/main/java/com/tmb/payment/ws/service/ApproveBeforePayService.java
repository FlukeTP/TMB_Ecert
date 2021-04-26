package com.tmb.payment.ws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.tmb.payment.ws.constant.ProjectConstant.DBD_STATUS;
import com.tmb.payment.ws.constant.ProjectConstant.WS_RESPONE;
import com.tmb.payment.ws.consumer.DbdPaymentConsumer;
import com.tmb.payment.ws.vo.ApproveBeforePayRequest;
import com.tmb.payment.ws.vo.ApproveBeforePayResponse;

@Service
public class ApproveBeforePayService {

	@Autowired
	private DbdPaymentConsumer dbdPaymentConsumer;
	
	public ApproveBeforePayResponse process(ApproveBeforePayRequest approveBeforePayRequest) {
		
		ApproveBeforePayResponse sp = new ApproveBeforePayResponse();
		try {
			
		Assert.notNull(approveBeforePayRequest.getBankCode(), "BankCode is null");
		
		String wsresponse = dbdPaymentConsumer.approveBeforePay(approveBeforePayRequest.getBankCode(), approveBeforePayRequest.getServiceCode(),
				approveBeforePayRequest.getRef1(), approveBeforePayRequest.getRef2(), approveBeforePayRequest.getAmount().floatValue());

		if(DBD_STATUS.SUCCESS.equalsIgnoreCase(wsresponse)) {
			sp.setStatusCode(WS_RESPONE.SUCCEEDED_CODE);
			sp.setDescription(WS_RESPONE.SUCCEEDED);
		}else {
			sp.setStatusCode(WS_RESPONE.FAILED_CODE);
			sp.setDescription(wsresponse);

		}
		}catch (IllegalArgumentException e) {
			sp.setStatusCode(WS_RESPONE.FAILED_CODE);
			sp.setDescription(e.getMessage());
		}
		
//		D000 - Accept
//		D002 - Reject ด้วยสาเหตุอื่นๆ
//		D003 - Reject ด้วยสาเหตุ จํานวนเงินไม่ถูกต้อง
//		D004 - Reject ด้วยสาเหตุ REF1 ไม่ถูกต้อง
//		D005 - Reject ด้วยสาเหตุ REF2 ไม่ถูกต้อง
//		D006 - Reject ด้วยสาเหตุ REF1 และ REF2 ไม่สัมพันธ์กัน
//		D007 - Reject ด้วยสาเหตุ รหัสธนาคารไม่ถูกต้อง
//		D008 - Reject ด้วยสาเหตุ ช่องทํางการชําระเงินไม่ถูกต้อง
//		D009 - Reject ด้วยสาเหตุ รหัสการให้บริการไม่ถูกต้อง
//		D010 - Reject ด้วยสาเหตุ วันที่ชําระเงินไม่ถูกต้อง
//		D011 - Reject ด้วยสาเหตุ วันที่ตัดยอดไม่ถูกต้อง
//		D012 - Reject ด้วยสาเหตุ ชําระเงินแล้ว
//		D013 - Reject ด้วยสาเหตุ เกินกําหนดระยะเวลา 2 วันของ ระบบหลักประกันธุรกิจฯ

		return sp;
	}

}
