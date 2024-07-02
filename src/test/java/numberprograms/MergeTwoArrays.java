package numberprograms;

import java.util.Scanner;
public class MergeTwoArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter array size  :");
		int size=sc.nextInt();
		System.out.print("enter the values for array 1  :");
		int[] a=new int[size];
		for (int i = 0; i < a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print(" enter the values for array 2  :");
		int[] b=new int[size];
		for (int i = 0; i < b.length; i++) 
		{
			b[i]=sc.nextInt();
		}
		int[] c=new int[a.length+b.length];
		System.out.println("size of the array  c  : "+c.length);
		int temp=0;
		int temp1=0;
		for (int i = 0; i < c.length; i++)
		{
			if (temp<a.length) {
				c[i]=a[temp++];
			}
			else {
				c[i]=b[temp1++];
				
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" , ");
		}
	}
}
