package com.softtek.comp;

public class Student extends Person {
	private String course;
	private int rollno;
	public Student(String name, String addrs, AdharDetails aadhar, String course, int rollno) {
		super(name, addrs, aadhar);
		this.course = course;
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [course=" + course + ", rollno=" + rollno + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	

}
