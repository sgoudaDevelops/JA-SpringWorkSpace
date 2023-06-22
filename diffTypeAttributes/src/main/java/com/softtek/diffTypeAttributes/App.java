package com.softtek.diffTypeAttributes;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.softtek.beans.Student;

public class App {
	public static void main(String[] args) {
                       //XmlBeanFactory
//		FileSystemResource fil = new FileSystemResource("src/main/java/com/softtek/cfg/ApplicationContext.xml");
//		XmlBeanFactory factory = new XmlBeanFactory(fil);

		// create the IOC container using the DefaultListable BeanFactory Container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/softtek/cfg/ApplicationContext.xml");
		// reader.loadBeanDefinitions("com/softtek/cfg/ApplicationContext.xml");
		Student std = factory.getBean("std", Student.class);
		System.out.println(std);
//		Student std1 = (Student) factory.getBean("Ram");
//		System.out.println("---------------------");
//		System.out.println(std1);
		Student std3 = factory.getBean("hello", Student.class);
		System.out.println(std3);

	}
}
