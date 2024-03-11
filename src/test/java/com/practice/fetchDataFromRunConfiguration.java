package com.practice;

import org.testng.annotations.Test;

public class fetchDataFromRunConfiguration {
	@Test
	public void main11() {
		System.out.println("--start--");
		String value = System.getProperty("key");
		String value1=System.getProperty("browser");
		System.out.println(value1);
		System.out.println(value);
		System.out.println("--end--");
	}
}
