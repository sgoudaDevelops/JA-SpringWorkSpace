package com.softtek.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.softtek.controller.guestController;
import com.softtek.vo.guestVo;

public class RealTimeDiTest 
{
    public static void main( String[] args )
    {
        // to read the inputs 
    	Scanner  sc= new Scanner(System.in);
    	String name=null,addrs=null,noofdays=null,perdaycharge=null;
    	if(sc!=null)
    	{
    		System.out.println("enter the guest name :: " );
    		name=sc.next();
    		System.out.println("enter the address :: ");
    		addrs=sc.next();
    		System.out.println("enter the no of days staying here ::");
    		noofdays=sc.next();
    		System.out.println("Enter the price per day");
    	     perdaycharge=sc.next();
    		
    	}
    	// prepare the vo class object having inputs
    	guestVo vo= new guestVo();
    	vo.setGname(name);
    	vo.setAddrs(addrs);
    	vo.setNoofday(noofdays);
    	vo.setPerdaycharge(perdaycharge);
    	
    	// create IOC conatiner
    	DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
    	XmlBeanDefinitionReader reader= new XmlBeanDefinitionReader(factory);
    	reader.loadBeanDefinitions("com/softtek/cfgs/ApplicationContext.xml");
    	
    	
    	// get controller class obj
    	guestController controller = factory.getBean("controller",guestController.class);
    	//System.out.println("printing the controller " + controller );
    	try {
    		// invoke the b.method
    	       String resultMsg = controller.processCustomer(vo);
    	       System.out.println(resultMsg);
    	}
    	catch (Exception e){
    		System.out.println("problem in the registering the customer");
    		e.printStackTrace();
    	}
    	
    }
}
