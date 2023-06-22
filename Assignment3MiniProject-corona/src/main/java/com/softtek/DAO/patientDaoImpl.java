package com.softtek.DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.softtek.Bo.patientBo;

public class patientDaoImpl implements IpatientDao{
	private DataSource ds;
	
	public patientDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public patientDaoImpl(DataSource ds) {
		super();
		this.ds = ds;
	}

	
	public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	private final String Patient_Insert_Query="insert into patienttable (pname,addrs,perdaycharge,days,totalbill) value(?,?,?,?,?)";
	
	@Override
	public int insertPatient(patientBo bo) throws SQLException {
		// TODO Auto-generated method stub
		
		int count=0;
		try(Connection con= ds.getConnection();
				PreparedStatement ps= con.prepareStatement(Patient_Insert_Query);){
			if(ps!=null) {
			ps.setString(1, bo.getPnmae());
			ps.setString(2, bo.getAddrs());
			ps.setDouble(3, bo.getPerdaycharge());
			ps.setDouble(4, bo.getNoofdays());
			ps.setDouble(5, bo.getTotalbill());
			 count = ps.executeUpdate();
			}
			return count;
		}
	}

}
