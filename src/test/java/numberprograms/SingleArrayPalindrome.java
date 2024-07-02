package numberprograms;

import java.util.*;
public class SingleArrayPalindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.err.print("enter the size  :");
		int size=s.nextInt();
		int[] a=new int[size];
		System.out.println("enter the values  :");
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		System.out.println("values for array 1  >>"+Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			int value=a[i];
			int temp=value;
			int sum=0;
			while (value!=0) {
				int d=value%10;
				sum=(sum*10)+d;
				value/=10;
			}	
			if (temp==sum) {
				System.out.println(i+"st element  "+a[i]+"  is a Palindrome Element");
			} else {
				System.err.println(i+"st element  "+a[i]+"  is not Palindrome Element ");
			}
		}
	}
}
