package com.softtek.dto;

import java.io.Serializable;

public class guestDTO implements Serializable {
	private String gname;
	private String addrs;
	private Double noofday ;
	private Double perdaycharge;
	private Double billamount ;
	
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
	public Double getNoofday() {
		return noofday;
	}
	public void setNoofday(Double noofday) {
		this.noofday = noofday;
	}
	public Double getPerdaycharge() {
		return perdaycharge;
	}
	public void setPerdaycharge(Double perdaycharge) {
		this.perdaycharge = perdaycharge;
	}
	public Double getBillamount() {
		return billamount;
	}
	public void setBillamount(Double billamount) {
		this.billamount = billamount;
	}
	@Override
	public String toString() {
		return "guestDTO [gname=" + gname + ", addrs=" + addrs + ", noofday=" + noofday + ", perdaycharge="
				+ perdaycharge + ", billamount=" + billamount + "]";
	}
	
	
	


	
	

}
