package com.softtek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.softtek.dto.CustomerDTO;
import com.softtek.service.ICustomerMgmtService;
import com.softtek.vo.CustomerVo;

@Controller("controller")
public final class MainController {
	// HAs a property
	@Autowired
	private ICustomerMgmtService service;

	public MainController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MainController(ICustomerMgmtService service) {
		super();
		System.out.println("MainController.1 param controller");
		this.service = service;
	}

	public String processCustomer(CustomerVo vo) throws Exception {
		CustomerDTO custDTO = new CustomerDTO();
		custDTO.setCname(vo.getCname());
		custDTO.setCadd(vo.getCadd());
		custDTO.setPamt(Double.parseDouble(vo.getPamt()));
		custDTO.setTime(Double.parseDouble(vo.getTime()));
		custDTO.setRate(Double.parseDouble(vo.getRate()));
		// use SErvice
		System.out.println("reaching the register customer");
		String resultMsg = service.registerCustomer(custDTO);
		return resultMsg;

	}

	@Override
	public String toString() {
		return "MainController [service=" + service + "]";
	}

}
