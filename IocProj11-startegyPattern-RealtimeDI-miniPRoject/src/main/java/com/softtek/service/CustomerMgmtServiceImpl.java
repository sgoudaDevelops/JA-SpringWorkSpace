package com.softtek.service;


import com.softtek.bo.CustomerBO;
import com.softtek.dao.ICustomerDAO;
import com.softtek.dto.CustomerDTO;

public class CustomerMgmtServiceImpl  implements ICustomerMgmtService{
	
	//has a relationship
	private ICustomerDAO dao;
	

	public CustomerMgmtServiceImpl(ICustomerDAO dao) {
		super();
		System.out.println("CustomerMgmtServiceImpl.1 param constructor");
		this.dao = dao;
	}


	@Override
	public String registerCustomer(CustomerDTO dto) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("CustomerMgmtServiceImpl.registerCustomer()");
		double  intramt=(dto.getPamt()*dto.getRate()*(dto.getTime()/12))/100.0;
		// prepare the customer the clas obj having persistable data
		CustomerBO custBo= new CustomerBO();
		custBo.setCname(dto.getCname());
		custBo.setCadd(dto.getCadd());
		custBo.setCno(dto.getCno());
		custBo.setPamt(dto.getPamt());
		custBo.setIntramt(intramt);
		
		// use DAO
		int count;
			count = dao.insert(custBo);
		return count==0?"registarion failed":"registration succesfull ::Interest amount::"
			+intramt;
	}


	@Override
	public String toString() {
		return "CustomerMgmtServiceImpl [dao=" + dao + "]";
	}
	
	

	

}
