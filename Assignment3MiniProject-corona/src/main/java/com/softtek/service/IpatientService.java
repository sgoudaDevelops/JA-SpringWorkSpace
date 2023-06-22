package com.softtek.service;

import java.sql.SQLException;

import com.softtek.dto.patientDto;

public interface IpatientService {
       String calculatebill(patientDto dto) throws SQLException;
}
