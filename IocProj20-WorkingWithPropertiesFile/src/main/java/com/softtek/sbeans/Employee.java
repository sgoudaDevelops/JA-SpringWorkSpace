package com.softtek.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("emp")
@PropertySource("classpath:com/softtek/commons/info.properties")
public class Employee {
	// @value("101") -directly
	@Value("${emp.id}")
	private String empno;
	@Value("${emp.name}")
	private String empname;
	@Value("${emp.addrs}")
	private String empaddrs;

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empname=" + empname + ", empaddrs=" + empaddrs + "]";
	}

}
