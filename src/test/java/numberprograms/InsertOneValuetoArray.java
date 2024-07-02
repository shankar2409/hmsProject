package numberprograms;

import java.util.Arrays;
import java.util.Scanner;

public class InsertOneValuetoArray {
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
		System.out.print("which position we need to insert into array 1  >>");
		int index=sc.nextInt();
		System.out.print("enter the value for inserting value  :");
		int element=sc.nextInt();
		int temp=0;
		int[] b=new int[size+1];
		for (int i = 0; i < b.length; i++) {
			if (i==index) {
				b[index]=element;
			}
			else {
				b[i]=a[temp++];
			}
		}
		System.err.println(Arrays.toString(b));
	}

}
