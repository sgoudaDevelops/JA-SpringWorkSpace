package com.softtek.controller;

import com.softtek.dto.guestDTO;
import com.softtek.service.IguestMgmtService;
import com.softtek.vo.guestVo;

public final class guestController {
	// HAs a property
	private IguestMgmtService service;

	public guestController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public guestController(IguestMgmtService service) {
		super();
		System.out.println("MainController.1 param controller");
		this.service = service;
	}

	public String processCustomer(guestVo vo) throws Exception
	{
		guestDTO custDTO=new guestDTO();
		custDTO.setGname(vo.getGname());
		custDTO.setAddrs(vo.getAddrs());
		custDTO.setNoofday(Double.parseDouble(vo.getNoofday()));
		custDTO.setPerdaycharge(Double.parseDouble(vo.getPerdaycharge()));
		
		//use SErvice
		
		String resultMsg=service.registerCustomer(custDTO);
		return resultMsg;
	
	}

	@Override
	public String toString() {
		return "MainController [service=" + service + "]";
	}
	

}
