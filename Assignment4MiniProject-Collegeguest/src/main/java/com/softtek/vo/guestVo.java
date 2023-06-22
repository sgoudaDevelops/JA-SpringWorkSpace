package com.softtek.vo;

public class guestVo {
	private String gname ;
	private String addrs;
	private String noofday;
	private String  perdaycharge;
	private String billamount ;
	
	
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

	public String getNoofday() {
		return noofday;
	}

	public void setNoofday(String noofday) {
		this.noofday = noofday;
	}

	public String getPerdaycharge() {
		return perdaycharge;
	}

	public void setPerdaycharge(String perdaycharge) {
		this.perdaycharge = perdaycharge;
	}

	public String getBillamount() {
		return billamount;
	}

	public void setBillamount(String billamount) {
		this.billamount = billamount;
	}

	@Override
	public String toString() {
		return "CustomerVo [gname=" + gname + ", addrs=" + addrs + ", noofday=" + noofday + ", perdaycharge="
				+ perdaycharge + ", billamount=" + billamount + "]";
	}

	
	

	
	

}
