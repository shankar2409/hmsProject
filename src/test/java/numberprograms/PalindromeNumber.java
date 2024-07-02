package numberprograms;

import java.util.*;
public class PalindromeNumber {
//one way to do PalindromeNumber
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the array Size  :");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("enter the Values for Array  :");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Array  1  :"+Arrays.toString(a));
		int temp=0,temp1=a.length-1;
		boolean flag=true;
		for (int i = a.length; temp<temp1; i--) {
			if (a[temp]==a[temp1]) {
				temp++;
				temp1--;
			}
			else {
				flag=false;
				break;
			}
		}
		if (flag==true) {
			System.err.println(Arrays.toString(a)+" is a Palindrome Array");
		} else {
			System.err.println(Arrays.toString(a)+" is not a Palindrome Array");
		}
	}
}
