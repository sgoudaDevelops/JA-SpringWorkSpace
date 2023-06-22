package com.softtek.iocProj5_FactoryPattern_Problem;

import com.softtek.comp.Employee;
import com.softtek.comp.Person;
import com.softtek.factory.PersonFactory;

public class FactoryPatternProbemtest 
{
    public static void main( String[] args ) throws Exception
    {
       // to create the employe opbject we need tpo create the depedent obj and then inject it while creating employe obj 
    	// for client it difficult to learn the java & handle it 
    	// so factory comes into picture
    //	PersonFactory factory=new PersonFactory();
//    	Person person = PersonFactory.getPerson("emp");
//    	System.out.println(person);
    
    	Employee person = PersonFactory.getPerson(Employee.class);
    	System.out.println(person);
       
    }
}
