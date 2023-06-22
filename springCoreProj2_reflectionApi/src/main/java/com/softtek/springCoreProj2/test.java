package com.softtek.springCoreProj2;

public class test {
	private int a;
	private int b;
	public test() {
		super();
		// TODO Auto-generated constructor stub
	}
	public test(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public void print() {
		System.out.println("hello");
	}
	@Override
	public String toString() {
		return "test [a=" + a + ", b=" + b + "]";
	}
	
	public String toString(int a, int b) {
		return "test [a=" + a + ", b=" + b + "]";
	}
	
	
	
	

}
