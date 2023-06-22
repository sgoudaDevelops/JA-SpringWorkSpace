package com.softtek.comps;

public class Vehicle {
	private Engine engine;

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(Engine engine) {
		super();
		this.engine = engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Vehicle [engine=" + engine + "]";
	}
	
	public void buyVehicle()
	{
		System.out.println("Hey!!! there....You sucessfully bought the " + engine.getClass().getSimpleName());
	//	System.out.println(engine);
	}

}
