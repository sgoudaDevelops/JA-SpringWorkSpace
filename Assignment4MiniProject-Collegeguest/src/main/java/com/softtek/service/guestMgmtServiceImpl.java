package com.softtek.service;


import com.softtek.bo.guestBO;
import com.softtek.dao.IGuestDAO;
import com.softtek.dto.guestDTO;

public class guestMgmtServiceImpl  implements IguestMgmtService{
	
	//has a relationship
	private IGuestDAO dao;
	

	public guestMgmtServiceImpl(IGuestDAO dao) {
		super();
		System.out.println("CustomerMgmtServiceImpl.1 param constructor");
		this.dao = dao;
	}


	@Override
	public String registerCustomer(guestDTO dto) throws Exception {
		// TODO Auto-generated method stub
	
		double totallbill=dto.getNoofday()*dto.getPerdaycharge();
		
		guestBO custBo= new guestBO();
		custBo.setGname(dto.getGname());
		custBo.setAddrs(dto.getAddrs());
		custBo.setNoofday(dto.getNoofday());
		custBo.setPerdaycharge(dto.getPerdaycharge());
		custBo.setBillamount(totallbill);
		
		
		// use DAO
		int count;
			count = dao.insert(custBo);
		return count==0?"data storage failed":"data stored succesfull :: total bill amount::"
			+ totallbill;
	}


	@Override
	public String toString() {
		return "CustomerMgmtServiceImpl [dao=" + dao + "]";
	}
	
	

	

}
