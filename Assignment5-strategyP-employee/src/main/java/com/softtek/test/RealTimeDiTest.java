package com.softtek.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.softtek.controller.MainController;
import com.softtek.vo.CustomerVo;

public class RealTimeDiTest 
{
    public static void main( String[] args )
    {
        // to read the inputs 
    	Scanner  sc= new Scanner(System.in);
    	String name=null,addrs=null,pamt=null,rate=null,time=null;
    	if(sc!=null)
    	{
    		System.out.println("enter the customer name :: " );
    		name=sc.next();
    		System.out.println("enter the address :: ");
    		addrs=sc.next();
    		System.out.println("enter the customer principle amount ::");
    		pamt=sc.next();
    		System.out.println("Enter the ROI");
    		rate =sc.next();
    		System.out.println("Enter time in months");
    		time=sc.next();
    	}
    	// prepare the vo class object having inputs
    	CustomerVo vo= new CustomerVo();
    	vo.setCname(name);
    	vo.setCadd(addrs);
    	vo.setPamt(pamt);
    	vo.setRate(rate);
    	vo.setTime(time);
    	
    	// create IOC conatiner
    	DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
    	XmlBeanDefinitionReader reader= new XmlBeanDefinitionReader(factory);
    	reader.loadBeanDefinitions("com/softtek/cfgs/ApplicationContext.xml");
    	
    	
    	// get controller class obj
    	MainController controller = factory.getBean("controller",MainController.class);
    	System.out.println("printing the controller " + controller );
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
