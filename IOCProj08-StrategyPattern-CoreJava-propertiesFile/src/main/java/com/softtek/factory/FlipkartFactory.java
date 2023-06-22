package com.softtek.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.softtek.comps.BlueDart;
import com.softtek.comps.Courier;
import com.softtek.comps.DTDC;
import com.softtek.comps.Flipkart;

// Factory pattern
public class FlipkartFactory {
	private static Properties props;
	static {
		System.out.println("Flipkartfactory.static block");

		try {
			InputStream is = new FileInputStream("src/main/java/com/softtek/commons/info.properties");
			props = new Properties();
			props.load(is);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// staic factory method
	public static Flipkart getInstance() throws Exception {
		System.out.println("FlipkartFactory.getInstance()");
		// get depednt class name
		String co = props.getProperty("okBro.className");
		// load the depedent class
		System.out.println(co);
		Class c = Class.forName(co);
		System.out.println("---------");
		// create the object for the loaded class
		Constructor<Courier> cons[] = c.getDeclaredConstructors();
		Courier courier = cons[0].newInstance();

		// create the target Class object
		Flipkart fpkt = new Flipkart();
		// assign the depndt class to target
		fpkt.setCourier(courier);
		return fpkt;

	}
}
