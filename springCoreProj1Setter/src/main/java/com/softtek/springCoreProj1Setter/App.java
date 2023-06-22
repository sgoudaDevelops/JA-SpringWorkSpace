package com.softtek.springCoreProj1Setter;

import java.nio.file.FileSystem;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.softtek.beans.WishMessageGenerator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" ); 
    	// to hold the name & loc of the spring bean cfg in resource obj 
    	FileSystemResource res= new FileSystemResource("src/main/java/com/softtek/cfg/ApplicationContext.xml");
    	
    	// bean factory spring container
    	XmlBeanFactory factory= new XmlBeanFactory(res);
    	
      //get target spring bean class obj injected with depedent spring bean class
    	Object object = factory.getBean("wmg");
    	
    	// type casting 
    	WishMessageGenerator generator = (WishMessageGenerator) object;
    	
    	
    	// invoke businness methods
    	String message = generator.generateMessage("shivangoud");
    	System.out.println(message);
    	System.out.println("--------");
    	
    }
}
