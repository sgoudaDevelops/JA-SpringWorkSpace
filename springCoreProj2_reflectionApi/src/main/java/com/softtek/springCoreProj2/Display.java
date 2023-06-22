package com.softtek.springCoreProj2;

public class Display {

	private int c;
	private int d;
	
	public Display() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public Display(int c, int d) {
		super();
		this.c = c;
		this.d = d;
	}
	@Override
	public String toString() {
		return "Display [c=" + c + ", d=" + d + "]";
	}
	
}
