package numberprograms;

import java.util.*;
public class MergeTwoArrayInZigZagManner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size  for array 1 :");
		int size=sc.nextInt();
		System.out.println("enter the value for array 1  :");
		int[] a=new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("enter the size for array 2  :");
		int size1=sc.nextInt();
		System.out.println("enter the value for array 2  :");
		int[] b=new int[size1];
		for (int i = 0; i < b.length; i++) {
			b[i]=sc.nextInt();
		}
		int[] c=new int[a.length+b.length];
		System.out.println("length of the array c:  "+c.length);
		int temp=0,temp1=0;
		for (int i = 0; i < c.length;) {
			if (temp<a.length) {
				c[i++]=a[temp++];
			}
			if (temp1<b.length) {
				c[i++]=b[temp1++];
			}
		}
		System.out.println("sort the array  >>>>  "+c.equals(b));
		System.out.println("final result of the array c >>>  "+Arrays.toString(c));
		
	}

}
