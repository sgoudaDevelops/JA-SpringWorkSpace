package com.softtek.vo;

public class Employee {
	private String Ename;
	private String addrs;
	private String basicSal;
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public String getBasicSal() {
		return basicSal;
	}
	public void setBasicSal(String basicSal) {
		this.basicSal = basicSal;
	}
	@Override
	public String toString() {
		return "Employee [Ename=" + Ename + ", addrs=" + addrs + ", basicSal=" + basicSal + "]";
	}
	

}
