package com.softtek.controller;

import java.sql.SQLException;

import com.softtek.dto.patientDto;
import com.softtek.service.IpatientService;
import com.softtek.vo.patientVo;


public class patientController {
	IpatientService ipatientService;
	

	public patientController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public patientController(IpatientService ipatientService) {
		super();
		this.ipatientService = ipatientService;
	}

	public IpatientService getIpatientService() {
		return ipatientService;
	}

	public void setIpatientService(IpatientService ipatientService) {
		this.ipatientService = ipatientService;
	}
     
	public String ProcessCustomer(patientVo vo) throws SQLException
	{ 
		patientDto dto = new patientDto();
		dto.setPname(vo.getPname());
		dto.setNoofdays(Double.parseDouble(vo.getNoofdays()));
		dto.setPerdaycharge(Double.parseDouble(vo.getPerdaycharge()));
		dto.setAddrs(vo.getAddrs());
		String calculatebill = ipatientService.calculatebill(dto);
		return calculatebill;
	}
	
	@Override
	public String toString() {
		return "patientController [ipatientService=" + ipatientService + "]";
	}
	

}
