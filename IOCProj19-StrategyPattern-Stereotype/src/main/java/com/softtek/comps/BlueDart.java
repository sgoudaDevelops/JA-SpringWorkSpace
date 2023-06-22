package com.softtek.comps;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bdt")
@Lazy(true)
@Scope("singleton")
public final class BlueDart implements Courier {

	public BlueDart() {
		super();
		System.out.println("Bluedart:: 0-param constructor");
	}

	@Override
	public String Deliver(int Oid) {
		// TODO Auto-generated method stub
		return Oid + "Order id is assigned to Bluedart delivery";
	}

}
