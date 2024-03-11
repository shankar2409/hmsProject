package com.practice;

import org.testng.annotations.Test;

public class TestNg {
	@Test(priority = 0)
	public void create() {
		System.out.println("--create--");
	}
	@Test(priority = 2,invocationCount = 1,dependsOnMethods = "delete")
	public void edit() {
		int[] f= {10,30};
		System.out.println(f[2]);
		System.out.println("--edit--");
	}
	@Test(invocationCount = 1)
	public void delete() {
		int[] d= {10,20,03,40};
		System.out.println("result :"+d[2]);
		System.out.println("--delete--");
	}
}



