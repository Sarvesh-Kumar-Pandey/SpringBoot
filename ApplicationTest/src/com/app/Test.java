package com.app;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Test {
	public static void main(String args[]) throws IOException {
		Test rp = new Test();
		System.out.println("Reading from properties file");
		System.out.println("-----------------------------");
 
		Properties prop = rp.readPropertiesFile("/config.properties");
 
		System.out.println("host : " + prop.getProperty("host"));
		System.out.println("username : " + prop.getProperty("username"));
		System.out.println("password : " + prop.getProperty("password"));
		System.out.println("-----------------------------");
	}
 
	public Properties readPropertiesFile(String fileName) throws IOException {
		InputStream fis = null;
		Properties prop = null;
		try {
			prop = new Properties();
			fis = this.getClass().getResourceAsStream(fileName);
 
			// create Properties class object
			if (fis != null) {
				// load properties file into it
				prop.load(fis);
			} else {
				throw new FileNotFoundException("property file '" + fileName + "' not found in the classpath");
			}
 
		} catch (FileNotFoundException e) {
 
			e.printStackTrace();
		} catch (IOException e) {
 
			e.printStackTrace();
		} finally {
			fis.close();
		}
 
		return prop;
	}
 
}
 


