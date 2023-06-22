package com.softtek.comps;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("dtdc")
@Lazy(true)
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
