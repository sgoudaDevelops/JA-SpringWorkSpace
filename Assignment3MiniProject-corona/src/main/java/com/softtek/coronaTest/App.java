package com.softtek.coronaTest;

import java.util.Scanner;

import javax.sql.rowset.spi.XmlReader;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.softtek.controller.patientController;

import com.softtek.vo.patientVo;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pname = null;
		String addrs = null;
		String priceperday = null;
		String noofdays = null;
		if (sc != null) {
			System.out.println("enter the name of the patient");
			pname = sc.next();
			System.out.println("enter the address of the patient ");
			addrs = sc.next();
			System.out.println("enter the price per day");
			priceperday = sc.next();
			System.out.println("enter the no of days  stayed in hospital");
			noofdays = sc.next();

		}
		// creating the vo class
		patientVo p1 = new patientVo();
		p1.setPname(pname);
		p1.setAddrs(addrs);
		p1.setNoofdays(noofdays);
		p1.setPerdaycharge(priceperday);

		// creating the the ioc bean factory
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/softtek/cfgs/ApplicationContext.xml");

		// get the controller bean class
		patientController cnt = factory.getBean("controller", patientController.class);
		try {
			String processPatient = cnt.ProcessCustomer(p1);
			System.out.println(processPatient);
		} catch (Exception e) {
			System.out.println("coudnt calculate the bill & storing the patient data in db");
		}

	}
}
