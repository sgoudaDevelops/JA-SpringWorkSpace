package com.softtek.assignment2Test;

import javax.naming.directory.InvalidAttributesException;

import com.softtek.comps.Engine;
import com.softtek.comps.Vehicle;
import com.softtek.factory.assignment_Factory;

public class App {
	public static void main(String[] args) throws InvalidAttributesException {
		 Vehicle instance = assignment_Factory.getInstance("Deisel");
		 instance.buyVehicle();
		

	}
}
