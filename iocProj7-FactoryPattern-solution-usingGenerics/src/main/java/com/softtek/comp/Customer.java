package com.softtek.comp;

public class Customer extends Person {
	private int txId;
	private double billAmount;

	public Customer(String name, String addrs, AdharDetails aadhar, int txId, double billAmount) {
		super(name, addrs, aadhar);
		this.txId = txId;
		this.billAmount = billAmount;
	}

	@Override
	public String toString() {
		return "Customer [txId=" + txId + ", billAmount=" + billAmount + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	

}
