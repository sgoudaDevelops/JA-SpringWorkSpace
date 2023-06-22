package com.softtek.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.softtek.dto.empDto;
import com.softtek.service.IempService;
import com.softtek.vo.Employee;

@Controller("empCon")
public class empController {
	@Autowired
	private IempService iempservice;

	public empController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public empController(IempService iempservice) {
		super();
		this.iempservice = iempservice;
	}

//	public IempService getIempservice() {
//		return iempservice;
//	}
//
//	public void setIempservice(IempService iempservice) {
//		this.iempservice = iempservice;
//	}

	public String processEmp(Employee e) throws SQLException {
		empDto dto = new empDto();
		dto.setAddrs(e.getAddrs());
		dto.setEname(e.getEname());
		dto.setBasicSal(Double.parseDouble(e.getBasicSal()));
		String res = iempservice.GrossNetsal(dto);
		return res;
	}

	@Override
	public String toString() {
		return "empController [iempservice=" + iempservice + "]";
	}

}
