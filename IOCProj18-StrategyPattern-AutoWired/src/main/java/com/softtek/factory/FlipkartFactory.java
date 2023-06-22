package com.softtek.factory;

import com.softtek.comps.BlueDart;
import com.softtek.comps.Courier;
import com.softtek.comps.DTDC;
import com.softtek.comps.Flipkart;

// Factory method
public class FlipkartFactory {
public static Flipkart getInstance(String courierType)
{
	//create depedent class object
	Courier courier= null;
	if(courierType.equalsIgnoreCase("dtdc"))
		courier=new DTDC();
	else if(courierType.equalsIgnoreCase("bluedart"))
		courier=new BlueDart();
	else throw new IllegalArgumentException("invalid courier type");
	
	// create the target class obj
	Flipkart fpkt= new Flipkart();
	// assign depedent class obj to target class obj
	fpkt.setCourier(courier);
	return fpkt;
}
	

}
