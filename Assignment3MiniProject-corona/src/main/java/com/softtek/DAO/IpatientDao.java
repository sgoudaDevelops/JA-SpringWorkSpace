package com.softtek.DAO;

import java.sql.SQLException;

import com.softtek.Bo.patientBo;

public interface IpatientDao {
	public int insertPatient(patientBo bo) throws SQLException;

}
