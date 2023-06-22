package com.softtek.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import com.softtek.sbeans.Employee;

/**
 * Hello world!
 *
 */
public class propertiesTestFile 
{
    public static void main( String[] args )
    {
        // create the applicationContext container
    	ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/softtek/cfgs/ApplicationContext.xml");
    	// get spring bean class obj
    	Employee emp = ctx.getBean("emp",Employee.class);
    	System.out.println("emp data"+ emp);
    	ConfigurableEnvironment env = ctx.getEnvironment();
    	System.out.println(env.getProperty("emp.id"));
    
    	
    	
    }
}
