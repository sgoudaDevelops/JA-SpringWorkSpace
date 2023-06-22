package com.softtek.bo;

public class guestBO {
	private String gname ;
	private String addrs;
	private double noofday;
	private double perdaycharge;
	private double billamount ;
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public double getNoofday() {
		return noofday;
	}
	public void setNoofday(double noofday) {
		this.noofday = noofday;
	}
	public double getPerdaycharge() {
		return perdaycharge;
	}
	public void setPerdaycharge(double perdaycharge) {
		this.perdaycharge = perdaycharge;
	}
	public double getBillamount() {
		return billamount;
	}
	public void setBillamount(double billamount) {
		this.billamount = billamount;
	}
	@Override
	public String toString() {
		return "guestBO [gname=" + gname + ", addrs=" + addrs + ", noofday=" + noofday + ", perdaycharge="
				+ perdaycharge + ", billamount=" + billamount + "]";
	}
	
	
	
	
	

}
