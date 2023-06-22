package com.softtek.Bo;

public class patientBo {
	private String pnmae;
	private String addrs;
	private double perdaycharge;
	private double noofdays;
	private double totalbill;
	
	public double getTotalbill() {
		return totalbill;
	}
	public void setTotalbill(double totalbill) {
		this.totalbill = totalbill;
	}
	public String getPnmae() {
		return pnmae;
	}
	public void setPnmae(String pnmae) {
		this.pnmae = pnmae;
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
		return "patientBo [pnmae=" + pnmae + ", addrs=" + addrs + ", perdaycharge=" + perdaycharge + ", noofdays="
				+ noofdays + ", totalbill=" + totalbill + "]";
	}
	
	
	
	

}
