package com.practice;

import org.testng.annotations.Test;

public class MavenTest {
	@Test
	public void sample_1Test() {
		System.err.println("--sample test 1--");
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		System.out.println(BROWSER);
		System.out.println(URL);
	}
	@Test
	public void sample_2Test() {
		System.out.println("--sample test 2--");
	}
}
