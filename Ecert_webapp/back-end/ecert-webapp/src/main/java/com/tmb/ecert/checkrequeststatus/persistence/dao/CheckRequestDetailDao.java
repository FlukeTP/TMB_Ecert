package com.tmb.ecert.checkrequeststatus.persistence.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.tmb.ecert.batchjob.domain.EcmMasterData;
import com.tmb.ecert.checkrequeststatus.persistence.vo.ws.ECMUuploadRequest;
import com.tmb.ecert.common.constant.DateConstant;
import com.tmb.ecert.common.constant.ProjectConstant.APPLICATION_LOG_NAME;
import com.tmb.ecert.common.domain.Certificate;
import com.tmb.ecert.common.domain.RequestCertificate;
import com.tmb.ecert.common.domain.RequestForm;
import com.tmb.ecert.report.persistence.vo.ReqReceiptVo;
import com.tmb.ecert.requestorform.persistence.vo.Nrq02000FormVo;

import th.co.baiwa.buckwaframework.common.util.EcerDateUtils;

@Repository
public class CheckRequestDetailDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static Logger Log = LoggerFactory.getLogger(APPLICATION_LOG_NAME.ECERT_SEARCH_REQFORM);

	private final String SQL_ECERT_REQUEST_CERTIFICATE = " SELECT C.* FROM ECERT_REQUEST_CERTIFICATE C ";

	public RequestForm findReqFormById(Long reqFormId) {
		Log.info("RequestorDao::findReqFormById finding by... id:{}", reqFormId);
		RequestForm reqForm = findReqFormById(reqFormId, true);
		Log.info("RequestorDao::findReqFormById finished with... tmbReqNo:{}", reqForm.getTmbRequestNo());
		return reqForm;
	}

	public RequestForm findReqFormById(Long reqFormId, boolean code) {
		Log.info("RequestorDao::findReqFormById finding by... id:{}, usedCode:{}", reqFormId, !code);
		List<Object> params = new ArrayList<>();
		StringBuilder sql = new StringBuilder("SELECT");
		sql.append(" F.PAIDTYPE_CODE, F.REQFORM_ID,F.REQUEST_DATE,F.TMB_REQUESTNO,F.ORGANIZE_ID,F.CUSTOMER_NAME,F.COMPANY_NAME,F.BRANCH,F.CA_NUMBER,F.DEPARTMENT,F.TRANCODE,F.GLTYPE,F.ACCOUNTTYPE,F.ACCOUNT_NO,F.ACCOUNT_NAME,F.CUSTOMER_NAMERECEIPT,F.TELEPHONE,F.REQUESTFORM_FILE,F.IDCARD_FILE,F.CHANGENAME_FILE,F.CERTIFICATE_FILE,F.ADDRESS,F.REMARK,F.PAYMENT_DATE,F.PAYLOADTS,F.PAYMENT_BRANCHCODE,F.POSTDATE,F.REF1,F.REF2,F.AMOUNT,F.AMOUNT_TMB,F.AMOUNT_DBD,F.RECEIPT_NO,F.ERROR_DESCRIPTION,F.PAYMENT_STATUS,F.COUNT_PAYMENT,F.REJECTREASON_OTHER,F.CREATED_BY_ID,F.CREATED_BY_NAME,F.CREATED_DATETIME,F.UPDATED_BY_ID,F.UPDATED_BY_NAME,F.UPDATED_DATETIME,F.MAKER_BY_ID,F.MAKER_BY_NAME,F.CHECKER_BY_ID,F.CHECKER_BY_NAME,F.OFFICE_CODE,F.RECEIPT_DATE,F.RECEIPT_FILE,F.LOCK_FLAG, F.MAJOR_NO,F.AMOUNT_VAT_TMB");
		if (code) {
			sql.append(" ,L.NAME AS CUSTSEGMENT_CODE");
			sql.append(" ,LD.NAME AS DEBIT_ACCOUNT_TYPE");
			sql.append(" ,C.NAME AS CERTYPE_CODE");
//			sql.append(" ,P.NAME AS PAIDTYPE_CODE");
			sql.append(" ,R.NAME AS REJECTREASON_CODE");
			sql.append(" ,S.NAME AS STATUS");
		} else {
			sql.append(" ,F.CUSTSEGMENT_CODE");
			sql.append(" ,F.DEBIT_ACCOUNT_TYPE");
			sql.append(" ,F.CERTYPE_CODE");
//			sql.append(" ,F.PAIDTYPE_CODE");
			sql.append(" ,F.REJECTREASON_CODE");
//			sql.append(" ,F.STATUS");
			
			// optional
			sql.append(" ,S.NAME AS STATUS");
		}
		sql.append(" FROM ECERT_REQUEST_FORM F");
		if (code) {
			sql.append(" LEFT JOIN ECERT_LISTOFVALUE L ON F.CUSTSEGMENT_CODE = L.CODE ");
			sql.append(" LEFT JOIN ECERT_LISTOFVALUE LD ON F.DEBIT_ACCOUNT_TYPE = LD.CODE ");
			sql.append(" LEFT JOIN ECERT_LISTOFVALUE C ON F.CERTYPE_CODE = C.CODE ");
//			sql.append(" LEFT JOIN ECERT_LISTOFVALUE P ON F.PAIDTYPE_CODE = P.CODE ");
			sql.append(" LEFT JOIN ECERT_LISTOFVALUE R ON F.REJECTREASON_CODE = R.CODE ");
			sql.append(" LEFT JOIN ECERT_LISTOFVALUE S ON F.STATUS = S.CODE ");
		} else {
			// optional
			sql.append(" LEFT JOIN ECERT_LISTOFVALUE S ON F.STATUS = S.CODE ");
		}
		sql.append(" WHERE F.REQFORM_ID = ? AND F.DELETE_FLAG = 0 ");
		params.add(reqFormId);
		RequestForm reqForm = jdbcTemplate.queryForObject(sql.toString(), params.toArray(), formMapping);
		Log.info("RequestorDao::findReqFormById finished with... tmbReqNo:{}", reqForm.getTmbRequestNo());
		return reqForm;
	}

	public List<RequestCertificate> findCertByReqFormId(Long reqFormId) {
		Log.info("RequestorDao::findCertByReqFormId finding by id:{}", reqFormId);
		List<Object> params = new ArrayList<>();
		StringBuilder sql = new StringBuilder(SQL_ECERT_REQUEST_CERTIFICATE);
		sql.append(" WHERE C.REQFORM_ID = ? ");
		params.add(reqFormId);
		List<RequestCertificate> certs = jdbcTemplate.query(sql.toString(), params.toArray(), certMapping);
		Log.info("RequestorDao::findCertByReqFormId finished with... {} item", certs.size());
		return certs;
	}

	public List<Certificate> findCerByCerTypeCode(String cerTypeCode) {
		Log.info("RequestorDao::findCerByCerTypeCode finding by cerTypeCode:{}", cerTypeCode);
		StringBuilder sql = new StringBuilder(" SELECT * FROM ECERT_CERTIFICATE ");
		sql.append(" WHERE TYPE_CODE = ? ORDER BY CODE ASC ");

		List<Object> params = new ArrayList<>();
		params.add(cerTypeCode);

		List<Certificate> result = jdbcTemplate.query(sql.toString(), params.toArray(), cerMapper);

		Log.info("RequestorDao::findCerByCerTypeCode finished with... {} item", result.size());
		return result;
	}
	
	public RequestForm findCertificateFileByReqID(Long reqID) {
		Log.info("RequestorDao::findCertificateFileByReqID finding by id:{}", reqID);
		StringBuilder sql = new StringBuilder(" ");
		// sql.append(" SELECT REQUESTFORM_FILE,CERTIFICATE_FILE,RECEIPT_FILE FROM ECERT_REQUEST_FORM WHERE REQFORM_ID = ? ");
		sql.append("   SELECT * FROM ECERT_REQUEST_FORM WHERE REQFORM_ID = ? AND DELETE_FLAG = 0  ");
		List<Object> params = new ArrayList<>();
		params.add(reqID);

		RequestForm result = jdbcTemplate.queryForObject(sql.toString(), params.toArray(), findFileNameMapping);

		Log.info("RequestorDao::findCertificateFileByReqID finished with... tmbReqNo:{}", result.getTmbRequestNo());
		
		return result;
	}
	
	public EcmMasterData findECMMaster(ECMUuploadRequest ecmReq) {
		StringBuilder sql = new StringBuilder(" ");
		sql.append("   SELECT * FROM ECERT_ECM_MASTERDATA WHERE TYPE_CODE = ? AND SOURCE = ? AND REPOSITORY = ?  ");
		List<Object> params = new ArrayList<>();
		params.add(ecmReq.getTmbDocTypeCode());
		params.add(ecmReq.getTmbSource());
		params.add(ecmReq.getRepositoryId());
		EcmMasterData result = jdbcTemplate.queryForObject(sql.toString(), params.toArray(), ecmMasterMapper);
		
		return result;
	}
	
	public int updateECMFlag(Long reqID,Long ecmStatus) {
		StringBuilder sql = new StringBuilder(" ");
		sql.append("  UPDATE ECERT_REQUEST_FORM SET ECM_FLAG = ?  WHERE REQFORM_ID = ?   ");
		List<Object> params = new ArrayList<>();
		params.add(ecmStatus);
		params.add(reqID);

		Log.info(sql.toString());

		int result = jdbcTemplate.update(sql.toString(), params.toArray());

		return result;
	}
	public int updateReceiptECMFlag(Long reqID,Long ecmStatus) {
		StringBuilder sql = new StringBuilder(" ");
		sql.append("  UPDATE ECERT_REQFORM_RECEIPT SET ECM_FLAG = ?  WHERE RECEIPT_ID = ?   ");
		List<Object> params = new ArrayList<>();
		params.add(ecmStatus);
		params.add(reqID);

		Log.info(sql.toString());

		int result = jdbcTemplate.update(sql.toString(), params.toArray());

		return result;
	}

	private RowMapper<RequestForm> findFileNameMapping = new RowMapper<RequestForm>() {
		@Override
		public RequestForm mapRow(ResultSet rs, int args1) throws SQLException {
			RequestForm row = new RequestForm();
			row.setCaNumber(rs.getString("CA_NUMBER"));
			row.setCustomerName(rs.getString("CUSTSEGMENT_CODE"));
			row.setRef2(rs.getString("REF2"));
			row.setRequestFormFile(rs.getString("REQUESTFORM_FILE"));
			row.setCertificateFile(rs.getString("CERTIFICATE_FILE"));
			row.setReceiptFile(rs.getString("RECEIPT_FILE"));
			row.setOrganizeId(rs.getString("ORGANIZE_ID"));
			row.setTmbRequestNo(rs.getString("TMB_REQUESTNO"));
			row.setCompanyName(rs.getString("COMPANY_NAME"));
			row.setRequestDate(rs.getTimestamp("REQUEST_DATE"));
			row.setIdCardFile(rs.getString("IDCARD_FILE"));
			row.setChangeNameFile(rs.getString("CHANGENAME_FILE"));
			return row;
		}
	};
	
	private RowMapper<Certificate> cerMapper = new RowMapper<Certificate>() {
		@Override
		public Certificate mapRow(ResultSet rs, int arg1) throws SQLException {
			Certificate list = new Certificate();
			list.setCode(rs.getString("CODE"));
			list.setTypeCode(rs.getString("TYPE_CODE"));
			list.setTypeDesc(rs.getString("TYPE_DESC"));
			list.setCertificate(rs.getString("CERTIFICATE"));
			list.setFeeDbd(rs.getString("FEE_DBD"));
			list.setFeeTmb(rs.getString("FEE_TMB"));
			return list;
		}
	};

	private RowMapper<RequestCertificate> certMapping = new RowMapper<RequestCertificate>() {
		@Override
		public RequestCertificate mapRow(ResultSet rs, int args1) throws SQLException {
			RequestCertificate row = new RequestCertificate();
			row.setReqCertificateId(rs.getLong("REQCERTIFICATE_ID"));
			row.setCertificateCode(rs.getString("CERTIFICATE_CODE"));
			row.setCreatedById(rs.getString("CREATED_BY_ID"));
			row.setCreatedByName(rs.getString("CREATED_BY_NAME"));
			row.setCreatedDateTime(rs.getTimestamp("CREATED_DATETIME"));
			row.setReqFormId(rs.getLong("REQFORM_ID"));
			row.setTotalNumber(rs.getInt("TOTALNUMBER"));
			row.setUpdateById(rs.getString("UPDATED_BY_ID"));
			row.setUpdateByName(rs.getString("UPDATED_BY_NAME"));
			row.setUpdateDateTime(rs.getTimestamp("UPDATED_DATETIME"));
			row.setAcceptedDate(rs.getDate("ACCEPTED_DATE"));
			row.setOther(rs.getString("OTHER"));
			row.setRegisteredDate(rs.getDate("REGISTERED_DATE"));
			row.setStatementYear(rs.getString("STATEMENT_YEAR"));
			return row;
		}
	};

	private RowMapper<RequestForm> formMapping = new RowMapper<RequestForm>() {
		@Override
		public RequestForm mapRow(ResultSet rs, int args1) throws SQLException {
			RequestForm row = new RequestForm();
			row.setAccountName(rs.getString("ACCOUNT_NAME"));
			row.setAccountNo(rs.getString("ACCOUNT_NO"));
			row.setAccountType(rs.getString("ACCOUNTTYPE"));
			row.setAddress(rs.getString("ADDRESS"));
			row.setAmount(rs.getBigDecimal("AMOUNT"));
			row.setAmountDbd(rs.getBigDecimal("AMOUNT_DBD"));
			row.setAmountTmb(rs.getBigDecimal("AMOUNT_TMB"));
			row.setBranch(rs.getString("BRANCH"));
			row.setCaNumber(rs.getString("CA_NUMBER"));
			row.setCertificateFile(rs.getString("CERTIFICATE_FILE"));
			row.setCerTypeCode(rs.getString("CERTYPE_CODE"));
			row.setChangeNameFile(rs.getString("CHANGENAME_FILE"));
			row.setCheckerById(rs.getString("CHECKER_BY_ID"));
			row.setCheckerByName(rs.getString("CHECKER_BY_NAME"));
			row.setCompanyName(rs.getString("COMPANY_NAME"));
			row.setCountPayment(rs.getInt("COUNT_PAYMENT"));
			row.setCreatedById(rs.getString("CREATED_BY_ID"));
			row.setCreatedByName(rs.getString("CREATED_BY_NAME"));
			row.setCreatedDateTime(rs.getTimestamp("CREATED_DATETIME"));
			row.setCustomerName(rs.getString("CUSTOMER_NAME"));
			row.setCustomerNameReceipt(rs.getString("CUSTOMER_NAMERECEIPT"));
			row.setCustsegmentCode(rs.getString("CUSTSEGMENT_CODE"));
			row.setDebitAccountType(rs.getString("DEBIT_ACCOUNT_TYPE"));
			row.setDepartment(rs.getString("DEPARTMENT"));
			row.setErrorDescription(rs.getString("ERROR_DESCRIPTION"));
			row.setGlType(rs.getString("GLTYPE"));
			row.setIdCardFile(rs.getString("IDCARD_FILE"));
			row.setMakerById(rs.getString("MAKER_BY_ID"));
			row.setMakerByName(rs.getString("MAKER_BY_NAME"));
			row.setOrganizeId(rs.getString("ORGANIZE_ID"));
			row.setPaidTypeCode(rs.getString("PAIDTYPE_CODE"));
			row.setPayLoadTs(rs.getTimestamp("PAYLOADTS"));
			row.setPaymentBranchCode(rs.getString("PAYMENT_BRANCHCODE"));
			row.setPaymentDate(rs.getTimestamp("PAYMENT_DATE"));
			row.setPaymentStatus(rs.getString("PAYMENT_STATUS"));
			row.setPostDate(rs.getTimestamp("POSTDATE"));
			row.setReceiptFile(rs.getString("RECEIPT_FILE"));
			row.setReceiptNo(rs.getString("RECEIPT_NO"));
			row.setRef1(rs.getString("REF1"));
			row.setRef2(rs.getString("REF2"));
			row.setRejectReasonCode(rs.getString("REJECTREASON_CODE"));
			row.setRejectReasonOther(rs.getString("REJECTREASON_OTHER"));
			row.setRemark(rs.getString("REMARK"));
			row.setReqFormId(rs.getLong("REQFORM_ID"));
			row.setRequestDate(rs.getTimestamp("REQUEST_DATE"));
			row.setRequestFormFile(rs.getString("REQUESTFORM_FILE"));
			row.setStatus(rs.getString("STATUS"));
			row.setTelephone(rs.getString("TELEPHONE"));
			row.setTmbRequestNo(rs.getString("TMB_REQUESTNO"));
			row.setTranCode(rs.getString("TRANCODE"));
			row.setUpdatedById(rs.getString("UPDATED_BY_ID"));
			row.setUpdatedByName(rs.getString("UPDATED_BY_NAME"));
			row.setUpdatedDateTime(rs.getTimestamp("UPDATED_DATETIME"));
			row.setLockFlag(rs.getInt("LOCK_FLAG"));
			row.setMajorNo(rs.getString("MAJOR_NO"));
			row.setAmountTmbVat(rs.getBigDecimal("AMOUNT_VAT_TMB"));
			return row;
		}
	};
	
	private RowMapper<EcmMasterData> ecmMasterMapper = new RowMapper<EcmMasterData>() {
		@Override
		public EcmMasterData mapRow(ResultSet rs, int arg1) throws SQLException {
			EcmMasterData list = new EcmMasterData();
			list.setTypeShortName(rs.getString("TYPE_SHORT_NAME"));
			list.setArchivalPeriod(rs.getInt("ARCHIVAL_PERIOD"));
			list.setDisposalPeriod(rs.getInt("DISPOSAL_PERIOD"));
			list.setTypeNameTh(rs.getString("TYPE_NAME_TH"));
			list.setTypeNameEn(rs.getString("TYPE_NAME_EN"));

			return list;
		}
	};
	
	public int checkDuplicate(Nrq02000FormVo form) {
		StringBuilder sql = new StringBuilder(" ");
		sql.append("  SELECT COUNT(*) FROM ECERT_REQUEST_FORM WHERE ORGANIZE_ID = ?  AND CAST(REQUEST_DATE AS DATE)  =  ? AND CERTYPE_CODE = ? ");
		List<Object> params = new ArrayList<>();
		params.add(form.getCorpNo());
//		params.add( EcerDateUtils.formatDDMMYYYYDate(new Date()));
		params.add( DateConstant.convertStrDDMMYYYYToDate(DateConstant.convertDateToStrDDMMYYYY(new Date())));
		params.add(form.getReqTypeSelect());

		int result = jdbcTemplate.queryForObject(sql.toString(), params.toArray(), Integer.class);

		return result;
	}
	
	public ReqReceiptVo findRequestReceiptByReqID (Long reqID) {
		StringBuilder sql = new StringBuilder(" ");
		sql.append("   SELECT * FROM ECERT_REQFORM_RECEIPT WHERE REQFORM_ID = ?  ORDER BY CREATED_DATETIME DESC ");
		List<Object> params = new ArrayList<>();
		params.add(reqID);
		List<ReqReceiptVo> result = jdbcTemplate.query(sql.toString(), params.toArray(), reqReceiptMasterMapper);
		return result.get(0);
	}
	
	public int countRequestReceiptByReqID (Long reqID) {
		StringBuilder sql = new StringBuilder(" ");
		sql.append("  SELECT COUNT(1) from ECERT_REQFORM_RECEIPT  WHERE REQFORM_ID  = ?  ");
		List<Object> params = new ArrayList<>();
		params.add(reqID);
		int result = jdbcTemplate.queryForObject(sql.toString(), params.toArray(), Integer.class);
		return result;
	}
	
	public List<ReqReceiptVo> findReceiptByReqID(Long reqFormId) {
		List<Object> params = new ArrayList<>();
		StringBuilder sql = new StringBuilder("");
		sql.append(" SELECT * FROM ECERT_REQFORM_RECEIPT  WHERE REQFORM_ID = ? "); 
		sql.append(" AND CREATED_DATETIME = ( SELECT MAX(CREATED_DATETIME) FROM ECERT_REQFORM_RECEIPT  WHERE REQFORM_ID = ? ) ");
		params.add(reqFormId);
		params.add(reqFormId);
		List<ReqReceiptVo> receipt = jdbcTemplate.query(sql.toString(), params.toArray(), reqReceiptMasterMapper);
		return receipt;
	}
	
	private RowMapper<ReqReceiptVo> reqReceiptMasterMapper = new RowMapper<ReqReceiptVo>() {
		@Override
		public ReqReceiptVo mapRow(ResultSet rs, int arg1) throws SQLException {
			ReqReceiptVo list = new ReqReceiptVo();
			list.setReceipt_id(rs.getLong("RECEIPT_ID"));
			list.setTmb_requestno(rs.getString("TMB_REQUESTNO"));
			list.setReceipt_no(rs.getString("RECEIPT_NO"));
			list.setReceipt_date(rs.getTimestamp("RECEIPT_DATE"));
			list.setCustomer_name(rs.getString("CUSTOMER_NAME"));
			list.setOrganize_id(rs.getString("ORGANIZE_ID"));
			list.setAddress(rs.getString("ADDRESS"));
			list.setMajor_no(rs.getString("MAJOR_NO"));
			list.setAmount(rs.getBigDecimal("AMOUNT"));
			list.setAmount_dbd(rs.getBigDecimal("AMOUNT_DBD"));
			list.setAmount_tmb(rs.getBigDecimal("AMOUNT_TMB"));
			list.setAmount_vat_tmb(rs.getBigDecimal("AMOUNT_VAT_TMB"));
			list.setPrint_count(rs.getInt("PRINT_COUNT"));
			list.setReason(rs.getString("REASON"));
			list.setDelete_flag(rs.getInt("DELETE_FLAG"));
			list.setCancel_flag(rs.getInt("CANCEL_FLAG"));
			list.setFile_name(rs.getString("FILE_NAME"));
			list.setReceipt_no_reference(rs.getString("RECEIPT_NO_REFERENCE"));
			
			return list;
		}
	};

}
