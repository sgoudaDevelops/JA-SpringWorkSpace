package com.softtek.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softtek.comps.Flipkart;
import com.softtek.factory.FlipkartFactory;

public class App 
{
    public static void main( String[] args )
    {
      //create the ioc container
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/softtek/cfgs/ApplicationContext.xml");
    	// get target bean class class obj
    	Flipkart fpkt = ctx.getBean("fpkt",Flipkart.class);
    	Flipkart fpkt1 = ctx.getBean("fpkt",Flipkart.class);
    	
    	// invoke the b.method
    	String shopping = fpkt.Shopping(new String[] {"rice","dal"},new double[] {100,200});
    	String shopping1 = fpkt.Shopping(new String[] {"rice1","dal1"},new double[] {100,200});
    	System.out.println(shopping);
    	System.out.println(shopping1);
    }
}
