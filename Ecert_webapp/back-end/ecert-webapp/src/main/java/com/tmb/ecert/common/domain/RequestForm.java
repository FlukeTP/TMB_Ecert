package com.tmb.ecert.common.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import th.co.baiwa.buckwaframework.common.bean.DatatableRequest;

public class RequestForm extends DatatableRequest {

	private static final long serialVersionUID = -5656949093847724841L;
	
	private Long reqFormId;
	private Timestamp requestDate;
	private String tmbRequestNo;

	private String cerTypeCode;
	private String organizeId;
	private String customerName;
	private String CompanyName;
	private String branch;
	private String custsegmentCode;
	private String caNumber;
	private String department;
	private String paidTypeCode;

	private String debitAccountType;
	private String tranCode;
	private String glType;
	private String accountType;
	private String accountNo;
	private String accountName;
	private String customerNameReceipt;
	private String telephone;
	private String requestFormFile;
	private String idCardFile;
	private String changeNameFile;

	private String certificateFile;
	private String address;
	private String remark;
	private Timestamp paymentDate;

	private Timestamp payLoadTs;
	private String paymentBranchCode;
	private Timestamp postDate;

	private String ref1;
	private String ref2;
	private BigDecimal amount;
	private BigDecimal amountTmb;
	private BigDecimal amountDbd;
	private String receiptNo;
	private String status;

	private String errorDescription;
	private String paymentStatus;
	private Integer countPayment;
	private String rejectReasonCode;
	private String rejectReasonOther;

	private String createdByDepartment;
	private String createdByGroup;
	private String createdByBelongto;
	private String createdByTel;
	private String createdByEmail;
	
	private String createdById;
	private String createdByName;
	private Timestamp createdDateTime;
	private String updatedById;
	private String updatedByName;
	private Timestamp updatedDateTime;

	private String makerById;
	private String makerByName;
	private String checkerById;
	private String checkerByName;
	private String majorNo;
	private BigDecimal amountTmbVat;

	private String officeCode;
	private Timestamp receiptDate;
	private String receiptFile;
	private Integer ecmFlag;
	
	private Integer lockFlag;
	private Integer deleteFlag;
	
	public BigDecimal getAmountTmbVat() {
		return amountTmbVat;
	}

	public void setAmountTmbVat(BigDecimal amountTmbVat) {
		this.amountTmbVat = amountTmbVat;
	}

	public String getMajorNo() {
		return majorNo;
	}

	public void setMajorNo(String majorNo) {
		this.majorNo = majorNo;
	}

	public String getCreatedByDepartment() {
		return createdByDepartment;
	}

	public void setCreatedByDepartment(String createdByDepartment) {
		this.createdByDepartment = createdByDepartment;
	}

	public String getCreatedByGroup() {
		return createdByGroup;
	}

	public void setCreatedByGroup(String createdByGroup) {
		this.createdByGroup = createdByGroup;
	}

	public String getCreatedByBelongto() {
		return createdByBelongto;
	}

	public void setCreatedByBelongto(String createdByBelongto) {
		this.createdByBelongto = createdByBelongto;
	}

	public String getCreatedByTel() {
		return createdByTel;
	}

	public void setCreatedByTel(String createdByTel) {
		this.createdByTel = createdByTel;
	}

	public String getCreatedByEmail() {
		return createdByEmail;
	}

	public void setCreatedByEmail(String createdByEmail) {
		this.createdByEmail = createdByEmail;
	}

	// optional
	private String uuid;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Integer getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(Integer deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public Integer getLockFlag() {
		return lockFlag;
	}

	public void setLockFlag(Integer lockFlag) {
		this.lockFlag = lockFlag;
	}

	public Integer getEcmFlag() {
		return ecmFlag;
	}

	public void setEcmFlag(Integer ecmFlag) {
		this.ecmFlag = ecmFlag;
	}

	private List<RequestCertificate> certificateList = new ArrayList<RequestCertificate>();

	public Long getReqFormId() {
		return reqFormId;
	}

	public void setReqFormId(Long reqFormId) {
		this.reqFormId = reqFormId;
	}

	public Timestamp getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Timestamp requestDate) {
		this.requestDate = requestDate;
	}

	public String getTmbRequestNo() {
		return tmbRequestNo;
	}

	public void setTmbRequestNo(String tmbRequestNo) {
		this.tmbRequestNo = tmbRequestNo;
	}

	public String getCerTypeCode() {
		return cerTypeCode;
	}

	public void setCerTypeCode(String cerTypeCode) {
		this.cerTypeCode = cerTypeCode;
	}

	public String getOrganizeId() {
		return organizeId;
	}

	public void setOrganizeId(String organizeId) {
		this.organizeId = organizeId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCustsegmentCode() {
		return custsegmentCode;
	}

	public void setCustsegmentCode(String custsegmentCode) {
		this.custsegmentCode = custsegmentCode;
	}

	public String getCaNumber() {
		return caNumber;
	}

	public void setCaNumber(String caNumber) {
		this.caNumber = caNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPaidTypeCode() {
		return paidTypeCode;
	}

	public void setPaidTypeCode(String paidTypeCode) {
		this.paidTypeCode = paidTypeCode;
	}

	public String getDebitAccountType() {
		return debitAccountType;
	}

	public void setDebitAccountType(String debitAccountType) {
		this.debitAccountType = debitAccountType;
	}

	public String getTranCode() {
		return tranCode;
	}

	public void setTranCode(String tranCode) {
		this.tranCode = tranCode;
	}

	public String getGlType() {
		return glType;
	}

	public void setGlType(String glType) {
		this.glType = glType;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getCustomerNameReceipt() {
		return customerNameReceipt;
	}

	public void setCustomerNameReceipt(String customerNameReceipt) {
		this.customerNameReceipt = customerNameReceipt;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getRequestFormFile() {
		return requestFormFile;
	}

	public void setRequestFormFile(String requestFormFile) {
		this.requestFormFile = requestFormFile;
	}

	public String getIdCardFile() {
		return idCardFile;
	}

	public void setIdCardFile(String idCardFile) {
		this.idCardFile = idCardFile;
	}

	public String getChangeNameFile() {
		return changeNameFile;
	}

	public void setChangeNameFile(String changeNameFile) {
		this.changeNameFile = changeNameFile;
	}

	public String getCertificateFile() {
		return certificateFile;
	}

	public void setCertificateFile(String certificateFile) {
		this.certificateFile = certificateFile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Timestamp getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Timestamp paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Timestamp getPayLoadTs() {
		return payLoadTs;
	}

	public void setPayLoadTs(Timestamp payLoadTs) {
		this.payLoadTs = payLoadTs;
	}

	public String getPaymentBranchCode() {
		return paymentBranchCode;
	}

	public void setPaymentBranchCode(String paymentBranchCode) {
		this.paymentBranchCode = paymentBranchCode;
	}

	public Timestamp getPostDate() {
		return postDate;
	}

	public void setPostDate(Timestamp postDate) {
		this.postDate = postDate;
	}

	public String getRef1() {
		return ref1;
	}

	public void setRef1(String ref1) {
		this.ref1 = ref1;
	}

	public String getRef2() {
		return ref2;
	}

	public void setRef2(String ref2) {
		this.ref2 = ref2;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getAmountTmb() {
		return amountTmb;
	}

	public void setAmountTmb(BigDecimal amountTmb) {
		this.amountTmb = amountTmb;
	}

	public BigDecimal getAmountDbd() {
		return amountDbd;
	}

	public void setAmountDbd(BigDecimal amountDbd) {
		this.amountDbd = amountDbd;
	}

	public String getReceiptNo() {
		return receiptNo;
	}

	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Integer getCountPayment() {
		return countPayment;
	}

	public void setCountPayment(Integer countPayment) {
		this.countPayment = countPayment;
	}

	public String getRejectReasonCode() {
		return rejectReasonCode;
	}

	public void setRejectReasonCode(String rejectReasonCode) {
		this.rejectReasonCode = rejectReasonCode;
	}

	public String getRejectReasonOther() {
		return rejectReasonOther;
	}

	public void setRejectReasonOther(String rejectReasonOther) {
		this.rejectReasonOther = rejectReasonOther;
	}

	public String getCreatedById() {
		return createdById;
	}

	public void setCreatedById(String createdById) {
		this.createdById = createdById;
	}

	public String getCreatedByName() {
		return createdByName;
	}

	public void setCreatedByName(String createdByName) {
		this.createdByName = createdByName;
	}

	public Timestamp getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getUpdatedById() {
		return updatedById;
	}

	public void setUpdatedById(String updatedById) {
		this.updatedById = updatedById;
	}

	public String getUpdatedByName() {
		return updatedByName;
	}

	public void setUpdatedByName(String updatedByName) {
		this.updatedByName = updatedByName;
	}

	public Timestamp getUpdatedDateTime() {
		return updatedDateTime;
	}

	public void setUpdatedDateTime(Timestamp updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}

	public String getMakerById() {
		return makerById;
	}

	public void setMakerById(String makerById) {
		this.makerById = makerById;
	}

	public String getMakerByName() {
		return makerByName;
	}

	public void setMakerByName(String makerByName) {
		this.makerByName = makerByName;
	}

	public String getCheckerById() {
		return checkerById;
	}

	public void setCheckerById(String checkerById) {
		this.checkerById = checkerById;
	}

	public String getCheckerByName() {
		return checkerByName;
	}

	public void setCheckerByName(String checkerByName) {
		this.checkerByName = checkerByName;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public Timestamp getReceiptDate() {
		return receiptDate;
	}

	public void setReceiptDate(Timestamp receiptDate) {
		this.receiptDate = receiptDate;
	}

	public String getReceiptFile() {
		return receiptFile;
	}

	public void setReceiptFile(String receiptFile) {
		this.receiptFile = receiptFile;
	}

	public List<RequestCertificate> getCertificateList() {
		return certificateList;
	}

	public void setCertificateList(List<RequestCertificate> certificateList) {
		this.certificateList = certificateList;
	}

	public void addCertificateList(RequestCertificate item) {
		certificateList.add(item);
	}

}
