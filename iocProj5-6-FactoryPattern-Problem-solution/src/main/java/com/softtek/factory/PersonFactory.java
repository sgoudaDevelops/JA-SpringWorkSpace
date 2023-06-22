package com.softtek.factory;

import java.lang.reflect.Constructor;

import com.softtek.comp.AdharDetails;
import com.softtek.comp.Customer;
import com.softtek.comp.Employee;
import com.softtek.comp.Person;
import com.softtek.comp.Student;

// factory pattern
public class PersonFactory {
public static < T extends Person> T getPerson(Class<T> clazz)throws Exception {
	Constructor<?>[] cons= clazz.getDeclaredConstructors();
	Object obj;
	
	if(clazz ==Employee.class)
	{
		 AdharDetails details= new AdharDetails(12345L,20,9876543l);
		obj = cons[0].newInstance("Naveen","Banglore",details,"hcl",56510);
	}
	else if(clazz == Customer.class)
	{
		AdharDetails details= new AdharDetails(123456L,22,4537989l);
		obj= cons[0].newInstance("Shivan","banglore",details,1234,9000.00);
	}
	else if(clazz==Student.class)
	{
		AdharDetails details= new AdharDetails(12345L,24,9543276l);
		obj =cons[0].newInstance("Ram","Hydrabad",details,"SpringBoot",123456);
	}
	else {
		throw new IllegalArgumentException("invalid person");
	}
	return (T) obj;
}
}
