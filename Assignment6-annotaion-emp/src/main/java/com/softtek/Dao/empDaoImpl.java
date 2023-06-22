package com.softtek.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.softtek.bo.empBo;

@Repository("mysql")
public class empDaoImpl implements IempDao {
	@Autowired
	private DataSource ds;
	final String Insert_Query = "insert into emptable (empname,addrs,basicsal,grosssal,netsal) values (?,?,?,?,?)";

	public empDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public empDaoImpl(DataSource ds) {
		super();
		this.ds = ds;
		
	}

//	public DataSource getDs() {
//		return ds;
//	}
//
//	public void setDs(DataSource ds) {
//		this.ds = ds;
//	}

	@Override
	public int insertEmp(empBo bo) throws SQLException {
		int count = 0;
		try (Connection connection = ds.getConnection();
				PreparedStatement ps = connection.prepareStatement(Insert_Query);) {
			if (ps != null) {
				ps.setString(1, bo.getEname());
				ps.setString(2, bo.getAddrs());
				ps.setDouble(3, bo.getBaseSal());
				ps.setDouble(4, bo.getGrossSal());
				ps.setDouble(5, bo.getNetSal());

				count = ps.executeUpdate();
			}
		}
		return count;
	}

}
