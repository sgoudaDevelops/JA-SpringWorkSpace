package com.softtek.test;

import java.util.Arrays;

public class langClassTest {
	static Class C1;
	public static void main(String[] args) {
		//Class C1=Test.class;
		
		try {
			C1 = Class.forName("com.softtek.test.Test");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("c1 obj data ::"+C1.toString()+"C1 obj class Name::"+C1.getClass());
		System.out.println("Test Class Super class name::"+C1.getSuperclass());
		System.out.println("Test class Implemented interface ::"+ Arrays.toString(C1.getInterfaces()));
		System.out.println(C1.getSuperclass());
		
		

	}

}
