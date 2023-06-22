package com.softtek.service;

import com.softtek.dto.CustomerDTO;

public interface ICustomerMgmtService {

	String registerCustomer(CustomerDTO custDTO) throws Exception;

}
