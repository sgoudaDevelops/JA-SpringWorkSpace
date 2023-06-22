package com.softtek.comp;

public class Employee extends Person {
	private String company;
	private double salary;

	public Employee(String name, String addrs, AdharDetails aadhar, String company, double salary) {
		super(name, addrs, aadhar);
		this.company = company;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [company=" + company + ", salary=" + salary + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
