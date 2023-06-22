package com.softtek.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.softtek.bo.guestBO;

public class guestDAOImpl implements IGuestDAO {
	// Has-a-property;
	private DataSource ds;
	final String guest_Insert_Query="insert into guesttable (gname,gaddrs,noofdays,perdaycharge,totalbill) values(?,?,?,?,?)";

	// For constructor Injection
	public guestDAOImpl(DataSource ds) {
		System.out.println("1 param constructor guestDao");
		this.ds = ds;
	}

	@Override
	public int insert(guestBO bo) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("CustomerDAOImpl.insert()");
		int count=0;
		try(Connection con= ds.getConnection();
				PreparedStatement ps= con.prepareStatement(guest_Insert_Query);){
			if(ps!=null) {
				ps.setString(1,bo.getGname());
				ps.setString(2,bo.getAddrs());
				ps.setDouble(3,bo.getNoofday());
				ps.setDouble(4,bo.getPerdaycharge());
				ps.setDouble(5,bo.getBillamount());
				count=ps.executeUpdate();
				
			}
		}
		
		return count;
	}
}
