package numberprograms;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("<< enter the size of the Array  >>");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("enter the values of an array");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("<< first  array  >>  "+Arrays.toString(a));
		System.out.print("which position we need to REMOVE in array 1  >>");
		int index=sc.nextInt();
		int[] b=new int[size-1];
		int temp=0; 
		for (int i = 0; i < a.length; i++) {
			if (i!=index) {
				b[temp++]=a[i];
			}
		}
		System.err.println(Arrays.toString(b));
	}

}
