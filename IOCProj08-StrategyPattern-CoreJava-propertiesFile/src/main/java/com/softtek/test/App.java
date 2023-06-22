package com.softtek.test;

import com.softtek.comps.Flipkart;
import com.softtek.factory.FlipkartFactory;

public class App {
	public static void main(String[] args) {

		try {
			Flipkart fpkt = FlipkartFactory.getInstance();
			String shopping = fpkt.Shopping(new String[] { "shoes", "shirts" }, new double[] { 100.0, 101.1 });
			System.out.println(shopping);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
