package com.softtek.vo;

public class patientVo {
	 private String pname;
	private String addrs;
	private String perdaycharge;
	private String noofdays;
	
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

	public String getPerdaycharge() {
		return perdaycharge;
	}

	public void setPerdaycharge(String perdaycharge) {
		this.perdaycharge = perdaycharge;
	}

	public String getNoofdays() {
		return noofdays;
	}

	public void setNoofdays(String noofdays) {
		this.noofdays = noofdays;
	}

	@Override
	public String toString() {
		return "customerVo [pname=" + pname + ", addrs=" + addrs + ", perdaycharge=" + perdaycharge + ", noofdays="
				+ noofdays + "]";
	}
	

}
