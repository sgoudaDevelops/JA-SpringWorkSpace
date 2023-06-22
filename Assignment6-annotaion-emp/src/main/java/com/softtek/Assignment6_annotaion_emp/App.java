package com.softtek.Assignment6_annotaion_emp;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.softtek.controller.empController;
import com.softtek.vo.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
		String Ename = null, addrs = null, basicSal=null;
		if (sc != null) {
			System.out.println("enter the employe name :: ");
			Ename = sc.next();
			System.out.println("enter the address :: ");
			addrs = sc.next();
		    System.out.println("enter the basic salary");
		    basicSal = sc.next();
		     Employee e= new Employee();
		     e.setEname(Ename);
		     e.setAddrs(addrs);
		     e.setBasicSal(basicSal);
		     
		     ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("com/softtek/cfgs/ApplicationContext.xml");
                        empController controller = context.getBean("empCon",empController.class);	
                        try {
							String processEmp = controller.processEmp(e);
							System.out.println(processEmp);
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							System.out.println("coudn't calculate the gross & net sal also storing the data ");
							e1.printStackTrace();
						}
		}
    }
}
