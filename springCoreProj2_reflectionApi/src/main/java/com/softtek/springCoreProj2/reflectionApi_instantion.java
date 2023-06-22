package com.softtek.springCoreProj2;

import java.lang.reflect.Constructor;

public class reflectionApi_instantion 
{
    public static void main( String[] args )
    {
       try {
    	   // load the class at runtime
		Class c = Class.forName(args[0]);
		
		//create object dynamically(option -1)
           Object obj = c.newInstance();// uses 0-param constructor
           System.out.println("obj1 :" +obj.toString());
           System.out.println("---------------------");
           
        // create Object Dynamically(option-2)
           Constructor[] constructors  = c.getDeclaredConstructors();
           for(Constructor constructor:constructors) {
        	   System.out.println(constructor);
           }
           System.out.println("----------------------");
           Object newInstance1 = constructors[0].newInstance();
           System.out.println("obj2 :"+newInstance1.toString());
           System.out.println("---------------------------------");
           Object newInstance2 = constructors[0].newInstance();
           System.out.println("obj3 :"+newInstance2.toString());
           
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
    }
}
}
    		
