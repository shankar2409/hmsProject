package com.practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFileTest {

	public static void main(String[] args) throws IOException {
		
//		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\CommonData.properties");
		Properties prop = new Properties();
//		prop.load(fis);
//		System.out.println(prop.getProperty("browser"));
//		System.out.println(prop.getProperty("url"));
		prop.setProperty("patient-username", "Patigmail.com");
		prop.setProperty("patient-password", "Test@12345");
//		System.out.println(prop.getProperty("Doctor-username"));
		
		prop.store(fos,"write data");
	}
}
