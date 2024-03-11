package com.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	@Test(dataProvider = "data")
	public void sample(String d,String b,String c) {
		System.out.println(d+" "+b+" "+c);
	}
	@DataProvider(name="data")
	public Object[][] excution() {
		Object[][] data = new Object[2][3];
		data[0][0]="20";
		data[0][1]="30";
		data[0][1]="40";
		data[1][0]="10";
			return data;	
	}
}
