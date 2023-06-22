package com.softtek.beans;

public class smartWatch implements Watch {
	private String brand;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "smartWatch [brand=" + brand + "]";
	}

}
