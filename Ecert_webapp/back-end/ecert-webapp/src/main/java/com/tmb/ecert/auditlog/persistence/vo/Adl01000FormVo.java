package com.tmb.ecert.auditlog.persistence.vo;

import th.co.baiwa.buckwaframework.common.bean.DatatableRequest;

public class Adl01000FormVo extends DatatableRequest {

	private static final long serialVersionUID = -362043556309172710L;
	public String dateForm;
	public String dateTo;
	public String createdById;
	public String actionCode;

	public String getDateForm() {
		return dateForm;
	}

	public void setDateForm(String dateForm) {
		this.dateForm = dateForm;
	}

	public String getDateTo() {
		return dateTo;
	}

	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}

	public String getCreatedById() {
		return createdById;
	}

	public void setCreatedById(String createdById) {
		this.createdById = createdById;
	}

	public String getActionCode() {
		return actionCode;
	}

	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}

}
