package com.softtek.factory;

import com.softtek.comp.AdharDetails;
import com.softtek.comp.Customer;
import com.softtek.comp.Employee;
import com.softtek.comp.Person;
import com.softtek.comp.Student;

// factory pattern
public class PersonFactory {
public static Person getPerson(String type) {
	Person per=null;AdharDetails details= null;
	
	if(type.equalsIgnoreCase("emp"))
	{
		details= new AdharDetails(12345L,20,9876543l);
		per= new Employee("Naveen","banglore",details,"HCL",54342);
	}
	else if(type.equalsIgnoreCase("emp"))
	{
		details= new AdharDetails(123456L,22,4537989l);
		per= new Customer("Shivan","banglore",details,1234,9000.00);
	}
	else if(type.equalsIgnoreCase("stud"))
	{
		details= new AdharDetails(12345L,24,9543276l);
		per=new Student("Ram","Hydrabad",details,"SpringBoot",123456);
	}
	else {
		throw new IllegalArgumentException("invalid person");
	}
	return per;
}
}
