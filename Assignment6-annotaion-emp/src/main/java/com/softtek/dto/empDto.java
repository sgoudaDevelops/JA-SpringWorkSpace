package com.softtek.dto;

import java.io.Serializable;

public class empDto implements Serializable {
	private String ename;
	private String addrs;
	private Double basicSal;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public Double getBasicSal() {
		return basicSal;
	}
	public void setBasicSal(Double basicSal) {
		this.basicSal = basicSal;
	}
	@Override
	public String toString() {
		return "empDto [ename=" + ename + ", addrs=" + addrs + ", basicSal=" + basicSal + "]";
	}
	
}
