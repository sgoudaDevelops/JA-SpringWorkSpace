package com.softtek.comp;

public class AdharDetails {
	private long adharno;
	private int age;
	private long mobNo;

	public AdharDetails(long adharno, int age, long mobNo) {
		super();
		this.adharno = adharno;
		this.age = age;
		this.mobNo = mobNo;
	}

	@Override
	public String toString() {
		return "AdharDetails [adharno=" + adharno + ", age=" + age + ", mobNo=" + mobNo + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
