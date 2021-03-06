package com.tmb.ecert.batchjob.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.tmb.ecert.batchjob.domain.EcmReceipt;
import com.tmb.ecert.common.domain.RequestForm;
import com.tmb.ecert.report.persistence.vo.ReqReceiptVo;

@Repository
public class ImportECMBatchDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
		
	public List<RequestForm> getRequestFormWithEcmFlag() {
		return jdbcTemplate.query("SELECT * FROM ECERT_REQUEST_FORM WHERE ECM_FLAG = 1 AND DELETE_FLAG=0 "
				+ "AND CA_NUMBER IS NOT NULL "
				+ "AND STATUS = '10009' "
				+ "AND CERTIFICATE_FILE IS NOT NULL ", mapping);
	}
	
	private RowMapper<RequestForm> mapping = new RowMapper<RequestForm> () {
		@Override
		public RequestForm mapRow(ResultSet rs, int arg1) throws SQLException {
			RequestForm reqForm = new RequestForm();
			reqForm.setReqFormId(rs.getLong("REQFORM_ID"));
			reqForm.setRequestDate(rs.getTimestamp("REQUEST_DATE"));
			reqForm.setTmbRequestNo(rs.getString("TMB_REQUESTNO"));
			reqForm.setCerTypeCode(rs.getString("CERTYPE_CODE"));
			reqForm.setOrganizeId(rs.getString("ORGANIZE_ID"));
			reqForm.setCustomerName(rs.getString("CUSTOMER_NAME"));
			reqForm.setCompanyName(rs.getString("COMPANY_NAME"));
			reqForm.setBranch(rs.getString("BRANCH"));
			reqForm.setCustsegmentCode(rs.getString("CUSTSEGMENT_CODE"));
			reqForm.setOfficeCode(rs.getString("OFFICE_CODE"));
			reqForm.setCaNumber(rs.getString("CA_NUMBER"));
			reqForm.setDepartment(rs.getString("DEPARTMENT"));
			reqForm.setPaidTypeCode(rs.getString("PAIDTYPE_CODE"));
			reqForm.setDebitAccountType(rs.getString("DEBIT_ACCOUNT_TYPE"));
			reqForm.setTranCode(rs.getString("TRANCODE"));
			reqForm.setGlType(rs.getString("GLTYPE"));
			reqForm.setAccountType(rs.getString("ACCOUNTTYPE"));
			reqForm.setAccountNo(rs.getString("ACCOUNT_NO"));
			reqForm.setAccountName(rs.getString("ACCOUNT_NAME"));
			reqForm.setCustomerNameReceipt(rs.getString("CUSTOMER_NAMERECEIPT"));
			reqForm.setTelephone(rs.getString("TELEPHONE"));
			reqForm.setRequestFormFile(rs.getString("REQUESTFORM_FILE"));
			reqForm.setIdCardFile(rs.getString("IDCARD_FILE"));
			reqForm.setChangeNameFile(rs.getString("CHANGENAME_FILE"));
			reqForm.setCertificateFile(rs.getString("CERTIFICATE_FILE"));
			reqForm.setAddress(rs.getString("ADDRESS"));
			reqForm.setRemark(rs.getString("REMARK"));
			reqForm.setPaymentDate(rs.getTimestamp("PAYMENT_DATE"));
			reqForm.setPayLoadTs(rs.getTimestamp("PAYLOADTS"));
			reqForm.setPaymentBranchCode(rs.getString("PAYMENT_BRANCHCODE"));
			reqForm.setPostDate(rs.getTimestamp("POSTDATE"));
			reqForm.setRef1(rs.getString("REF1"));
			reqForm.setRef2(rs.getString("REF2"));
			reqForm.setAmount(rs.getBigDecimal("AMOUNT"));
			reqForm.setAmountTmb(rs.getBigDecimal("AMOUNT_TMB"));
			reqForm.setAmountDbd(rs.getBigDecimal("AMOUNT_DBD"));
			reqForm.setReceiptNo(rs.getString("RECEIPT_NO"));
			reqForm.setReceiptDate(rs.getTimestamp("RECEIPT_DATE"));
			reqForm.setStatus(rs.getString("STATUS"));
			reqForm.setErrorDescription(rs.getString("ERROR_DESCRIPTION"));
			reqForm.setPaymentStatus(rs.getString("PAYMENT_STATUS"));
			reqForm.setCountPayment(rs.getInt("COUNT_PAYMENT"));
			reqForm.setRejectReasonCode(rs.getString("REJECTREASON_CODE"));
			reqForm.setRejectReasonOther(rs.getString("REJECTREASON_OTHER"));
			reqForm.setCreatedById(rs.getString("CREATED_BY_ID"));
			reqForm.setCreatedByName(rs.getString("CREATED_BY_NAME"));
			reqForm.setCreatedDateTime(rs.getTimestamp("CREATED_DATETIME"));
			reqForm.setMakerById(rs.getString("MAKER_BY_ID"));
			reqForm.setMakerByName(rs.getString("MAKER_BY_NAME"));
			reqForm.setCheckerById(rs.getString("CHECKER_BY_ID"));
			reqForm.setCheckerByName(rs.getString("CHECKER_BY_NAME"));
			reqForm.setUpdatedById(rs.getString("UPDATED_BY_ID"));
			reqForm.setUpdatedByName(rs.getString("UPDATED_BY_NAME"));
			reqForm.setUpdatedDateTime(rs.getTimestamp("UPDATED_DATETIME"));
			reqForm.setOfficeCode(rs.getString("OFFICE_CODE"));
			reqForm.setReceiptFile(rs.getString("RECEIPT_FILE"));
			reqForm.setEcmFlag(rs.getInt("ECM_FLAG"));
			return reqForm;
		}
	};
	

	public List<EcmReceipt> findRequestReceipt() {
		StringBuilder sql = new StringBuilder(" ");
		sql.append("  SELECT a.RECEIPT_ID,a.REQFORM_ID ,a.FILE_NAME,b.CA_NUMBER,b.CUSTSEGMENT_CODE,    ");
		sql.append(" b.COMPANY_NAME,b.ORGANIZE_ID,b.TMB_REQUESTNO,b.MAKER_BY_ID from ECERT_REQFORM_RECEIPT a ");
		sql.append(" INNER JOIN ECERT_REQUEST_FORM b ON a.REQFORM_ID = b.REQFORM_ID ");
		sql.append(" WHERE a.ECM_FLAG = 1 ");
		List<EcmReceipt> result = jdbcTemplate.query(sql.toString(), reqReceiptMasterMapper);
		return result;
	}
	
	private RowMapper<EcmReceipt> reqReceiptMasterMapper = new RowMapper<EcmReceipt>() {
		@Override
		public EcmReceipt mapRow(ResultSet rs, int arg1) throws SQLException {
			EcmReceipt list = new EcmReceipt();
			list.setReceiptId(rs.getLong("RECEIPT_ID"));
			list.setReqId(rs.getLong("REQFORM_ID"));
			list.setFileName(rs.getString("FILE_NAME"));
			list.setCaNumber(rs.getString("CA_NUMBER"));
			list.setCompanyName(rs.getString("COMPANY_NAME"));
			list.setCustomerSegment(rs.getString("CUSTSEGMENT_CODE"));
			list.setOrganizeId(rs.getString("ORGANIZE_ID"));
			list.setTmbRequestNo(rs.getString("TMB_REQUESTNO"));
			list.setMakerById(rs.getString("MAKER_BY_ID"));

			return list;
		}
	};
	
	
}
