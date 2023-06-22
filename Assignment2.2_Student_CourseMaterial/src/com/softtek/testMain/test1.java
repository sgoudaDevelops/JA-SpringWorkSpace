package com.softtek.testMain;

import java.lang.reflect.InvocationTargetException;

import javax.naming.directory.InvalidAttributesException;

import com.softtek.comps.Student;
import com.softtek.factory.StudentFactory;

public class test1 {
private static Student studentObj;
private static Student studentObj1;

public static void main(String[] args) throws InvalidAttributesException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	studentObj= StudentFactory.getStudentObj("python");
	studentObj.coursedet();
	Student studentObj2 = StudentFactory.studentObj();
	studentObj2.coursedet();
	
}
}
