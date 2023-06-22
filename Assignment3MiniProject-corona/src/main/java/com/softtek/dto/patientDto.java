package com.softtek.dto;

import java.io.Serializable;

public class patientDto implements Serializable{
	String pname;
	String addrs;
	Double perdaycharge;
	Double noofdays;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public double getPerdaycharge() {
		return perdaycharge;
	}
	public void setPerdaycharge(double perdaycharge) {
		this.perdaycharge = perdaycharge;
	}
	public double getNoofdays() {
		return noofdays;
	}
	public void setNoofdays(double noofdays) {
		this.noofdays = noofdays;
	}
	@Override
	public String toString() {
		return "patientDto [pname=" + pname + ", addrs=" + addrs + ", perdaycharge=" + perdaycharge + ", noofdays="
				+ noofdays + "]";
	}
	

}
