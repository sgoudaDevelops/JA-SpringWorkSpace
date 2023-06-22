package com.softtek.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable {
	private Integer cno;
	private String cname;
	private String cadd;
	private Double pamt;
	private Double Rate;
	private Double time;
	
	
	

	public CustomerDTO() {
		super();
		System.out.println("CustomerDTO.o param constructor");
		// TODO Auto-generated constructor stub
	}



	public CustomerDTO(Integer cno, String cname, String cadd, Double pamt, Double rate, Double time) {
		super();
		System.out.println("CustomerDTO.1 param constructor");
		this.cno = cno;
		this.cname = cname;
		this.cadd = cadd;
		this.pamt = pamt;
		Rate = rate;
		this.time = time;
	}



	public Integer getCno() {
		return cno;
	}



	public void setCno(Integer cno) {
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



	public Double getPamt() {
		return pamt;
	}



	public void setPamt(Double pamt) {
		this.pamt = pamt;
	}



	public Double getRate() {
		return Rate;
	}



	public void setRate(Double rate) {
		Rate = rate;
	}



	public Double getTime() {
		return time;
	}



	public void setTime(Double time) {
		this.time = time;
	}



	@Override
	public String toString() {
		return "CustomerDTO [cadd=" + cadd + ", cname=" + cname + ", cno=" + cno + ", pamt=" + pamt + ", Rate=" + Rate
				+ ", time=" + time + "]";
	}
	
	

}
