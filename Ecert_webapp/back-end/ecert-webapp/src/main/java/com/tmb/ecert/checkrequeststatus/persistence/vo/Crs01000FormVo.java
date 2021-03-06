package com.tmb.ecert.checkrequeststatus.persistence.vo;

import th.co.baiwa.buckwaframework.common.bean.DatatableRequest;

public class Crs01000FormVo extends DatatableRequest {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2424139912314074646L;
	private String reqDate;
	private String toReqDate;
	private String companyName;
	private String organizeId;
	private String tmbReqNo;
	private String status;
	private Integer lockFlag;
	private String createdById;
	private String updatedById;
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCreatedById() {
		return createdById;
	}

	public void setCreatedById(String createdById) {
		this.createdById = createdById;
	}

	public Integer getLockFlag() {
		return lockFlag;
	}

	public void setLockFlag(Integer lockFlag) {
		this.lockFlag = lockFlag;
	}

	public String getUpdatedById() {
		return updatedById;
	}

	public void setUpdatedById(String updatedById) {
		this.updatedById = updatedById;
	}

	public String getReqDate() {
		return reqDate;
	}

	public void setReqDate(String reqDate) {
		this.reqDate = reqDate;
	}

	public String getToReqDate() {
		return toReqDate;
	}

	public void setToReqDate(String toReqDate) {
		this.toReqDate = toReqDate;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getOrganizeId() {
		return organizeId;
	}

	public void setOrganizeId(String organizeId) {
		this.organizeId = organizeId;
	}

	public String getTmbReqNo() {
		return tmbReqNo;
	}

	public void setTmbReqNo(String tmbReqNo) {
		this.tmbReqNo = tmbReqNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Crs01000FormVo [reqDate=" + reqDate + ", toReqDate=" + toReqDate + ", companyName=" + companyName
				+ ", organizeId=" + organizeId + ", tmbReqNo=" + tmbReqNo + ", status=" + status + "]";
	}

}
