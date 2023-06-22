package com.softtek.beans;

import java.util.Date;

public class WishMessageGenerator {
	// has a property
	private Date date;

	
   // parametrized constructor for constructor 
	public WishMessageGenerator(Date date) {
		super();
		this.date = date;
	}
	


	public void setDate(Date date) {
		this.date = date;
	}



	public String generateMessage(String user) {
		System.out.println("WishMessageGenerator.generateMessage()");
		System.out.println(this.hashCode() +" "+ date.hashCode());
		//get current hour of the day 
		int hour = date.getHours(); // gives 0-23
		if (hour<12)
			return  "good morning " +user;	
	
		else if(hour<16)
			return "good afternoon "+ user;
	
		else if(hour <20)
			return  "good evening " +user;
		else 
			return "good night" +user;
	}

}
