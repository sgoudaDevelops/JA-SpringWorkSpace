package com.softtek.factory;

import javax.naming.directory.InvalidAttributesException;

import com.softtek.comps.Dengine;
import com.softtek.comps.Eengine;
import com.softtek.comps.Engine;
import com.softtek.comps.Pengine;
import com.softtek.comps.Vehicle;

public class assignment_Factory {

	public static Vehicle getInstance(String engine) throws InvalidAttributesException {
		Engine e = null;
		if (engine.equalsIgnoreCase("Petrol")) {
			e = new Pengine();
		} else if (engine.equalsIgnoreCase("Deisel"))
			e = new Dengine();
		else if (engine.equalsIgnoreCase("Electric"))
			e = new Eengine();
		else
			throw new InvalidAttributesException("invalid input");

		// creating obj of the target class
		Vehicle v = new Vehicle();

		// setting the depedent on the target class
		v.setEngine(e);

		return v;
	}

}
