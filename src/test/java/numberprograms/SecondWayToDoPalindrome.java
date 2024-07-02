package numberprograms;

import java.util.Arrays;
import java.util.Scanner;

public class SecondWayToDoPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.err.print("enter the Array size  :");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("enter the values for array  :");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Array 1 value  :"+Arrays.toString(a));
		int[] b=new int[size];
		int temp=0;
		for (int i = a.length-1; 0<=i; i--) {
			b[temp++]=a[i];
		}
		boolean flag=true;
		System.out.println(Arrays.toString(b));
		for (int i = 0; i < a.length; i++) {
			if (a[i]!=b[i]) {
				flag=false;
				break;
			}
		}
		if (flag==true) {
			System.out.println(Arrays.toString(a)+" is a Palindrome Number");
		}
		else
		{
		System.out.println(Arrays.toString(a)+" is not a Palinfrome Number");
		}
	}

}
