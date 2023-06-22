package com.softtek.Dao;

import java.sql.SQLException;

import com.softtek.bo.empBo;

public interface IempDao {
   int insertEmp(empBo bo) throws SQLException;
}
