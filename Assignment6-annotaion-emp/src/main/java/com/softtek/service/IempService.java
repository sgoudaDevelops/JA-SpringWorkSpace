package com.softtek.service;

import java.sql.SQLException;

import com.softtek.dto.empDto;

public interface IempService {
  String GrossNetsal(empDto dto) throws SQLException;
}
