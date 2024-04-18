package testYantraArrayPrograms;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

import org.testng.annotations.Test;

public class ArrayPrograms {
	@Test(enabled = false,priority = 1)
	public void swapTwoNumber() {
		System.out.println("=========with third variable========");
		int i = 10;
		int j = 20;
		System.out.println("actual  " + i + " " + j);
		int temp = i;
		i = j;
		j = temp;
		System.out.println("after swap   " + i + "  " + j);

		System.out.println("==========without third variable=============");
		// without third variable
		int a = 10;
		int b = 20;
		System.out.println("actual   " + a + " " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after swap  " + a + " " + b);

	}

	@Test(enabled = false,priority = 2)
	public void sortArrayUsingBubbleSort() {
		int[] data = { 4,2,7,1};
		for (int i = 0; i < data.length; i++) {
			for (int j = i+1; j< data.length; j++) {
				if (data[i]>data[j]) {
					int temp=data[i];
					data[i]=data[j];
					data[j]=temp;//0 4 2 1
				}
			}
			System.out.println(data[i]);
		}
		System.out.println(Arrays.toString(data));
		
		System.out.println("firstMinimumNumber"+data[0]);
		System.out.println("secondMinimumNumber"+data[1]);
		System.out.println("firstMaximumNumber"+data[data.length-1]);
		System.out.println("secondMaximumNumber"+data[data.length-2]);
		int sum=0;
		int mulply=1;
		for (int i = 0; i < 3; i++) {
			sum+=data[i];
			mulply*=data[i];
		}
		System.out.println("sum of first minimumNumber"+sum);
		System.out.println("multiply of first minimumNumber"+mulply);
		sum=0;
		mulply=1;
		for (int i = data.length-1; i >data.length-2 ; i--) {
			sum+=data[i];
			mulply*=data[i];
		}
		System.out.println("sum of first three maximum number"+sum);
		System.out.println("multiply of first three maximum number"+mulply);
		
 		}
	
	@Test(enabled = false,priority = 3)
	public void desortingOrder() {
		int[] data = { 4,2,0,1};
		for (int i = 0; i < data.length; i++) {
			for (int j = i+1; j< data.length; j++) {
				if (data[i]<data[j]) {
					int temp=data[i];
					data[i]=data[j];
					data[j]=temp;//0 4 2 1
				}
			}
			System.out.println(data[i]);
		}
		System.out.println(Arrays.toString(data));
	}
	
	@Test(enabled = false,priority = 4)
	public void findFirstMinimumNumber() {
		int[] data= {2,3,9,0,4,1};
		int min=data[0];
		
		for (int i = 1; i < data.length; i++) {
			if (min>data[i]) {
				min=data[i];
			}
		}
		System.out.println(min);
		
	}
	@Test(enabled = false,priority = 5)
	public void firstMaximumNumber() {
		int[] a= {3,5,67,84,0,6,2,1};
		int fMax=a[0];
		for (int i = 1; i < a.length; i++) {
			if (fMax<a[i]) {
				fMax=a[i];
			}
		}
		System.out.println(fMax);
	}
	
	@Test
	public void secondMinimumNumber() {
		int[] data= {4,0,5,1,0,3,5};
		int max=data[0];
		for (int i = 1; i < data.length; i++) {
			if (max<data[i]) {
				max=data[i];	
			}
		}
		System.out.println(max+"max");
		int min=max;
		int secMin=0;
		for (int i = 0; i < data.length; i++) {
			if (min<data[i]) {
				secMin=min;
				min=data[i];
			} 
			else if (data[i]>min&data[i]!=secMin) {
				secMin=min;
				min=data[i];
			}
			
		}
		System.out.println(secMin+"secnondmin");
		System.out.println(min+"min");
	}
	@Test(enabled = false,priority = 7)
	public void sumOfFirstThreeMinimum() {
		int[] a= {8,4,7,93,9,2,5,6};
		int target=100;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]+a[j]==target) {
					System.out.println(a[i]+" + "+a[j]+" = "+target);
				}
			}
		}
 	}
	@Test(enabled = false,priority = 8)
	public void secondMinNumber() {
		int[] a= {10,2,3,65,-8,7,89,6};
		int fmin=a[0],smin=fmin;
		for (int i = 0; i < a.length; i++) {
			if (a[i]<fmin&&a[i]<smin) {
				smin=fmin;
				fmin=a[i];
				
			}
			else if (a[i]<smin) {
				smin=a[i];
			}
		}
		System.out.println(smin+" "+fmin);
	
	}
	@Test(priority = 9,enabled = false)
	public void frequentlyRepeatedNumber() {
		int[] a= {4,1,2,1,1,2,2,2,0};
		int max=0;
		int val=0;
		for (int i = 0; i < a.length; i++) {
			int count=1;
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					count++;
				}
			}
			if (count>max) {
				max=count;
				val=a[i];
			}
			
		}
		System.out.println(val);
		
	}
	@Test(enabled = false)
	public void arrangeValues() {
		int[] a= {0,4,0,2,0,6};
		int[] res=new int[a.length];
		int m=0,n=a.length-1;
		for (int i = 0; i < a.length; i++) {
				if(a[i]==0) {
					res[m]=a[i];
					m++;
				}else {
					res[n]=a[i];
					n--;				
				}		}
		System.out.println(Arrays.toString(res));
	}
	@Test
	public void reverseRepeatedNumber() {
		int[] a= {0,4,0,2,0,6};
		int[] res=new int[a.length];
		int m=0,n=a.length-1;
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res.length; j++) {
			
			if (a[i]==0) {
				res[n]=a[i];
				n--;
			} else {
				res[m]=a[i];
				m++;
			}
		}
		System.out.println(Arrays.toString(res));
	}}

}
