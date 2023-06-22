package com.softtek.comps;

public final class BlueDart implements Courier {
	

	public BlueDart() {
		super();
		System.out.println("Bluedart:: 0-param constructor");
	}

	@Override
	public String Deliver(int Oid) {
		// TODO Auto-generated method stub
		return Oid +"Order id is assigned to Bluedart delivery";
	}
	

}
