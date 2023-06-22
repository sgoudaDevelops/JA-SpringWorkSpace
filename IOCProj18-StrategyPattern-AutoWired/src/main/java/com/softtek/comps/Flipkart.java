package com.softtek.comps;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public final class Flipkart {
	// has a property
	@Autowired
	//@Qualifier("bdt")
	private Courier courier;

	public Flipkart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
	}

	public String Shopping(String Items[], double price[]) {
		double billamount = 0;
		for (double p : price) {
			billamount += p;
		}
		//generate Order id
		int oid=new Random().nextInt(1000);
		
		//use Courier
		String msg=courier.Deliver(oid);
		return Arrays.toString(Items) + "are purchased having bill amount"+billamount;

		
	}
	
	

	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + "]";
	}

}
