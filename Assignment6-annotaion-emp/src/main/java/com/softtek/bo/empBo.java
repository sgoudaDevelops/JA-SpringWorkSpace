package com.softtek.bo;

public class empBo {
	private String ename;
	private String addrs;
	private double baseSal;
	private double grossSal;
	private double netSal;
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
	public double getBaseSal() {
		return baseSal;
	}
	public void setBaseSal(double baseSal) {
		this.baseSal = baseSal;
	}
	public double getGrossSal() {
		return grossSal;
	}
	public void setGrossSal(double grossSal) {
		this.grossSal = grossSal;
	}
	public double getNetSal() {
		return netSal;
	}
	public void setNetSal(double netSal) {
		this.netSal = netSal;
	}
	@Override
	public String toString() {
		return "empBo [ename=" + ename + ", addrs=" + addrs + ", baseSal=" + baseSal + ", grossSal=" + grossSal
				+ ", netSal=" + netSal + "]";
	}
	

}
