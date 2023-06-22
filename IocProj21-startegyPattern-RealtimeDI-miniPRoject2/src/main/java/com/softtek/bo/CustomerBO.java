package com.softtek.bo;

public class CustomerBO {
	private Integer cno;
	private String cname;
	private String cadd;
	private Double pamt;
	private Double Intramt;

	public CustomerBO() {
		super();
		System.out.println("CustomerBO.0 param trace");
	}

	public CustomerBO(Integer cno, String cname, String cadd, Double pamt, Double intramt) {
		
		super();
		System.out.println("CustomerBO.1 param constructor");
		this.cno = cno;
		this.cname = cname;
		this.cadd = cadd;
		this.pamt = pamt;
		Intramt = intramt;
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

	public Double getIntramt() {
		return Intramt;
	}

	public void setIntramt(Double intramt) {
		Intramt = intramt;
	}

}
