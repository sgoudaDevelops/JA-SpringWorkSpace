package com.softtek.comp;

public abstract class Person {
	private String name;
	private String addrs;
	private AdharDetails aadhar;
	
	
	public Person(String name, String addrs, AdharDetails aadhar) {
		super();
		this.name = name;
		this.addrs = addrs;
		this.aadhar = aadhar;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", addrs=" + addrs + ", aadhar=" + aadhar + "]";
	}
	
	
	

}
