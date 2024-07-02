package com.practice;

import java.util.Arrays;

import org.testng.annotations.Test;

public class arrayProgram {
	@Test
	public void m1() {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int[] b = { 3, 4, 5, 7, 8, 9, 90, 98 };
		int temp = 0;
		int[] result = new int[a.length + b.length];
		for (int i = 0; i < result.length; i++) {
			if (i < a.length) {
				result[i] = a[i];
			} else {
				result[i] = b[temp++];
			}
		}
		System.out.println(Arrays.toString(result));
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				if(result[i]>result[j]) {
					int temp1=result[i];
					result[i]=result[j];
					result[j]=temp1;
				}
			}
		}
		
		System.out.println(Arrays.toString(result));
//		int start=0,end=result.length-1;
//		while(start<end) {
//			
//		}
//		System.out.println(Arrays.toString(result));
	}
}
