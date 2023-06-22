package com.softtek.comps;

public final class DTDC implements Courier {
	

	
	public DTDC() {
		super();
		System.out.println("DTDC::o-param constructor");
	}

	@Override
	public String Deliver(int Oid) {
		// TODO Auto-generated method stub
		return Oid+"Order id is associted with DTDC courier";
	}
	

}
