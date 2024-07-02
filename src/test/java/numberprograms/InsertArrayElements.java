package numberprograms;

import java.util.Arrays;
import java.util.Scanner;
public class InsertArrayElements {
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
		System.out.println("enter the array size array  >> ");
		int size1=sc.nextInt();
		int[] b= new int[size1];
		System.out.println("enter the values of an array");
		for (int i = 0; i < b.length; i++) {
			b[i]=sc.nextInt();
		}
		System.out.println("<< second Array  >> "+Arrays.toString(b));
		System.out.print("which position we need to insert into array 1  >>");
		int index=sc.nextInt();
		System.out.println("which element to we want to take int array 2 >>");
		int element=sc.nextInt();
		int temp=0;
		int[] newArr=new int[size+1];
		for (int i = 0; i < newArr.length; i++) {
			if (i==index) {
				newArr[index]=b[element];
			}
			else {
				newArr[i]=a[temp++];
			}
		}
		System.err.println(Arrays.toString(newArr));
	}
}
