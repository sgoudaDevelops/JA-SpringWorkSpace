package com.softtek.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

import javax.naming.directory.InvalidAttributesException;

import com.softtek.comps.CourseMaterial;
import com.softtek.comps.DotnetMaterial;
import com.softtek.comps.PythonMaterial;
import com.softtek.comps.Student;
import com.softtek.comps.javaMaterial;

public class StudentFactory {
	private static Properties props;
	static {
		System.out.println("StudentFactory.enclosing_method()");
		try {
			InputStream is = new FileInputStream("src/com/softtek/properties/info.properties");
			props = new Properties();
			props.load(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Student getStudentObj(String sub) throws InvalidAttributesException {
		CourseMaterial cm = null;
		if (sub.equalsIgnoreCase("Python"))
			cm = new PythonMaterial();
		else if (sub.equalsIgnoreCase("Java"))
			cm = new javaMaterial();
		else if (sub.equalsIgnoreCase("Dotnet"))
			cm = new DotnetMaterial();
		else
			throw new InvalidAttributesException("invalid course material");

		// target class obj
		Student std = new Student();
		std.setCourse(cm);
		return std;

	}

	public static Student studentObj() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			String property = props.getProperty("ref.ClassName");
			//System.out.println(property);
			Class c = Class.forName(property);
			Constructor<CourseMaterial>[] cons = c.getDeclaredConstructors();
			  CourseMaterial cm = cons[0].newInstance();
			  
			Student std = new  Student();
			std.setCourse(cm);
			return std;
			
			

	}
}
