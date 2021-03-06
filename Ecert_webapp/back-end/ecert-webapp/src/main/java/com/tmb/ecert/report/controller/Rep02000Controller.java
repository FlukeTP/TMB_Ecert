package com.tmb.ecert.report.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tmb.ecert.common.constant.ProjectConstant;
import com.tmb.ecert.common.constant.ProjectConstant.EMAIL_SERVICE;
import com.tmb.ecert.common.service.EmailService;
import com.tmb.ecert.report.persistence.vo.Rep02000FormVo;
import com.tmb.ecert.report.persistence.vo.Rep02000Vo;
import com.tmb.ecert.report.service.Rep02000tService;

@Controller
@RequestMapping("api/rep/rep02000")
public class Rep02000Controller {
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Rep02000tService rep02000tService;
	
	@Autowired
	private EmailService emailService;
	
	@PostMapping("/list")
	@ResponseBody
	public List<Rep02000Vo> list(@RequestBody Rep02000FormVo formVo){
		List<Rep02000Vo> rep02000VoList = new ArrayList<Rep02000Vo>();
		try {
			rep02000VoList = rep02000tService.findAll(formVo);
			
		} catch (Exception e) {
			log.error("Error ! ==> Rep02000Controller method list",e);
		}
		
		return rep02000VoList;
	}
	@GetMapping("/exportFile")
	@ResponseBody
	public  void exportFile(@ModelAttribute Rep02000FormVo formVo, HttpServletResponse response) throws Exception {
		try {
			rep02000tService.exportFile(formVo, response);
		} catch (Exception e) {
			emailService.sendEmailAbnormal(new Date(), ProjectConstant.EMAIL_SERVICE.FUNCTION_NAME_EXPORT_EXCEL, e.toString());
			log.error("Error ! ==> Rep02000Controller method exportFile",e);
		}
		
	}

}

 