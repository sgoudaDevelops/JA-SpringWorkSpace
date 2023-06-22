package com.softtek.service;

import java.sql.SQLException;

import com.softtek.Bo.patientBo;
import com.softtek.DAO.IpatientDao;
import com.softtek.DAO.patientDaoImpl;
import com.softtek.dto.patientDto;

public class patientImpl implements IpatientService{
	private IpatientDao ipatientdao;
	

	public IpatientDao getIpatientdao() {
		return ipatientdao;
	}

	public void setIpatientdao(IpatientDao ipatientdao) {
		this.ipatientdao = ipatientdao;
	}

	public patientImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public patientImpl(IpatientDao ipatientdao) {
		super();
		this.ipatientdao = ipatientdao;
	}

	@Override
	public String calculatebill(patientDto dto) throws SQLException {
		// TODO Auto-generated method stub
		double bill= (dto.getNoofdays()*dto.getPerdaycharge());
		patientBo bo= new patientBo();
		
		bo.setPnmae(dto.getPname());
		bo.setAddrs(dto.getAddrs());
		bo.setNoofdays(dto.getNoofdays());
		bo.setPerdaycharge(dto.getPerdaycharge());
		bo.setTotalbill(bill);
     
     	// calling the insert method
     	int count=0;
			count = ipatientdao.insertPatient(bo);
		return count==0?"patient data is failed to store":"patient data stored succesfully :: total bill " + bill;
		
     	
		//return "Hii the total bill of your's for "+ dto.getNoofdays()+" days "+ " is " + bill +" rupees";
	}

}


