package com.softtek.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.softtek.bo.CustomerBO;

@Repository("mysqlDAO")
public class CustomerDAOImpl implements ICustomerDAO {
	// Has-a-property;
	@Autowired
	private DataSource ds;
	final String Customer_Insert_Query = "insert into realtimedi_customer (CNAME,CADD,PAMT,INTRAMT) values(?,?,?,?)";

	// For constructor Injection
	public CustomerDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insert(CustomerBO bo) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("CustomerDAOImpl.insert()");
		int count = 0;
		try (Connection con = ds.getConnection(); PreparedStatement ps = con.prepareStatement(Customer_Insert_Query);) {
			if (ps != null) {
				ps.setString(1, bo.getCname());
				ps.setString(2, bo.getCadd());
				ps.setDouble(3, bo.getPamt());
				ps.setDouble(4, bo.getIntramt());
				count = ps.executeUpdate();

			}
		}

		return count;
	}
}
