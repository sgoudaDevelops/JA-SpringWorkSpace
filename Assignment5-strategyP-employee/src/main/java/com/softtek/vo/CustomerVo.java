package com.softtek.vo;

public class CustomerVo {
	private String cno;
	private String cname;
	private String cadd;
	private String rate;
	private String time;
	private String pamt;
	
	
	public CustomerVo() {
		super();
	 System.out.println("CustomerVo.0 param constructor");
		// TODO Auto-generated constructor stub
	}
	public CustomerVo(String cno, String cname, String cadd, String rate, String time, String pamt) {
		super();
		System.out.println("CustomerVo.1 param constructor");
		this.cno = cno;
		this.cname = cname;
		this.cadd = cadd;
		this.rate = rate;
		this.time = time;
		this.pamt = pamt;
	}
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCadd() {
		return cadd;
	}
	public void setCadd(String cadd) {
		this.cadd = cadd;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPamt() {
		return pamt;
	}
	public void setPamt(String pamt) {
		this.pamt = pamt;
	}
	
	
	

}
