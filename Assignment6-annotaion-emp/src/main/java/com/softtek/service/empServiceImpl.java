package com.softtek.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.softtek.Dao.IempDao;
import com.softtek.bo.empBo;
import com.softtek.dto.empDto;

@Service
public class empServiceImpl implements IempService {
	@Autowired
	//@Qualifier("mysql2")
	@Qualifier("dao")
	private IempDao iempdao;
	

	public empServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public empServiceImpl(IempDao iempdao) {
		super();
		this.iempdao = iempdao;
	}

//	public IempDao getIempdao() {
//		return iempdao;
//	}
//
//	public void setIempdao(IempDao iempdao) {
//		this.iempdao = iempdao;
//	}
	

	@Override
	public String toString() {
		return "empServiceImpl [iempdao=" + iempdao + "]";
	}

	@Override
	public String GrossNetsal(empDto dto) throws SQLException {
		double grossSal;
		double netSal;   
		grossSal=(1.4*dto.getBasicSal());
		netSal=1.2*dto.getBasicSal();    
		empBo bo=new empBo();
		bo.setEname(dto.getEname());
		bo.setAddrs(dto.getAddrs());
		bo.setGrossSal(grossSal);
		bo.setBaseSal(dto.getBasicSal());
		bo.setNetSal(netSal);
		iempdao.insertEmp(bo);
		return "gross sal of the employee :"+grossSal+"  net sal of the employee :"+ netSal;
	}

}
